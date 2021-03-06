package com.pq.tracs.model.lookups;

import com.pq.tracs.model.dao.ContractTitleViewImpl;
import com.pq.tracs.model.dao.ContractViewImpl;

import com.pq.tracs.model.dao.JContractRightTitlesViewImpl;

import com.pq.tracs.model.dao.TracsView;

import java.sql.ResultSet;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ContentOwnerTitlesLookupImpl extends TracsView {
    /**This is the default constructor (do not remove)
     */
    public ContentOwnerTitlesLookupImpl() {
    }


    protected void create() {
        super.create();
        setManageRowsByKey(true);
    }


    /**executeQueryForCollection - overridden for custom java data source support.
     */
    protected void executeQueryForCollection(Object qc, Object params[], int noUserParams) {
    
//        // get the contract view row for the current contract
//        ContractViewImpl o = (ContractViewImpl)this.getApplicationModule().findViewObject("ContractView2");
//        Row r = o.getCurrentRow();
//        
//        // pull the contract ID
//        Object contractId = r.getAttribute("Id");
//        
//        this.setWhereClause("NOT EXISTS(select 1 from trax_contract_title tct where tct.title_id = QRSLT.ID and tct.contract_id=" + contractId + ")");
//        
        super.executeQueryForCollection(qc, params, noUserParams);

    }

    /**hasNextForCollection - overridden for custom java data source support.
     */
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**createRowFromResultSet - overridden for custom java data source support.
     */
    protected ViewRowImpl createRowFromResultSet(Object qc, 
                                                 ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**getEstimatedRowCount - overridden for custom java data source support.
     */
    public long getEstimatedRowCount() {
        long value = super.getEstimatedRowCount();
        return value;
    }

    /**
     * Returns the bind variable value for contract_id.
     * @return bind variable value for contract_id
     */
    public Number getcontract_id() {
        return (Number)getNamedWhereClauseParam("contract_id");
    }

    /**
     * Sets <code>value</code> for bind variable contract_id.
     * @param value value to bind as contract_id
     */
    public void setcontract_id(Number value) {
        setNamedWhereClauseParam("contract_id", value);
    }

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }
}
