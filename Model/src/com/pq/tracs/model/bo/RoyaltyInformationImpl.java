package com.pq.tracs.model.bo;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RoyaltyInformationImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getId();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        ContractId {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getContractId();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setContractId((Number)value);
            }
        }
        ,
        RoyaltyContactId {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getRoyaltyContactId();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setRoyaltyContactId((Number)value);
            }
        }
        ,
        Currency {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getCurrency();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setCurrency((String)value);
            }
        }
        ,
        PaymentFrequency {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getPaymentFrequency();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setPaymentFrequency((String)value);
            }
        }
        ,
        PaymentTerm {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getPaymentTerm();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setPaymentTerm((String)value);
            }
        }
        ,
        InterimPaymentTermDays {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getInterimPaymentTermDays();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setInterimPaymentTermDays((Number)value);
            }
        }
        ,
        AnnualPaymentTermDays {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getAnnualPaymentTermDays();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setAnnualPaymentTermDays((Number)value);
            }
        }
        ,
        GuaranteeFrequency {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getGuaranteeFrequency();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setGuaranteeFrequency((String)value);
            }
        }
        ,
        PaidOnBillingFlag {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getPaidOnBillingFlag();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setPaidOnBillingFlag((String)value);
            }
        }
        ,
        AdvanceRoyaltyAmount {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getAdvanceRoyaltyAmount();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setAdvanceRoyaltyAmount((Number)value);
            }
        }
        ,
        AdvanceFrequencyComments {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getAdvanceFrequencyComments();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setAdvanceFrequencyComments((String)value);
            }
        }
        ,
        LicenseDataDeliveryFee {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getLicenseDataDeliveryFee();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setLicenseDataDeliveryFee((Number)value);
            }
        }
        ,
        LicenseFeeDueDate {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getLicenseFeeDueDate();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setLicenseFeeDueDate((Date)value);
            }
        }
        ,
        OneTimeSigningBonus {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getOneTimeSigningBonus();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setOneTimeSigningBonus((Number)value);
            }
        }
        ,
        SigningBonusDueDate {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getSigningBonusDueDate();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setSigningBonusDueDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        Contract {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getContract();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setContract((ContractImpl)value);
            }
        }
        ,
        Contact {
            public Object get(RoyaltyInformationImpl obj) {
                return obj.getContact();
            }

            public void put(RoyaltyInformationImpl obj, Object value) {
                obj.setContact((ContactImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RoyaltyInformationImpl object);

        public abstract void put(RoyaltyInformationImpl object, Object value);

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
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int PAYMENTFREQUENCY = AttributesEnum.PaymentFrequency.index();
    public static final int PAYMENTTERM = AttributesEnum.PaymentTerm.index();
    public static final int INTERIMPAYMENTTERMDAYS = AttributesEnum.InterimPaymentTermDays.index();
    public static final int ANNUALPAYMENTTERMDAYS = AttributesEnum.AnnualPaymentTermDays.index();
    public static final int GUARANTEEFREQUENCY = AttributesEnum.GuaranteeFrequency.index();
    public static final int PAIDONBILLINGFLAG = AttributesEnum.PaidOnBillingFlag.index();
    public static final int ADVANCEROYALTYAMOUNT = AttributesEnum.AdvanceRoyaltyAmount.index();
    public static final int ADVANCEFREQUENCYCOMMENTS = AttributesEnum.AdvanceFrequencyComments.index();
    public static final int LICENSEDATADELIVERYFEE = AttributesEnum.LicenseDataDeliveryFee.index();
    public static final int LICENSEFEEDUEDATE = AttributesEnum.LicenseFeeDueDate.index();
    public static final int ONETIMESIGNINGBONUS = AttributesEnum.OneTimeSigningBonus.index();
    public static final int SIGNINGBONUSDUEDATE = AttributesEnum.SigningBonusDueDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int CONTRACT = AttributesEnum.Contract.index();
    public static final int CONTACT = AttributesEnum.Contact.index();

    /**This is the default constructor (do not remove)
     */
    public RoyaltyInformationImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.RoyaltyInformation");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for Id, using the alias name Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for ContractId, using the alias name ContractId
     */
    public Number getContractId() {
        return (Number)getAttributeInternal(CONTRACTID);
    }

    /**Sets <code>value</code> as the attribute value for ContractId
     */
    public void setContractId(Number value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**Gets the attribute value for RoyaltyContactId, using the alias name RoyaltyContactId
     */
    public Number getRoyaltyContactId() {
        return (Number)getAttributeInternal(ROYALTYCONTACTID);
    }

    /**Sets <code>value</code> as the attribute value for RoyaltyContactId
     */
    public void setRoyaltyContactId(Number value) {
        setAttributeInternal(ROYALTYCONTACTID, value);
    }

    /**Gets the attribute value for Currency, using the alias name Currency
     */
    public String getCurrency() {
        return (String)getAttributeInternal(CURRENCY);
    }

    /**Sets <code>value</code> as the attribute value for Currency
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**Gets the attribute value for PaymentFrequency, using the alias name PaymentFrequency
     */
    public String getPaymentFrequency() {
        return (String)getAttributeInternal(PAYMENTFREQUENCY);
    }

    /**Sets <code>value</code> as the attribute value for PaymentFrequency
     */
    public void setPaymentFrequency(String value) {
        setAttributeInternal(PAYMENTFREQUENCY, value);
    }

    /**Gets the attribute value for PaymentTerm, using the alias name PaymentTerm
     */
    public String getPaymentTerm() {
        return (String)getAttributeInternal(PAYMENTTERM);
    }

    /**Sets <code>value</code> as the attribute value for PaymentTerm
     */
    public void setPaymentTerm(String value) {
        setAttributeInternal(PAYMENTTERM, value);
    }

    /**Gets the attribute value for InterimPaymentTermDays, using the alias name InterimPaymentTermDays
     */
    public Number getInterimPaymentTermDays() {
        return (Number)getAttributeInternal(INTERIMPAYMENTTERMDAYS);
    }

    /**Sets <code>value</code> as the attribute value for InterimPaymentTermDays
     */
    public void setInterimPaymentTermDays(Number value) {
        setAttributeInternal(INTERIMPAYMENTTERMDAYS, value);
    }

    /**Gets the attribute value for AnnualPaymentTermDays, using the alias name AnnualPaymentTermDays
     */
    public Number getAnnualPaymentTermDays() {
        return (Number)getAttributeInternal(ANNUALPAYMENTTERMDAYS);
    }

    /**Sets <code>value</code> as the attribute value for AnnualPaymentTermDays
     */
    public void setAnnualPaymentTermDays(Number value) {
        setAttributeInternal(ANNUALPAYMENTTERMDAYS, value);
    }

    /**Gets the attribute value for GuaranteeFrequency, using the alias name GuaranteeFrequency
     */
    public String getGuaranteeFrequency() {
        return (String)getAttributeInternal(GUARANTEEFREQUENCY);
    }

    /**Sets <code>value</code> as the attribute value for GuaranteeFrequency
     */
    public void setGuaranteeFrequency(String value) {
        setAttributeInternal(GUARANTEEFREQUENCY, value);
    }

    /**Gets the attribute value for PaidOnBillingFlag, using the alias name PaidOnBillingFlag
     */
    public String getPaidOnBillingFlag() {
        return (String)getAttributeInternal(PAIDONBILLINGFLAG);
    }

    /**Sets <code>value</code> as the attribute value for PaidOnBillingFlag
     */
    public void setPaidOnBillingFlag(String value) {
        setAttributeInternal(PAIDONBILLINGFLAG, value);
    }

    /**Gets the attribute value for AdvanceRoyaltyAmount, using the alias name AdvanceRoyaltyAmount
     */
    public Number getAdvanceRoyaltyAmount() {
        return (Number)getAttributeInternal(ADVANCEROYALTYAMOUNT);
    }

    /**Sets <code>value</code> as the attribute value for AdvanceRoyaltyAmount
     */
    public void setAdvanceRoyaltyAmount(Number value) {
        setAttributeInternal(ADVANCEROYALTYAMOUNT, value);
    }

    /**Gets the attribute value for AdvanceFrequencyComments, using the alias name AdvanceFrequencyComments
     */
    public String getAdvanceFrequencyComments() {
        return (String)getAttributeInternal(ADVANCEFREQUENCYCOMMENTS);
    }

    /**Sets <code>value</code> as the attribute value for AdvanceFrequencyComments
     */
    public void setAdvanceFrequencyComments(String value) {
        setAttributeInternal(ADVANCEFREQUENCYCOMMENTS, value);
    }

    /**Gets the attribute value for LicenseDataDeliveryFee, using the alias name LicenseDataDeliveryFee
     */
    public Number getLicenseDataDeliveryFee() {
        return (Number)getAttributeInternal(LICENSEDATADELIVERYFEE);
    }

    /**Sets <code>value</code> as the attribute value for LicenseDataDeliveryFee
     */
    public void setLicenseDataDeliveryFee(Number value) {
        setAttributeInternal(LICENSEDATADELIVERYFEE, value);
    }

    /**Gets the attribute value for LicenseFeeDueDate, using the alias name LicenseFeeDueDate
     */
    public Date getLicenseFeeDueDate() {
        return (Date)getAttributeInternal(LICENSEFEEDUEDATE);
    }

    /**Sets <code>value</code> as the attribute value for LicenseFeeDueDate
     */
    public void setLicenseFeeDueDate(Date value) {
        setAttributeInternal(LICENSEFEEDUEDATE, value);
    }

    /**Gets the attribute value for OneTimeSigningBonus, using the alias name OneTimeSigningBonus
     */
    public Number getOneTimeSigningBonus() {
        return (Number)getAttributeInternal(ONETIMESIGNINGBONUS);
    }

    /**Sets <code>value</code> as the attribute value for OneTimeSigningBonus
     */
    public void setOneTimeSigningBonus(Number value) {
        setAttributeInternal(ONETIMESIGNINGBONUS, value);
    }

    /**Gets the attribute value for SigningBonusDueDate, using the alias name SigningBonusDueDate
     */
    public Date getSigningBonusDueDate() {
        return (Date)getAttributeInternal(SIGNINGBONUSDUEDATE);
    }

    /**Sets <code>value</code> as the attribute value for SigningBonusDueDate
     */
    public void setSigningBonusDueDate(Date value) {
        setAttributeInternal(SIGNINGBONUSDUEDATE, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for CreatedDate, using the alias name CreatedDate
     */
    public Date getCreatedDate() {
        return (Date)getAttributeInternal(CREATEDDATE);
    }


    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }


    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
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

    /**Gets the associated entity ContractImpl
     */
    public ContractImpl getContract() {
        return (ContractImpl)getAttributeInternal(CONTRACT);
    }

    /**Sets <code>value</code> as the associated entity ContractImpl
     */
    public void setContract(ContractImpl value) {
        setAttributeInternal(CONTRACT, value);
    }

    /**Gets the associated entity ContactImpl
     */
    public ContactImpl getContact() {
        return (ContactImpl)getAttributeInternal(CONTACT);
    }

    /**Sets <code>value</code> as the associated entity ContactImpl
     */
    public void setContact(ContactImpl value) {
        setAttributeInternal(CONTACT, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }


}
