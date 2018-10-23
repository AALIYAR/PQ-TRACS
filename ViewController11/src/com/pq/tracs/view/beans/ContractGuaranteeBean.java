package com.pq.tracs.view.beans;

import com.pq.tracs.model.dao.ContractGuaranteeViewImpl;
import com.pq.tracs.model.dao.ContractGuaranteeViewRowImpl;
import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.services.TracsServiceImpl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

public class ContractGuaranteeBean extends TableMultiDeleteBean {
    public ContractGuaranteeBean() {
        super();
    }

    private RichPopup confirmAddPopup;

    private String newCurrency;
    private String newAmount = "0";
    private String newMedia;
    private String newDeliveryFormat;
    private String newProductCode;
    private String newInventoryDivision;

    public void setConfirmAddPopup(RichPopup confirmAddPopup) {
        this.confirmAddPopup = confirmAddPopup;
    }

    public RichPopup getConfirmAddPopup() {
        return confirmAddPopup;
    }

    public void setNewCurrency(String newCurrency) {
        this.newCurrency = newCurrency;
    }

    public String getNewCurrency() {
        return newCurrency;
    }

    public void setNewAmount(String newAmount) {
        this.newAmount = newAmount;
    }

    public String getNewAmount() {
        return newAmount;
    }

    public void setNewMedia(String newMedia) {
        this.newMedia = newMedia;
    }

    public String getNewMedia() {
        return newMedia;
    }

    public void setNewDeliveryFormat(String newDeliveryFormat) {
        this.newDeliveryFormat = newDeliveryFormat;
    }

    public String getNewDeliveryFormat() {
        return newDeliveryFormat;
    }

    public void setNewProductCode(String newProductCode) {
        this.newProductCode = newProductCode;
    }

    public String getNewProductCode() {
        return newProductCode;
    }

    public void setNewInventoryDivision(String newInventoryDivision) {
        this.newInventoryDivision = newInventoryDivision;
    }

    public String getNewInventoryDivision() {
        return newInventoryDivision;
    }


