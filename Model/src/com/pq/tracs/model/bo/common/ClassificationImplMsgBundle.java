package com.pq.tracs.model.bo.common;

import oracle.jbo.common.JboResourceBundle;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public class ClassificationImplMsgBundle extends JboResourceBundle {


    static final Object[][] sMessageStrings = 
    {
{ "ClassificationNumber_Rule_0", "The given Legacy ID already exists in the system.  Please assign another." },
{ "ClassificationType_Rule_0", "That is not the correct Legacy Id type for the OVR's Content Source." }, { "PrimaryFlag_LABEL", "Primary Flag" }, { "ClassificationType_LABEL", "Classification Type" }, { "ClassificationNumber_LABEL", "Classification Number" }, { "CreatedBy_LABEL", "Created By" }, { "CreatedDate_LABEL", "Created Date" }, { "LastUpdatedBy_LABEL", "Last Updated By" }, { "LastUpdatedDate_LABEL", "Last Updated Date" }, { "GenerationMethod_LABEL", "Generation Method" } };

    /**This is the default constructor (do not remove)
     */
    public ClassificationImplMsgBundle() {
    }

    /**@return an array of key-value pairs.
     */
    public Object[][] getContents() {
        return super.getMergedArray(sMessageStrings, super.getContents());
    }
}