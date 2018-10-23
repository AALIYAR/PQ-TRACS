package com.pq.tracs.model.dao;

import oracle.jbo.Key;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TitleRecordViewImpl extends TracsView {
    /**This is the default constructor (do not remove)
     */
    public TitleRecordViewImpl() {
    }

    @Override
    public void afterCommit(TransactionEvent transactionEvent) {
        if (getCurrentRow() != null) {
            key = getCurrentRow().getKey();

        }
        super.afterCommit(transactionEvent);
    }

    @Override
    public void executeQuery() {
        try {
        super.executeQuery();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (key != null) {
            findAndSetCurrentRowByKey(key, 1);
            key = null;
        }
    }
}
