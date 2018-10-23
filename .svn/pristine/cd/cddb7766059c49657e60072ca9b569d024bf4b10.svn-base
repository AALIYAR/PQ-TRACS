package com.pq.tracs.model.services.applicationModule;

import com.pq.tracs.model.services.TracsServiceImpl;
import com.pq.tracs.model.services.common.TracsService;

import oracle.jbo.domain.Number;

import org.junit.*;
import static org.junit.Assert.*;

public class TracsServiceAMTest {
    protected TracsServiceAMFixture fixture1 =
        TracsServiceAMFixture.getInstance();
    private TracsService _amImpl;
    private TracsServiceImpl appM;

    public TracsServiceAMTest() {
    }

    @Before
    public void setUp() {
        this._amImpl = (TracsService)fixture1.getApplicationModule();
        this.appM = (TracsServiceImpl)_amImpl;
    }

    @After
    public void tearDown() {
        this._amImpl = null;
        this.appM = null;
    }

    @Test
    public void testCreateTargetFromUlrichs() {
        fail("Failure is OK, testCreateTargetFromUlrichs not implemented.");
    }

    @Test
    public void testForwardToApex() {
        fail("Failure is OK, testForwardToApex not implemented.");
    }

    @Test
    public void testCreateContractFromOpp() {
        fail("Failure is OK, testCreateContractFromOpp not implemented.");
    }

    @Test
    public void testAttachTitlesToRights() {
        try {
            String statusMessage =
                appM.attachTitlesToRights(new Number(-999));
            appM.getContractRightView1().executeQuery();
            appM.getDBTransaction().rollback();
            assertNotNull(statusMessage);
        } catch (Exception ex) {
            appM.getDBTransaction().rollback();
            fail("Attach Titles to Rights failed: " + ex.getMessage());
        }
    }

    @Test
    public void testAttachTitlesToRates() {
        try {
            String statusMessage =
                appM.attachTitlesToRates(new Number(-999));
            appM.getRoyaltyRateView1().executeQuery();
            appM.getDBTransaction().rollback();
            assertNotNull(statusMessage);
        } catch (Exception ex) {
            appM.getDBTransaction().rollback();
            fail("Attach Titles to Rates failed: " + ex.getMessage());
        }
    }

    @Test
    public void testAttachTitlesToGuarantees() {
        try {
            String statusMessage =
                appM.attachTitlesToGuarantees(new Number(-999));
            appM.getContractGuaranteeView1().executeQuery();
            appM.getDBTransaction().rollback();
            assertNotNull(statusMessage);
        } catch (Exception ex) {
            appM.getDBTransaction().rollback();
            fail("Attach Titles to Guarantees failed: " + ex.getMessage());
        }
    }

    @Test
    public void testCreateCatalogNumberForTarget() {
        fail("Failure is OK, testCreateCatalogNumberForTarget not implemented.");
    }

    @Test
    public void testCopyContract() {
        fail("Failure is OK, testCopyContract not implemented.");
    }

    @Test
    public void testExcludeAll() {
        fail("Failure is OK, testExcludeAll not implemented.");
    }

    @Test
    public void testValidateImportData() {
        fail("Failure is OK, testValidateImportData not implemented.");
    }

    @Test
    public void testSaveImportData() {
        fail("Failure is OK, testSaveImportData not implemented.");
    }

    @Test
    public void testCopyTitle() {
        fail("Failure is OK, testCopyTitle not implemented.");
    }

    @Test
    public void testExecuteNameChange() {
        fail("Failure is OK, testExecuteNameChange not implemented.");
    }

    @Test
    public void testAddTitlesToContract() {
        fail("Failure is OK, testAddTitlesToContract not implemented.");
    }
}
