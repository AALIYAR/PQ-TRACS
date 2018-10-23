package com.pq.tracs.view.beans;

import java.io.IOException;
import java.io.InputStream;

import java.sql.SQLException;

import javax.faces.event.ValueChangeEvent;

import oracle.jbo.domain.BlobDomain;

import oracle.jheadstart.controller.jsf.bean.FileHandlerBean;

import oracle.ord.im.OrdDomainIOInterface;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class ImportFileHandlerBean extends FileHandlerBean {
    public ImportFileHandlerBean() {
        super();
    }


    @Override
    public void uploadBlobFile(ValueChangeEvent event) {
        super.uploadBlobFile(event);

        try {
            UploadedFile file = (UploadedFile)event.getNewValue();

            getValueBinding().getViewObject().getCurrentRow().setAttribute("ImportFileName",
                                                                           file.getFilename());

        } catch (Exception ex) {
            System.out.println("EX");
            ex.printStackTrace();
        }
    }

    @Override
    public String getFileName() {

        // try to derive from file object
        Object file =
            getTableBean() == null ? getValueBinding().getInputValue() :
            getCurrentAttribute();

        if (file instanceof OrdDomainIOInterface) {
            try {
                return ((OrdDomainIOInterface)file).getSourceName();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            if (getTableBean() == null) {
                return (String)getValueBinding().getViewObject().getCurrentRow().getAttribute("ImportFileName");
            } else {
                return (String)this.getCurrentRow().getAttribute("ImportFileName");
            }
        }

        return super.getFileName();
    }
}
