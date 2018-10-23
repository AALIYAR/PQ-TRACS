package com.pq.tracs.model.dao;

import com.pq.tracs.model.bo.RoyaltyInformationImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RoyaltyInformationViewRowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getId();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        ContractId {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getContractId();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setContractId((Number)value);
            }
        }
        ,
        RoyaltyContactId {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getRoyaltyContactId();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setRoyaltyContactId((Number)value);
            }
        }
        ,
        RoyaltyContact {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getRoyaltyContact();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setRoyaltyContact((String)value);
            }
        }
        ,
        Currency {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getCurrency();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setCurrency((String)value);
            }
        }
        ,
        PaymentFrequency {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getPaymentFrequency();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setPaymentFrequency((String)value);
            }
        }
        ,
        GuaranteeFrequency {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getGuaranteeFrequency();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setGuaranteeFrequency((String)value);
            }
        }
        ,
        InterimPaymentTermDays {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getInterimPaymentTermDays();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setInterimPaymentTermDays((Number)value);
            }
        }
        ,
        AnnualPaymentTermDays {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getAnnualPaymentTermDays();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAnnualPaymentTermDays((Number)value);
            }
        }
        ,
        AdvanceRoyaltyAmount {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getAdvanceRoyaltyAmount();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAdvanceRoyaltyAmount((Number)value);
            }
        }
        ,
        LicenseDataDeliveryFee {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getLicenseDataDeliveryFee();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setLicenseDataDeliveryFee((Number)value);
            }
        }
        ,
        OneTimeSigningBonus {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getOneTimeSigningBonus();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setOneTimeSigningBonus((Number)value);
            }
        }
        ,
        LicenseFeeDueDate {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getLicenseFeeDueDate();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setLicenseFeeDueDate((Date)value);
            }
        }
        ,
        SigningBonusDueDate {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getSigningBonusDueDate();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setSigningBonusDueDate((Date)value);
            }
        }
        ,
        PaidOnBillingFlag {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getPaidOnBillingFlag();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setPaidOnBillingFlag((String)value);
            }
        }
        ,
        PaymentTerm {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getPaymentTerm();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setPaymentTerm((String)value);
            }
        }
        ,
        AdvanceFrequencyComments {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getAdvanceFrequencyComments();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAdvanceFrequencyComments((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        ContentOwnerId {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getContentOwnerId();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setContentOwnerId((Number)value);
            }
        }
        ,
        ContractView {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getContractView();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CurrencyLookup {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getCurrencyLookup();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        GuaranteeFrequencyLookup {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getGuaranteeFrequencyLookup();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PaymentFrequencyLookup {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getPaymentFrequencyLookup();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PaymentTermLookup {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getPaymentTermLookup();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RoyaltyContactLOV {
            public Object get(RoyaltyInformationViewRowImpl obj) {
                return obj.getRoyaltyContactLOV();
            }

            public void put(RoyaltyInformationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RoyaltyInformationViewRowImpl object);

        public abstract void put(RoyaltyInformationViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int ROYALTYCONTACTID = AttributesEnum.RoyaltyContactId.index();
    public static final int ROYALTYCONTACT = AttributesEnum.RoyaltyContact.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int PAYMENTFREQUENCY = AttributesEnum.PaymentFrequency.index();
    public static final int GUARANTEEFREQUENCY = AttributesEnum.GuaranteeFrequency.index();
    public static final int INTERIMPAYMENTTERMDAYS = AttributesEnum.InterimPaymentTermDays.index();
    public static final int ANNUALPAYMENTTERMDAYS = AttributesEnum.AnnualPaymentTermDays.index();
    public static final int ADVANCEROYALTYAMOUNT = AttributesEnum.AdvanceRoyaltyAmount.index();
    public static final int LICENSEDATADELIVERYFEE = AttributesEnum.LicenseDataDeliveryFee.index();
    public static final int ONETIMESIGNINGBONUS = AttributesEnum.OneTimeSigningBonus.index();
    public static final int LICENSEFEEDUEDATE = AttributesEnum.LicenseFeeDueDate.index();
    public static final int SIGNINGBONUSDUEDATE = AttributesEnum.SigningBonusDueDate.index();
    public static final int PAIDONBILLINGFLAG = AttributesEnum.PaidOnBillingFlag.index();
    public static final int PAYMENTTERM = AttributesEnum.PaymentTerm.index();
    public static final int ADVANCEFREQUENCYCOMMENTS = AttributesEnum.AdvanceFrequencyComments.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int CONTENTOWNERID = AttributesEnum.ContentOwnerId.index();
    public static final int CONTRACTVIEW = AttributesEnum.ContractView.index();
    public static final int CURRENCYLOOKUP = AttributesEnum.CurrencyLookup.index();
    public static final int GUARANTEEFREQUENCYLOOKUP = AttributesEnum.GuaranteeFrequencyLookup.index();
    public static final int PAYMENTFREQUENCYLOOKUP = AttributesEnum.PaymentFrequencyLookup.index();
    public static final int PAYMENTTERMLOOKUP = AttributesEnum.PaymentTermLookup.index();
    public static final int ROYALTYCONTACTLOV = AttributesEnum.RoyaltyContactLOV.index();

    /**This is the default constructor (do not remove)
     */
    public RoyaltyInformationViewRowImpl() {
    }

    /**Gets RoyaltyInformation entity object.
     */
    public RoyaltyInformationImpl getRoyaltyInformation() {
        return (RoyaltyInformationImpl)getEntity(0);
    }

    /**Gets the attribute value for ID using the alias name Id
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as attribute value for ID using the alias name Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for CONTRACT_ID using the alias name ContractId
     */
    public Number getContractId() {
        return (Number) getAttributeInternal(CONTRACTID);
    }

    /**Sets <code>value</code> as attribute value for CONTRACT_ID using the alias name ContractId
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**Gets the attribute value for ROYALTY_CONTACT_ID using the alias name RoyaltyContactId
     */
    public Number getRoyaltyContactId() {
        return (Number) getAttributeInternal(ROYALTYCONTACTID);
    }

    /**Sets <code>value</code> as attribute value for ROYALTY_CONTACT_ID using the alias name RoyaltyContactId
     */
    public void setRoyaltyContactId(Number value) {
        setAttributeInternal(ROYALTYCONTACTID, value);
    }

    /**Gets the attribute value for CURRENCY using the alias name Currency
     */
    public String getCurrency() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**Sets <code>value</code> as attribute value for CURRENCY using the alias name Currency
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**Gets the attribute value for PAYMENT_FREQUENCY using the alias name PaymentFrequency
     */
    public String getPaymentFrequency() {
        return (String) getAttributeInternal(PAYMENTFREQUENCY);
    }

    /**Sets <code>value</code> as attribute value for PAYMENT_FREQUENCY using the alias name PaymentFrequency
     */
    public void setPaymentFrequency(String value) {
        setAttributeInternal(PAYMENTFREQUENCY, value);
    }

    /**Gets the attribute value for PAYMENT_TERM using the alias name PaymentTerm
     */
    public String getPaymentTerm() {
        return (String) getAttributeInternal(PAYMENTTERM);
    }

    /**Sets <code>value</code> as attribute value for PAYMENT_TERM using the alias name PaymentTerm
     */
    public void setPaymentTerm(String value) {
        setAttributeInternal(PAYMENTTERM, value);
    }

    /**Gets the attribute value for INTERIM_PAYMENT_TERM_DAYS using the alias name InterimPaymentTermDays
     */
    public Number getInterimPaymentTermDays() {
        return (Number) getAttributeInternal(INTERIMPAYMENTTERMDAYS);
    }

    /**Sets <code>value</code> as attribute value for INTERIM_PAYMENT_TERM_DAYS using the alias name InterimPaymentTermDays
     */
    public void setInterimPaymentTermDays(Number value) {
        setAttributeInternal(INTERIMPAYMENTTERMDAYS, value);
    }

    /**Gets the attribute value for ANNUAL_PAYMENT_TERM_DAYS using the alias name AnnualPaymentTermDays
     */
    public Number getAnnualPaymentTermDays() {
        return (Number) getAttributeInternal(ANNUALPAYMENTTERMDAYS);
    }

    /**Sets <code>value</code> as attribute value for ANNUAL_PAYMENT_TERM_DAYS using the alias name AnnualPaymentTermDays
     */
    public void setAnnualPaymentTermDays(Number value) {
        setAttributeInternal(ANNUALPAYMENTTERMDAYS, value);
    }

    /**Gets the attribute value for GUARANTEE_FREQUENCY using the alias name GuaranteeFrequency
     */
    public String getGuaranteeFrequency() {
        return (String) getAttributeInternal(GUARANTEEFREQUENCY);
    }

    /**Sets <code>value</code> as attribute value for GUARANTEE_FREQUENCY using the alias name GuaranteeFrequency
     */
    public void setGuaranteeFrequency(String value) {
        setAttributeInternal(GUARANTEEFREQUENCY, value);
    }

    /**Gets the attribute value for PAID_ON_BILLING_FLAG using the alias name PaidOnBillingFlag
     */
    public String getPaidOnBillingFlag() {
        return (String) getAttributeInternal(PAIDONBILLINGFLAG);
    }

    /**Sets <code>value</code> as attribute value for PAID_ON_BILLING_FLAG using the alias name PaidOnBillingFlag
     */
    public void setPaidOnBillingFlag(String value) {
        setAttributeInternal(PAIDONBILLINGFLAG, value);
    }

    /**Gets the attribute value for ADVANCE_ROYALTY_AMOUNT using the alias name AdvanceRoyaltyAmount
     */
    public Number getAdvanceRoyaltyAmount() {
        return (Number) getAttributeInternal(ADVANCEROYALTYAMOUNT);
    }

    /**Sets <code>value</code> as attribute value for ADVANCE_ROYALTY_AMOUNT using the alias name AdvanceRoyaltyAmount
     */
    public void setAdvanceRoyaltyAmount(Number value) {
        setAttributeInternal(ADVANCEROYALTYAMOUNT, value);
    }

    /**Gets the attribute value for ADVANCE_FREQUENCY_COMMENTS using the alias name AdvanceFrequencyComments
     */
    public String getAdvanceFrequencyComments() {
        return (String) getAttributeInternal(ADVANCEFREQUENCYCOMMENTS);
    }

    /**Sets <code>value</code> as attribute value for ADVANCE_FREQUENCY_COMMENTS using the alias name AdvanceFrequencyComments
     */
    public void setAdvanceFrequencyComments(String value) {
        setAttributeInternal(ADVANCEFREQUENCYCOMMENTS, value);
    }

    /**Gets the attribute value for LICENSE_DATA_DELIVERY_FEE using the alias name LicenseDataDeliveryFee
     */
    public Number getLicenseDataDeliveryFee() {
        return (Number) getAttributeInternal(LICENSEDATADELIVERYFEE);
    }

    /**Sets <code>value</code> as attribute value for LICENSE_DATA_DELIVERY_FEE using the alias name LicenseDataDeliveryFee
     */
    public void setLicenseDataDeliveryFee(Number value) {
        setAttributeInternal(LICENSEDATADELIVERYFEE, value);
    }

    /**Gets the attribute value for LICENSE_FEE_DUE_DATE using the alias name LicenseFeeDueDate
     */
    public Date getLicenseFeeDueDate() {
        return (Date) getAttributeInternal(LICENSEFEEDUEDATE);
    }

    /**Sets <code>value</code> as attribute value for LICENSE_FEE_DUE_DATE using the alias name LicenseFeeDueDate
     */
    public void setLicenseFeeDueDate(Date value) {
        setAttributeInternal(LICENSEFEEDUEDATE, value);
    }

    /**Gets the attribute value for ONE_TIME_SIGNING_BONUS using the alias name OneTimeSigningBonus
     */
    public Number getOneTimeSigningBonus() {
        return (Number) getAttributeInternal(ONETIMESIGNINGBONUS);
    }

    /**Sets <code>value</code> as attribute value for ONE_TIME_SIGNING_BONUS using the alias name OneTimeSigningBonus
     */
    public void setOneTimeSigningBonus(Number value) {
        setAttributeInternal(ONETIMESIGNINGBONUS, value);
    }

    /**Gets the attribute value for SIGNING_BONUS_DUE_DATE using the alias name SigningBonusDueDate
     */
    public Date getSigningBonusDueDate() {
        return (Date) getAttributeInternal(SIGNINGBONUSDUEDATE);
    }

    /**Sets <code>value</code> as attribute value for SIGNING_BONUS_DUE_DATE using the alias name SigningBonusDueDate
     */
    public void setSigningBonusDueDate(Date value) {
        setAttributeInternal(SIGNINGBONUSDUEDATE, value);
    }

    /**Gets the attribute value for the calculated attribute RoyaltyContact
     */
    public String getRoyaltyContact() {
        return (String) getAttributeInternal(ROYALTYCONTACT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute RoyaltyContact
     */
    public void setRoyaltyContact(String value) {
        setAttributeInternal(ROYALTYCONTACT, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**Gets the attribute value for CREATED_BY using the alias name CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for CREATED_DATE using the alias name CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ContentOwnerId.
     * @return the ContentOwnerId
     */
    public Number getContentOwnerId() {
        return (Number) getAttributeInternal(CONTENTOWNERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ContentOwnerId.
     * @param value value to set the  ContentOwnerId
     */
    public void setContentOwnerId(Number value) {
        setAttributeInternal(CONTENTOWNERID, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ContractView.
     */
    public ContractViewRowImpl getContractView() {
        return (ContractViewRowImpl)getAttributeInternal(CONTRACTVIEW);
    }

    /**
     * Sets the master-detail link ContractView between this object and <code>value</code>.
     */
    public void setContractView(ContractViewRowImpl value) {
        setAttributeInternal(CONTRACTVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CurrencyLookup.
     */
    public RowSet getCurrencyLookup() {
        return (RowSet)getAttributeInternal(CURRENCYLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> GuaranteeFrequencyLookup.
     */
    public RowSet getGuaranteeFrequencyLookup() {
        return (RowSet)getAttributeInternal(GUARANTEEFREQUENCYLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PaymentFrequencyLookup.
     */
    public RowSet getPaymentFrequencyLookup() {
        return (RowSet)getAttributeInternal(PAYMENTFREQUENCYLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PaymentTermLookup.
     */
    public RowSet getPaymentTermLookup() {
        return (RowSet)getAttributeInternal(PAYMENTTERMLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RoyaltyContactLOV.
     */
    public RowSet getRoyaltyContactLOV() {
        return (RowSet)getAttributeInternal(ROYALTYCONTACTLOV);
    }
}