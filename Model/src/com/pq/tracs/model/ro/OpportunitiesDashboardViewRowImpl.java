package com.pq.tracs.model.ro;

import java.math.BigDecimal;

import oracle.jbo.domain.Date;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 13 13:58:42 EDT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OpportunitiesDashboardViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getId();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        OpportunityName {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getOpportunityName();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setOpportunityName((String)value);
            }
        }
        ,
        CurrentStatus {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCurrentStatus();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCurrentStatus((String)value);
            }
        }
        ,
        AccountName {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getAccountName();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAccountName((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        AccountManager {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getAccountManager();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAccountManager((String)value);
            }
        }
        ,
        AmId {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getAmId();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAmId((BigDecimal)value);
            }
        }
        ,
        CataloguedCount {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCataloguedCount();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCataloguedCount((BigDecimal)value);
            }
        }
        ,
        UncataloguedCount {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getUncataloguedCount();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setUncataloguedCount((BigDecimal)value);
            }
        }
        ,
        SignedDate {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getSignedDate();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setSignedDate((Date)value);
            }
        }
        ,
        CurrentPreStatus {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCurrentPreStatus();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCurrentPreStatus((String)value);
            }
        }
        ,
        CurrentCatalogingStatus {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCurrentCatalogingStatus();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCurrentCatalogingStatus((String)value);
            }
        }
        ,
        CurrentAgreementStatus {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getCurrentAgreementStatus();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setCurrentAgreementStatus((String)value);
            }
        }
        ,
        AgreementDataFlag {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getAgreementDataFlag();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAgreementDataFlag((String)value);
            }
        }
        ,
        UserId {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getUserId();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setUserId((BigDecimal)value);
            }
        }
        ,
        Username {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getUsername();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setUsername((String)value);
            }
        }
        ,
        KeyAccountLevel {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getKeyAccountLevel();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setKeyAccountLevel((String)value);
            }
        }
        ,
        Priority {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getPriority();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setPriority((String)value);
            }
        }
        ,
        Form {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getForm();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setForm((String)value);
            }
        }
        ,
        Type {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getType();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setType((String)value);
            }
        }
        ,
        DashboardUserView {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getDashboardUserView();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NegotiableStageLookup2 {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getNegotiableStageLookup2();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OpportunityPriorityLookup {
            public Object get(OpportunitiesDashboardViewRowImpl obj) {
                return obj.getOpportunityPriorityLookup();
            }

            public void put(OpportunitiesDashboardViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(OpportunitiesDashboardViewRowImpl object);

        public abstract void put(OpportunitiesDashboardViewRowImpl object,
                                 Object value);

        public int index() {
            return OpportunitiesDashboardViewRowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return OpportunitiesDashboardViewRowImpl.AttributesEnum.firstIndex() + OpportunitiesDashboardViewRowImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = OpportunitiesDashboardViewRowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int OPPORTUNITYNAME = AttributesEnum.OpportunityName.index();
    public static final int CURRENTSTATUS = AttributesEnum.CurrentStatus.index();
    public static final int ACCOUNTNAME = AttributesEnum.AccountName.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int ACCOUNTMANAGER = AttributesEnum.AccountManager.index();
    public static final int AMID = AttributesEnum.AmId.index();
    public static final int CATALOGUEDCOUNT = AttributesEnum.CataloguedCount.index();
    public static final int UNCATALOGUEDCOUNT = AttributesEnum.UncataloguedCount.index();
    public static final int SIGNEDDATE = AttributesEnum.SignedDate.index();
    public static final int CURRENTPRESTATUS = AttributesEnum.CurrentPreStatus.index();
    public static final int CURRENTCATALOGINGSTATUS = AttributesEnum.CurrentCatalogingStatus.index();
    public static final int CURRENTAGREEMENTSTATUS = AttributesEnum.CurrentAgreementStatus.index();
    public static final int AGREEMENTDATAFLAG = AttributesEnum.AgreementDataFlag.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int KEYACCOUNTLEVEL = AttributesEnum.KeyAccountLevel.index();
    public static final int PRIORITY = AttributesEnum.Priority.index();
    public static final int FORM = AttributesEnum.Form.index();
    public static final int TYPE = AttributesEnum.Type.index();
    public static final int DASHBOARDUSERVIEW = AttributesEnum.DashboardUserView.index();
    public static final int NEGOTIABLESTAGELOOKUP2 = AttributesEnum.NegotiableStageLookup2.index();
    public static final int OPPORTUNITYPRIORITYLOOKUP = AttributesEnum.OpportunityPriorityLookup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OpportunitiesDashboardViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Id.
     * @return the Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Id.
     * @param value value to set the  Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OpportunityName.
     * @return the OpportunityName
     */
    public String getOpportunityName() {
        return (String) getAttributeInternal(OPPORTUNITYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OpportunityName.
     * @param value value to set the  OpportunityName
     */
    public void setOpportunityName(String value) {
        setAttributeInternal(OPPORTUNITYNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentStatus.
     * @return the CurrentStatus
     */
    public String getCurrentStatus() {
        return (String) getAttributeInternal(CURRENTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentStatus.
     * @param value value to set the  CurrentStatus
     */
    public void setCurrentStatus(String value) {
        setAttributeInternal(CURRENTSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AccountName.
     * @return the AccountName
     */
    public String getAccountName() {
        return (String) getAttributeInternal(ACCOUNTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccountName.
     * @param value value to set the  AccountName
     */
    public void setAccountName(String value) {
        setAttributeInternal(ACCOUNTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedDate.
     * @return the CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedDate.
     * @param value value to set the  CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AccountManager.
     * @return the AccountManager
     */
    public String getAccountManager() {
        return (String) getAttributeInternal(ACCOUNTMANAGER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccountManager.
     * @param value value to set the  AccountManager
     */
    public void setAccountManager(String value) {
        setAttributeInternal(ACCOUNTMANAGER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmId.
     * @return the AmId
     */
    public BigDecimal getAmId() {
        return (BigDecimal) getAttributeInternal(AMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AmId.
     * @param value value to set the  AmId
     */
    public void setAmId(BigDecimal value) {
        setAttributeInternal(AMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CataloguedCount.
     * @return the CataloguedCount
     */
    public BigDecimal getCataloguedCount() {
        return (BigDecimal) getAttributeInternal(CATALOGUEDCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CataloguedCount.
     * @param value value to set the  CataloguedCount
     */
    public void setCataloguedCount(BigDecimal value) {
        setAttributeInternal(CATALOGUEDCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UncataloguedCount.
     * @return the UncataloguedCount
     */
    public BigDecimal getUncataloguedCount() {
        return (BigDecimal) getAttributeInternal(UNCATALOGUEDCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UncataloguedCount.
     * @param value value to set the  UncataloguedCount
     */
    public void setUncataloguedCount(BigDecimal value) {
        setAttributeInternal(UNCATALOGUEDCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SignedDate.
     * @return the SignedDate
     */
    public Date getSignedDate() {
        return (Date) getAttributeInternal(SIGNEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SignedDate.
     * @param value value to set the  SignedDate
     */
    public void setSignedDate(Date value) {
        setAttributeInternal(SIGNEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentPreStatus.
     * @return the CurrentPreStatus
     */
    public String getCurrentPreStatus() {
        return (String) getAttributeInternal(CURRENTPRESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentPreStatus.
     * @param value value to set the  CurrentPreStatus
     */
    public void setCurrentPreStatus(String value) {
        setAttributeInternal(CURRENTPRESTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentCatalogingStatus.
     * @return the CurrentCatalogingStatus
     */
    public String getCurrentCatalogingStatus() {
        return (String) getAttributeInternal(CURRENTCATALOGINGSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentCatalogingStatus.
     * @param value value to set the  CurrentCatalogingStatus
     */
    public void setCurrentCatalogingStatus(String value) {
        setAttributeInternal(CURRENTCATALOGINGSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentAgreementStatus.
     * @return the CurrentAgreementStatus
     */
    public String getCurrentAgreementStatus() {
        return (String) getAttributeInternal(CURRENTAGREEMENTSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentAgreementStatus.
     * @param value value to set the  CurrentAgreementStatus
     */
    public void setCurrentAgreementStatus(String value) {
        setAttributeInternal(CURRENTAGREEMENTSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AgreementDataFlag.
     * @return the AgreementDataFlag
     */
    public String getAgreementDataFlag() {
        return (String) getAttributeInternal(AGREEMENTDATAFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AgreementDataFlag.
     * @param value value to set the  AgreementDataFlag
     */
    public void setAgreementDataFlag(String value) {
        setAttributeInternal(AGREEMENTDATAFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UserId.
     * @return the UserId
     */
    public BigDecimal getUserId() {
        return (BigDecimal) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UserId.
     * @param value value to set the  UserId
     */
    public void setUserId(BigDecimal value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Username.
     * @return the Username
     */
    public String getUsername() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Username.
     * @param value value to set the  Username
     */
    public void setUsername(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute KeyAccountLevel.
     * @return the KeyAccountLevel
     */
    public String getKeyAccountLevel() {
        return (String) getAttributeInternal(KEYACCOUNTLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute KeyAccountLevel.
     * @param value value to set the  KeyAccountLevel
     */
    public void setKeyAccountLevel(String value) {
        setAttributeInternal(KEYACCOUNTLEVEL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Priority.
     * @return the Priority
     */
    public String getPriority() {
        return (String) getAttributeInternal(PRIORITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Priority.
     * @param value value to set the  Priority
     */
    public void setPriority(String value) {
        setAttributeInternal(PRIORITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Form.
     * @return the Form
     */
    public String getForm() {
        return (String) getAttributeInternal(FORM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Form.
     * @param value value to set the  Form
     */
    public void setForm(String value) {
        setAttributeInternal(FORM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Type.
     * @return the Type
     */
    public String getType() {
        return (String) getAttributeInternal(TYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Type.
     * @param value value to set the  Type
     */
    public void setType(String value) {
        setAttributeInternal(TYPE, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link DashboardUserView.
     */
    public Row getDashboardUserView() {
        return (Row)getAttributeInternal(DASHBOARDUSERVIEW);
    }

    /**
     * Sets the master-detail link DashboardUserView between this object and <code>value</code>.
     */
    public void setDashboardUserView(Row value) {
        setAttributeInternal(DASHBOARDUSERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> NegotiableStageLookup2.
     */
    public RowSet getNegotiableStageLookup2() {
        return (RowSet)getAttributeInternal(NEGOTIABLESTAGELOOKUP2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OpportunityPriorityLookup.
     */
    public RowSet getOpportunityPriorityLookup() {
        return (RowSet)getAttributeInternal(OPPORTUNITYPRIORITYLOOKUP);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
