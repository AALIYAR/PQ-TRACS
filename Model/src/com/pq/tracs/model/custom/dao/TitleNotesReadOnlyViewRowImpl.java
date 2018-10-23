package com.pq.tracs.model.custom.dao;

import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TitleNotesReadOnlyViewRowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(TitleNotesReadOnlyViewRowImpl obj) {
                return obj.getId();
            }

            public void put(TitleNotesReadOnlyViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        NoteType {
            public Object get(TitleNotesReadOnlyViewRowImpl obj) {
                return obj.getNoteType();
            }

            public void put(TitleNotesReadOnlyViewRowImpl obj, Object value) {
                obj.setNoteType((String)value);
            }
        }
        ,
        NoteText {
            public Object get(TitleNotesReadOnlyViewRowImpl obj) {
                return obj.getNoteText();
            }

            public void put(TitleNotesReadOnlyViewRowImpl obj, Object value) {
                obj.setNoteText((ClobDomain)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TitleNotesReadOnlyViewRowImpl object);

        public abstract void put(TitleNotesReadOnlyViewRowImpl object,
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
    public static final int NOTETYPE = AttributesEnum.NoteType.index();
    public static final int NOTETEXT = AttributesEnum.NoteText.index();

    /**This is the default constructor (do not remove)
     */
    public TitleNotesReadOnlyViewRowImpl() {
    }

    /**Gets the attribute value for the calculated attribute Id
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for the calculated attribute NoteType
     */
    public String getNoteType() {
        return (String) getAttributeInternal(NOTETYPE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NoteType
     */
    public void setNoteType(String value) {
        setAttributeInternal(NOTETYPE, value);
    }

    /**Gets the attribute value for the calculated attribute NoteText
     */
    public ClobDomain getNoteText() {
        return (ClobDomain) getAttributeInternal(NOTETEXT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NoteText
     */
    public void setNoteText(ClobDomain value) {
        setAttributeInternal(NOTETEXT, value);
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
}