package com.pq.tracs.view.beans;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import java.sql.SQLException;
import java.sql.Timestamp;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.common.PropertyMetadata;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.im.OrdUtils;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;
import oracle.jbo.uicli.binding.JUCtrlValueBinding;
import oracle.jbo.uicli.binding.JUCtrlValueBindingRef;

import oracle.jheadstart.controller.jsf.util.JsfUtils;

import oracle.ord.html.OrdURLBuilder;
import oracle.ord.im.OrdDomainIOInterface;

import oracle.adf.share.logging.ADFLogger;

import oracle.jheadstart.controller.jsf.bean.FileHandlerBean;
import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.UploadedFile;


public class TracsFileHandlerBean extends FileHandlerBean {
    private static final ADFLogger sLog =
        ADFLogger.createADFLogger(FileHandlerBean.class);

    private JUCtrlValueBinding valueBinding;

    private transient UIComponent usesUploadIndicator;

    private String fileName;
    private String contentType;
    private TableBean tableBean;
    private String fileNameWhenEmpty;


    public TracsFileHandlerBean() {

    }

    public boolean isBlob() {
        return getValueBinding().getAttributeDef().getJavaType().equals(BlobDomain.class);
    }

    public void uploadBlobFile(ValueChangeEvent event) {
        try {
            UploadedFile file = (UploadedFile)event.getNewValue();
            InputStream is = file.getInputStream();
            byte[] bytes = new byte[(int)file.getLength()];

            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length) {
                numRead = is.read(bytes, offset, bytes.length - offset);
                if (numRead < 0) {
                    break;
                }
                offset += numRead;
            }

            BlobDomain bd = new BlobDomain(bytes);
            getValueBinding().setInputValue(bd);

            if (getTableBean() == null) {
                getValueBinding().getViewObject().getCurrentRow().setAttribute("Name",
                                                                               file.getFilename());
                getValueBinding().getViewObject().getCurrentRow().setAttribute("FileSize",
                                                                               file.getLength());
            } else {
                this.getCurrentRow().setAttribute("Name", file.getFilename());
                this.getCurrentRow().setAttribute("FileSize",
                                                  file.getLength());
            }
        } catch (IOException e) {
            System.out.println("IO");
            sLog.severe(e);
        } catch (Exception ex) {
            System.out.println("EX");
            ex.printStackTrace();
        }
    }

    public void uploadFile(ValueChangeEvent event) {
        if (isBlob()) {
            uploadBlobFile(event);
            return;
        }

        UploadedFile file = (UploadedFile)event.getNewValue();
        OrdDomainIOInterface ordValue = getOrdObject(file, getValueBinding());

        // Strange: we need to set the ordValue on the Entity Object first,
        // then retrieve the object again from the EO to set the file name
        // If we don't, the filename will not be updated!
        getValueBinding().setInputValue(ordValue);

        ordValue = (OrdDomainIOInterface)getValueBinding().getInputValue();

        try {
            // Store file name as well!
            ordValue.setSource("FILE", null, file.getFilename());
            ordValue.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        } catch (SQLException e) {
            sLog.severe(e);
        }
    }

    private OrdDomainIOInterface getOrdObject(UploadedFile file,
                                              JUCtrlValueBinding binding) {
        if (file != null) {
            String filename = file.getFilename();
            String contentType = file.getContentType();
            if (filename.length() > 0 && file.getLength() >= 0) {
                try {
                    // SDA: added check for inputSTream, can be null when the
                    // fileInput is on another tab, currently not visible
                    if (file.getInputStream() == null) {
                        return null;
                    } else {
                        return OrdUtils.getOrdObject(file.getInputStream(),
                                                     contentType, binding);
                    }
                } catch (IOException e) {
                    throw new JboException(e);
                }
            }
        }

        return null;
    }

    public void setValueBinding(JUCtrlValueBinding valueBinding) {
        this.valueBinding = valueBinding;
    }

    public JUCtrlValueBinding getValueBinding() {
        return valueBinding;
    }

    public void downloadFile(FacesContext facesContext, OutputStream out) {
        Object file =
            getTableBean() == null ? getValueBinding().getInputValue() :
            getCurrentAttribute();
        if (file == null) {
            return;
        }
        InputStream in = getInputStream(file);
        if (in == null) {
            return;
        }
        // Copy the contents of the input stream to the zipoutput stream
        int next;

        byte[] buffer = new byte[8192];
        int bytesRead = 0;
        try {
            while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            in.close();
            if (file.getClass().equals(BlobDomain.class)) {
                ((BlobDomain)file).closeInputStream();
                ((BlobDomain)file).closeOutputStream();
            }
        } catch (IOException e) {
            sLog.severe("Error while downloading file: " + e.getMessage());
        }
    }

    private InputStream getInputStream(Object file) {
        InputStream in = null;
        if (file instanceof OrdDomainIOInterface) {
            try {
                in = ((OrdDomainIOInterface)file).getDataInStream();
            } catch (SQLException e) {
                sLog.severe(e.getMessage());
            }
        } else if (file instanceof InputStream) {
            in = (InputStream)file;
        } else if (file instanceof BlobDomain) {
            // This does not work (getStorageByteArray() returns null)
            //in = new ByteArrayInputStream( ((BlobDomain)file).getStorageByteArray() );
            in = ((BlobDomain)file).getBinaryStream();
            //      try
            //      {
            //        // somehow, the InputStream that is returned does not always contain
            //        // data... this is an attempt to fix that, but it does not seem to work
            //        // either...
            //        in.reset();
            //      }
            //      catch (IOException e)
            //      {
            //        sLog.severe(e);
            //      }
        } else if (file instanceof byte[]) {
            in = new ByteArrayInputStream((byte[])file);
        } else {
            JsfUtils.getInstance().addError("File file must be of type java.io.InputStream, oracle.ord.im.OrdDomainIOInterface, oracle.jbo.domain.BlobDomain, or byte[] ");
        }
        return in;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    protected Object getCurrentAttribute() {
        String attribute = getValueBinding().getAttributeDef().getName();
        Row currentRow = getCurrentRow();
        return currentRow != null ? currentRow.getAttribute(attribute) : null;
    }

    protected Row getCurrentRow() {
        String attribute = getValueBinding().getAttributeDef().getName();

        if (getTableBean() == null) {
            return null;
        }

        Object rowData =
            getTableBean().getBindingCollectionModel().getRowData();

        Row curTableRow = null;

        if (rowData instanceof JUCtrlValueBindingRef) {
            curTableRow = ((JUCtrlValueBindingRef)rowData).getRow();
        } else if (rowData instanceof JUCtrlHierNodeBinding) {
            curTableRow = ((JUCtrlHierNodeBinding)rowData).getRow();
        } else {
            return null;
        }

        if (curTableRow.getAttribute(attribute) == null) {
            return null;
        }

        return curTableRow;
    }

    public String getFileName() {
        // try to derive from file object
        Object file =
            getTableBean() == null ? getValueBinding().getInputValue() :
            getCurrentAttribute();

        if (file instanceof OrdDomainIOInterface) {
            try {
                return ((OrdDomainIOInterface)file).getSourceName();
            } catch (SQLException e) {
                sLog.severe(e.getMessage());
            }
        } else {
            if (getTableBean() == null) {
                return (String)getValueBinding().getViewObject().getCurrentRow().getAttribute("Name");
            } else {
                return (String)this.getCurrentRow().getAttribute("Name");
            }
        }

        return getFileNameWhenEmpty();
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        if (contentType == null || getTableBean() != null) {
            // try to derive from file object
            Object file =
                getTableBean() == null ? getValueBinding().getInputValue() :
                getCurrentAttribute();
            if (file instanceof OrdDomainIOInterface) {
                try {
                    return ((OrdDomainIOInterface)file).getMimeType();
                } catch (SQLException e) {
                    sLog.severe(e.getMessage());
                }
            }
        }
        return contentType;
    }

    public String getFileUrl() {
        if (getTableBean() == null &&
            getValueBinding().getInputValue() == null) {
            return null;
        }

        if (getTableBean() != null && getCurrentRow() == null) {
            return null;
        }

        String appId =
            getValueBinding().getDCIteratorBinding().getDataControl().getName();
        String packageName =
            getValueBinding().getDCIteratorBinding().getDataControl().getDef().getPackageName();
        String configName =
            getValueBinding().getDCIteratorBinding().getDataControl().getDef().getConfiguration();
        // by prefixing config with package name, the OrdPlayMediaServlet uses the jbo session cookie to retrieve
        // the app module. This ensures it will also work when the Oracle Extended Page templates jar is added
        // to the project!! Yes, otherwise it no longer works because then the BindingContext does not contain any data control
        // that is used to retrieve the app module! Probably because two databindings.cpx on classpath
        // which is not correctly resolved with OrdMedia URL, although ADFBindingFilter is chained...
        String amConfig = packageName + "." + configName;
        String viewObjectFullName =
            getValueBinding().getDCIteratorBinding().getViewObject().getFullName();
        //
        // Get the ord.RetrievePath property from BC4J config
        //
        //    Hashtable env = am.getSession().getEnvironment();
        //    String retrPath = (String)env.get(PropertyConstants.ORD_RETRIEVE_PATH);
        //    if( retrPath == null || retrPath.length() == 0 )
        //    {
        //      retrPath = PropertyMetadata.ORD_RETRIEVE_PATH.getProperty();
        //    }

        String retrPath = PropertyMetadata.ORD_RETRIEVE_PATH.getProperty();

        Row currentRow =
            getTableBean() == null ? getValueBinding().getCurrentRow() :
            getCurrentRow();

        OrdURLBuilder builder =
            new OrdURLBuilder(appId, viewObjectFullName, currentRow,
                              getValueBinding().getAttributeDef().getName(),
                              retrPath, amConfig);
        // Fix for bug4492525, we need to return value starting with "/"
        // thus it can reenter the ADFBindingFilter to initialize the
        // datacontrol correctly to fetch the intermedia object.
        // Even more, we need to let the URL start with /faces/ to immediately
        // refresh an image after an update took place.
        // TODO: find a better way (not hardcoded) to retrieve the context (/faces)!
        // SDA 21-10-2010: / no longer needed, /faces/ does NOT solve caching problem
        // still nee to start new session to see image update
        String url = builder.getOrdDomainURL();
        if (!url.startsWith("/")) {
            //      url =  "/faces/" + url;
            url = "/" + url;
        }
        sLog.info("File Url: " + url);
        return url;
    }

    public boolean isFileExist() {
        if (getTableBean() == null)
            return getValueBinding().getInputValue() != null;
        else
            return getCurrentAttribute() != null;
    }

    public static void setUsesUpload(boolean usesUpload) {
        UIComponent form =
            FacesContext.getCurrentInstance().getViewRoot().findComponent("dataForm");
        if (form != null && form instanceof RichForm) {
            RichForm richForm = (RichForm)form;
            if (richForm.isUsesUpload() != usesUpload) {
                richForm.setUsesUpload(usesUpload);
                sLog.info("The attribute 'usesUpload' has been set to " +
                          usesUpload + " on the <af:form> element");
                AdfFacesContext.getCurrentInstance().addPartialTarget(richForm);
            }
        }
    }

    public void setUsesUploadIndicator(UIComponent usesUploadIndicator) {
        this.usesUploadIndicator = usesUploadIndicator;
        setUsesUpload(true);
    }

    public UIComponent getUsesUploadIndicator() {
        return usesUploadIndicator;
    }

    public void setTableBean(TableBean tableBean) {
        this.tableBean = tableBean;
    }

    public TableBean getTableBean() {
        return tableBean;
    }

    public void setFileNameWhenEmpty(String fileNameWhenEmpty) {
        this.fileNameWhenEmpty = fileNameWhenEmpty;
    }

    public String getFileNameWhenEmpty() {
        Object evaluated = JsfUtils.getExpressionValue(fileNameWhenEmpty);
        if (evaluated == null || evaluated.toString().length() == 0) {
            return "download"; // return this as the fallback scenario
        }

        return evaluated.toString();
    }
}
