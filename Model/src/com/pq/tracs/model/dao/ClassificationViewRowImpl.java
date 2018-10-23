package com.pq.tracs.model.dao;

import com.pq.tracs.model.bo.ClassificationImpl;

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
// ---    Mon Apr 21 14:48:25 EDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ClassificationViewRowImpl extends ViewRowImpl {
    @Override
    public void remove() {
        DCDataControl dc =
                   BindingContext.getCurrent().findDataControl("TracsServiceDataControl");
        TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
        String user = appM.getUsername();
          if(this.getTitleRecordId() != null ) { 
                  this.getTitleRecordView().setLastUpdatedBy(user);
                            }
          if(this.getTitleId() != null) {
                  this.getTitleView().setLastUpdatedBy(user);              
          }
          
          super.remove();
          
          

    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getId();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        TitleId {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleId();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setTitleId((Number)value);
            }
        }
        ,
        ClassificationType {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getClassificationType();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setClassificationType((String)value);
            }
        }
        ,
        ClassificationNumber {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getClassificationNumber();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setClassificationNumber((String)value);
            }
        }
        ,
        PrimaryFlag {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getPrimaryFlag();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setPrimaryFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        TitleRecordId {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleRecordId();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setTitleRecordId((Number)value);
            }
        }
        ,
        PrimaryClassification {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getPrimaryClassification();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setPrimaryClassification((String)value);
            }
        }
        ,
        PrimaryClassificationType {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getPrimaryClassificationType();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setPrimaryClassificationType((String)value);
            }
        }
        ,
        GenerationMethod {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getGenerationMethod();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setGenerationMethod((String)value);
            }
        }
        ,
        TitleRecordView {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleRecordView();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TitleView {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleView();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TitleClassificationLookup {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleClassificationLookup();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        GenerationMethodLookup {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getGenerationMethodLookup();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TitleClassificationsLookup {
            public Object get(ClassificationViewRowImpl obj) {
                return obj.getTitleClassificationsLookup();
            }

            public void put(ClassificationViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ClassificationViewRowImpl object);

        public abstract void put(ClassificationViewRowImpl object,
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
    public static final int CLASSIFICATIONTYPE = AttributesEnum.ClassificationType.index();
    public static final int CLASSIFICATIONNUMBER = AttributesEnum.ClassificationNumber.index();
    public static final int PRIMARYFLAG = AttributesEnum.PrimaryFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TITLERECORDID = AttributesEnum.TitleRecordId.index();
    public static final int PRIMARYCLASSIFICATION = AttributesEnum.PrimaryClassification.index();
    public static final int PRIMARYCLASSIFICATIONTYPE = AttributesEnum.PrimaryClassificationType.index();
    public static final int GENERATIONMETHOD = AttributesEnum.GenerationMethod.index();
    public static final int TITLERECORDVIEW = AttributesEnum.TitleRecordView.index();
    public static final int TITLEVIEW = AttributesEnum.TitleView.index();
    public static final int TITLECLASSIFICATIONLOOKUP = AttributesEnum.TitleClassificationLookup.index();
    public static final int GENERATIONMETHODLOOKUP = AttributesEnum.GenerationMethodLookup.index();
    public static final int TITLECLASSIFICATIONSLOOKUP = AttributesEnum.TitleClassificationsLookup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ClassificationViewRowImpl() {
    }

    /**
     * Gets Classification entity object.
     * @return the Classification
     */
    public ClassificationImpl getClassification() {
        return (ClassificationImpl)getEntity(0);
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
     * Gets the attribute value for TITLE_ID using the alias name TitleId.
     * @return the TITLE_ID
     */
    public Number getTitleId() {
        return (Number)getAttributeInternal(TITLEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TITLE_ID using the alias name TitleId.
     * @param value value to set the TITLE_ID
     */
    public void setTitleId(Number value) {
        setAttributeInternal(TITLEID, value);
    }

    /**
     * Gets the attribute value for CLASSIFICATION_TYPE using the alias name ClassificationType.
     * @return the CLASSIFICATION_TYPE
     */
    public String getClassificationType() {
        return (String) getAttributeInternal(CLASSIFICATIONTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CLASSIFICATION_TYPE using the alias name ClassificationType.
     * @param value value to set the CLASSIFICATION_TYPE
     */
    public void setClassificationType(String value) {
        setAttributeInternal(CLASSIFICATIONTYPE, value);
    }

    /**
     * Gets the attribute value for CLASSIFICATION_NUMBER using the alias name ClassificationNumber.
     * @return the CLASSIFICATION_NUMBER
     */
    public String getClassificationNumber() {
        return (String) getAttributeInternal(CLASSIFICATIONNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for CLASSIFICATION_NUMBER using the alias name ClassificationNumber.
     * @param value value to set the CLASSIFICATION_NUMBER
     */
    public void setClassificationNumber(String value) {
        setAttributeInternal(CLASSIFICATIONNUMBER, value);
    }

    /**
     * Gets the attribute value for PRIMARY_FLAG using the alias name PrimaryFlag.
     * @return the PRIMARY_FLAG
     */
    public String getPrimaryFlag() {
        return (String) getAttributeInternal(PRIMARYFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for PRIMARY_FLAG using the alias name PrimaryFlag.
     * @param value value to set the PRIMARY_FLAG
     */
    public void setPrimaryFlag(String value) {
        setAttributeInternal(PRIMARYFLAG, value);
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
     * Gets the attribute value for the calculated attribute PrimaryClassification.
     * @return the PrimaryClassification
     */
    public String getPrimaryClassification() {
        return (String) getAttributeInternal(PRIMARYCLASSIFICATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PrimaryClassification.
     * @param value value to set the  PrimaryClassification
     */
    public void setPrimaryClassification(String value) {
        setAttributeInternal(PRIMARYCLASSIFICATION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PrimaryClassificationType.
     * @return the PrimaryClassificationType
     */
    public String getPrimaryClassificationType() {
        return (String) getAttributeInternal(PRIMARYCLASSIFICATIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PrimaryClassificationType.
     * @param value value to set the  PrimaryClassificationType
     */
    public void setPrimaryClassificationType(String value) {
        setAttributeInternal(PRIMARYCLASSIFICATIONTYPE, value);
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
     * Gets the associated <code>Row</code> using master-detail link TitleView.
     */
    public TitleViewRowImpl getTitleView() {
        return (TitleViewRowImpl)getAttributeInternal(TITLEVIEW);
    }

    /**
     * Sets the master-detail link TitleView between this object and <code>value</code>.
     */
    public void setTitleView(Row value) {
        setAttributeInternal(TITLEVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TitleClassificationLookup.
     */
    public RowSet getTitleClassificationLookup() {
        return (RowSet)getAttributeInternal(TITLECLASSIFICATIONLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> GenerationMethodLookup.
     */
    public RowSet getGenerationMethodLookup() {
        return (RowSet)getAttributeInternal(GENERATIONMETHODLOOKUP);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TitleClassificationsLookup.
     */
    public RowSet getTitleClassificationsLookup() {
        return (RowSet)getAttributeInternal(TITLECLASSIFICATIONSLOOKUP);
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
