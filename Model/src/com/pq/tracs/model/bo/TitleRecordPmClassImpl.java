package com.pq.tracs.model.bo;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TitleRecordPmClassImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getId();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleRecordId {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getTitleRecordId();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setTitleRecordId((Number)value);
            }
        }
        ,
        PmClass {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getPmClass();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setPmClass((String)value);
            }
        }
        ,
        PrimaryFlag {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getPrimaryFlag();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setPrimaryFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedDate {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TitleRecord {
            public Object get(TitleRecordPmClassImpl obj) {
                return obj.getTitleRecord();
            }

            public void put(TitleRecordPmClassImpl obj, Object value) {
                obj.setTitleRecord((TitleRecordImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TitleRecordPmClassImpl object);

        public abstract void put(TitleRecordPmClassImpl object, Object value);

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
    public static final int PMCLASS = AttributesEnum.PmClass.index();
    public static final int PRIMARYFLAG = AttributesEnum.PrimaryFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TITLERECORD = AttributesEnum.TitleRecord.index();

    /**This is the default constructor (do not remove)
     */
    public TitleRecordPmClassImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.TitleRecordPmClass");
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

    /**Gets the attribute value for PmClass, using the alias name PmClass
     */
    public String getPmClass() {
        return (String)getAttributeInternal(PMCLASS);
    }

    /**Sets <code>value</code> as the attribute value for PmClass
     */
    public void setPmClass(String value) {
        setAttributeInternal(PMCLASS, value);
    }

    /**Gets the attribute value for PrimaryFlag, using the alias name PrimaryFlag
     */
    public String getPrimaryFlag() {
        return (String)getAttributeInternal(PRIMARYFLAG);
    }

    /**Sets <code>value</code> as the attribute value for PrimaryFlag
     */
    public void setPrimaryFlag(String value) {
        setAttributeInternal(PRIMARYFLAG, value);
    }

    /**Gets the attribute value for CreatedBy, using the alias name CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**Gets the attribute value for CreatedDate, using the alias name CreatedDate
     */
    public Date getCreatedDate() {
        return (Date)getAttributeInternal(CREATEDDATE);
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


    protected void prepareForDML(int operation, TransactionEvent e) {
        super.prepareForDML(operation, e);
        
         try {
             if (operation == DML_INSERT || operation == DML_UPDATE) {
                 if(this.getTitleRecord().getTitleRecordPmClass().getRowCount()<=1){
                     setPrimaryFlag("Y");
                 }
             }
         } catch (Exception efg) {
             
         }
    }

    /**Gets the associated entity TitleRecordImpl
     */
    public TitleRecordImpl getTitleRecord() {
        return (TitleRecordImpl)getAttributeInternal(TITLERECORD);
    }

    /**Sets <code>value</code> as the associated entity TitleRecordImpl
     */
    public void setTitleRecord(TitleRecordImpl value) {
        setAttributeInternal(TITLERECORD, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

}
