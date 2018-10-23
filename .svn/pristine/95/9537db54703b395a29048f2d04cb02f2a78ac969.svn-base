package com.pq.tracs.model.services.view.TitleView1VO;

import com.pq.tracs.model.dao.TitleViewRowImpl;

import com.pq.tracs.model.services.view.VOCreateTestBase;

import oracle.jbo.AttrValException;
import oracle.jbo.RowValException;

import oracle.jbo.server.ViewRowImpl;

import org.junit.*;
import org.junit.Assert;

public class TitleView1VOTest extends VOCreateTestBase {

    public TitleView1VOTest() {
        myName = "TitleView1";
    }

    @Test
    public void testSortTitle() {
        ViewRowImpl row = this.createAndSetMandatory();

        row.setAttribute("LongTitle", "The Test Sort Title");
        Assert.assertEquals("Sorting with The", "Test Sort Title The",
                            row.getAttribute("SortTitle"));

        row.setAttribute("LongTitle", "An Test Sort Title");
        Assert.assertEquals("Sorting with An", "Test Sort Title An",
                            row.getAttribute("SortTitle"));

        row.setAttribute("LongTitle", "A Test Sort Title");
        Assert.assertEquals("Sorting with A", "Test Sort Title A",
                            row.getAttribute("SortTitle"));
    }

    @Test(expected = AttrValException.class)
    public void testEditableFlagMandatory() {
        ViewRowImpl row = this.createAndSetMandatory();

        row.setAttribute("EditableFlag", null);
        row.validate();
    }

    @Test(expected = AttrValException.class)
    public void testPeerReviewFlagMandatory() {
        ViewRowImpl row = this.createAndSetMandatory();

        row.setAttribute("PeerReviewFlag", null);
        row.validate();
    }

    @Test(expected = AttrValException.class)
    public void testActiveFlagMandatory() {
        ViewRowImpl row = this.createAndSetMandatory();

        row.setAttribute("ActiveFlag", null);
        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimaryClassification() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getClassificationView());

        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimaryVaryingForm() {
        try {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getVaryingFormView1());

        row.validate();
        } catch (RowValException rowEx) {
            throw rowEx;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test(expected = RowValException.class)
    public void testPrimarySubject() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getTitleSubjectView());

        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimarySeries() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getTitleSeriesView());

        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimaryLanguage() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getTitleLanguageView());

        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimaryAbstractLanguage() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getTitleAbstractLanguageView());

        row.validate();
    }

    @Test(expected = RowValException.class)
    public void testPrimaryContentOwner() {
        TitleViewRowImpl row = (TitleViewRowImpl)this.createAndSetMandatory();

        this.checkPrimary(row, row.getTitleContentOwnerView());

        row.validate();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
