package com.pq.tracs.model.dao;

import com.pq.tracs.model.bo.TracsBaseEntity;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 11 13:48:29 EST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LookupSetMappingViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getId();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        SourceCodeSetId {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getSourceCodeSetId();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setSourceCodeSetId((Number)value);
            }
        }
        ,
        DestinationCodeSetId {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getDestinationCodeSetId();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setDestinationCodeSetId((Number)value);
            }
        }
        ,
        Description {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getDescription();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LookupCodeMappingView {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getLookupCodeMappingView();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LookupCodeSetLookup {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getLookupCodeSetLookup();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LookupCodeSetView1 {
            public Object get(LookupSetMappingViewRowImpl obj) {
                return obj.getLookupCodeSetView1();
            }

            public void put(LookupSetMappingViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(LookupSetMappingViewRowImpl object);

        public abstract void put(LookupSetMappingViewRowImpl object,
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
    public static final int SOURCECODESETID = AttributesEnum.SourceCodeSetId.index();
    public static final int DESTINATIONCODESETID = AttributesEnum.DestinationCodeSetId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LOOKUPCODEMAPPINGVIEW = AttributesEnum.LookupCodeMappingView.index();
    public static final int LOOKUPCODESETLOOKUP = AttributesEnum.LookupCodeSetLookup.index();
    public static final int LOOKUPCODESETVIEW1 = AttributesEnum.LookupCodeSetView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LookupSetMappingViewRowImpl() {
    }

    /**
     * Gets LookupSetMapping entity object.
     * @return the LookupSetMapping
     */
    public TracsBaseEntity getLookupSetMapping() {
        return (TracsBaseEntity)getEntity(0);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for SOURCE_CODE_SET_ID using the alias name SourceCodeSetId.
     * @return the SOURCE_CODE_SET_ID
     */
    public Number getSourceCodeSetId() {
        return (Number)getAttributeInternal(SOURCECODESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_CODE_SET_ID using the alias name SourceCodeSetId.
     * @param value value to set the SOURCE_CODE_SET_ID
     */
    public void setSourceCodeSetId(Number value) {
        setAttributeInternal(SOURCECODESETID, value);
    }

    /**
     * Gets the attribute value for DESTINATION_CODE_SET_ID using the alias name DestinationCodeSetId.
     * @return the DESTINATION_CODE_SET_ID
     */
    public Number getDestinationCodeSetId() {
        return (Number)getAttributeInternal(DESTINATIONCODESETID);
    }

    /**
     * Sets <code>value</code> as attribute value for DESTINATION_CODE_SET_ID using the alias name DestinationCodeSetId.
     * @param value value to set the DESTINATION_CODE_SET_ID
     */
    public void setDestinationCodeSetId(Number value) {
        setAttributeInternal(DESTINATIONCODESETID, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
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

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
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
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
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
     * Gets the associated <code>RowIterator</code> using master-detail link LookupCodeMappingView.
     */
    public RowIterator getLookupCodeMappingView() {
        return (RowIterator)getAttributeInternal(LOOKUPCODEMAPPINGVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupCodeSetLookup.
     */
    public RowSet getLookupCodeSetLookup() {
        return (RowSet)getAttributeInternal(LOOKUPCODESETLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupCodeSetView1.
     */
    public RowSet getLookupCodeSetView1() {
        return (RowSet)getAttributeInternal(LOOKUPCODESETVIEW1);
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