    public void handleCreateOK(DialogEvent dialogEvent) {

        try {
            // only proceed if user clicked OK
            if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {

                // get an instance of the application module
                DCDataControl dc =
                    BindingContext.getCurrent().findDataControl("TracsServiceDataControl");
                TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();

                // get the contract view row
                ContractViewRowImpl cvr =
                    (ContractViewRowImpl)appM.getContractView2().getCurrentRow();

                // get the term length from the current contract row
                String termLength = cvr.getTermLength();

                // only proceed if the contract has a valid term length
                if (!termLength.equalsIgnoreCase("Evergreen")) {

                    // create temp variables to store the values from the popup
                    String tCurrency = null;
                    Number tAmount = null;
                    String tMedia = null;
                    String tDeliveryFormat = null;
                    String tProductCode = null;
                    String tInventoryDivision = null;

                    int term = 0;
                    int years = 0;
                    if (termLength.equalsIgnoreCase("1 Year")) {
                        term = 12;
                        years = 1;
                    } else if (termLength.equalsIgnoreCase("2 Years")) {
                        term = 24;
                        years = 2;
                    } else if (termLength.equalsIgnoreCase("3 Years")) {
                        term = 36;
                        years = 3;
                    } else if (termLength.equalsIgnoreCase("4 Years")) {
                        term = 48;
                        years = 4;
                    } else if (termLength.equalsIgnoreCase("5 Years")) {
                        term = 60;
                        years = 5;
                    } else if (termLength.equalsIgnoreCase("6 Years")) {
                        term = 72;
                        years = 6;
                    } else if (termLength.equalsIgnoreCase("7 Years")) {
                        term = 84;
                        years = 7;
                    } else if (termLength.equalsIgnoreCase("8 Years")) {
                        term = 96;
                        years = 8;
                    } else if (termLength.equalsIgnoreCase("9 Years")) {
                        term = 108;
                        years = 9;
                    } else if (termLength.equalsIgnoreCase("10 Years")) {
                        term = 120;
                        years = 10;
                    } else if (termLength.equalsIgnoreCase("18 Months")) {
                        term = 18;
                        years = 2;
                    } else if (termLength.equalsIgnoreCase("30 Months")) {
                        term = 30;
                        years = 3;
                    } else if (termLength.equalsIgnoreCase("42 Months")) {
                        term = 42;
                        years = 4;
                    }

                    // translate the values (from list indexes to strings)
                    if (this.newCurrency != null &&
                        !this.newCurrency.isEmpty() &&
                        this.newCurrency.length() > 0) {
                        tCurrency =
                                (String)appM.getContractGuaranteeCurrencyLookup().getRowAtRangeIndex(Integer.decode(this.newCurrency).intValue()).getAttribute("InternalValue");
                    }

                    if (this.newMedia != null && !this.newMedia.isEmpty() &&
                        this.newMedia.length() > 0) {
                        tMedia =
                                (String)appM.getContractGuaranteeMediaCodeLookup().getRowAtRangeIndex(Integer.decode(this.newMedia).intValue()).getAttribute("InternalValue");
                    }

                    if (this.newDeliveryFormat != null &&
                        !this.newDeliveryFormat.isEmpty() &&
                        this.newDeliveryFormat.length() > 0) {
                        tDeliveryFormat =
                                (String)appM.getContractGuaranteeDeliveryFormatLookup().getRowAtRangeIndex(Integer.decode(this.newDeliveryFormat).intValue()).getAttribute("InternalValue");
                    }

                    if (this.newProductCode != null &&
                        !this.newProductCode.isEmpty() &&
                        this.newProductCode.length() > 0) {
                        tProductCode =
                                (String)appM.getContractGuaranteeProductCodeLookup().getRowAtRangeIndex(Integer.decode(this.newProductCode).intValue()).getAttribute("InternalValue");
                    }


                    if (this.newInventoryDivision != null &&
                        !this.newInventoryDivision.isEmpty() &&
                        this.newInventoryDivision.length() > 0) {
                        tInventoryDivision =
                                (String)appM.getContractGuaranteeInventoryDivisionLookup().getRowAtRangeIndex(Integer.decode(this.newInventoryDivision).intValue()).getAttribute("InternalValue");
                    }

                    // translate amount to a number
                    if (!this.newAmount.isEmpty() &&
                        this.newAmount.length() > 0) {
                        tAmount = new Number(this.getNewAmount());
                    }

                    // get the appropriate start and end dates for the contract
                    // first check for existing guarantees
                    ContractGuaranteeViewImpl contractGuarantees =
                        appM.getContractGuaranteeView1();
                    ContractGuaranteeViewRowImpl firstRow =
                        (ContractGuaranteeViewRowImpl)contractGuarantees.first();
                    Date effectiveDate;

                    if (firstRow != null) {
                        // if a guarantee exists, set the start date to the day after the most recent (should be first by the order clause)
                        effectiveDate =
                                new Date(firstRow.getEffectiveEndDate());
                        effectiveDate.addJulianDays(1, 0);
                    } else {
                        effectiveDate = cvr.getEffectiveDate();
                    }

                    // if the effective date is before the start date of the contract, reset it to the expiration date minus the term
                    Date startDate = new Date(cvr.getExpirationDate());
                    startDate.addMonths(-(term));
                    startDate.addJulianDays(1, 0);
                    if (effectiveDate.compareTo(startDate) < 0) {
                        effectiveDate = startDate;
                    }

                    Date expirationDate = cvr.getExpirationDate();

                    // for each year in the contract (starting with the current year) create a new guarantee row
                    for (int i = 0; i < years; i++) {

                        oracle.jbo.domain.Date jbo_ef =
                            new oracle.jbo.domain.Date(effectiveDate);
                        jbo_ef.addMonths(i * 12);

                        if (jbo_ef.compareTo(expirationDate) >= 0) {
                            // if the new effective date is equal to or past the expiration date, exit the loop
                            break;
                        }

                        oracle.jbo.domain.Date jbo_ex =
                            new oracle.jbo.domain.Date(jbo_ef.dateValue());
                        jbo_ex.addMonths(12);
                        jbo_ex.addJulianDays(-1, 0);

                        if (jbo_ex.compareTo(expirationDate) > 0) {
                            jbo_ex = expirationDate;
                        }

                        ContractGuaranteeViewRowImpl newGuar =
                            (ContractGuaranteeViewRowImpl)contractGuarantees.createRow();

                        newGuar.setCurrency(tCurrency);
                        newGuar.setAmount(tAmount);
                        newGuar.setEffectiveStartDate(jbo_ef);
                        newGuar.setEffectiveEndDate(jbo_ex);
                        newGuar.setMedia(tMedia);
                        newGuar.setDeliveryFormat(tDeliveryFormat);
                        newGuar.setProductCode(tProductCode);
                        newGuar.setInventoryDivision(tInventoryDivision);

                        //Insert that row in ViewObject
                        appM.getContractGuaranteeView1().insertRow(newGuar);
                    } //for loop

                    FacesContext.getCurrentInstance().addMessage(null,
                                                                 new FacesMessage("Guarantees added successfully."));
                    appM.getDBTransaction().commit();
                    //appM.getContractGuaranteeView1().executeQuery();
                    AdfFacesContext.getCurrentInstance().addPartialTarget(this.getTable());

                } // if term length is verified
                else {
                    FacesContext.getCurrentInstance().addMessage(null,
                                                                 new FacesMessage("Cannot Add Gaurantee with Term Length " +
                                                                                  termLength));
                } // if term length doesnt match

            }
            this.setNewAmount("0");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
