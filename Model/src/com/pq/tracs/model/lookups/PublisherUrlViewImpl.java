package com.pq.tracs.model.lookups;

import com.pq.tracs.model.dao.TracsView;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PublisherUrlViewImpl extends TracsView {

    private static final int URLCODESETID = 114;
    
    /**This is the default constructor (do not remove)
     */
    public PublisherUrlViewImpl() {
    }

    public static Number getURLCODESETID() {
        return new Number(URLCODESETID);
    }
}