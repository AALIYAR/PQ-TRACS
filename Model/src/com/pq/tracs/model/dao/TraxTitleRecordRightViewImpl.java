package com.pq.tracs.model.dao;

import oracle.jbo.AttributeList;
import oracle.jbo.Row;
import oracle.jbo.RowMatch;
import oracle.jbo.UpdateEvent;
import oracle.jbo.server.Entity;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.QueryCollection;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TraxTitleRecordRightViewImpl extends TracsView {
    /**This is the default constructor (do not remove)
     */
    public TraxTitleRecordRightViewImpl() {
    }
    
    @Override
    protected boolean rowQualifies (ViewRowImpl viewRowImpl) {
    EntityImpl primaryEntity = viewRowImpl.getEntity(0);
    if (primaryEntity != null && primaryEntity.getEntityState() != Entity.STATUS_UNMODIFIED){
        return false;
    }
    return super.rowQualifies(viewRowImpl);
       }

        
//    System.out.println("primary entity:  "  +primaryEntity.getEntityState());
//    System.out.println("status:  "  +primaryEntity);
//
//    System.out.println("In impl: "  +this.getrightTypeValue());
//    System.out.println("vrow: " +viewRowImpl);
//       System.out.println( "vo: " +this.getViewObject());
//    //  this.getViewObject().setAssociationConsistent(false);

    /**Gets the bind variable value for rightTypeValue
     */
    public String getrightTypeValue() {
        return (String)getNamedWhereClauseParam("rightTypeValue");
    }

    /**Sets <code>value</code> for bind variable rightTypeValue
     */
    public void setrightTypeValue(String value) {
        setNamedWhereClauseParam("rightTypeValue", value);
    }
    
}