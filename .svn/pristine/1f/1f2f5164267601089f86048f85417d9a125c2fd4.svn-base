package com.pq.tracs.model.services.view;

import com.pq.tracs.model.services.applicationModule.TracsServiceAMFixture;

import oracle.jbo.AttrValException;
import oracle.jbo.AttributeDef;
import oracle.jbo.InvalidOwnerException;
import oracle.jbo.InvalidParamException;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.NoDefException;
import oracle.jbo.Row;
import oracle.jbo.RowAlreadyDeletedException;
import oracle.jbo.RowCreateException;
import oracle.jbo.RowIterator;
import oracle.jbo.RowValException;
import oracle.jbo.TooManyObjectsException;
import oracle.jbo.ViewObject;

import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

import oracle.jbo.server.ViewRowImpl;

import org.junit.*;
import static org.junit.Assert.*;

public class VOCreateTestBase extends VOTestBase {
    protected static final int TEMPORARY_KEY = -999;

    public VOCreateTestBase() {
        super();
    }


    @Test
    public void testMandatoryCheck() {
        ViewObject view =
            fixture1.getApplicationModule().findViewObject(myName);
        if (!view.isReadOnly()) {
            try {
                ViewRowImpl row = clearTemporaryRowAndCreate(view);
                setMandatoryFields(view, row);
                row.validate();
            } catch (AttrValException attEx) {
                fail("validation failed: " + attEx.getMessage());
            } catch (TooManyObjectsException tmoEx) {
                assertNotNull("Too Many Objects: " + tmoEx.getMessage(), view);
            } catch (RowValException rowEx) {
                assertNotNull("Row Val: " + rowEx.getMessage(), view);
            } catch (NoDefException noDefEx) {
                fail("No Def: " + noDefEx.getMessage());
            } catch (InvalidOwnerException invOwnEx) {
                fail("Invalid Owner: " + invOwnEx.getMessage());
            } catch (RowCreateException rowCrEx) {
                fail("Row Create: " + rowCrEx.getMessage());
            } catch (RowAlreadyDeletedException radEx) {
                fail("Row Already Deleted: " + radEx.getMessage());
            } catch (InvalidParamException invParEx) {
                fail("Invalid Param: " + invParEx.getMessage());
            } catch (JboException jboEx) {
                fail("JBO: " + jboEx.getMessage());
            } catch (Exception ex) {
                fail("mandatory check failed: " + ex.getMessage());
            }
            assertNotNull(view);
        }
    }
    
    protected ViewRowImpl createAndSetMandatory() {
        ViewObject view = fixture1.getApplicationModule().findViewObject(myName);
        ViewRowImpl row = this.clearTemporaryRowAndCreate(view);
        this.setMandatoryFields(view, row);
        return row;
    }
 
    protected ViewRowImpl clearTemporaryRowAndCreate(ViewObject view) {
        Object[] keys = { TEMPORARY_KEY };
        Row[] rows =
            view.findByKey(new Key(keys), ViewObject.QUERY_MODE_SCAN_UNPOSTED_ENTITY_ROWS);

        for (Row rw : rows) {
            rw.remove();
        }

        ViewRowImpl r = (ViewRowImpl)view.createRow();

        return r;
    }
    
    protected void setMandatoryFields(ViewObject view, ViewRowImpl row) {
        setMandatoryFields(view, row, TEMPORARY_KEY);
    }

    protected void setMandatoryFields(ViewObject view, ViewRowImpl row, int tempKey) {
        AttributeDef[] attributeDefs = view.getAttributeDefs();

        for (AttributeDef attDef : attributeDefs) {
            if (attDef.isPrimaryKey() &&
                attDef.getUpdateableFlag() != AttributeDef.READONLY) {
                row.setAttribute(attDef.getName(), tempKey);
            } else if (attDef.isMandatory() &&
                       attDef.getUpdateableFlag() != AttributeDef.READONLY) {
                String dataType = attDef.getJavaType().getName();
                try {
                    if (dataType.equals(String.class.getName())) {
                        row.setAttribute(attDef.getName(), "Y");
                    } else if (dataType.equals(Number.class.getName())) {
                        row.setAttribute(attDef.getName(), 1);
                    } else if (dataType.equals(Date.class.getName())) {
                        row.setAttribute(attDef.getName(),
                                         new Date(Date.getCurrentDate()));
                    } else if (dataType.equals(Integer.class.getName())) {
                        row.setAttribute(attDef.getName(), 1);
                    } else if (dataType.equals(ClobDomain.class.getName())) {
                        row.setAttribute(attDef.getName(), "Test");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    protected void checkPrimary(ViewRowImpl row, RowIterator children) {

        ViewRowImpl childRow = (ViewRowImpl)children.createRow();
        this.setMandatoryFields(childRow.getViewObject(), childRow, -998);
        childRow.setAttribute("PrimaryFlag", "Y");
        children.insertRow(childRow);

        childRow = (ViewRowImpl)children.createRow();
        this.setMandatoryFields(childRow.getViewObject(), childRow, -997);
        childRow.setAttribute("PrimaryFlag", "Y");
        children.insertRow(childRow);

        row.validate();
    }

}
