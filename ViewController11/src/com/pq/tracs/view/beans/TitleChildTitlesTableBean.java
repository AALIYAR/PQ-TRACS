package com.pq.tracs.view.beans;

import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class TitleChildTitlesTableBean extends TableBean {
    public TitleChildTitlesTableBean() {
        super();
    }

    private RichPopup reAssignPopup;
    private RichPopup noSelectPopup;
    private Number newCurrentId;
    private String newCurrentCatalog;
    private String catalogList;

    public void setReAssignPopup(RichPopup mypopup) {
        this.reAssignPopup = mypopup;
    }

    public RichPopup getReAssignPopup() {
        return reAssignPopup;
    }

    public void setNoSelectPopup(RichPopup noSelectionPopup) {
        this.noSelectPopup = noSelectionPopup;
    }

    public RichPopup getNoSelectPopup() {
        return noSelectPopup;
    }

    public void setNewCurrentCatalog(String newNoteType) {
        this.newCurrentCatalog = newNoteType;
    }

    public String getNewCurrentCatalog() {
        return newCurrentCatalog;
    }

    public void setCatalogList(String catalogList) {
        this.catalogList = catalogList;
    }

    public String getCatalogList() {
        return catalogList;
    }

    public void reAssignChildren(ActionEvent actionEvent) {

        RichTable table = this.getTable();
        RowKeySet keys = table.getSelectedRowKeys();
        Iterator keyIter = keys.iterator();

        FacesContext fctx = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        String popupId;

        if (!keyIter.hasNext()) {
            popupId = noSelectPopup.getClientId(fctx);
        } else {
            StringBuilder catList = new StringBuilder();
            while (keyIter.hasNext()) {
                Object key = keyIter.next();
                table.setRowKey(key);
                Row row = ((JUCtrlHierNodeBinding)table.getRowData()).getRow();

                catList.append((String)row.getAttribute("CatalogNumber"));
                if (keyIter.hasNext()) {
                    catList.append(", ");
                }
            }
            this.catalogList = catList.toString();
            popupId = reAssignPopup.getClientId(fctx);
        }

        script.append("var popup = AdfPage.PAGE.findComponent(\"").append(popupId).append("\");").append("var hints = {align:\"after_start\", alignId:\"").append("ReAssignChildTitles").append("\"};").append("popup.show(hints);");

        ExtendedRenderKitService erks =
            Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        erks.addScript(fctx, script.toString());

    }

    public void handleOK(DialogEvent dialogEvent) {

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            this.newCurrentId = null;
            RichTable table = this.getTable();
            RowKeySet keys = table.getSelectedRowKeys();
            Iterator keyIter = keys.iterator();

            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("TracsServiceDataControl");

            TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();

            newCurrentId = appM.getTitleIdByCatalog(this.newCurrentCatalog);

            if (newCurrentId != null) {
                while (keyIter.hasNext()) {
                    Object key = keyIter.next();
                    table.setRowKey(key);
                    Row row =
                        ((JUCtrlHierNodeBinding)table.getRowData()).getRow();
                    appM.reAssignChildCatalog((Number)row.getAttribute("Id"),
                                              newCurrentId);

                }
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage("Previous versions re-assigned to " +
                                                                              newCurrentCatalog));

                //Refresh the table
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage("Failure.  Could not re-assign to " +
                                                                              newCurrentCatalog));
            }
        }
    }

}
