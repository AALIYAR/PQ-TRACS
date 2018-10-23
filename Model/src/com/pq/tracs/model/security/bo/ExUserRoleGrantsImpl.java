package com.pq.tracs.model.security.bo;

import com.pq.tracs.model.bo.TracsBaseEntity;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;


import oracle.jheadstart.model.adfbc.security.entity.UserRoleGrantImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExUserRoleGrantsImpl extends oracle.jheadstart.model.adfbc.security.entity.UserRoleGrantImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(ExUserRoleGrantsImpl obj) {
                return obj.getId();
            }

            public void put(ExUserRoleGrantsImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        UsrId {
            public Object get(ExUserRoleGrantsImpl obj) {
                return obj.getUsrId();
            }

            public void put(ExUserRoleGrantsImpl obj, Object value) {
                obj.setUsrId((Number)value);
            }
        }
        ,
        RleId {
            public Object get(ExUserRoleGrantsImpl obj) {
                return obj.getRleId();
            }

            public void put(ExUserRoleGrantsImpl obj, Object value) {
                obj.setRleId((Number)value);
            }
        }
        ,
        ExUsers {
            public Object get(ExUserRoleGrantsImpl obj) {
                return obj.getExUsers();
            }

            public void put(ExUserRoleGrantsImpl obj, Object value) {
                obj.setExUsers((ExUsersImpl)value);
            }
        }
        ,
        ExRoles {
            public Object get(ExUserRoleGrantsImpl obj) {
                return obj.getExRoles();
            }

            public void put(ExUserRoleGrantsImpl obj, Object value) {
                obj.setExRoles((ExRolesImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ExUserRoleGrantsImpl object);

        public abstract void put(ExUserRoleGrantsImpl object, Object value);

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
    public static final int USRID = AttributesEnum.UsrId.index();
    public static final int RLEID = AttributesEnum.RleId.index();
    public static final int EXUSERS = AttributesEnum.ExUsers.index();
    public static final int EXROLES = AttributesEnum.ExRoles.index();

    /**This is the default constructor (do not remove)
     */
    public ExUserRoleGrantsImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.security.bo.ExUserRoleGrants");
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

    /**Gets the attribute value for UsrId, using the alias name UsrId
     */
    public Number getUsrId() {
        return (Number)getAttributeInternal(USRID);
    }

    /**Sets <code>value</code> as the attribute value for UsrId
     */
    public void setUsrId(Number value) {
        setAttributeInternal(USRID, value);
    }

    /**Gets the attribute value for RleId, using the alias name RleId
     */
    public Number getRleId() {
        return (Number)getAttributeInternal(RLEID);
    }

    /**Sets <code>value</code> as the attribute value for RleId
     */
    public void setRleId(Number value) {
        setAttributeInternal(RLEID, value);
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

    /**Gets the associated entity ExUsersImpl
     */
    public ExUsersImpl getExUsers() {
        return (ExUsersImpl)getAttributeInternal(EXUSERS);
    }

    /**Sets <code>value</code> as the associated entity ExUsersImpl
     */
    public void setExUsers(ExUsersImpl value) {
        setAttributeInternal(EXUSERS, value);
    }

    /**Gets the associated entity ExRolesImpl
     */
    public ExRolesImpl getExRoles() {
        return (ExRolesImpl)getAttributeInternal(EXROLES);
    }

    /**Sets <code>value</code> as the associated entity ExRolesImpl
     */
    public void setExRoles(ExRolesImpl value) {
        setAttributeInternal(EXROLES, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }


}
