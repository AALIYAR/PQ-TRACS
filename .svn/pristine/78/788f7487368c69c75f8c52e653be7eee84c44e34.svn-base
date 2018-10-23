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
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ManufacturingTitlesTableBean extends TableBean {
    public ManufacturingTitlesTableBean() {
        super();
    }

    private RichPopup updateCIRPopup;
    private RichPopup noSelectionPopup;
    private String newCIR;
    private String catalogList;

    public void setUpdateCIRPopup(RichPopup mypopup) {
        this.updateCIRPopup = mypopup;
    }

    public RichPopup getUpdateCIRPopup() {
        return updateCIRPopup;
    }

    public void setNoSelectionPopup(RichPopup noSelectionPopup) {
        this.noSelectionPopup = noSelectionPopup;
    }

    public RichPopup getNoSelectionPopup() {
        return noSelectionPopup;
    }

    public void setNewCIR(String newNoteType) {
        this.newCIR = newNoteType;
    }

    public String getNewCIR() {
        return newCIR;
    }

    public void setCatalogList(String catalogList) {
        this.catalogList = catalogList;
    }

    public String getCatalogList() {
        return catalogList;
    }

    public void updateCIR(ActionEvent actionEvent) {

        newCIR = new String();

        RichTable table = this.getTable();
        RowKeySet keys = table.getSelectedRowKeys();
        Iterator keyIter = keys.iterator();

        FacesContext fctx = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        String popupId;

        if (!keyIter.hasNext()) {
            popupId = noSelectionPopup.getClientId(fctx);
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
            popupId = updateCIRPopup.getClientId(fctx);
        }

        script.append("var popup = AdfPage.PAGE.findComponent(\"").append(popupId).append("\");").append("var hints = {align:\"after_start\", alignId:\"").append("TitlesAddNotes").append("\"};").append("popup.show(hints);");

        ExtendedRenderKitService erks =
            Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        erks.addScript(fctx, script.toString());

    }

    public void handleOK(DialogEvent dialogEvent) {

        RichTable table = this.getTable();
        RowKeySet keys = table.getSelectedRowKeys();
        Iterator keyIter = keys.iterator();

        FacesContext context = FacesContext.getCurrentInstance();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("TracsServiceDataControl");

        TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            while (keyIter.hasNext()) {
                Object key = keyIter.next();
                table.setRowKey(key);
                Row row = ((JUCtrlHierNodeBinding)table.getRowData()).getRow();
                appM.updateCIR((Number)row.getAttribute("Id"), this.newCIR);

            }

            //Refresh the table
            AdfFacesContext.getCurrentInstance().addPartialTarget(table);
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("Update successful."));

        }

    }

}
