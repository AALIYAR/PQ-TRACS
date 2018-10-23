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
public class TitleRecordRightCategoryImpl extends TracsBaseEntity {
    public static final int TITLERECORDRIGHT = 11;
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
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getId();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleRecordRightId {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getTitleRecordRightId();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setTitleRecordRightId((Number)value);
            }
        }
        ,
        CategoryId {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getCategoryId();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setCategoryId((Number)value);
            }
        }
        ,
        Name {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getName();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        Value {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getValue();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setValue((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        FullOrPartial {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getFullOrPartial();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setFullOrPartial((String)value);
            }
        }
        ,
        PermitFlag {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getPermitFlag();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setPermitFlag((String)value);
            }
        }
        ,
        GenerationMethod {
            public Object get(TitleRecordRightCategoryImpl obj) {
                return obj.getGenerationMethod();
            }

            public void put(TitleRecordRightCategoryImpl obj, Object value) {
                obj.setGenerationMethod((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TitleRecordRightCategoryImpl object);

        public abstract void put(TitleRecordRightCategoryImpl object,
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
    public static final int TITLERECORDRIGHTID = AttributesEnum.TitleRecordRightId.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int VALUE = AttributesEnum.Value.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int FULLORPARTIAL = AttributesEnum.FullOrPartial.index();
    public static final int PERMITFLAG = AttributesEnum.PermitFlag.index();
    public static final int GENERATIONMETHOD = AttributesEnum.GenerationMethod.index();

    /**This is the default constructor (do not remove)
     */
    public TitleRecordRightCategoryImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.TitleRecordRightCategory");
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

    /**Gets the attribute value for TitleRecordRightId, using the alias name TitleRecordRightId
     */
    public Number getTitleRecordRightId() {
        return (Number)getAttributeInternal(TITLERECORDRIGHTID);
    }

    /**Sets <code>value</code> as the attribute value for TitleRecordRightId
     */
    public void setTitleRecordRightId(Number value) {
        setAttributeInternal(TITLERECORDRIGHTID, value);
    }

    /**Gets the attribute value for CategoryId, using the alias name CategoryId
     */
    public Number getCategoryId() {
        return (Number)getAttributeInternal(CATEGORYID);
    }

    /**Sets <code>value</code> as the attribute value for CategoryId
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
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

    /**Gets the attribute value for Value, using the alias name Value
     */
    public String getValue() {
        return (String)getAttributeInternal(VALUE);
    }

    /**Sets <code>value</code> as the attribute value for Value
     */
    public void setValue(String value) {
        setAttributeInternal(VALUE, value);
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


    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
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

    /**Gets the attribute value for FullOrPartial, using the alias name FullOrPartial
     */
    public String getFullOrPartial() {
        return (String)getAttributeInternal(FULLORPARTIAL);
    }

    /**Sets <code>value</code> as the attribute value for FullOrPartial
     */
    public void setFullOrPartial(String value) {
        setAttributeInternal(FULLORPARTIAL, value);
    }

    /**Gets the attribute value for PermitFlag, using the alias name PermitFlag
     */
    public String getPermitFlag() {
        return (String)getAttributeInternal(PERMITFLAG);
    }

    /**Sets <code>value</code> as the attribute value for PermitFlag
     */
    public void setPermitFlag(String value) {
        setAttributeInternal(PERMITFLAG, value);
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

    /**Gets the associated entity TitleRecordRightImpl
     */
    public TitleRecordRightImpl getTitleRecordRight() {
        return (TitleRecordRightImpl)getAttributeInternal(TITLERECORDRIGHT);
    }

    /**Sets <code>value</code> as the associated entity TitleRecordRightImpl
     */
    public void setTitleRecordRight(TitleRecordRightImpl value) {
        setAttributeInternal(TITLERECORDRIGHT, value);
    }

}