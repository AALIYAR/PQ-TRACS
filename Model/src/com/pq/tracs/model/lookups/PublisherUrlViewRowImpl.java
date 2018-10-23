package com.pq.tracs.model.lookups;

import com.pq.tracs.model.bo.LookupCodeImpl;
import com.pq.tracs.model.bo.LookupCodeSetImpl;


import com.pq.tracs.model.dao.PublisherAddressLOVViewImpl;

import oracle.jbo.AttributeList;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PublisherUrlViewRowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getId();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        InternalValue {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getInternalValue();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setInternalValue((String)value);
            }
        }
        ,
        DisplayValue {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getDisplayValue();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setDisplayValue((String)value);
            }
        }
        ,
        OrderBy1 {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getOrderBy1();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setOrderBy1((Number)value);
            }
        }
        ,
        Description {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getDescription();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        CreatedbySearch {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getCreatedbySearch();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setCreatedbySearch((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedbySearch {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getLastUpdatedbySearch();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setLastUpdatedbySearch((Date)value);
            }
        }
        ,
        LookupCodeSetId {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getLookupCodeSetId();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setLookupCodeSetId((Number)value);
            }
        }
        ,
        Id1 {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getId1();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setId1((Number)value);
            }
        }
        ,
        CodeSet {
            public Object get(PublisherUrlViewRowImpl obj) {
                return obj.getCodeSet();
            }

            public void put(PublisherUrlViewRowImpl obj, Object value) {
                obj.setCodeSet((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PublisherUrlViewRowImpl object);

        public abstract void put(PublisherUrlViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int INTERNALVALUE = AttributesEnum.InternalValue.index();
    public static final int DISPLAYVALUE = AttributesEnum.DisplayValue.index();
    public static final int ORDERBY1 = AttributesEnum.OrderBy1.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBYSEARCH = AttributesEnum.CreatedbySearch.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBYSEARCH = AttributesEnum.LastUpdatedbySearch.index();
    public static final int LOOKUPCODESETID = AttributesEnum.LookupCodeSetId.index();
    public static final int ID1 = AttributesEnum.Id1.index();
    public static final int CODESET = AttributesEnum.CodeSet.index();

    /**This is the default constructor (do not remove)
     */
    public PublisherUrlViewRowImpl() {
    }

    /**Gets LookupCode entity object.
     */
    public LookupCodeImpl getLookupCode() {
        return (LookupCodeImpl)getEntity(0);
    }

    /**Gets LookupCodeSet entity object.
     */
    public LookupCodeSetImpl getLookupCodeSet() {
        return (LookupCodeSetImpl)getEntity(1);
    }

    /**Gets the attribute value for ID using the alias name Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as attribute value for ID using the alias name Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for INTERNAL_VALUE using the alias name InternalValue
     */
    public String getInternalValue() {
        return (String)getAttributeInternal(INTERNALVALUE);
    }

    /**Sets <code>value</code> as attribute value for INTERNAL_VALUE using the alias name InternalValue
     */
    public void setInternalValue(String value) {
        setAttributeInternal(INTERNALVALUE, value);
    }

    /**Gets the attribute value for DISPLAY_VALUE using the alias name DisplayValue
     */
    public String getDisplayValue() {
        return (String)getAttributeInternal(DISPLAYVALUE);
    }

    /**Sets <code>value</code> as attribute value for DISPLAY_VALUE using the alias name DisplayValue
     */
    public void setDisplayValue(String value) {
        setAttributeInternal(DISPLAYVALUE, value);
    }

    /**Gets the attribute value for ORDER_BY using the alias name OrderBy1
     */
    public Number getOrderBy1() {
        return (Number)getAttributeInternal(ORDERBY1);
    }

    /**Sets <code>value</code> as attribute value for ORDER_BY using the alias name OrderBy1
     */
    public void setOrderBy1(Number value) {
        setAttributeInternal(ORDERBY1, value);
    }

    /**Gets the attribute value for DESCRIPTION using the alias name Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**Gets the attribute value for CREATED_BY using the alias name CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
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
        return (Date)getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedbySearch.
     * @return the CreatedbySearch
     */
    public Date getCreatedbySearch() {
        return (Date) getAttributeInternal(CREATEDBYSEARCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedbySearch.
     * @param value value to set the  CreatedbySearch
     */
    public void setCreatedbySearch(Date value) {
        setAttributeInternal(CREATEDBYSEARCH, value);
    }

    /**Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedbySearch.
     * @return the LastUpdatedbySearch
     */
    public Date getLastUpdatedbySearch() {
        return (Date) getAttributeInternal(LASTUPDATEDBYSEARCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedbySearch.
     * @param value value to set the  LastUpdatedbySearch
     */
    public void setLastUpdatedbySearch(Date value) {
        setAttributeInternal(LASTUPDATEDBYSEARCH, value);
    }

    /**Gets the attribute value for LOOKUP_CODE_SET_ID using the alias name LookupCodeSetId
     */
    public Number getLookupCodeSetId() {
        return (Number)getAttributeInternal(LOOKUPCODESETID);
    }

    /**Sets <code>value</code> as attribute value for LOOKUP_CODE_SET_ID using the alias name LookupCodeSetId
     */
    public void setLookupCodeSetId(Number value) {
        setAttributeInternal(LOOKUPCODESETID, value);
    }

    /**Gets the attribute value for ID using the alias name Id1
     */
    public Number getId1() {
        return (Number)getAttributeInternal(ID1);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id1.
     * @param value value to set the ID
     */
    public void setId1(Number value) {
        setAttributeInternal(ID1, value);
    }

    /**Gets the attribute value for CODE_SET using the alias name CodeSet
     */
    public String getCodeSet() {
        return (String)getAttributeInternal(CODESET);
    }

    /**Sets <code>value</code> as attribute value for CODE_SET using the alias name CodeSet
     */
    public void setCodeSet(String value) {
        setAttributeInternal(CODESET, value);
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

    protected void create(AttributeList nvp) {
        super.create(nvp);

        try {
            this.setLookupCodeSetId(((PublisherUrlViewImpl)this.getViewObject()).getURLCODESETID());

        } catch (Exception ex) {
            System.out.println("pub id error");
            ex.printStackTrace();
        }
    }

}
