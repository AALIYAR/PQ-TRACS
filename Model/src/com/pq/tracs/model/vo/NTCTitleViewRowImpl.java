package com.pq.tracs.model.vo;

import com.pq.tracs.model.bo.ActivityImpl;

import com.pq.tracs.model.bo.TracsBaseEntity;

import com.pq.tracs.model.eo.TraxActivityContentOwnerImpl;
import com.pq.tracs.model.eo.TraxActivityTitleImpl;

import com.pq.tracs.model.eo.TraxActivityUserImpl;

import com.pq.tracs.model.eo.TraxTitleChangeImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.RowCreateException;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 02 11:51:35 EST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NTCTitleViewRowImpl extends ViewRowImpl {
    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);

        this.setType("NTC-B");
        // The view row will already have created "blank" entity instances
        ActivityImpl newActivity = this.getActivity();
        TraxActivityUserImpl newActivityUser = this.getTraxActivityUser();
        TraxTitleChangeImpl newTitleChange = this.getTraxTitleChange();
        try {
            // Let "blank" entity instance do programmatic defaulting
            newActivity.create(attributeList);

            newTitleChange.create(newActivity);
            newTitleChange.setActivityId(newActivity.getId());

            // create the activity user row and set the user type to Owner
            newActivityUser.create(newActivity);
            newActivityUser.setActivityId(newActivity.getId());
            newActivityUser.setUserType("Owner");
            newActivityUser.setAddDate(new Date(Date.getCurrentDate()));
            this.setOwner(newActivityUser.getUserDisplayName());

        } catch (JboException ex) {
            newActivity.revert();
            newActivityUser.revert();
            newTitleChange.revert();
            throw ex;
        } catch (Exception otherEx) {
            newActivity.revert();
            newActivityUser.revert();
            newTitleChange.revert();
            throw new RowCreateException(true, /* EO Row? */"NTC Title",
                    /* EO Name */otherEx); /* Details */
        }
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getId();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        NtcNumber {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNtcNumber();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNtcNumber((Number)value);
            }
        }
        ,
        Type {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getType();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setType((String)value);
            }
        }
        ,
        SubType {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getSubType();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setSubType((String)value);
            }
        }
        ,
        Priority {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getPriority();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setPriority((String)value);
            }
        }
        ,
        Owner {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getOwner();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setOwner((String)value);
            }
        }
        ,
        Description {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getDescription();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        DueDate {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getDueDate();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setDueDate((Date)value);
            }
        }
        ,
        EmailText {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getEmailText();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setEmailText((ClobDomain)value);
            }
        }
        ,
        Notes {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNotes();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNotes((String)value);
            }
        }
        ,
        NtcPriority {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNtcPriority();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNtcPriority((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        Id1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getId1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setId1((Number)value);
            }
        }
        ,
        ActivityId {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getActivityId();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setActivityId((Number)value);
            }
        }
        ,
        CurrentManufactureType {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getCurrentManufactureType();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setCurrentManufactureType((String)value);
            }
        }
        ,
        NewManufactureType {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNewManufactureType();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNewManufactureType((String)value);
            }
        }
        ,
        SupportDocumentationIncFlag {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getSupportDocumentationIncFlag();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setSupportDocumentationIncFlag((String)value);
            }
        }
        ,
        LastVolumeIssueDate {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getLastVolumeIssueDate();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setLastVolumeIssueDate((String)value);
            }
        }
        ,
        FirstVolumeIssueDate {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getFirstVolumeIssueDate();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setFirstVolumeIssueDate((String)value);
            }
        }
        ,
        NewTitle {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNewTitle();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNewTitle((String)value);
            }
        }
        ,
        NewIssn {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNewIssn();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNewIssn((String)value);
            }
        }
        ,
        NewEissn {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getNewEissn();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setNewEissn((String)value);
            }
        }
        ,
        TitleChangeTo {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTitleChangeTo();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setTitleChangeTo((String)value);
            }
        }
        ,
        IssnChangeTo {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getIssnChangeTo();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setIssnChangeTo((String)value);
            }
        }
        ,
        SplitTitle {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getSplitTitle();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setSplitTitle((String)value);
            }
        }
        ,
        SplitIssn {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getSplitIssn();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setSplitIssn((String)value);
            }
        }
        ,
        CreatedBy1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getCreatedBy1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setCreatedBy1((String)value);
            }
        }
        ,
        CreatedDate1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getCreatedDate1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setCreatedDate1((Date)value);
            }
        }
        ,
        LastUpdatedBy1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getLastUpdatedBy1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy1((String)value);
            }
        }
        ,
        LastUpdatedDate1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getLastUpdatedDate1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate1((Date)value);
            }
        }
        ,
        TraxActivityTitleView {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTraxActivityTitleView();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TraxActivityAttachmentView {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTraxActivityAttachmentView();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        SubTypeLookup {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getSubTypeLookup();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_NTCPriorityLooup1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTracsLookupModule_NTCPriorityLooup1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_CurrentManuTypesLookup1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTracsLookupModule_CurrentManuTypesLookup1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_NewManuTypesLookup1 {
            public Object get(NTCTitleViewRowImpl obj) {
                return obj.getTracsLookupModule_NewManuTypesLookup1();
            }

            public void put(NTCTitleViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(NTCTitleViewRowImpl object);

        public abstract void put(NTCTitleViewRowImpl object, Object value);

        public int index() {
            return NTCTitleViewRowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return NTCTitleViewRowImpl.AttributesEnum.firstIndex() +
                NTCTitleViewRowImpl.AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = NTCTitleViewRowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int NTCNUMBER = AttributesEnum.NtcNumber.index();
    public static final int TYPE = AttributesEnum.Type.index();
    public static final int SUBTYPE = AttributesEnum.SubType.index();
    public static final int PRIORITY = AttributesEnum.Priority.index();
    public static final int OWNER = AttributesEnum.Owner.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DUEDATE = AttributesEnum.DueDate.index();
    public static final int EMAILTEXT = AttributesEnum.EmailText.index();
    public static final int NOTES = AttributesEnum.Notes.index();
    public static final int NTCPRIORITY = AttributesEnum.NtcPriority.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ID1 = AttributesEnum.Id1.index();
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int CURRENTMANUFACTURETYPE = AttributesEnum.CurrentManufactureType.index();
    public static final int NEWMANUFACTURETYPE = AttributesEnum.NewManufactureType.index();
    public static final int SUPPORTDOCUMENTATIONINCFLAG = AttributesEnum.SupportDocumentationIncFlag.index();
    public static final int LASTVOLUMEISSUEDATE = AttributesEnum.LastVolumeIssueDate.index();
    public static final int FIRSTVOLUMEISSUEDATE = AttributesEnum.FirstVolumeIssueDate.index();
    public static final int NEWTITLE = AttributesEnum.NewTitle.index();
    public static final int NEWISSN = AttributesEnum.NewIssn.index();
    public static final int NEWEISSN = AttributesEnum.NewEissn.index();
    public static final int TITLECHANGETO = AttributesEnum.TitleChangeTo.index();
    public static final int ISSNCHANGETO = AttributesEnum.IssnChangeTo.index();
    public static final int SPLITTITLE = AttributesEnum.SplitTitle.index();
    public static final int SPLITISSN = AttributesEnum.SplitIssn.index();
    public static final int CREATEDBY1 = AttributesEnum.CreatedBy1.index();
    public static final int CREATEDDATE1 = AttributesEnum.CreatedDate1.index();
    public static final int LASTUPDATEDBY1 = AttributesEnum.LastUpdatedBy1.index();
    public static final int LASTUPDATEDDATE1 = AttributesEnum.LastUpdatedDate1.index();
    public static final int TRAXACTIVITYTITLEVIEW = AttributesEnum.TraxActivityTitleView.index();
    public static final int TRAXACTIVITYATTACHMENTVIEW = AttributesEnum.TraxActivityAttachmentView.index();
    public static final int SUBTYPELOOKUP = AttributesEnum.SubTypeLookup.index();
    public static final int TRACSLOOKUPMODULE_NTCPRIORITYLOOUP1 = AttributesEnum.TracsLookupModule_NTCPriorityLooup1.index();
    public static final int TRACSLOOKUPMODULE_CURRENTMANUTYPESLOOKUP1 = AttributesEnum.TracsLookupModule_CurrentManuTypesLookup1.index();
    public static final int TRACSLOOKUPMODULE_NEWMANUTYPESLOOKUP1 = AttributesEnum.TracsLookupModule_NewManuTypesLookup1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NTCTitleViewRowImpl() {
    }

    /**
     * Gets Activity entity object.
     * @return the Activity
     */
    public ActivityImpl getActivity() {
        return (ActivityImpl)getEntity(0);
    }

    /**
     * Gets TraxTitleChange entity object.
     * @return the TraxTitleChange
     */
    public TraxTitleChangeImpl getTraxTitleChange() {
        return (TraxTitleChangeImpl)getEntity(1);
    }


    /**
     * Gets TraxActivityUser entity object.
     * @return the TraxActivityUser
     */
    public TraxActivityUserImpl getTraxActivityUser() {
        return (TraxActivityUserImpl)getEntity(2);
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
     * Gets the attribute value for NTC_NUMBER using the alias name NtcNumber.
     * @return the NTC_NUMBER
     */
    public Number getNtcNumber() {
        return (Number)getAttributeInternal(NTCNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for NTC_NUMBER using the alias name NtcNumber.
     * @param value value to set the NTC_NUMBER
     */
    public void setNtcNumber(Number value) {
        setAttributeInternal(NTCNUMBER, value);
    }

    /**
     * Gets the attribute value for TYPE using the alias name Type.
     * @return the TYPE
     */
    public String getType() {
        return (String)getAttributeInternal(TYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TYPE using the alias name Type.
     * @param value value to set the TYPE
     */
    public void setType(String value) {
        setAttributeInternal(TYPE, value);
    }

    /**
     * Gets the attribute value for SUB_TYPE using the alias name SubType.
     * @return the SUB_TYPE
     */
    public String getSubType() {
        return (String)getAttributeInternal(SUBTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_TYPE using the alias name SubType.
     * @param value value to set the SUB_TYPE
     */
    public void setSubType(String value) {
        setAttributeInternal(SUBTYPE, value);
    }


    /**
     * Gets the attribute value for PRIORITY using the alias name Priority.
     * @return the PRIORITY
     */
    public String getPriority() {
        return (String)getAttributeInternal(PRIORITY);
    }

    /**
     * Sets <code>value</code> as attribute value for PRIORITY using the alias name Priority.
     * @param value value to set the PRIORITY
     */
    public void setPriority(String value) {
        setAttributeInternal(PRIORITY, value);
    }

    /**
     * Gets the attribute value for OWNER using the alias name Owner.
     * @return the OWNER
     */
    public String getOwner() {
        return (String)getAttributeInternal(OWNER);
    }

    /**
     * Sets <code>value</code> as attribute value for OWNER using the alias name Owner.
     * @param value value to set the OWNER
     */
    public void setOwner(String value) {
        setAttributeInternal(OWNER, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }


    /**
     * Gets the attribute value for DUE_DATE using the alias name DueDate.
     * @return the DUE_DATE
     */
    public Date getDueDate() {
        return (Date)getAttributeInternal(DUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DUE_DATE using the alias name DueDate.
     * @param value value to set the DUE_DATE
     */
    public void setDueDate(Date value) {
        setAttributeInternal(DUEDATE, value);
    }

    /**
     * Gets the attribute value for EMAIL_TEXT using the alias name EmailText.
     * @return the EMAIL_TEXT
     */
    public ClobDomain getEmailText() {
        return (ClobDomain)getAttributeInternal(EMAILTEXT);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL_TEXT using the alias name EmailText.
     * @param value value to set the EMAIL_TEXT
     */
    public void setEmailText(ClobDomain value) {
        setAttributeInternal(EMAILTEXT, value);
    }


    /**
     * Gets the attribute value for NOTES using the alias name Notes.
     * @return the NOTES
     */
    public String getNotes() {
        return (String)getAttributeInternal(NOTES);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTES using the alias name Notes.
     * @param value value to set the NOTES
     */
    public void setNotes(String value) {
        setAttributeInternal(NOTES, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
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
     * Gets the attribute value for ID using the alias name Id1.
     * @return the ID
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

    /**
     * Gets the attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @return the ACTIVITY_ID
     */
    public Number getActivityId() {
        return (Number)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_ID using the alias name ActivityId.
     * @param value value to set the ACTIVITY_ID
     */
    public void setActivityId(Number value) {
        setAttributeInternal(ACTIVITYID, value);
    }

    /**
     * Gets the attribute value for CURRENT_MANUFACTURE_TYPE using the alias name CurrentManufactureType.
     * @return the CURRENT_MANUFACTURE_TYPE
     */
    public String getCurrentManufactureType() {
        return (String)getAttributeInternal(CURRENTMANUFACTURETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENT_MANUFACTURE_TYPE using the alias name CurrentManufactureType.
     * @param value value to set the CURRENT_MANUFACTURE_TYPE
     */
    public void setCurrentManufactureType(String value) {
        setAttributeInternal(CURRENTMANUFACTURETYPE, value);
    }

    /**
     * Gets the attribute value for NEW_MANUFACTURE_TYPE using the alias name NewManufactureType.
     * @return the NEW_MANUFACTURE_TYPE
     */
    public String getNewManufactureType() {
        return (String)getAttributeInternal(NEWMANUFACTURETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for NEW_MANUFACTURE_TYPE using the alias name NewManufactureType.
     * @param value value to set the NEW_MANUFACTURE_TYPE
     */
    public void setNewManufactureType(String value) {
        setAttributeInternal(NEWMANUFACTURETYPE, value);
    }

    /**
     * Gets the attribute value for SUPPORT_DOCUMENTATION_INC_FLAG using the alias name SupportDocumentationIncFlag.
     * @return the SUPPORT_DOCUMENTATION_INC_FLAG
     */
    public String getSupportDocumentationIncFlag() {
        return (String)getAttributeInternal(SUPPORTDOCUMENTATIONINCFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPORT_DOCUMENTATION_INC_FLAG using the alias name SupportDocumentationIncFlag.
     * @param value value to set the SUPPORT_DOCUMENTATION_INC_FLAG
     */
    public void setSupportDocumentationIncFlag(String value) {
        setAttributeInternal(SUPPORTDOCUMENTATIONINCFLAG, value);
    }

    /**
     * Gets the attribute value for LAST_VOLUME_ISSUE_DATE using the alias name LastVolumeIssueDate.
     * @return the LAST_VOLUME_ISSUE_DATE
     */
    public String getLastVolumeIssueDate() {
        return (String)getAttributeInternal(LASTVOLUMEISSUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_VOLUME_ISSUE_DATE using the alias name LastVolumeIssueDate.
     * @param value value to set the LAST_VOLUME_ISSUE_DATE
     */
    public void setLastVolumeIssueDate(String value) {
        setAttributeInternal(LASTVOLUMEISSUEDATE, value);
    }

    /**
     * Gets the attribute value for FIRST_VOLUME_ISSUE_DATE using the alias name FirstVolumeIssueDate.
     * @return the FIRST_VOLUME_ISSUE_DATE
     */
    public String getFirstVolumeIssueDate() {
        return (String)getAttributeInternal(FIRSTVOLUMEISSUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for FIRST_VOLUME_ISSUE_DATE using the alias name FirstVolumeIssueDate.
     * @param value value to set the FIRST_VOLUME_ISSUE_DATE
     */
    public void setFirstVolumeIssueDate(String value) {
        setAttributeInternal(FIRSTVOLUMEISSUEDATE, value);
    }

    /**
     * Gets the attribute value for NEW_TITLE using the alias name NewTitle.
     * @return the NEW_TITLE
     */
    public String getNewTitle() {
        return (String)getAttributeInternal(NEWTITLE);
    }

    /**
     * Sets <code>value</code> as attribute value for NEW_TITLE using the alias name NewTitle.
     * @param value value to set the NEW_TITLE
     */
    public void setNewTitle(String value) {
        setAttributeInternal(NEWTITLE, value);
    }


    /**
     * Gets the attribute value for NEW_ISSN using the alias name NewIssn.
     * @return the NEW_ISSN
     */
    public String getNewIssn() {
        return (String) getAttributeInternal(NEWISSN);
    }

    /**
     * Sets <code>value</code> as attribute value for NEW_ISSN using the alias name NewIssn.
     * @param value value to set the NEW_ISSN
     */
    public void setNewIssn(String value) {
        setAttributeInternal(NEWISSN, value);
    }

    /**
     * Gets the attribute value for NEW_EISSN using the alias name NewEissn.
     * @return the NEW_EISSN
     */
    public String getNewEissn() {
        return (String) getAttributeInternal(NEWEISSN);
    }

    /**
     * Sets <code>value</code> as attribute value for NEW_EISSN using the alias name NewEissn.
     * @param value value to set the NEW_EISSN
     */
    public void setNewEissn(String value) {
        setAttributeInternal(NEWEISSN, value);
    }

    /**
     * Gets the attribute value for TITLE_CHANGE_TO using the alias name TitleChangeTo.
     * @return the TITLE_CHANGE_TO
     */
    public String getTitleChangeTo() {
        return (String)getAttributeInternal(TITLECHANGETO);
    }

    /**
     * Sets <code>value</code> as attribute value for TITLE_CHANGE_TO using the alias name TitleChangeTo.
     * @param value value to set the TITLE_CHANGE_TO
     */
    public void setTitleChangeTo(String value) {
        setAttributeInternal(TITLECHANGETO, value);
    }

    /**
     * Gets the attribute value for ISSN_CHANGE_TO using the alias name IssnChangeTo.
     * @return the ISSN_CHANGE_TO
     */
    public String getIssnChangeTo() {
        return (String)getAttributeInternal(ISSNCHANGETO);
    }

    /**
     * Sets <code>value</code> as attribute value for ISSN_CHANGE_TO using the alias name IssnChangeTo.
     * @param value value to set the ISSN_CHANGE_TO
     */
    public void setIssnChangeTo(String value) {
        setAttributeInternal(ISSNCHANGETO, value);
    }

    /**
     * Gets the attribute value for SPLIT_TITLE using the alias name SplitTitle.
     * @return the SPLIT_TITLE
     */
    public String getSplitTitle() {
        return (String)getAttributeInternal(SPLITTITLE);
    }

    /**
     * Sets <code>value</code> as attribute value for SPLIT_TITLE using the alias name SplitTitle.
     * @param value value to set the SPLIT_TITLE
     */
    public void setSplitTitle(String value) {
        setAttributeInternal(SPLITTITLE, value);
    }

    /**
     * Gets the attribute value for SPLIT_ISSN using the alias name SplitIssn.
     * @return the SPLIT_ISSN
     */
    public String getSplitIssn() {
        return (String)getAttributeInternal(SPLITISSN);
    }

    /**
     * Sets <code>value</code> as attribute value for SPLIT_ISSN using the alias name SplitIssn.
     * @param value value to set the SPLIT_ISSN
     */
    public void setSplitIssn(String value) {
        setAttributeInternal(SPLITISSN, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy1.
     * @return the CREATED_BY
     */
    public String getCreatedBy1() {
        return (String)getAttributeInternal(CREATEDBY1);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy1.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy1(String value) {
        setAttributeInternal(CREATEDBY1, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate1.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate1() {
        return (Date)getAttributeInternal(CREATEDDATE1);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate1.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate1(Date value) {
        setAttributeInternal(CREATEDDATE1, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy1.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy1() {
        return (String)getAttributeInternal(LASTUPDATEDBY1);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy1.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy1(String value) {
        setAttributeInternal(LASTUPDATEDBY1, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate1.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate1() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE1);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate1.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate1(Date value) {
        setAttributeInternal(LASTUPDATEDDATE1, value);
    }


    /**
     * Gets the attribute value for NTC_PRIORITY using the alias name NtcPriority.
     * @return the NTC_PRIORITY
     */
    public String getNtcPriority() {
        return (String) getAttributeInternal(NTCPRIORITY);
    }

    /**
     * Sets <code>value</code> as attribute value for NTC_PRIORITY using the alias name NtcPriority.
     * @param value value to set the NTC_PRIORITY
     */
    public void setNtcPriority(String value) {
        setAttributeInternal(NTCPRIORITY, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TraxActivityTitleView.
     */
    public RowIterator getTraxActivityTitleView() {
        return (RowIterator)getAttributeInternal(TRAXACTIVITYTITLEVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TraxActivityAttachmentView.
     */
    public RowIterator getTraxActivityAttachmentView() {
        return (RowIterator)getAttributeInternal(TRAXACTIVITYATTACHMENTVIEW);
    }


    /**
     * Gets the view accessor <code>RowSet</code> SubTypeLookup.
     */
    public RowSet getSubTypeLookup() {
        return (RowSet)getAttributeInternal(SUBTYPELOOKUP);
    }


    /**
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_NTCPriorityLooup1.
     */
    public RowSet getTracsLookupModule_NTCPriorityLooup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_NTCPRIORITYLOOUP1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_CurrentManuTypesLookup1.
     */
    public RowSet getTracsLookupModule_CurrentManuTypesLookup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_CURRENTMANUTYPESLOOKUP1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_NewManuTypesLookup1.
     */
    public RowSet getTracsLookupModule_NewManuTypesLookup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_NEWMANUTYPESLOOKUP1);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
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
