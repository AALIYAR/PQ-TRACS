package com.pq.tracs.model.services.view;

import com.pq.tracs.model.services.applicationModule.TracsServiceAMFixture;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;

import org.junit.*;
import static org.junit.Assert.*;

public class VOTestBase {
    protected TracsServiceAMFixture fixture1 =
        TracsServiceAMFixture.getInstance();
    protected String myName;

    @Test
    public void testExecuteQuery() {
        ViewObject view =
            fixture1.getApplicationModule().findViewObject(myName);
        try {
            view.executeQuery();
            ViewRowImpl row = (ViewRowImpl)view.first();

        } catch (Exception ex) {
            ex.printStackTrace();
            fail("executeQuery failed with: " + ex.getMessage());
        }
        assertNotNull(view);
    }

    @Test
    public void testAccess() {
        ViewObject view =
            fixture1.getApplicationModule().findViewObject(myName);
        assertNotNull(view);
    }
}
