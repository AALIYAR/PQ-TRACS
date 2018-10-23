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
public class TitleContractRightImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TitleContractRightImpl obj) {
                return obj.getId();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleId {
            public Object get(TitleContractRightImpl obj) {
                return obj.getTitleId();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setTitleId((Number)value);
            }
        }
        ,
        ContractRightId {
            public Object get(TitleContractRightImpl obj) {
                return obj.getContractRightId();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setContractRightId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TitleContractRightImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TitleContractRightImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TitleContractRightImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TitleContractRightImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        ContractRight {
            public Object get(TitleContractRightImpl obj) {
                return obj.getContractRight();
            }

            public void put(TitleContractRightImpl obj, Object value) {
                obj.setContractRight((ContractRightImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TitleContractRightImpl object);

        public abstract void put(TitleContractRightImpl object, Object value);

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
    public static final int TITLEID = AttributesEnum.TitleId.index();
    public static final int CONTRACTRIGHTID = AttributesEnum.ContractRightId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int CONTRACTRIGHT = AttributesEnum.ContractRight.index();

    /**This is the default constructor (do not remove)
     */
    public TitleContractRightImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.TitleContractRight");
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

    /**Gets the attribute value for ContractRightId, using the alias name ContractRightId
     */
    public Number getContractRightId() {
        return (Number)getAttributeInternal(CONTRACTRIGHTID);
    }

    /**Sets <code>value</code> as the attribute value for ContractRightId
     */
    public void setContractRightId(Number value) {
        setAttributeInternal(CONTRACTRIGHTID, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for CreatedDate, using the alias name CreatedDate
     */
    public Date getCreatedDate() {
        return (Date)getAttributeInternal(CREATEDDATE);
    }

    /**Sets <code>value</code> as the attribute value for CreatedDate
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

    /**Sets <code>value</code> as the attribute value for LastUpdatedDate
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


    /**Gets the associated entity ContractRightImpl
     */
    public ContractRightImpl getContractRight() {
        return (ContractRightImpl)getAttributeInternal(CONTRACTRIGHT);
    }

    /**Sets <code>value</code> as the associated entity ContractRightImpl
     */
    public void setContractRight(ContractRightImpl value) {
        setAttributeInternal(CONTRACTRIGHT, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

}
