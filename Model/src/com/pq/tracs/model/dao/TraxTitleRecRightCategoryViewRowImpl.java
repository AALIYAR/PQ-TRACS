package com.pq.tracs.model.dao;


import com.pq.tracs.model.bo.TitleRecordRightCategoryImpl;

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
public class TraxTitleRecRightCategoryViewRowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getId();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleRecordRightId {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getTitleRecordRightId();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setTitleRecordRightId((Number)value);
            }
        }
        ,
        CategoryId {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getCategoryId();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setCategoryId((Number)value);
            }
        }
        ,
        Name {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getName();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setName((String)value);
            }
        }
        ,
        Value {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getValue();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setValue((String)value);
            }
        }
        ,
        PermitFlag {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getPermitFlag();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setPermitFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        GenerationMethod {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getGenerationMethod();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setGenerationMethod((String)value);
            }
        }
        ,
        CategoryLookup {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getCategoryLookup();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CategoryValueLookupDropDown {
            public Object get(TraxTitleRecRightCategoryViewRowImpl obj) {
                return obj.getCategoryValueLookupDropDown();
            }

            public void put(TraxTitleRecRightCategoryViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TraxTitleRecRightCategoryViewRowImpl object);

        public abstract void put(TraxTitleRecRightCategoryViewRowImpl object,
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
    public static final int PERMITFLAG = AttributesEnum.PermitFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int GENERATIONMETHOD = AttributesEnum.GenerationMethod.index();
    public static final int CATEGORYLOOKUP = AttributesEnum.CategoryLookup.index();
    public static final int CATEGORYVALUELOOKUPDROPDOWN = AttributesEnum.CategoryValueLookupDropDown.index();

    /**This is the default constructor (do not remove)
     */
    public TraxTitleRecRightCategoryViewRowImpl() {
    }

    /**Gets TraxTitleRecRightCategory entity object.
     */
    public TitleRecordRightCategoryImpl getTraxTitleRecRightCategory() {
        return (TitleRecordRightCategoryImpl)getEntity(0);
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

    /**Gets the attribute value for TITLE_RECORD_RIGHT_ID using the alias name TitleRecordRightId
     */
    public Number getTitleRecordRightId() {
        return (Number) getAttributeInternal(TITLERECORDRIGHTID);
    }

    /**Sets <code>value</code> as attribute value for TITLE_RECORD_RIGHT_ID using the alias name TitleRecordRightId
     */
    public void setTitleRecordRightId(Number value) {
        setAttributeInternal(TITLERECORDRIGHTID, value);
    }

    /**Gets the attribute value for CATEGORY_ID using the alias name CategoryId
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**Gets the attribute value for NAME using the alias name Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**Sets <code>value</code> as attribute value for NAME using the alias name Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**Gets the attribute value for VALUE using the alias name Value
     */
    public String getValue() {
        return (String) getAttributeInternal(VALUE);
    }

    /**Sets <code>value</code> as attribute value for VALUE using the alias name Value
     */
    public void setValue(String value) {
        setAttributeInternal(VALUE, value);
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

    /**Gets the attribute value for PERMIT_FLAG using the alias name PermitFlag
     */
    public String getPermitFlag() {
        return (String) getAttributeInternal(PERMITFLAG);
    }

    /**Sets <code>value</code> as attribute value for PERMIT_FLAG using the alias name PermitFlag
     */
    public void setPermitFlag(String value) {
        setAttributeInternal(PERMITFLAG, value);
    }


    /**
     * Gets the attribute value for GENERATION_METHOD using the alias name GenerationMethod.
     * @return the GENERATION_METHOD
     */
    public String getGenerationMethod() {
        return (String) getAttributeInternal(GENERATIONMETHOD);
    }

    /**
     * Sets <code>value</code> as attribute value for GENERATION_METHOD using the alias name GenerationMethod.
     * @param value value to set the GENERATION_METHOD
     */
    public void setGenerationMethod(String value) {
        setAttributeInternal(GENERATIONMETHOD, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CategoryLookup.
     */
    public RowSet getCategoryLookup() {
        return (RowSet)getAttributeInternal(CATEGORYLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CategoryValueLookupDropDown.
     */
    public RowSet getCategoryValueLookupDropDown() {
        return (RowSet)getAttributeInternal(CATEGORYVALUELOOKUPDROPDOWN);
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


}
