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

public class UlrichsCreateTargetBean {

    public UlrichsCreateTargetBean() {
        super();
    }

    private Number pUlrichsId;
    private RichPopup confirmPopup;
    private String confirmMsg;

    public void handleOK(DialogEvent dialogEvent) {

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("TracsServiceDataControl");

            TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
            String statusMessage = null;

            try {
                appM.createTargetFromUlrichs();

                appM.getDBTransaction().commit();
                appM.getTraxUlrichsTitleView1().executeQuery();

                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage("New target created."));
            } catch (Exception ex) {
                appM.getDBTransaction().rollback();
                FacesContext.getCurrentInstance().addMessage(null,
                                                             new FacesMessage(ex.getMessage()));
            }
        } else {
            System.out.println("handle Cancel successful");
        }

    }

    public void updateRRG(ActionEvent actionEvent) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        String popupId = popupId = confirmPopup.getClientId(fctx);
        pUlrichsId =
                (Number)actionEvent.getComponent().getAttributes().get("pContractId");

        //Map paramMap = actionEvent.getComponent().getAttributes();
        script.append("var popup = AdfPage.PAGE.findComponent(\"").append(popupId).append("\");").append("var hints = {align:\"after_start\", alignId:\"").append("TitlesAddNotes").append("\"};").append("popup.show(hints);");

        confirmMsg = "Are you sure you want to create a new target?";

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

    public void setPUlrichsId(Number pContractId) {
        this.pUlrichsId = pContractId;
    }

    public Number getPUlrichsId() {
        return pUlrichsId;
    }

    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    public String getConfirmMsg() {
        return confirmMsg;
    }
}
