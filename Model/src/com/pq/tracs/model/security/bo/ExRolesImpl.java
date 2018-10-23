package com.pq.tracs.model.security.bo;

import com.pq.tracs.model.bo.TracsBaseEntity;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;


import oracle.jheadstart.model.adfbc.security.entity.RoleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExRolesImpl extends oracle.jheadstart.model.adfbc.security.entity.RoleImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(ExRolesImpl obj) {
                return obj.getId();
            }

            public void put(ExRolesImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        OrgKey {
            public Object get(ExRolesImpl obj) {
                return obj.getOrgKey();
            }

            public void put(ExRolesImpl obj, Object value) {
                obj.setOrgKey((String)value);
            }
        }
        ,
        ShortName {
            public Object get(ExRolesImpl obj) {
                return obj.getShortName();
            }

            public void put(ExRolesImpl obj, Object value) {
                obj.setShortName((String)value);
            }
        }
        ,
        Name {
            public Object get(ExRolesImpl obj) {
                return obj.getName();
            }

            public void put(ExRolesImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        ExUserRoleGrants {
            public Object get(ExRolesImpl obj) {
                return obj.getExUserRoleGrants();
            }

            public void put(ExRolesImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ExRolesImpl object);

        public abstract void put(ExRolesImpl object, Object value);

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
    public static final int ORGKEY = AttributesEnum.OrgKey.index();
    public static final int SHORTNAME = AttributesEnum.ShortName.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int EXUSERROLEGRANTS = AttributesEnum.ExUserRoleGrants.index();

    /**This is the default constructor (do not remove)
     */
    public ExRolesImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.pq.tracs.model.security.bo.ExRoles");
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

    /**Gets the attribute value for OrgKey, using the alias name OrgKey
     */
    public String getOrgKey() {
        return (String)getAttributeInternal(ORGKEY);
    }

    /**Sets <code>value</code> as the attribute value for OrgKey
     */
    public void setOrgKey(String value) {
        setAttributeInternal(ORGKEY, value);
    }

    /**Gets the attribute value for ShortName, using the alias name ShortName
     */
    public String getShortName() {
        return (String)getAttributeInternal(SHORTNAME);
    }

    /**Sets <code>value</code> as the attribute value for ShortName
     */
    public void setShortName(String value) {
        setAttributeInternal(SHORTNAME, value);
    }

    /**Gets the attribute value for Name, using the alias name Name
     */
    public String getName() {
        return (String)getAttributeInternal(NAME);
    }

    /**Sets <code>value</code> as the attribute value for Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
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

    /**Gets the associated entity oracle.jbo.RowIterator
     */
    public RowIterator getExUserRoleGrants() {
        return (RowIterator)getAttributeInternal(EXUSERROLEGRANTS);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }


}