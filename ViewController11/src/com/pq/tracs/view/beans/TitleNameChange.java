package com.pq.tracs.view.beans;


import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.dao.TitleViewImpl;
import com.pq.tracs.model.dao.TitleViewRowImpl;
import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;

import oracle.jheadstart.controller.jsf.bean.DynamicRegionManager;
import oracle.jheadstart.view.dyntab.DynTab;
import oracle.jheadstart.view.dyntab.DynTabContext;
import oracle.jheadstart.view.dyntab.DynTabTracker;
import oracle.jheadstart.view.dyntab.DynTabContext.TabOverflowException;
import oracle.jheadstart.view.dyntab.DynTabLauncher;


public class TitleNameChange {

    TracsServiceImpl appM;
    TitleViewRowImpl newTitleRow;
    TitleViewRowImpl currentTitleRow;


    public TitleNameChange() {

        FacesContext context = FacesContext.getCurrentInstance();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("TracsServiceDataControl");

        appM = (TracsServiceImpl)dc.getDataProvider();

    }

    private TitleViewRowImpl getCurrentTitle() {
        // get the title view
        TitleViewImpl tvo = (TitleViewImpl)appM.getTitleView1();

        // get the current title (row)
        return (TitleViewRowImpl)tvo.getCurrentRow();

    }

    public void ExecuteNameChange() {

        newTitleRow = appM.executeNameChange();

        try {
            appM.getDBTransaction().commit();
        } catch (Exception e) {
            // you handle the exception here
            e.printStackTrace();
        }


    }

    /*
     * Similarly, we need to call the copyTitle() method from TracsServiceImpl
     * then restart the taskflow to prevent display of previous version of title
     */

    public void CopyTitle() {

        newTitleRow = appM.copyTitle();
        appM.getDBTransaction().commit();
    }

    public String getTitleId() {
        if (newTitleRow == null) {
            ExecuteNameChange();
        }
        return newTitleRow.getId().toString();
    }

    public String getCatalogNumber() {
        if (newTitleRow == null) {
            ExecuteNameChange();
        }
        return newTitleRow.getCatalogNumber();
    }

    public String getCopyTitleId() {
        if (newTitleRow == null) {
            CopyTitle();
        }
        return newTitleRow.getId().toString();
    }

    public String getCopyCatalogNumber() {
        if (newTitleRow == null) {
            CopyTitle();
        }
        return newTitleRow.getCatalogNumber();
    }

}
