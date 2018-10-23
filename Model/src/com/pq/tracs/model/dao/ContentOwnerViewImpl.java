package com.pq.tracs.model.dao;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ContentOwnerViewImpl extends TracsView {
    /**This is the default constructor (do not remove)
     */
    public ContentOwnerViewImpl() {
    }


    /**
     * Returns the bind variable value for SHOW_ALL.
     * @return bind variable value for SHOW_ALL
     */
    public String getSHOW_ALL() {
        return (String)getNamedWhereClauseParam("SHOW_ALL");
    }

    /**
     * Sets <code>value</code> for bind variable SHOW_ALL.
     * @param value value to bind as SHOW_ALL
     */
    public void setSHOW_ALL(String value) {
        setNamedWhereClauseParam("SHOW_ALL", value);
    }
}