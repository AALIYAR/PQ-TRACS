package com.pq.tracs.model.dao;

import com.pq.tracs.model.bo.OvrBrowseTypeImpl;

import com.pq.tracs.model.services.TracsServiceImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 24 11:52:09 EST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OvrBrowseTypeViewRowImpl extends ViewRowImpl {
    @Override
    public void remove() {
        DCDataControl dc =
                   BindingContext.getCurrent().findDataControl("TracsServiceDataControl");
        TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
        String user = appM.getUsername();
          if(this.getTitleRecordId() != null ) { 
                  this.getTitleRecordView().setLastUpdatedBy(user);
                            }
        super.remove();
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getId();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleRecordId {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getTitleRecordId();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setTitleRecordId((Number)value);
            }
        }
        ,
        BrowseType {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getBrowseType();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setBrowseType((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        TitleRecordView {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getTitleRecordView();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BrowseTypeLookup {
            public Object get(OvrBrowseTypeViewRowImpl obj) {
                return obj.getBrowseTypeLookup();
            }

            public void put(OvrBrowseTypeViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(OvrBrowseTypeViewRowImpl object);

        public abstract void put(OvrBrowseTypeViewRowImpl object,
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
    public static final int TITLERECORDID = AttributesEnum.TitleRecordId.index();
    public static final int BROWSETYPE = AttributesEnum.BrowseType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TITLERECORDVIEW = AttributesEnum.TitleRecordView.index();
    public static final int BROWSETYPELOOKUP = AttributesEnum.BrowseTypeLookup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OvrBrowseTypeViewRowImpl() {
    }

    /**
     * Gets OvrBrowseType entity object.
     * @return the OvrBrowseType
     */
    public OvrBrowseTypeImpl getOvrBrowseType() {
        return (OvrBrowseTypeImpl)getEntity(0);
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
     * Gets the attribute value for TITLE_RECORD_ID using the alias name TitleRecordId.
     * @return the TITLE_RECORD_ID
     */
    public Number getTitleRecordId() {
        return (Number)getAttributeInternal(TITLERECORDID);
    }

    /**
     * Sets <code>value</code> as attribute value for TITLE_RECORD_ID using the alias name TitleRecordId.
     * @param value value to set the TITLE_RECORD_ID
     */
    public void setTitleRecordId(Number value) {
        setAttributeInternal(TITLERECORDID, value);
    }

    /**
     * Gets the attribute value for BROWSE_TYPE using the alias name BrowseType.
     * @return the BROWSE_TYPE
     */
    public String getBrowseType() {
        return (String) getAttributeInternal(BROWSETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for BROWSE_TYPE using the alias name BrowseType.
     * @param value value to set the BROWSE_TYPE
     */
    public void setBrowseType(String value) {
        setAttributeInternal(BROWSETYPE, value);
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
     * Gets the associated <code>Row</code> using master-detail link TitleRecordView.
     */
    public TitleRecordViewRowImpl getTitleRecordView() {
        return (TitleRecordViewRowImpl)getAttributeInternal(TITLERECORDVIEW);
    }

    /**
     * Sets the master-detail link TitleRecordView between this object and <code>value</code>.
     */
    public void setTitleRecordView(Row value) {
        setAttributeInternal(TITLERECORDVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BrowseTypeLookup.
     */
    public RowSet getBrowseTypeLookup() {
        return (RowSet)getAttributeInternal(BROWSETYPELOOKUP);
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
