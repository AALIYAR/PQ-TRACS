package com.pq.tracs.model.bo;

import oracle.jbo.AttributeList;
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
public class TitleRecordHistoryImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        this.setGenerationMethod("Manual");
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getId();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleRecordId {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getTitleRecordId();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setTitleRecordId((Number)value);
            }
        }
        ,
        TitleId {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getTitleId();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setTitleId((Number)value);
            }
        }
        ,
        EndDate {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getEndDate();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        PmTitle {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getPmTitle();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setPmTitle((String)value);
            }
        }
        ,
        SubTitle {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getSubTitle();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setSubTitle((String)value);
            }
        }
        ,
        PartNumber {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getPartNumber();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setPartNumber((String)value);
            }
        }
        ,
        PartName {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getPartName();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setPartName((String)value);
            }
        }
        ,
        Edition {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getEdition();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setEdition((String)value);
            }
        }
        ,
        Qualifier {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getQualifier();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setQualifier((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        Issn {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getIssn();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setIssn((String)value);
            }
        }
        ,
        OnlineIssn {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getOnlineIssn();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setOnlineIssn((String)value);
            }
        }
        ,
        Coden {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getCoden();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setCoden((String)value);
            }
        }
        ,
        Isbn {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getIsbn();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setIsbn((String)value);
            }
        }
        ,
        ForeignTitle {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getForeignTitle();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setForeignTitle((String)value);
            }
        }
        ,
        CatalogNumber {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getCatalogNumber();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setCatalogNumber((String)value);
            }
        }
        ,
        SortTitle {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getSortTitle();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setSortTitle((String)value);
            }
        }
        ,
        GenerationMethod {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getGenerationMethod();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setGenerationMethod((String)value);
            }
        }
        ,
        Range {
            public Object get(TitleRecordHistoryImpl obj) {
                return obj.getRange();
            }

            public void put(TitleRecordHistoryImpl obj, Object value) {
                obj.setRange((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TitleRecordHistoryImpl object);

        public abstract void put(TitleRecordHistoryImpl object, Object value);

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
    public static final int TITLERECORDID = AttributesEnum.TitleRecordId.index();
    public static final int TITLEID = AttributesEnum.TitleId.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int PMTITLE = AttributesEnum.PmTitle.index();
    public static final int SUBTITLE = AttributesEnum.SubTitle.index();
    public static final int PARTNUMBER = AttributesEnum.PartNumber.index();
    public static final int PARTNAME = AttributesEnum.PartName.index();
    public static final int EDITION = AttributesEnum.Edition.index();
    public static final int QUALIFIER = AttributesEnum.Qualifier.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSN = AttributesEnum.Issn.index();
    public static final int ONLINEISSN = AttributesEnum.OnlineIssn.index();
    public static final int CODEN = AttributesEnum.Coden.index();
    public static final int ISBN = AttributesEnum.Isbn.index();
    public static final int FOREIGNTITLE = AttributesEnum.ForeignTitle.index();
    public static final int CATALOGNUMBER = AttributesEnum.CatalogNumber.index();
    public static final int SORTTITLE = AttributesEnum.SortTitle.index();
    public static final int GENERATIONMETHOD = AttributesEnum.GenerationMethod.index();
    public static final int RANGE = AttributesEnum.Range.index();

    /**This is the default constructor (do not remove)
     */
    public TitleRecordHistoryImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.TitleRecordHistory");
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

    /**Gets the attribute value for TitleRecordId, using the alias name TitleRecordId
     */
    public Number getTitleRecordId() {
        return (Number)getAttributeInternal(TITLERECORDID);
    }

    /**Sets <code>value</code> as the attribute value for TitleRecordId
     */
    public void setTitleRecordId(Number value) {
        setAttributeInternal(TITLERECORDID, value);
    }

    /**Gets the attribute value for TitleId, using the alias name TitleId
     */
    public Number getTitleId() {
        return (Number)getAttributeInternal(TITLEID);
    }

    /**Sets <code>value</code> as the attribute value for TitleId
     */
    public void setTitleId(Number value) {
        setAttributeInternal(TITLEID, value);
    }

    /**Gets the attribute value for EndDate, using the alias name EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**Sets <code>value</code> as the attribute value for EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**Gets the attribute value for PmTitle, using the alias name PmTitle
     */
    public String getPmTitle() {
        return (String)getAttributeInternal(PMTITLE);
    }

    /**Sets <code>value</code> as the attribute value for PmTitle
     */
    public void setPmTitle(String value) {
        setAttributeInternal(PMTITLE, value);
    }

    /**Gets the attribute value for SubTitle, using the alias name SubTitle
     */
    public String getSubTitle() {
        return (String)getAttributeInternal(SUBTITLE);
    }

    /**Sets <code>value</code> as the attribute value for SubTitle
     */
    public void setSubTitle(String value) {
        setAttributeInternal(SUBTITLE, value);
    }

    /**Gets the attribute value for PartNumber, using the alias name PartNumber
     */
    public String getPartNumber() {
        return (String)getAttributeInternal(PARTNUMBER);
    }

    /**Sets <code>value</code> as the attribute value for PartNumber
     */
    public void setPartNumber(String value) {
        setAttributeInternal(PARTNUMBER, value);
    }

    /**Gets the attribute value for PartName, using the alias name PartName
     */
    public String getPartName() {
        return (String)getAttributeInternal(PARTNAME);
    }

    /**Sets <code>value</code> as the attribute value for PartName
     */
    public void setPartName(String value) {
        setAttributeInternal(PARTNAME, value);
    }

    /**Gets the attribute value for Edition, using the alias name Edition
     */
    public String getEdition() {
        return (String)getAttributeInternal(EDITION);
    }

    /**Sets <code>value</code> as the attribute value for Edition
     */
    public void setEdition(String value) {
        setAttributeInternal(EDITION, value);
    }

    /**Gets the attribute value for Qualifier, using the alias name Qualifier
     */
    public String getQualifier() {
        return (String)getAttributeInternal(QUALIFIER);
    }

    /**Sets <code>value</code> as the attribute value for Qualifier
     */
    public void setQualifier(String value) {
        setAttributeInternal(QUALIFIER, value);
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


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

    /**Gets the attribute value for Issn, using the alias name Issn
     */
    public String getIssn() {
        return (String)getAttributeInternal(ISSN);
    }

    /**Sets <code>value</code> as the attribute value for Issn
     */
    public void setIssn(String value) {
        setAttributeInternal(ISSN, value);
    }

    /**Gets the attribute value for OnlineIssn, using the alias name OnlineIssn
     */
    public String getOnlineIssn() {
        return (String)getAttributeInternal(ONLINEISSN);
    }

    /**Sets <code>value</code> as the attribute value for OnlineIssn
     */
    public void setOnlineIssn(String value) {
        setAttributeInternal(ONLINEISSN, value);
    }

    /**Gets the attribute value for Coden, using the alias name Coden
     */
    public String getCoden() {
        return (String)getAttributeInternal(CODEN);
    }

    /**Sets <code>value</code> as the attribute value for Coden
     */
    public void setCoden(String value) {
        setAttributeInternal(CODEN, value);
    }

    /**Gets the attribute value for Isbn, using the alias name Isbn
     */
    public String getIsbn() {
        return (String)getAttributeInternal(ISBN);
    }

    /**Sets <code>value</code> as the attribute value for Isbn
     */
    public void setIsbn(String value) {
        setAttributeInternal(ISBN, value);
    }

    /**Gets the attribute value for ForeignTitle, using the alias name ForeignTitle
     */
    public String getForeignTitle() {
        return (String)getAttributeInternal(FOREIGNTITLE);
    }

    /**Sets <code>value</code> as the attribute value for ForeignTitle
     */
    public void setForeignTitle(String value) {
        setAttributeInternal(FOREIGNTITLE, value);
    }

    /**Gets the attribute value for CatalogNumber, using the alias name CatalogNumber
     */
    public String getCatalogNumber() {
        return (String)getAttributeInternal(CATALOGNUMBER);
    }

    /**Sets <code>value</code> as the attribute value for CatalogNumber
     */
    public void setCatalogNumber(String value) {
        setAttributeInternal(CATALOGNUMBER, value);
    }

    /**
     * Gets the attribute value for SortTitle, using the alias name SortTitle.
     * @return the SortTitle
     */
    public String getSortTitle() {
        return (String)getAttributeInternal(SORTTITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SortTitle.
     * @param value value to set the SortTitle
     */
    public void setSortTitle(String value) {
        setAttributeInternal(SORTTITLE, value);
    }

    /**
     * Gets the attribute value for GenerationMethod, using the alias name GenerationMethod.
     * @return the GenerationMethod
     */
    public String getGenerationMethod() {
        return (String)getAttributeInternal(GENERATIONMETHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for GenerationMethod.
     * @param value value to set the GenerationMethod
     */
    public void setGenerationMethod(String value) {
        setAttributeInternal(GENERATIONMETHOD, value);
    }

    /**
     * Gets the attribute value for Range, using the alias name Range.
     * @return the Range
     */
    public String getRange() {
        return (String)getAttributeInternal(RANGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Range.
     * @param value value to set the Range
     */
    public void setRange(String value) {
        setAttributeInternal(RANGE, value);
    }

}
