package com.pq.tracs.model.vo;

import com.pq.tracs.model.bo.ActivityImpl;
import com.pq.tracs.model.bo.TracsBaseEntity;
import com.pq.tracs.model.eo.TraxActivityUserImpl;

import com.pq.tracs.model.eo.TraxRightsChangeImpl;
import com.pq.tracs.model.eo.TraxTitleChangeImpl;

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
// ---    Sun Jun 28 12:15:41 EDT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NTCRightsViewRowImpl extends ViewRowImpl {
    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);

        this.setType("NTC-R");
        // The view row will already have created "blank" entity instances
        ActivityImpl newActivity = this.getActivity();
        TraxActivityUserImpl newActivityUser = this.getTraxActivityUser();
        TraxRightsChangeImpl NewRightsChange = this.getTraxRightsChange();
        try {
            // Let "blank" entity instance do programmatic defaulting
            newActivity.create(attributeList);

            NewRightsChange.create(newActivity);
            NewRightsChange.setActivityId(newActivity.getId());

            // create the activity user row and set the user type to Owner
            newActivityUser.create(newActivity);
            newActivityUser.setActivityId(newActivity.getId());
            newActivityUser.setUserType("Owner");
            newActivityUser.setAddDate(new Date(Date.getCurrentDate()));
            this.setOwner(newActivityUser.getUserDisplayName());

        } catch (JboException ex) {
            newActivity.revert();
            newActivityUser.revert();
            NewRightsChange.revert();
            throw ex;
        } catch (Exception otherEx) {
            newActivity.revert();
            newActivityUser.revert();
            NewRightsChange.revert();
            throw new RowCreateException(true, /* EO Row? */"NTC Rights",
                    /* EO Name */otherEx); /* Details */
        }
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getId();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        SubType {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getSubType();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setSubType((String)value);
            }
        }
        ,
        NtcNumber {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getNtcNumber();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setNtcNumber((Number)value);
            }
        }
        ,
        NtcPriority {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getNtcPriority();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setNtcPriority((String)value);
            }
        }
        ,
        Description {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getDescription();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        Notes {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getNotes();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setNotes((String)value);
            }
        }
        ,
        EmailText {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getEmailText();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setEmailText((ClobDomain)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        Id1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getId1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setId1((Number)value);
            }
        }
        ,
        ActivityId {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getActivityId();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setActivityId((Number)value);
            }
        }
        ,
        FormatsInvolved {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getFormatsInvolved();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setFormatsInvolved((String)value);
            }
        }
        ,
        ProductTypesInvolved {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getProductTypesInvolved();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setProductTypesInvolved((String)value);
            }
        }
        ,
        ProductPartnersAffected {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getProductPartnersAffected();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setProductPartnersAffected((String)value);
            }
        }
        ,
        RemovalIs {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getRemovalIs();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setRemovalIs((String)value);
            }
        }
        ,
        BackfileProductPartners {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getBackfileProductPartners();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setBackfileProductPartners((String)value);
            }
        }
        ,
        BackfileProductRemoval {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getBackfileProductRemoval();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setBackfileProductRemoval((String)value);
            }
        }
        ,
        RemoveFromContentPartners {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getRemoveFromContentPartners();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setRemoveFromContentPartners((String)value);
            }
        }
        ,
        VolYearContinuedFlag {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getVolYearContinuedFlag();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setVolYearContinuedFlag((String)value);
            }
        }
        ,
        AAndIContinuedFlag {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getAAndIContinuedFlag();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAAndIContinuedFlag((String)value);
            }
        }
        ,
        Id2 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getId2();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setId2((Number)value);
            }
        }
        ,
        LastUpdatedDate1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getLastUpdatedDate1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate1((Date)value);
            }
        }
        ,
        ActivityId1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getActivityId1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setActivityId1((Number)value);
            }
        }
        ,
        JhsUsersId {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getJhsUsersId();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setJhsUsersId((Number)value);
            }
        }
        ,
        UserType {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getUserType();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setUserType((String)value);
            }
        }
        ,
        Owner {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getOwner();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setOwner((String)value);
            }
        }
        ,
        Type {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getType();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setType((String)value);
            }
        }
        ,
        TraxActivityTitleView {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getTraxActivityTitleView();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TraxActivityAttachmentView {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getTraxActivityAttachmentView();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_NTCFormatLookup1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getTracsLookupModule_NTCFormatLookup1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_NTCProductTypeLookup1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getTracsLookupModule_NTCProductTypeLookup1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TracsLookupModule_NTCContentPartnerLookup1 {
            public Object get(NTCRightsViewRowImpl obj) {
                return obj.getTracsLookupModule_NTCContentPartnerLookup1();
            }

            public void put(NTCRightsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(NTCRightsViewRowImpl object);

        public abstract void put(NTCRightsViewRowImpl object, Object value);

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
    public static final int SUBTYPE = AttributesEnum.SubType.index();
    public static final int NTCNUMBER = AttributesEnum.NtcNumber.index();
    public static final int NTCPRIORITY = AttributesEnum.NtcPriority.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int NOTES = AttributesEnum.Notes.index();
    public static final int EMAILTEXT = AttributesEnum.EmailText.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ID1 = AttributesEnum.Id1.index();
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int FORMATSINVOLVED = AttributesEnum.FormatsInvolved.index();
    public static final int PRODUCTTYPESINVOLVED = AttributesEnum.ProductTypesInvolved.index();
    public static final int PRODUCTPARTNERSAFFECTED = AttributesEnum.ProductPartnersAffected.index();
    public static final int REMOVALIS = AttributesEnum.RemovalIs.index();
    public static final int BACKFILEPRODUCTPARTNERS = AttributesEnum.BackfileProductPartners.index();
    public static final int BACKFILEPRODUCTREMOVAL = AttributesEnum.BackfileProductRemoval.index();
    public static final int REMOVEFROMCONTENTPARTNERS = AttributesEnum.RemoveFromContentPartners.index();
    public static final int VOLYEARCONTINUEDFLAG = AttributesEnum.VolYearContinuedFlag.index();
    public static final int AANDICONTINUEDFLAG = AttributesEnum.AAndIContinuedFlag.index();
    public static final int ID2 = AttributesEnum.Id2.index();
    public static final int LASTUPDATEDDATE1 = AttributesEnum.LastUpdatedDate1.index();
    public static final int ACTIVITYID1 = AttributesEnum.ActivityId1.index();
    public static final int JHSUSERSID = AttributesEnum.JhsUsersId.index();
    public static final int USERTYPE = AttributesEnum.UserType.index();
    public static final int OWNER = AttributesEnum.Owner.index();
    public static final int TYPE = AttributesEnum.Type.index();
    public static final int TRAXACTIVITYTITLEVIEW = AttributesEnum.TraxActivityTitleView.index();
    public static final int TRAXACTIVITYATTACHMENTVIEW = AttributesEnum.TraxActivityAttachmentView.index();
    public static final int TRACSLOOKUPMODULE_NTCFORMATLOOKUP1 = AttributesEnum.TracsLookupModule_NTCFormatLookup1.index();
    public static final int TRACSLOOKUPMODULE_NTCPRODUCTTYPELOOKUP1 = AttributesEnum.TracsLookupModule_NTCProductTypeLookup1.index();
    public static final int TRACSLOOKUPMODULE_NTCCONTENTPARTNERLOOKUP1 = AttributesEnum.TracsLookupModule_NTCContentPartnerLookup1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NTCRightsViewRowImpl() {
    }

    /**
     * Gets Activity entity object.
     * @return the Activity
     */
    public ActivityImpl getActivity() {
        return (ActivityImpl)getEntity(0);
    }

    /**
     * Gets TraxRightsChange entity object.
     * @return the TraxRightsChange
     */
    public TraxRightsChangeImpl getTraxRightsChange() {
        return (TraxRightsChangeImpl)getEntity(1);
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
     * Gets the attribute value for SUB_TYPE using the alias name SubType.
     * @return the SUB_TYPE
     */
    public String getSubType() {
        return (String) getAttributeInternal(SUBTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_TYPE using the alias name SubType.
     * @param value value to set the SUB_TYPE
     */
    public void setSubType(String value) {
        setAttributeInternal(SUBTYPE, value);
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
     * Gets the attribute value for NOTES using the alias name Notes.
     * @return the NOTES
     */
    public String getNotes() {
        return (String) getAttributeInternal(NOTES);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTES using the alias name Notes.
     * @param value value to set the NOTES
     */
    public void setNotes(String value) {
        setAttributeInternal(NOTES, value);
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
     * Gets the attribute value for FORMATS_INVOLVED using the alias name FormatsInvolved.
     * @return the FORMATS_INVOLVED
     */
    public String getFormatsInvolved() {
        return (String) getAttributeInternal(FORMATSINVOLVED);
    }

    /**
     * Sets <code>value</code> as attribute value for FORMATS_INVOLVED using the alias name FormatsInvolved.
     * @param value value to set the FORMATS_INVOLVED
     */
    public void setFormatsInvolved(String value) {
        setAttributeInternal(FORMATSINVOLVED, value);
    }

    /**
     * Gets the attribute value for PRODUCT_TYPES_INVOLVED using the alias name ProductTypesInvolved.
     * @return the PRODUCT_TYPES_INVOLVED
     */
    public String getProductTypesInvolved() {
        return (String) getAttributeInternal(PRODUCTTYPESINVOLVED);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_TYPES_INVOLVED using the alias name ProductTypesInvolved.
     * @param value value to set the PRODUCT_TYPES_INVOLVED
     */
    public void setProductTypesInvolved(String value) {
        setAttributeInternal(PRODUCTTYPESINVOLVED, value);
    }

    /**
     * Gets the attribute value for PRODUCT_PARTNERS_AFFECTED using the alias name ProductPartnersAffected.
     * @return the PRODUCT_PARTNERS_AFFECTED
     */
    public String getProductPartnersAffected() {
        return (String) getAttributeInternal(PRODUCTPARTNERSAFFECTED);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_PARTNERS_AFFECTED using the alias name ProductPartnersAffected.
     * @param value value to set the PRODUCT_PARTNERS_AFFECTED
     */
    public void setProductPartnersAffected(String value) {
        setAttributeInternal(PRODUCTPARTNERSAFFECTED, value);
    }

    /**
     * Gets the attribute value for REMOVAL_IS using the alias name RemovalIs.
     * @return the REMOVAL_IS
     */
    public String getRemovalIs() {
        return (String) getAttributeInternal(REMOVALIS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMOVAL_IS using the alias name RemovalIs.
     * @param value value to set the REMOVAL_IS
     */
    public void setRemovalIs(String value) {
        setAttributeInternal(REMOVALIS, value);
    }

    /**
     * Gets the attribute value for BACKFILE_PRODUCT_PARTNERS using the alias name BackfileProductPartners.
     * @return the BACKFILE_PRODUCT_PARTNERS
     */
    public String getBackfileProductPartners() {
        return (String) getAttributeInternal(BACKFILEPRODUCTPARTNERS);
    }

    /**
     * Sets <code>value</code> as attribute value for BACKFILE_PRODUCT_PARTNERS using the alias name BackfileProductPartners.
     * @param value value to set the BACKFILE_PRODUCT_PARTNERS
     */
    public void setBackfileProductPartners(String value) {
        setAttributeInternal(BACKFILEPRODUCTPARTNERS, value);
    }

    /**
     * Gets the attribute value for BACKFILE_PRODUCT_REMOVAL using the alias name BackfileProductRemoval.
     * @return the BACKFILE_PRODUCT_REMOVAL
     */
    public String getBackfileProductRemoval() {
        return (String) getAttributeInternal(BACKFILEPRODUCTREMOVAL);
    }

    /**
     * Sets <code>value</code> as attribute value for BACKFILE_PRODUCT_REMOVAL using the alias name BackfileProductRemoval.
     * @param value value to set the BACKFILE_PRODUCT_REMOVAL
     */
    public void setBackfileProductRemoval(String value) {
        setAttributeInternal(BACKFILEPRODUCTREMOVAL, value);
    }

    /**
     * Gets the attribute value for REMOVE_FROM_CONTENT_PARTNERS using the alias name RemoveFromContentPartners.
     * @return the REMOVE_FROM_CONTENT_PARTNERS
     */
    public String getRemoveFromContentPartners() {
        return (String) getAttributeInternal(REMOVEFROMCONTENTPARTNERS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMOVE_FROM_CONTENT_PARTNERS using the alias name RemoveFromContentPartners.
     * @param value value to set the REMOVE_FROM_CONTENT_PARTNERS
     */
    public void setRemoveFromContentPartners(String value) {
        setAttributeInternal(REMOVEFROMCONTENTPARTNERS, value);
    }

    /**
     * Gets the attribute value for VOL_YEAR_CONTINUED_FLAG using the alias name VolYearContinuedFlag.
     * @return the VOL_YEAR_CONTINUED_FLAG
     */
    public String getVolYearContinuedFlag() {
        return (String) getAttributeInternal(VOLYEARCONTINUEDFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for VOL_YEAR_CONTINUED_FLAG using the alias name VolYearContinuedFlag.
     * @param value value to set the VOL_YEAR_CONTINUED_FLAG
     */
    public void setVolYearContinuedFlag(String value) {
        setAttributeInternal(VOLYEARCONTINUEDFLAG, value);
    }

    /**
     * Gets the attribute value for ID using the alias name Id2.
     * @return the ID
     */
    public Number getId2() {
        return (Number)getAttributeInternal(ID2);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id2.
     * @param value value to set the ID
     */
    public void setId2(Number value) {
        setAttributeInternal(ID2, value);
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
     * Gets the attribute value for ACTIVITY_ID using the alias name ActivityId1.
     * @return the ACTIVITY_ID
     */
    public Number getActivityId1() {
        return (Number)getAttributeInternal(ACTIVITYID1);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVITY_ID using the alias name ActivityId1.
     * @param value value to set the ACTIVITY_ID
     */
    public void setActivityId1(Number value) {
        setAttributeInternal(ACTIVITYID1, value);
    }

    /**
     * Gets the attribute value for JHS_USERS_ID using the alias name JhsUsersId.
     * @return the JHS_USERS_ID
     */
    public Number getJhsUsersId() {
        return (Number)getAttributeInternal(JHSUSERSID);
    }

    /**
     * Sets <code>value</code> as attribute value for JHS_USERS_ID using the alias name JhsUsersId.
     * @param value value to set the JHS_USERS_ID
     */
    public void setJhsUsersId(Number value) {
        setAttributeInternal(JHSUSERSID, value);
    }

    /**
     * Gets the attribute value for USER_TYPE using the alias name UserType.
     * @return the USER_TYPE
     */
    public String getUserType() {
        return (String) getAttributeInternal(USERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_TYPE using the alias name UserType.
     * @param value value to set the USER_TYPE
     */
    public void setUserType(String value) {
        setAttributeInternal(USERTYPE, value);
    }

    /**
     * Gets the attribute value for OWNER using the alias name Owner.
     * @return the OWNER
     */
    public String getOwner() {
        return (String) getAttributeInternal(OWNER);
    }

    /**
     * Sets <code>value</code> as attribute value for OWNER using the alias name Owner.
     * @param value value to set the OWNER
     */
    public void setOwner(String value) {
        setAttributeInternal(OWNER, value);
    }

    /**
     * Gets the attribute value for TYPE using the alias name Type.
     * @return the TYPE
     */
    public String getType() {
        return (String) getAttributeInternal(TYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TYPE using the alias name Type.
     * @param value value to set the TYPE
     */
    public void setType(String value) {
        setAttributeInternal(TYPE, value);
    }

    /**
     * Gets the attribute value for A_AND_I_CONTINUED_FLAG using the alias name AAndIContinuedFlag.
     * @return the A_AND_I_CONTINUED_FLAG
     */
    public String getAAndIContinuedFlag() {
        return (String) getAttributeInternal(AANDICONTINUEDFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for A_AND_I_CONTINUED_FLAG using the alias name AAndIContinuedFlag.
     * @param value value to set the A_AND_I_CONTINUED_FLAG
     */
    public void setAAndIContinuedFlag(String value) {
        setAttributeInternal(AANDICONTINUEDFLAG, value);
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
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_NTCFormatLookup1.
     */
    public RowSet getTracsLookupModule_NTCFormatLookup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_NTCFORMATLOOKUP1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_NTCProductTypeLookup1.
     */
    public RowSet getTracsLookupModule_NTCProductTypeLookup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_NTCPRODUCTTYPELOOKUP1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TracsLookupModule_NTCContentPartnerLookup1.
     */
    public RowSet getTracsLookupModule_NTCContentPartnerLookup1() {
        return (RowSet)getAttributeInternal(TRACSLOOKUPMODULE_NTCCONTENTPARTNERLOOKUP1);
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
