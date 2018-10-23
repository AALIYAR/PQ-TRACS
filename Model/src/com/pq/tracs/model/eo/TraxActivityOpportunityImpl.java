package com.pq.tracs.model.eo;

import com.pq.tracs.model.bo.ActivityImpl;
import com.pq.tracs.model.bo.TracsBaseEntity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 18 14:28:25 EDT 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TraxActivityOpportunityImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getId();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        ActivityId {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getActivityId();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setActivityId((Number)value);
            }
        }
        ,
        PrmOpportunityId {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getPrmOpportunityId();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setPrmOpportunityId((Number)value);
            }
        }
        ,
        AddedDate {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getAddedDate();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setAddedDate((Date)value);
            }
        }
        ,
        RemovedDate {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getRemovedDate();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setRemovedDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedDate {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PrimaryFlag {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getPrimaryFlag();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setPrimaryFlag((String)value);
            }
        }
        ,
        Activity {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getActivity();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setActivity((ActivityImpl)value);
            }
        }
        ,
        PrmOpportunity {
            public Object get(TraxActivityOpportunityImpl obj) {
                return obj.getPrmOpportunity();
            }

            public void put(TraxActivityOpportunityImpl obj, Object value) {
                obj.setPrmOpportunity((TracsBaseEntity)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TraxActivityOpportunityImpl object);

        public abstract void put(TraxActivityOpportunityImpl object,
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
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int PRMOPPORTUNITYID = AttributesEnum.PrmOpportunityId.index();
    public static final int ADDEDDATE = AttributesEnum.AddedDate.index();
    public static final int REMOVEDDATE = AttributesEnum.RemovedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int PRIMARYFLAG = AttributesEnum.PrimaryFlag.index();
    public static final int ACTIVITY = AttributesEnum.Activity.index();
    public static final int PRMOPPORTUNITY = AttributesEnum.PrmOpportunity.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TraxActivityOpportunityImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.eo.TraxActivityOpportunity");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for ActivityId, using the alias name ActivityId.
     * @return the ActivityId
     */
    public Number getActivityId() {
        return (Number)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityId.
     * @param value value to set the ActivityId
     */
    public void setActivityId(Number value) {
        setAttributeInternal(ACTIVITYID, value);
    }

    /**
     * Gets the attribute value for PrmOpportunityId, using the alias name PrmOpportunityId.
     * @return the PrmOpportunityId
     */
    public Number getPrmOpportunityId() {
        return (Number)getAttributeInternal(PRMOPPORTUNITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrmOpportunityId.
     * @param value value to set the PrmOpportunityId
     */
    public void setPrmOpportunityId(Number value) {
        setAttributeInternal(PRMOPPORTUNITYID, value);
    }

    /**
     * Gets the attribute value for AddedDate, using the alias name AddedDate.
     * @return the AddedDate
     */
    public Date getAddedDate() {
        return (Date)getAttributeInternal(ADDEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AddedDate.
     * @param value value to set the AddedDate
     */
    public void setAddedDate(Date value) {
        setAttributeInternal(ADDEDDATE, value);
    }

    /**
     * Gets the attribute value for RemovedDate, using the alias name RemovedDate.
     * @return the RemovedDate
     */
    public Date getRemovedDate() {
        return (Date)getAttributeInternal(REMOVEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemovedDate.
     * @param value value to set the RemovedDate
     */
    public void setRemovedDate(Date value) {
        setAttributeInternal(REMOVEDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the CreatedDate
     */
    public Date getCreatedDate() {
        return (Date)getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Gets the attribute value for PrimaryFlag, using the alias name PrimaryFlag.
     * @return the PrimaryFlag
     */
    public String getPrimaryFlag() {
        return (String)getAttributeInternal(PRIMARYFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrimaryFlag.
     * @param value value to set the PrimaryFlag
     */
    public void setPrimaryFlag(String value) {
        setAttributeInternal(PRIMARYFLAG, value);
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

    /**
     * @return the associated entity com.pq.tracs.model.bo.ActivityImpl.
     */
    public ActivityImpl getActivity() {
        return (ActivityImpl)getAttributeInternal(ACTIVITY);
    }

    /**
     * Sets <code>value</code> as the associated entity com.pq.tracs.model.bo.ActivityImpl.
     */
    public void setActivity(ActivityImpl value) {
        setAttributeInternal(ACTIVITY, value);
    }

    /**
     * @return the associated entity com.pq.tracs.model.bo.TracsBaseEntity.
     */
    public TracsBaseEntity getPrmOpportunity() {
        return (TracsBaseEntity)getAttributeInternal(PRMOPPORTUNITY);
    }

    /**
     * Sets <code>value</code> as the associated entity com.pq.tracs.model.bo.TracsBaseEntity.
     */
    public void setPrmOpportunity(TracsBaseEntity value) {
        setAttributeInternal(PRMOPPORTUNITY, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    public void create(AttributeList attributeList) {
        super.create(attributeList);
    }
  
  protected void validateEntity() {
      super.validateEntity();
      
      if (this.getPrimaryFlag().equalsIgnoreCase("Y")) {
          // if primary flag is set on this record, then mark the title as invalid so it will validat the primary flags
          this.getActivity().setInvalid();
      }
  }

}
