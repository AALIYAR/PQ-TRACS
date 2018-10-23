package com.pq.tracs.view.beans;

import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.Iterator;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import oracle.jheadstart.controller.jsf.bean.TableBean;

import org.apache.myfaces.trinidad.model.RowKeySet;

public class TitleOpportunitiesTableBean extends TableBean {
    public TitleOpportunitiesTableBean() {
        super();
    }

    private RichPopup correctTitlePopup;
    private String correctTrackingNo;
    private String correctCatalogNo;

    public void setCorrectTitlePopup(RichPopup correctTitlePopup) {
        this.correctTitlePopup = correctTitlePopup;
    }

    public RichPopup getCorrectTitlePopup() {
        return correctTitlePopup;
    }

    public void setCorrectTrackingNo(String correctTrackingNo) {
        this.correctTrackingNo = correctTrackingNo;
    }

    public String getCorrectTrackingNo() {
        return correctTrackingNo;
    }

    public void setCorrectCatalogNo(String correctCatalogNo) {
        this.correctCatalogNo = correctCatalogNo;
    }

    public String getCorrectCatalogNo() {
        return correctCatalogNo;
    }

    public void handleOK(DialogEvent dialogEvent) {
        try {
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
                    Row row =
                        ((JUCtrlHierNodeBinding)table.getRowData()).getRow();
                    appM.switchTarget((Number)row.getAttribute("TitleId"),
                                      (Number)row.getAttribute("Id"),
                                      this.correctTrackingNo,
                                      this.correctCatalogNo);

                }

                this.correctCatalogNo = "";
                this.correctTrackingNo = "";

                DCBindingContainer bindings =
                    (DCBindingContainer)bindingContext.getCurrentBindingsEntry();
                if (this.getName().equalsIgnoreCase("NewTitleOpportunitiesTable")) {
                    DCIteratorBinding iter =
                        bindings.findIteratorBinding("NewTitleOpportunitiesIterator");
                    iter.executeQuery();

                } else {
                    DCIteratorBinding iter =
                        bindings.findIteratorBinding("TitleOpportunitiesIterator");
                    iter.executeQuery();

                }
                //Refresh the table
                AdfFacesContext.getCurrentInstance().addPartialTarget(table);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
