package com.pq.tracs.view.beans;

import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.dao.TitleRecordViewRowImpl;
import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.OperationBinding;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class TableMultiDeleteBean extends TableBean {
    public TableMultiDeleteBean() {
        super();
    }

    private RichPopup confirmDeletePopup;

    public void handleOK(DialogEvent dialogEvent) {
        //getting table & key references from binding
        RichTable table = this.getTable();
        RowKeySet keys = table.getSelectedRowKeys();

        //getting iterator to iterate over selected row keys
        Iterator selection = keys.iterator();

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("TracsServiceDataControl");

        TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();

        String viewForDelete = null;
        if (this.getName().equalsIgnoreCase("TitleSubTabTable")) {
            viewForDelete = "ContractTitleView1";
        } else if (this.getName().equalsIgnoreCase("ContractRightsTable")) {
            viewForDelete = "ContractRightView1";
        } else if (this.getName().equalsIgnoreCase("ContractRightTitlesTable")) {
            viewForDelete = "JContractRightTitlesView1";
        } else if (this.getName().equalsIgnoreCase("RoyaltyRateTitleTable")) {
            viewForDelete = "ContractRoyaltyRateTitleView1";
        } else if (this.getName().equalsIgnoreCase("OvrRightsTable")) {
            viewForDelete = "TraxTitleRecordRightView4";
            TitleRecordViewRowImpl trr =
                (TitleRecordViewRowImpl)appM.getTitleRecordView2().getCurrentRow();
            trr.setLastUpdatedBy(appM.getUsername());
        } else if (this.getName().equalsIgnoreCase("ContractGuaranteeTitleTable")) {
            viewForDelete = "ContractGuaranteeTitleView1";
        } else if (this.getName().equalsIgnoreCase("TargetGroupTitlesTable")) {
            viewForDelete = "PrmTargetGroupTitleView1";
        } else if (this.getName().equalsIgnoreCase("ContractGuaranteeTable")) {
            viewForDelete = "ContractGuaranteeView1";
        }

        appM.deleteSelectedRows(selection, viewForDelete);


        //Refresh the table
        AdfFacesContext.getCurrentInstance().addPartialTarget(table);
        FacesContext.getCurrentInstance().addMessage(null,
                                                     new FacesMessage("Delete successful."));

    }

    public void setConfirmDeletePopup(RichPopup confirmDeletePopup) {
        this.confirmDeletePopup = confirmDeletePopup;
    }

    public RichPopup getConfirmDeletePopup() {
        return confirmDeletePopup;
    }
}
