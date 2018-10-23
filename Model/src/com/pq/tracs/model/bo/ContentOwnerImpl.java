package com.pq.tracs.model.bo;

import com.pq.tracs.model.eo.PrmOpportunityImpl;
import com.pq.tracs.model.eo.TraxContentOwnerContactImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ContentOwnerImpl extends TracsBaseEntity {
    public static final int ACTIVITY1 = 34;
    public static final int CATALOGNUMBERSEQUENCE1 = 36;
    private static EntityDefImpl mDefinitionObject;

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);

       try {
          SequenceImpl seq = new SequenceImpl("TRAX_CONTENT_OWNER_NO_SEQ", getDBTransaction());
          this.setContentOwnerNo(seq.getSequenceNumber());
      
       } catch (Exception e1) {
           System.out.println("*******************Exception while creating target tracking number***********************");
           System.out.println("Error :" + e1.toString());
           //throw new JboException("Invalid primary key value.");
       }
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(ContentOwnerImpl obj) {
                return obj.getId();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        Name {
            public Object get(ContentOwnerImpl obj) {
                return obj.getName();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        Site {
            public Object get(ContentOwnerImpl obj) {
                return obj.getSite();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setSite((String)value);
            }
        }
        ,
        VanLoozenId {
            public Object get(ContentOwnerImpl obj) {
                return obj.getVanLoozenId();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setVanLoozenId((String)value);
            }
        }
        ,
        MainPhoneNumber {
            public Object get(ContentOwnerImpl obj) {
                return obj.getMainPhoneNumber();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setMainPhoneNumber((String)value);
            }
        }
        ,
        MainFaxNumber {
            public Object get(ContentOwnerImpl obj) {
                return obj.getMainFaxNumber();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setMainFaxNumber((String)value);
            }
        }
        ,
        MainEmailAddress {
            public Object get(ContentOwnerImpl obj) {
                return obj.getMainEmailAddress();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setMainEmailAddress((String)value);
            }
        }
        ,
        RasNumber {
            public Object get(ContentOwnerImpl obj) {
                return obj.getRasNumber();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setRasNumber((String)value);
            }
        }
        ,
        ParentContentOwnerId {
            public Object get(ContentOwnerImpl obj) {
                return obj.getParentContentOwnerId();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setParentContentOwnerId((Number)value);
            }
        }
        ,
        MainUrl {
            public Object get(ContentOwnerImpl obj) {
                return obj.getMainUrl();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setMainUrl((String)value);
            }
        }
        ,
        ActiveFlag {
            public Object get(ContentOwnerImpl obj) {
                return obj.getActiveFlag();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setActiveFlag((String)value);
            }
        }
        ,
        EfeedInformationLastUpdated {
            public Object get(ContentOwnerImpl obj) {
                return obj.getEfeedInformationLastUpdated();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setEfeedInformationLastUpdated((Date)value);
            }
        }
        ,
        ContentOwnerType {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContentOwnerType();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setContentOwnerType((String)value);
            }
        }
        ,
        ContentOwnerSubType {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContentOwnerSubType();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setContentOwnerSubType((String)value);
            }
        }
        ,
        PrimaryLanguage {
            public Object get(ContentOwnerImpl obj) {
                return obj.getPrimaryLanguage();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setPrimaryLanguage((String)value);
            }
        }
        ,
        EfeedSampleAvailableFlag {
            public Object get(ContentOwnerImpl obj) {
                return obj.getEfeedSampleAvailableFlag();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setEfeedSampleAvailableFlag((String)value);
            }
        }
        ,
        EfeedInProductionFlag {
            public Object get(ContentOwnerImpl obj) {
                return obj.getEfeedInProductionFlag();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setEfeedInProductionFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ContentOwnerImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(ContentOwnerImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ContentOwnerImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(ContentOwnerImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        CustomerFlag {
            public Object get(ContentOwnerImpl obj) {
                return obj.getCustomerFlag();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setCustomerFlag((String)value);
            }
        }
        ,
        ContentOwnerNo {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContentOwnerNo();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setContentOwnerNo((Number)value);
            }
        }
        ,
        ProblematicPublisher {
            public Object get(ContentOwnerImpl obj) {
                return obj.getProblematicPublisher();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setProblematicPublisher((String)value);
            }
        }
        ,
        KeyAccountLevel {
            public Object get(ContentOwnerImpl obj) {
                return obj.getKeyAccountLevel();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setKeyAccountLevel((String)value);
            }
        }
        ,
        ParentContentOwnerIdContentOwner {
            public Object get(ContentOwnerImpl obj) {
                return obj.getParentContentOwnerIdContentOwner();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setParentContentOwnerIdContentOwner((ContentOwnerImpl)value);
            }
        }
        ,
        ContentOwner {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContentOwner();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Contract {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContract();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ContentOwnerTitle {
            public Object get(ContentOwnerImpl obj) {
                return obj.getContentOwnerTitle();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Address {
            public Object get(ContentOwnerImpl obj) {
                return obj.getAddress();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Title {
            public Object get(ContentOwnerImpl obj) {
                return obj.getTitle();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TraxActivityContentOwner {
            public Object get(ContentOwnerImpl obj) {
                return obj.getTraxActivityContentOwner();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TraxContentOwnerContact {
            public Object get(ContentOwnerImpl obj) {
                return obj.getTraxContentOwnerContact();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PrmAccountContactMethod {
            public Object get(ContentOwnerImpl obj) {
                return obj.getPrmAccountContactMethod();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TraxContentOwnerAttachment {
            public Object get(ContentOwnerImpl obj) {
                return obj.getTraxContentOwnerAttachment();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Publisher {
            public Object get(ContentOwnerImpl obj) {
                return obj.getPublisher();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PrmOpportunity {
            public Object get(ContentOwnerImpl obj) {
                return obj.getPrmOpportunity();
            }

            public void put(ContentOwnerImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ContentOwnerImpl object);

        public abstract void put(ContentOwnerImpl object, Object value);

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
    public static final int NAME = AttributesEnum.Name.index();
    public static final int SITE = AttributesEnum.Site.index();
    public static final int VANLOOZENID = AttributesEnum.VanLoozenId.index();
    public static final int MAINPHONENUMBER = AttributesEnum.MainPhoneNumber.index();
    public static final int MAINFAXNUMBER = AttributesEnum.MainFaxNumber.index();
    public static final int MAINEMAILADDRESS = AttributesEnum.MainEmailAddress.index();
    public static final int RASNUMBER = AttributesEnum.RasNumber.index();
    public static final int PARENTCONTENTOWNERID = AttributesEnum.ParentContentOwnerId.index();
    public static final int MAINURL = AttributesEnum.MainUrl.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int EFEEDINFORMATIONLASTUPDATED = AttributesEnum.EfeedInformationLastUpdated.index();
    public static final int CONTENTOWNERTYPE = AttributesEnum.ContentOwnerType.index();
    public static final int CONTENTOWNERSUBTYPE = AttributesEnum.ContentOwnerSubType.index();
    public static final int PRIMARYLANGUAGE = AttributesEnum.PrimaryLanguage.index();
    public static final int EFEEDSAMPLEAVAILABLEFLAG = AttributesEnum.EfeedSampleAvailableFlag.index();
    public static final int EFEEDINPRODUCTIONFLAG = AttributesEnum.EfeedInProductionFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int CUSTOMERFLAG = AttributesEnum.CustomerFlag.index();
    public static final int CONTENTOWNERNO = AttributesEnum.ContentOwnerNo.index();
    public static final int PROBLEMATICPUBLISHER = AttributesEnum.ProblematicPublisher.index();
    public static final int KEYACCOUNTLEVEL = AttributesEnum.KeyAccountLevel.index();
    public static final int PARENTCONTENTOWNERIDCONTENTOWNER = AttributesEnum.ParentContentOwnerIdContentOwner.index();
    public static final int CONTENTOWNER = AttributesEnum.ContentOwner.index();
    public static final int CONTRACT = AttributesEnum.Contract.index();
    public static final int CONTENTOWNERTITLE = AttributesEnum.ContentOwnerTitle.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int TRAXACTIVITYCONTENTOWNER = AttributesEnum.TraxActivityContentOwner.index();
    public static final int TRAXCONTENTOWNERCONTACT = AttributesEnum.TraxContentOwnerContact.index();
    public static final int PRMACCOUNTCONTACTMETHOD = AttributesEnum.PrmAccountContactMethod.index();
    public static final int TRAXCONTENTOWNERATTACHMENT = AttributesEnum.TraxContentOwnerAttachment.index();
    public static final int PUBLISHER = AttributesEnum.Publisher.index();
    public static final int PRMOPPORTUNITY = AttributesEnum.PrmOpportunity.index();

    /**This is the default constructor (do not remove)
     */
    public ContentOwnerImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.ContentOwner");
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

    /**Gets the attribute value for Name, using the alias name Name
     */
    public String getName() {
        return (String)getAttributeInternal(NAME);
    }

    /**Sets <code>value</code> as the attribute value for Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**Gets the attribute value for Site, using the alias name Site
     */
    public String getSite() {
        return (String)getAttributeInternal(SITE);
    }

    /**Sets <code>value</code> as the attribute value for Site
     */
    public void setSite(String value) {
        setAttributeInternal(SITE, value);
    }

    /**Gets the attribute value for VanLoozenId, using the alias name VanLoozenId
     */
    public String getVanLoozenId() {
        return (String)getAttributeInternal(VANLOOZENID);
    }

    /**Sets <code>value</code> as the attribute value for VanLoozenId
     */
    public void setVanLoozenId(String value) {
        setAttributeInternal(VANLOOZENID, value);
    }

    /**Gets the attribute value for MainPhoneNumber, using the alias name MainPhoneNumber
     */
    public String getMainPhoneNumber() {
        return (String)getAttributeInternal(MAINPHONENUMBER);
    }

    /**Sets <code>value</code> as the attribute value for MainPhoneNumber
     */
    public void setMainPhoneNumber(String value) {        
        setAttributeInternal(MAINPHONENUMBER, value);
    }

    /**Gets the attribute value for MainFaxNumber, using the alias name MainFaxNumber
     */
    public String getMainFaxNumber() {
        return (String)getAttributeInternal(MAINFAXNUMBER);
    }

    /**Sets <code>value</code> as the attribute value for MainFaxNumber
     */
    public void setMainFaxNumber(String value) {
        setAttributeInternal(MAINFAXNUMBER, value);
    }

    /**Gets the attribute value for MainEmailAddress, using the alias name MainEmailAddress
     */
    public String getMainEmailAddress() {
        return (String)getAttributeInternal(MAINEMAILADDRESS);
    }

    /**Sets <code>value</code> as the attribute value for MainEmailAddress
     */
    public void setMainEmailAddress(String value) {
        setAttributeInternal(MAINEMAILADDRESS, value);
    }


    /**Gets the attribute value for RasNumber, using the alias name RasNumber
     */
    public String getRasNumber() {
        return (String)getAttributeInternal(RASNUMBER);
    }

    /**Sets <code>value</code> as the attribute value for RasNumber
     */
    public void setRasNumber(String value) {
        setAttributeInternal(RASNUMBER, value);
    }


    /**Gets the attribute value for ParentContentOwnerId, using the alias name ParentContentOwnerId
     */
    public Number getParentContentOwnerId() {
        return (Number)getAttributeInternal(PARENTCONTENTOWNERID);
    }

    /**Sets <code>value</code> as the attribute value for ParentContentOwnerId
     */
    public void setParentContentOwnerId(Number value) {
        setAttributeInternal(PARENTCONTENTOWNERID, value);
    }

    /**Gets the attribute value for MainUrl, using the alias name MainUrl
     */
    public String getMainUrl() {
        return (String)getAttributeInternal(MAINURL);
    }

    /**Sets <code>value</code> as the attribute value for MainUrl
     */
    public void setMainUrl(String value) {
        setAttributeInternal(MAINURL, value);
    }


    /**Gets the attribute value for ActiveFlag, using the alias name ActiveFlag
     */
    public String getActiveFlag() {
        return (String)getAttributeInternal(ACTIVEFLAG);
    }

    /**Sets <code>value</code> as the attribute value for ActiveFlag
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }


    /**Gets the attribute value for EfeedInformationLastUpdated, using the alias name EfeedInformationLastUpdated
     */
    public Date getEfeedInformationLastUpdated() {
        return (Date)getAttributeInternal(EFEEDINFORMATIONLASTUPDATED);
    }

    /**Sets <code>value</code> as the attribute value for EfeedInformationLastUpdated
     */
    public void setEfeedInformationLastUpdated(Date value) {
        setAttributeInternal(EFEEDINFORMATIONLASTUPDATED, value);
    }


    /**Gets the attribute value for ContentOwnerType, using the alias name ContentOwnerType
     */
    public String getContentOwnerType() {
        return (String)getAttributeInternal(CONTENTOWNERTYPE);
    }

    /**Sets <code>value</code> as the attribute value for ContentOwnerType
     */
    public void setContentOwnerType(String value) {
        setAttributeInternal(CONTENTOWNERTYPE, value);
    }

    /**Gets the attribute value for ContentOwnerSubType, using the alias name ContentOwnerSubType
     */
    public String getContentOwnerSubType() {
        return (String)getAttributeInternal(CONTENTOWNERSUBTYPE);
    }

    /**Sets <code>value</code> as the attribute value for ContentOwnerSubType
     */
    public void setContentOwnerSubType(String value) {
        setAttributeInternal(CONTENTOWNERSUBTYPE, value);
    }

    /**Gets the attribute value for PrimaryLanguage, using the alias name PrimaryLanguage
     */
    public String getPrimaryLanguage() {
        return (String)getAttributeInternal(PRIMARYLANGUAGE);
    }

    /**Sets <code>value</code> as the attribute value for PrimaryLanguage
     */
    public void setPrimaryLanguage(String value) {
        setAttributeInternal(PRIMARYLANGUAGE, value);
    }

    /**Gets the attribute value for EfeedSampleAvailableFlag, using the alias name EfeedSampleAvailableFlag
     */
    public String getEfeedSampleAvailableFlag() {
        return (String)getAttributeInternal(EFEEDSAMPLEAVAILABLEFLAG);
    }

    /**Sets <code>value</code> as the attribute value for EfeedSampleAvailableFlag
     */
    public void setEfeedSampleAvailableFlag(String value) {
        setAttributeInternal(EFEEDSAMPLEAVAILABLEFLAG, value);
    }

    /**Gets the attribute value for EfeedInProductionFlag, using the alias name EfeedInProductionFlag
     */
    public String getEfeedInProductionFlag() {
        return (String)getAttributeInternal(EFEEDINPRODUCTIONFLAG);
    }

    /**Sets <code>value</code> as the attribute value for EfeedInProductionFlag
     */
    public void setEfeedInProductionFlag(String value) {
        setAttributeInternal(EFEEDINPRODUCTIONFLAG, value);
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

    /**Gets the associated entity ContentOwnerImpl
     */
    public ContentOwnerImpl getParentContentOwnerIdContentOwner() {
        return (ContentOwnerImpl)getAttributeInternal(PARENTCONTENTOWNERIDCONTENTOWNER);
    }

    /**Sets <code>value</code> as the associated entity ContentOwnerImpl
     */
    public void setParentContentOwnerIdContentOwner(ContentOwnerImpl value) {
        setAttributeInternal(PARENTCONTENTOWNERIDCONTENTOWNER, value);
    }

    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getContentOwner() {
        return (RowIterator)getAttributeInternal(CONTENTOWNER);
    }


    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getContract() {
        return (RowIterator)getAttributeInternal(CONTRACT);
    }


    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getContentOwnerTitle() {
        return (RowIterator)getAttributeInternal(CONTENTOWNERTITLE);
    }

    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getAddress() {
        return (RowIterator)getAttributeInternal(ADDRESS);
    }


    /**Gets the attribute value for CustomerFlag, using the alias name CustomerFlag
     */
    public String getCustomerFlag() {
        return (String)getAttributeInternal(CUSTOMERFLAG);
    }

    /**Sets <code>value</code> as the attribute value for CustomerFlag
     */
    public void setCustomerFlag(String value) {
        setAttributeInternal(CUSTOMERFLAG, value);
    }


    /**
     * Gets the attribute value for ContentOwnerNo, using the alias name ContentOwnerNo.
     * @return the ContentOwnerNo
     */
    public Number getContentOwnerNo() {
        return (Number)getAttributeInternal(CONTENTOWNERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContentOwnerNo.
     * @param value value to set the ContentOwnerNo
     */
    public void setContentOwnerNo(Number value) {
        setAttributeInternal(CONTENTOWNERNO, value);
    }

    /**
     * Gets the attribute value for ProblematicPublisher, using the alias name ProblematicPublisher.
     * @return the ProblematicPublisher
     */
    public String getProblematicPublisher() {
        return (String)getAttributeInternal(PROBLEMATICPUBLISHER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProblematicPublisher.
     * @param value value to set the ProblematicPublisher
     */
    public void setProblematicPublisher(String value) {
        setAttributeInternal(PROBLEMATICPUBLISHER, value);
    }

    /**
     * Gets the attribute value for KeyAccountLevel, using the alias name KeyAccountLevel.
     * @return the KeyAccountLevel
     */
    public String getKeyAccountLevel() {
        return (String)getAttributeInternal(KEYACCOUNTLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for KeyAccountLevel.
     * @param value value to set the KeyAccountLevel
     */
    public void setKeyAccountLevel(String value) {
        setAttributeInternal(KEYACCOUNTLEVEL, value);
    }

    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getActivity1() {
        return (RowIterator)getAttributeInternal(ACTIVITY1);
    }

    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getTitle() {
        return (RowIterator)getAttributeInternal(TITLE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTraxActivityContentOwner() {
        return (RowIterator)getAttributeInternal(TRAXACTIVITYCONTENTOWNER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTraxContentOwnerContact() {
        return (RowIterator)getAttributeInternal(TRAXCONTENTOWNERCONTACT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPrmAccountContactMethod() {
        return (RowIterator)getAttributeInternal(PRMACCOUNTCONTACTMETHOD);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTraxContentOwnerAttachment() {
        return (RowIterator)getAttributeInternal(TRAXCONTENTOWNERATTACHMENT);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPublisher() {
        return (RowIterator)getAttributeInternal(PUBLISHER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPrmOpportunity() {
        return (RowIterator)getAttributeInternal(PRMOPPORTUNITY);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

    /**
     * Validation method for ContentOwner.
     */
    public boolean validateContentOwnerContact() {
        RowIterator contactIter = this.getTraxContentOwnerContact();
        int i = 0;
        int j = 0;  
        TraxContentOwnerContactImpl contact;
         while (j < contactIter.getRowCount()) {
            contact = (TraxContentOwnerContactImpl)contactIter.next();
            if ("Y".equalsIgnoreCase(contact.getPrimaryFlag())) {
                i++;
            }
             if (i > 1) {
                return false;
            }
             j++;
        }
        
        return true;
    }
    
    public void setInvalid() {
        super.setInvalid();
    }

    protected void validateEntity() {
        super.validateEntity();
    }


    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getCatalogNumberSequence1() {
        return (RowIterator)getAttributeInternal(CATALOGNUMBERSEQUENCE1);
    }


}
