package com.pq.tracs.model.dao;

import oracle.jbo.Key;;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;

public class TracsView extends ViewObjectImpl {
    Key key = null;

    @Override
    public void executeQuery() {
        try {
        super.executeQuery();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        if (key != null) {
//            findAndSetCurrentRowByKey(key, 1);
//            key = null;
//        }
    }

    @Override
    public void afterCommit(TransactionEvent transactionEvent) {
//        if (getCurrentRow() != null) {
//            key = getCurrentRow().getKey();
//
//        }
        
        super.afterCommit(transactionEvent);
    }

}