package com.pq.tracs.view.beans;

import com.pq.tracs.model.services.TracsServiceImpl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ToolsBean {

    private enum ContractAction {
        ConATRt,
        ConATRa,
        ConATG;
    }

    public ToolsBean() {
        super();
    }

    private Number pContractId;
    private RichPopup confirmPopup;
    private String actionString;
    private String confirmMsg;

    public void handleOK(DialogEvent dialogEvent) {

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("TracsServiceDataControl");

            TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
            String statusMessage = null;

            try {
                switch (ContractAction.valueOf(actionString)) {
                case ConATRa:
                    statusMessage = appM.attachTitlesToRates(pContractId);
                    appM.getRoyaltyRateView1().executeQuery();
                    break;
                case ConATRt:
                    statusMessage = appM.attachTitlesToRights(pContractId);
                    appM.getContractRightView1().executeQuery();
                    break;
                case ConATG:
                    statusMessage = appM.attachTitlesToGuarantees(pContractId);
                    appM.getContractGuaranteeView1().executeQuery();
                    break;
                }
                appM.getDBTransaction().commit();
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage(statusMessage));
            } catch (Exception ex) {
                ex.printStackTrace();
                appM.getDBTransaction().rollback();
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage(ex.getMessage()));
            }
        } else {
            System.out.println("handle Cancel successful: " + actionString);
        }

    }

    public void updateRRG(ActionEvent actionEvent) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        String popupId = popupId = confirmPopup.getClientId(fctx);
        actionString = "" + actionEvent.getComponent().getId();
        pContractId =
                (Number)actionEvent.getComponent().getAttributes().get("pContractId");

        //Map paramMap = actionEvent.getComponent().getAttributes();
        script.append("var popup = AdfPage.PAGE.findComponent(\"").append(popupId).append("\");").append("var hints = {align:\"after_start\", alignId:\"").append("TitlesAddNotes").append("\"};").append("popup.show(hints);");

        switch (ContractAction.valueOf(actionString)) {
        case ConATRa:
            confirmMsg =
                    "Associate All Titles to All Royalties, do you want to proceed?";
            break;
        case ConATRt:
            confirmMsg =
                    "Associate All Titles to All Rights, do you want to proceed?";
            break;
        case ConATG:
            confirmMsg =
                    "Associate All Titles to All Guarantees, do you want to proceed?";
            break;
        default:
            confirmMsg = "Do you want to proceed?";
        }

        ExtendedRenderKitService erks =
            Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        erks.addScript(fctx, script.toString());

    }

    public void setConfirmPopup(RichPopup confirmPopup) {
        this.confirmPopup = confirmPopup;
    }

    public RichPopup getConfirmPopup() {
        return confirmPopup;
    }

    public void setActionString(String actionString) {
        this.actionString = actionString;
    }

    public String getActionString() {
        return actionString;
    }

    public void setPContractId(Number pContractId) {
        this.pContractId = pContractId;
    }

    public Number getPContractId() {
        return pContractId;
    }

    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    public String getConfirmMsg() {
        return confirmMsg;
    }
}

