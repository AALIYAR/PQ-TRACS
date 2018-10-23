package com.pq.tracs.model.bo;

import java.sql.PreparedStatement;

import java.util.HashMap;

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
public class RelatedTitleImpl extends TracsBaseEntity {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(RelatedTitleImpl obj) {
                return obj.getId();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        ParentTitleId {
            public Object get(RelatedTitleImpl obj) {
                return obj.getParentTitleId();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setParentTitleId((Number)value);
            }
        }
        ,
        RelatedTitleId {
            public Object get(RelatedTitleImpl obj) {
                return obj.getRelatedTitleId();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setRelatedTitleId((Number)value);
            }
        }
        ,
        RelationReason {
            public Object get(RelatedTitleImpl obj) {
                return obj.getRelationReason();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setRelationReason((String)value);
            }
        }
        ,
        PrintMessage {
            public Object get(RelatedTitleImpl obj) {
                return obj.getPrintMessage();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setPrintMessage((String)value);
            }
        }
        ,
        PrintFlag {
            public Object get(RelatedTitleImpl obj) {
                return obj.getPrintFlag();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setPrintFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(RelatedTitleImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedDate {
            public Object get(RelatedTitleImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(RelatedTitleImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(RelatedTitleImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Title {
            public Object get(RelatedTitleImpl obj) {
                return obj.getTitle();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setTitle((TitleImpl)value);
            }
        }
        ,
        Title1 {
            public Object get(RelatedTitleImpl obj) {
                return obj.getTitle1();
            }

            public void put(RelatedTitleImpl obj, Object value) {
                obj.setTitle1((TitleImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RelatedTitleImpl object);

        public abstract void put(RelatedTitleImpl object, Object value);

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
    public static final int PARENTTITLEID = AttributesEnum.ParentTitleId.index();
    public static final int RELATEDTITLEID = AttributesEnum.RelatedTitleId.index();
    public static final int RELATIONREASON = AttributesEnum.RelationReason.index();
    public static final int PRINTMESSAGE = AttributesEnum.PrintMessage.index();
    public static final int PRINTFLAG = AttributesEnum.PrintFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int TITLE1 = AttributesEnum.Title1.index();

    /**This is the default constructor (do not remove)
     */
    public RelatedTitleImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.bo.RelatedTitle");
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

    /**Gets the attribute value for ParentTitleId, using the alias name ParentTitleId
     */
    public Number getParentTitleId() {
        return (Number)getAttributeInternal(PARENTTITLEID);
    }

    /**Sets <code>value</code> as the attribute value for ParentTitleId
     */
    public void setParentTitleId(Number value) {
        setAttributeInternal(PARENTTITLEID, value);
    }

    /**Gets the attribute value for RelatedTitleId, using the alias name RelatedTitleId
     */
    public Number getRelatedTitleId() {
        return (Number)getAttributeInternal(RELATEDTITLEID);
    }

    /**Sets <code>value</code> as the attribute value for RelatedTitleId
     */
    public void setRelatedTitleId(Number value) {
        setAttributeInternal(RELATEDTITLEID, value);
    }

    /**Gets the attribute value for RelationReason, using the alias name RelationReason
     */
    public String getRelationReason() {
        return (String)getAttributeInternal(RELATIONREASON);
    }

    /**Sets <code>value</code> as the attribute value for RelationReason
     */
    public void setRelationReason(String value) {
        setAttributeInternal(RELATIONREASON, value);
    }

    /**Gets the attribute value for PrintMessage, using the alias name PrintMessage
     */
    public String getPrintMessage() {
        return (String)getAttributeInternal(PRINTMESSAGE);
    }

    /**Sets <code>value</code> as the attribute value for PrintMessage
     */
    public void setPrintMessage(String value) {
        setAttributeInternal(PRINTMESSAGE, value);
    }

    /**Gets the attribute value for PrintFlag, using the alias name PrintFlag
     */
    public String getPrintFlag() {
        return (String)getAttributeInternal(PRINTFLAG);
    }

    /**Sets <code>value</code> as the attribute value for PrintFlag
     */
    public void setPrintFlag(String value) {
        setAttributeInternal(PRINTFLAG, value);
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

    /**Gets the associated entity TitleImpl
     */
    public TitleImpl getTitle() {
        return (TitleImpl)getAttributeInternal(TITLE);
    }

    /**Sets <code>value</code> as the associated entity TitleImpl
     */
    public void setTitle(TitleImpl value) {
        setAttributeInternal(TITLE, value);
    }

    /**Gets the associated entity TitleImpl
     */
    public TitleImpl getTitle1() {
        return (TitleImpl)getAttributeInternal(TITLE1);
    }

    /**Sets <code>value</code> as the associated entity TitleImpl
     */
    public void setTitle1(TitleImpl value) {
        setAttributeInternal(TITLE1, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }

    protected void doDML(int i, TransactionEvent transactionEvent) {
        super.doDML(i, transactionEvent);
        
        if(i==DML_INSERT){
        
            String sql = "insert into trax_related_title(ID,PARENT_TITLE_ID,RELATED_TITLE_ID,RELATION_REASON,PRINT_FLAG," + 
                    "CREATED_BY,CREATED_DATE,LAST_UPDATED_BY,LAST_UPDATED_DATE)" + 
                    "values(jhs_seq.nextval,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt =null;
            try  {
                
                /**
                 *  Product Preceding               Product Succeeding
                    Product Succeeding            Product Preceding
                    Component                          Component
                    Also Includes                      Filmed With
                    Filmed With                        Also Includes
                 */
                 
                 HashMap map= new HashMap();
                 map.put("Product Preceding","Product Succeeding");
                 map.put("Product Succeeding","Product Preceding");
                 map.put("Also Includes","Filmed With");
                 map.put("Filmed With","Also Includes");
                 map.put("Component","Component");
    
                pstmt = getDBTransaction().createPreparedStatement(sql,1);
                pstmt.setInt(1,getRelatedTitleId().intValue());
                pstmt.setInt(2,getParentTitleId().intValue());
                pstmt.setString(3,(String)map.get(getRelationReason()));
                pstmt.setString(4,getPrintFlag());
                pstmt.setString(5,getCreatedBy());
                pstmt.setDate(6,getCreatedDate().dateValue());
                pstmt.setString(7,getCreatedBy());
                pstmt.setDate(8,getCreatedDate().dateValue());
                
                pstmt.executeUpdate();
                  
            } catch (Exception ex)  {
                ex.printStackTrace();
            } finally  {
            }
        }
            
    }

}
