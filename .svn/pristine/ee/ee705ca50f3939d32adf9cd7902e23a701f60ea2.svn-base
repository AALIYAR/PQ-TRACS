package com.pq.tracs.view.beans;

import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.dao.TitleViewRowImpl;
import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.Iterator;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;

public class TitleCreateOvrBean extends TableBean {
    public TitleCreateOvrBean() {
        super();
    }

    private RichPopup confirmCreatePopup;
    private String newContentSource;
    private String newAutoGenRuleSet;
    private String newPMID;

    public void setConfirmCreatePopup(RichPopup confirmCreatePopup) {
        this.confirmCreatePopup = confirmCreatePopup;
    }

    public RichPopup getConfirmCreatePopup() {
        return confirmCreatePopup;
    }

    public void setNewContentSource(String newContentSource) {
        this.newContentSource = newContentSource;
    }

    public String getNewContentSource() {
        return newContentSource;
    }

    public void setNewAutoGenRuleSet(String newAutoGenRuleSet) {
        this.newAutoGenRuleSet = newAutoGenRuleSet;
    }

    public String getNewAutoGenRuleSet() {
        return newAutoGenRuleSet;
    }


    public void setNewPMID(String newPMID) {
        this.newPMID = newPMID;
    }

    public String getNewPMID() {
        return newPMID;
    }

    public void handleCreateOK(DialogEvent dialogEvent) {

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            if (this.newContentSource != null &&
                !this.newContentSource.isEmpty() &&
                this.newContentSource.length() > 0) {
                // get an instance of the application module
                DCDataControl dc =
                    BindingContext.getCurrent().findDataControl("TracsServiceDataControl");
                TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();

                // get the contract view row
                TitleViewRowImpl titleRow =
                    (TitleViewRowImpl)appM.getTitleView1().getCurrentRow();

                // get the term length from the current contract row
                Number titleId = titleRow.getId();
                String contentSource = null;
                String autoGenRuleSet = null;

                contentSource =
                        (String)appM.getContentSourceLookup().getRowAtRangeIndex(Integer.decode(this.newContentSource).intValue()).getAttribute("InternalValue");

                if (this.newAutoGenRuleSet != null &&
                    !this.newAutoGenRuleSet.isEmpty() &&
                    this.newAutoGenRuleSet.length() > 0) {
                    autoGenRuleSet =
                            (String)appM.getAutoGenRuleSetLookup().getRowAtRangeIndex(Integer.decode(this.newAutoGenRuleSet).intValue()).getAttribute("InternalValue");
                }

                appM.CreateOVR(titleId, this.newPMID, contentSource,
                               autoGenRuleSet);

                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage("New OVR created."));
                appM.getDBTransaction().commit();

                //appM.getContractGuaranteeView1().executeQuery();
                appM.getTitleRecordView1().executeQuery();
                AdfFacesContext.getCurrentInstance().addPartialTarget(this.getTable());
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                                              "Content Source required.",
                                                                              "You must select a Content Source."));
            }
        }

        this.newPMID = null;
        this.newContentSource = null;
        this.newAutoGenRuleSet = null;
    }

}
