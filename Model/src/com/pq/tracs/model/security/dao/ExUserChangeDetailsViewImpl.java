package com.pq.tracs.model.security.dao;

import com.pq.tracs.model.dao.TracsView;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jheadstart.model.JhsUserContext;
import oracle.jheadstart.model.adfbc.v2.JhsApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExUserChangeDetailsViewImpl extends TracsView {
    /**This is the default constructor (do not remove)
     */
    public ExUserChangeDetailsViewImpl() {
    }
    
    public void executeQuery () {

        ApplicationModule am = getDBTransaction().getRootApplicationModule();
        JhsApplicationModule jhsAm = (JhsApplicationModule)am;
        Object user = jhsAm.getUser();
        JhsUserContext userContext = (JhsUserContext)user;
        
        setNamedWhereClauseParam("USER_NAME", userContext.getUserId());
        
        super.executeQuery();
                    
    }

    /**Gets the bind variable value for USER_NAME
     */
    public String getUSER_NAME() {
        return (String)getNamedWhereClauseParam("USER_NAME");
    }

    /**Sets <code>value</code> for bind variable USER_NAME
     */
    public void setUSER_NAME(String value) {
        setNamedWhereClauseParam("USER_NAME", value);
    }    
}
