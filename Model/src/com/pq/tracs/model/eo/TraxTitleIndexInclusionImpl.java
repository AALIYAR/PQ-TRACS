package com.pq.tracs.model.eo;

import com.pq.tracs.model.bo.TitleImpl;
import com.pq.tracs.model.bo.TracsBaseEntity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Feb 02 15:00:16 EST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TraxTitleIndexInclusionImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getId();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleId {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getTitleId();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setTitleId((Number)value);
            }
        }
        ,
        IndexName {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getIndexName();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setIndexName((String)value);
            }
        }
        ,
        IndexNote {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getIndexNote();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setIndexNote((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        Title {
            public Object get(TraxTitleIndexInclusionImpl obj) {
                return obj.getTitle();
            }

            public void put(TraxTitleIndexInclusionImpl obj, Object value) {
                obj.setTitle((TitleImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TraxTitleIndexInclusionImpl object);

        public abstract void put(TraxTitleIndexInclusionImpl object,
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
    public static final int TITLEID = AttributesEnum.TitleId.index();
    public static final int INDEXNAME = AttributesEnum.IndexName.index();
    public static final int INDEXNOTE = AttributesEnum.IndexNote.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TITLE = AttributesEnum.Title.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TraxTitleIndexInclusionImpl() {
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
     * Gets the attribute value for TitleId, using the alias name TitleId.
     * @return the TitleId
     */
    public Number getTitleId() {
        return (Number)getAttributeInternal(TITLEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TitleId.
     * @param value value to set the TitleId
     */
    public void setTitleId(Number value) {
        setAttributeInternal(TITLEID, value);
    }

    /**
     * Gets the attribute value for IndexName, using the alias name IndexName.
     * @return the IndexName
     */
    public String getIndexName() {
        return (String)getAttributeInternal(INDEXNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for IndexName.
     * @param value value to set the IndexName
     */
    public void setIndexName(String value) {
        setAttributeInternal(INDEXNAME, value);
    }

    /**
     * Gets the attribute value for IndexNote, using the alias name IndexNote.
     * @return the IndexNote
     */
    public String getIndexNote() {
        return (String)getAttributeInternal(INDEXNOTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IndexNote.
     * @param value value to set the IndexNote
     */
    public void setIndexNote(String value) {
        setAttributeInternal(INDEXNOTE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
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

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the CreatedDate
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

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
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

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
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
     * @return the associated entity com.pq.tracs.model.bo.TitleImpl.
     */
    public TitleImpl getTitle() {
        return (TitleImpl)getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the associated entity com.pq.tracs.model.bo.TitleImpl.
     */
    public void setTitle(TitleImpl value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.eo.TraxTitleIndexInclusion");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }
}
