
package com.pq.tracs.view.beans;

import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.services.TracsServiceImpl;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;

public class CopyContractBean {
    ContractViewRowImpl newContractRow;
    ContractViewRowImpl currentContractRow;
    TracsServiceImpl appM;

    public CopyContractBean() {

        FacesContext context = FacesContext.getCurrentInstance();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("TracsServiceDataControl");

        appM = (TracsServiceImpl)dc.getDataProvider();
    }

    public String getContractId() {
        if (newContractRow == null) {
            CopyContract();
        }
        return newContractRow.getId().toString();
    }

    public String getContractNo() {
        if (newContractRow == null) {
            CopyContract();
        }
        return newContractRow.getContractNumber();
    }

    public void CopyContract() {
        newContractRow = (ContractViewRowImpl)appM.copyContract();
        appM.getDBTransaction().commit();
    }
}
