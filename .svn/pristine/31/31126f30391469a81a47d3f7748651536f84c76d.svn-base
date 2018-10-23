package com.pq.tracs.model.services.view.TitleRecordView2VO;

import com.pq.tracs.model.services.applicationModule.TracsServiceAMFixture;

import com.pq.tracs.model.services.view.VOCreateTestBase;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import oracle.jbo.server.ViewRowImpl;

import org.junit.*;
import static org.junit.Assert.*;

public class TitleRecordView2VOTest extends VOCreateTestBase {
    

    public TitleRecordView2VOTest() {
        myName = "TitleRecordView2";
    }

    @Test
    public void testSortTitle() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("TitleRecordView1");
        ViewRowImpl row = this.clearTemporaryRowAndCreate(view);
        this.setMandatoryFields(view, row);
        
        row.setAttribute("PmTitle", "The Test Sort Title");
        Assert.assertEquals("Sorting with The", "Test Sort Title The", row.getAttribute("SortTitle"));
        
        row.setAttribute("PmTitle", "An Test Sort Title");
        Assert.assertEquals("Sorting with An", "Test Sort Title An", row.getAttribute("SortTitle"));
        
        row.setAttribute("PmTitle", "A Test Sort Title");
        Assert.assertEquals("Sorting with A", "Test Sort Title A", row.getAttribute("SortTitle"));
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
