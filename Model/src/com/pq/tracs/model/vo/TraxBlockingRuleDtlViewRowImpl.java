package com.pq.tracs.model.vo;

import com.pq.tracs.model.bo.TracsBaseEntity;

import com.pq.tracs.model.eo.TraxBlockingRuleDtlImpl;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 13 15:42:05 EDT 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TraxBlockingRuleDtlViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getId();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        BlockingRuleHdrId {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getBlockingRuleHdrId();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setBlockingRuleHdrId((Number)value);
            }
        }
        ,
        RelatedLineId {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getRelatedLineId();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setRelatedLineId((Number)value);
            }
        }
        ,
        BlockingRuleType {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getBlockingRuleType();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setBlockingRuleType((String)value);
            }
        }
        ,
        BlockingRuleValue {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getBlockingRuleValue();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setBlockingRuleValue((String)value);
            }
        }
        ,
        BlockedFlag {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getBlockedFlag();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setBlockedFlag((String)value);
            }
        }
        ,
        ContainChilds {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getContainChilds();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setContainChilds((String)value);
            }
        }
        ,
        ExcludeFlag {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getExcludeFlag();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setExcludeFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LovId {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getLovId();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setLovId((Number)value);
            }
        }
        ,
        TraxBlockingRuleDtlView_2 {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getTraxBlockingRuleDtlView_2();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        SubCategoryValueLookup {
            public Object get(TraxBlockingRuleDtlViewRowImpl obj) {
                return obj.getSubCategoryValueLookup();
            }

            public void put(TraxBlockingRuleDtlViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TraxBlockingRuleDtlViewRowImpl object);

        public abstract void put(TraxBlockingRuleDtlViewRowImpl object,
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
    public static final int BLOCKINGRULEHDRID = AttributesEnum.BlockingRuleHdrId.index();
    public static final int RELATEDLINEID = AttributesEnum.RelatedLineId.index();
    public static final int BLOCKINGRULETYPE = AttributesEnum.BlockingRuleType.index();
    public static final int BLOCKINGRULEVALUE = AttributesEnum.BlockingRuleValue.index();
    public static final int BLOCKEDFLAG = AttributesEnum.BlockedFlag.index();
    public static final int CONTAINCHILDS = AttributesEnum.ContainChilds.index();
    public static final int EXCLUDEFLAG = AttributesEnum.ExcludeFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LOVID = AttributesEnum.LovId.index();
    public static final int TRAXBLOCKINGRULEDTLVIEW_2 = AttributesEnum.TraxBlockingRuleDtlView_2.index();
    public static final int SUBCATEGORYVALUELOOKUP = AttributesEnum.SubCategoryValueLookup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TraxBlockingRuleDtlViewRowImpl() {
    }

    /**
     * Gets TraxBlockingRuleDtl entity object.
     * @return the TraxBlockingRuleDtl
     */
    public TraxBlockingRuleDtlImpl getTraxBlockingRuleDtl() {
        return (TraxBlockingRuleDtlImpl)getEntity(0);
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
     * Gets the attribute value for BLOCKING_RULE_HDR_ID using the alias name BlockingRuleHdrId.
     * @return the BLOCKING_RULE_HDR_ID
     */
    public Number getBlockingRuleHdrId() {
        return (Number)getAttributeInternal(BLOCKINGRULEHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCKING_RULE_HDR_ID using the alias name BlockingRuleHdrId.
     * @param value value to set the BLOCKING_RULE_HDR_ID
     */
    public void setBlockingRuleHdrId(Number value) {
        setAttributeInternal(BLOCKINGRULEHDRID, value);
    }

    /**
     * Gets the attribute value for RELATED_LINE_ID using the alias name RelatedLineId.
     * @return the RELATED_LINE_ID
     */
    public Number getRelatedLineId() {
        return (Number)getAttributeInternal(RELATEDLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for RELATED_LINE_ID using the alias name RelatedLineId.
     * @param value value to set the RELATED_LINE_ID
     */
    public void setRelatedLineId(Number value) {
        setAttributeInternal(RELATEDLINEID, value);
    }

    /**
     * Gets the attribute value for BLOCKING_RULE_TYPE using the alias name BlockingRuleType.
     * @return the BLOCKING_RULE_TYPE
     */
    public String getBlockingRuleType() {
        return (String) getAttributeInternal(BLOCKINGRULETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCKING_RULE_TYPE using the alias name BlockingRuleType.
     * @param value value to set the BLOCKING_RULE_TYPE
     */
    public void setBlockingRuleType(String value) {
        setAttributeInternal(BLOCKINGRULETYPE, value);
    }

    /**
     * Gets the attribute value for BLOCKING_RULE_VALUE using the alias name BlockingRuleValue.
     * @return the BLOCKING_RULE_VALUE
     */
    public String getBlockingRuleValue() {
        return (String) getAttributeInternal(BLOCKINGRULEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCKING_RULE_VALUE using the alias name BlockingRuleValue.
     * @param value value to set the BLOCKING_RULE_VALUE
     */
    public void setBlockingRuleValue(String value) {
        setAttributeInternal(BLOCKINGRULEVALUE, value);
    }

    /**
     * Gets the attribute value for EXCLUDE_FLAG using the alias name ExcludeFlag.
     * @return the EXCLUDE_FLAG
     */
    public String getExcludeFlag() {
        return (String) getAttributeInternal(EXCLUDEFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for EXCLUDE_FLAG using the alias name ExcludeFlag.
     * @param value value to set the EXCLUDE_FLAG
     */
    public void setExcludeFlag(String value) {
        setAttributeInternal(EXCLUDEFLAG, value);
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
     * Gets the attribute value for BLOCKED_FLAG using the alias name BlockedFlag.
     * @return the BLOCKED_FLAG
     */
    public String getBlockedFlag() {
        return (String) getAttributeInternal(BLOCKEDFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCKED_FLAG using the alias name BlockedFlag.
     * @param value value to set the BLOCKED_FLAG
     */
    public void setBlockedFlag(String value) {
        setAttributeInternal(BLOCKEDFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ContainChilds.
     * @return the ContainChilds
     */
    public String getContainChilds() {
        return (String) getAttributeInternal(CONTAINCHILDS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ContainChilds.
     * @param value value to set the  ContainChilds
     */
    public void setContainChilds(String value) {
        setAttributeInternal(CONTAINCHILDS, value);
    }


    /**
     * Gets the attribute value for the calculated attribute LovId.
     * @return the LovId
     */
    public Number getLovId() {
        return (Number)getAttributeInternal(LOVID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LovId.
     * @param value value to set the  LovId
     */
    public void setLovId(Number value) {
        setAttributeInternal(LOVID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link TraxBlockingRuleDtlView_2.
     */
    public RowIterator getTraxBlockingRuleDtlView_2() {
        return (RowIterator)getAttributeInternal(TRAXBLOCKINGRULEDTLVIEW_2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> SubCategoryValueLookup.
     */
    public RowSet getSubCategoryValueLookup() {
        return (RowSet)getAttributeInternal(SUBCATEGORYVALUELOOKUP);
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