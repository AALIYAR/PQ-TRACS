package com.pq.tracs.model.custom.dao;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomSecurityUserVOImpl extends ViewObjectImpl {
    /**This is the default constructor (do not remove)
     */
    public CustomSecurityUserVOImpl() {
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