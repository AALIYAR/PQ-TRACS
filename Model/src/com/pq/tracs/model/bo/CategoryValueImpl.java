package com.pq.tracs.model.bo;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CategoryValueImpl extends TracsBaseEntity {
    public static final int CHILDCATEGORY = 9;
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(CategoryValueImpl obj) {
                return obj.getId();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        CategoryId {
            public Object get(CategoryValueImpl obj) {
                return obj.getCategoryId();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setCategoryId((Number)value);
            }
        }
        ,
        Value {
            public Object get(CategoryValueImpl obj) {
                return obj.getValue();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setValue((String)value);
            }
        }
        ,
        Description {
            public Object get(CategoryValueImpl obj) {
                return obj.getDescription();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(CategoryValueImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedDate {
            public Object get(CategoryValueImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(CategoryValueImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(CategoryValueImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ActiveFlag {
            public Object get(CategoryValueImpl obj) {
                return obj.getActiveFlag();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setActiveFlag((String)value);
            }
        }
        ,
        InternalValue {
            public Object get(CategoryValueImpl obj) {
                return obj.getInternalValue();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setInternalValue((String)value);
            }
        }
        ,
        OrderBy1 {
            public Object get(CategoryValueImpl obj) {
                return obj.getOrderBy1();
            }

            public void put(CategoryValueImpl obj, Object value) {
                obj.setOrderBy1((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CategoryValueImpl object);

        public abstract void put(CategoryValueImpl object, Object value);

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
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int VALUE = AttributesEnum.Value.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int INTERNALVALUE = AttributesEnum.InternalValue.index();
    public static final int ORDERBY1 = AttributesEnum.OrderBy1.index();

    /**This is the default constructor (do not remove)
     */
    public CategoryValueImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.CategoryValue");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for Id, using the alias name Id
     */
    public Number getId() {
        // Add any custom logic you wish to perform in this getter here.
        return (Number)getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for Id
     */
    public void setId(Number value) {
        // Add custom validation or business logic for this setter here.
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for CategoryId, using the alias name CategoryId
     */
    public Number getCategoryId() {
        // Add any custom logic you wish to perform in this getter here.
        return (Number)getAttributeInternal(CATEGORYID);
    }

    /**Sets <code>value</code> as the attribute value for CategoryId
     */
    public void setCategoryId(Number value) {
        // Add custom validation or business logic for this setter here.
        setAttributeInternal(CATEGORYID, value);
    }

    /**Gets the attribute value for Value, using the alias name Value
     */
    public String getValue() {
        // Add any custom logic you wish to perform in this getter here.
        return (String)getAttributeInternal(VALUE);
    }

    /**Sets <code>value</code> as the attribute value for Value
     */
    public void setValue(String value) {
        // Add custom validation or business logic for this setter here.
        setAttributeInternal(VALUE, value);
    }

    /**Gets the attribute value for Description, using the alias name Description
     */
    public String getDescription() {
        // Add any custom logic you wish to perform in this getter here.
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**Sets <code>value</code> as the attribute value for Description
     */
    public void setDescription(String value) {
        // Add custom validation or business logic for this setter here.
        setAttributeInternal(DESCRIPTION, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public String getCreatedBy() {
        // Add any custom logic you wish to perform in this getter here.
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**Gets the attribute value for CreatedDate, using the alias name CreatedDate
     */
    public Date getCreatedDate() {
        // Add any custom logic you wish to perform in this getter here.
        return (Date)getAttributeInternal(CREATEDDATE);
    }

    /**Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        // Add any custom logic you wish to perform in this getter here.
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        // Add any custom logic you wish to perform in this getter here.
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
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

    /**Sets <code>value</code> as the attribute value for LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        // Add custom validation or business logic for this setter here.
        setAttributeInternal(LASTUPDATEDBY, value);
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


    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getChildCategory() {
        return (RowIterator)getAttributeInternal(CHILDCATEGORY);
    }


    /**Gets the attribute value for InternalValue, using the alias name InternalValue
     */
    public String getInternalValue() {
        return (String)getAttributeInternal(INTERNALVALUE);
    }

    /**Sets <code>value</code> as the attribute value for InternalValue
     */
    public void setInternalValue(String value) {
        setAttributeInternal(INTERNALVALUE, value);
    }

    /**Gets the attribute value for OrderBy1, using the alias name OrderBy1
     */
    public Number getOrderBy1() {
        return (Number)getAttributeInternal(ORDERBY1);
    }

    /**Sets <code>value</code> as the attribute value for OrderBy1
     */
    public void setOrderBy1(Number value) {
        setAttributeInternal(ORDERBY1, value);
    }

}