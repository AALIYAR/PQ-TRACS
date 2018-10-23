package com.pq.tracs.model.services;

import com.pq.tracs.model.bo.ContentOwnerTitleImpl;
import com.pq.tracs.model.bo.TitleImpl;
import com.pq.tracs.model.bo.TitleNoteImpl;
import com.pq.tracs.model.custom.dao.CustomSecurityUserVOImpl;
import com.pq.tracs.model.custom.dao.GroupPermissionsViewImpl;
import com.pq.tracs.model.custom.dao.RolesViewImpl;
import com.pq.tracs.model.dao.ActivityViewImpl;
import com.pq.tracs.model.dao.AddedEntryViewImpl;
import com.pq.tracs.model.dao.AdditionalUrlViewImpl;
import com.pq.tracs.model.dao.AddressViewImpl;
import com.pq.tracs.model.dao.ClassificationViewImpl;
import com.pq.tracs.model.dao.ContactViewImpl;
import com.pq.tracs.model.dao.ContentOwnerNoteViewImpl;
import com.pq.tracs.model.dao.ContentOwnerViewImpl;
import com.pq.tracs.model.dao.ContractAttachmentViewImpl;
import com.pq.tracs.model.dao.ContractGuaranteeTitleViewImpl;
import com.pq.tracs.model.dao.ContractGuaranteeViewImpl;
import com.pq.tracs.model.dao.ContractNoteViewImpl;
import com.pq.tracs.model.dao.ContractRightCategoryViewImpl;
import com.pq.tracs.model.dao.ContractRightViewImpl;
import com.pq.tracs.model.dao.ContractRightViewRowImpl;
import com.pq.tracs.model.dao.ContractRoyaltyRateTitleViewImpl;
import com.pq.tracs.model.dao.ContractTitleRoyaltyRateViewImpl;
import com.pq.tracs.model.dao.ContractTitleViewImpl;
import com.pq.tracs.model.dao.ContractViewImpl;
import com.pq.tracs.model.dao.ContractViewRowImpl;
import com.pq.tracs.model.dao.JTraxTitleContractRightViewImpl;
import com.pq.tracs.model.dao.OvrBrowseTypeViewImpl;
import com.pq.tracs.model.dao.TitleContentOwnerViewImpl;
import com.pq.tracs.model.dao.TitleContractViewImpl;
import com.pq.tracs.model.dao.TitleNoteViewImpl;
import com.pq.tracs.model.dao.TitleRecordViewImpl;
import com.pq.tracs.model.dao.TitleViewImpl;
import com.pq.tracs.model.dao.TracsView;
import com.pq.tracs.model.dao.TraxTitleRecRightCategoryViewImpl;
import com.pq.tracs.model.dao.TraxTitleRecordRightViewImpl;
import com.pq.tracs.model.dao.VaryingFormViewImpl;
import com.pq.tracs.model.lookups.ContentOwnerTitlesLookupImpl;
import com.pq.tracs.model.lookups.ContractContactROViewImpl;
import com.pq.tracs.model.lookups.ContractTitleLookupImpl;
import com.pq.tracs.model.lookups.LookupCodeLookupImpl;
import com.pq.tracs.model.lookups.PublisherUrlViewImpl;
import com.pq.tracs.model.lookups.TitleRoyaltyRateLookupImpl;
import com.pq.tracs.model.lookups.TitlesContractRightLookUpImpl;
import com.pq.tracs.model.lookups.UsersLOVImpl;
import com.pq.tracs.model.ro.DeliveryRightViewImpl;
import com.pq.tracs.model.dao.EfeedFormatViewImpl;
import com.pq.tracs.model.dao.JContractRightTitlesViewImpl;
import com.pq.tracs.model.dao.JContractTitleContractRightViewImpl;
import com.pq.tracs.model.dao.RelatedTitleViewImpl;
import com.pq.tracs.model.dao.RoyaltyInformationViewImpl;
import com.pq.tracs.model.dao.RoyaltyRateExceptionViewImpl;
import com.pq.tracs.model.dao.RoyaltyRateViewImpl;
import com.pq.tracs.model.dao.RoyaltyRateViewRowImpl;
import com.pq.tracs.model.dao.TitleLanguageViewImpl;
import com.pq.tracs.model.dao.TitleRecordHistoryViewImpl;
import com.pq.tracs.model.dao.TitleRecordLegacyDataViewImpl;
import com.pq.tracs.model.dao.TitleRecordPmClassViewImpl;
import com.pq.tracs.model.dao.TitleRecordScheduleViewImpl;
import com.pq.tracs.model.dao.TitleRecordViewRowImpl;
import com.pq.tracs.model.dao.TitleSeriesViewImpl;
import com.pq.tracs.model.dao.TitleSubjectViewImpl;
import com.pq.tracs.model.dao.TitleViewRowImpl;
import com.pq.tracs.model.dao.TraxRightTemplateViewImpl;
import com.pq.tracs.model.ro.OpportunitiesDashboardViewImpl;
import com.pq.tracs.model.ro.SearchViewImpl;
import com.pq.tracs.model.lookups.ContractBasedTitleLOVImpl;
import com.pq.tracs.model.lookups.ContractGuaranteeMultiSelectLOVImpl;
import com.pq.tracs.model.lookups.ContractTitleRightMultiSelectLOVImpl;
import com.pq.tracs.model.lookups.TitleLOVImpl;
import com.pq.tracs.model.security.dao.ExUserChangeDetailsViewImpl;
import com.pq.tracs.model.services.common.TracsService;

import com.pq.tracs.model.vo.ContentOwnerContactViewImpl;
import com.pq.tracs.model.vo.NTCPublisherViewImpl;
import com.pq.tracs.model.vo.NTCRightsViewImpl;
import com.pq.tracs.model.vo.PrmOpportunityAgreementDataViewImpl;
import com.pq.tracs.model.vo.NTCTitleViewImpl;
import com.pq.tracs.model.vo.TraxBlockingRuleDtlViewRowImpl;
import com.pq.tracs.model.vo.TraxOvrCSCutoverViewImpl;
import com.pq.tracs.model.vo.TraxTitleChildTitleViewImpl;
import com.pq.tracs.model.vo.TraxTitleChildTitleViewRowImpl;
import com.pq.tracs.model.vo.TraxUlrichsTitleViewImpl;

import com.pq.tracs.model.vo.TraxUlrichsTitleViewRowImpl;

import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeDef;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jbo.server.ViewRowImpl;

import oracle.jheadstart.model.JhsUserContext;
import oracle.jheadstart.model.adfbc.v2.JhsApplicationModuleImpl;
import oracle.jheadstart.util.DatabaseProcedure;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TracsServiceImpl extends JhsApplicationModuleImpl implements TracsService {
    /**This is the default constructor (do not remove)
     */
    public TracsServiceImpl() {
    }


    /**Container's getter for ContentOwnerView1
     */
    public ContentOwnerViewImpl getContentOwnerView1() {
        return (ContentOwnerViewImpl)findViewObject("ContentOwnerView1");
    }


    /**Container's getter for AdditionalUrlFkLink1
     */
    public ViewLinkImpl getAdditionalUrlFkLink1() {
        return (ViewLinkImpl)findViewLink("AdditionalUrlFkLink1");
    }

    /**Container's getter for TraxContentOwnerNoteFkLink1
     */
    public ViewLinkImpl getTraxContentOwnerNoteFkLink1() {
        return (ViewLinkImpl)findViewLink("TraxContentOwnerNoteFkLink1");
    }

    /**Container's getter for ContractContentOwnerFkLink1
     */
    public ViewLinkImpl getContractContentOwnerFkLink1() {
        return (ViewLinkImpl)findViewLink("ContractContentOwnerFkLink1");
    }


    /**Container's getter for EfeedFormatContentOwnerFkLink1
     */
    public ViewLinkImpl getEfeedFormatContentOwnerFkLink1() {
        return (ViewLinkImpl)findViewLink("EfeedFormatContentOwnerFkLink1");
    }


    /**Container's getter for AddressContentOwnerFkLink1
     */
    public ViewLinkImpl getAddressContentOwnerFkLink1() {
        return (ViewLinkImpl)findViewLink("AddressContentOwnerFkLink1");
    }

    /**Sample main for debugging Business Components code using the tester.
     */
    public static void main(String[] args) { /* package name */
        /* Configuration Name */launchTester("com.pq.tracs.model.services",
                                             "TracsServiceLocal");
    }


    /**Container's getter for AdditionalUrlView1
     */
    public AdditionalUrlViewImpl getAdditionalUrlView1() {
        return (AdditionalUrlViewImpl)findViewObject("AdditionalUrlView1");
    }

    /**Container's getter for ContentOwnerNoteView1
     */
    public ContentOwnerNoteViewImpl getContentOwnerNoteView1() {
        return (ContentOwnerNoteViewImpl)findViewObject("ContentOwnerNoteView1");
    }

    /**Container's getter for ContractView1
     */
    public ContractViewImpl getContractView1() {
        return (ContractViewImpl)findViewObject("ContractView1");
    }

    /**Container's getter for EfeedFormatView1
     */
    public EfeedFormatViewImpl getEfeedFormatView1() {
        return (EfeedFormatViewImpl)findViewObject("EfeedFormatView1");
    }


    /**Container's getter for AddressView1
     */
    public AddressViewImpl getAddressView1() {
        return (AddressViewImpl)findViewObject("AddressView1");
    }


    /**Container's getter for ContractView2
     */
    public ContractViewImpl getContractView2() {
        return (ContractViewImpl)findViewObject("ContractView2");
    }

    /**Container's getter for ContractNoteView2
     */
    public ContractNoteViewImpl getContractNoteView2() {
        return (ContractNoteViewImpl)findViewObject("ContractNoteView2");
    }


    /**Container's getter for RoyaltyInformationView3
     */
    public RoyaltyInformationViewImpl getRoyaltyInformationView3() {
        return (RoyaltyInformationViewImpl)findViewObject("RoyaltyInformationView3");
    }

    /**Container's getter for TraxContractNoteFkLink1
     */
    public ViewLinkImpl getTraxContractNoteFkLink1() {
        return (ViewLinkImpl)findViewLink("TraxContractNoteFkLink1");
    }


    /**Container's getter for RoyaltyInformationFkLink1
     */
    public ViewLinkImpl getRoyaltyInformationFkLink1() {
        return (ViewLinkImpl)findViewLink("RoyaltyInformationFkLink1");
    }

    /**Container's getter for ContractTypeLookup
     */
    public ViewObjectImpl getContractTypeLookup() {
        return (ViewObjectImpl)findViewObject("ContractTypeLookup");
    }

    /**Container's getter for ContractDivisionLookup
     */
    public ViewObjectImpl getContractDivisionLookup() {
        return (ViewObjectImpl)findViewObject("ContractDivisionLookup");
    }

    /**Container's getter for ContractStatusLookup
     */
    public ViewObjectImpl getContractStatusLookup() {
        return (ViewObjectImpl)findViewObject("ContractStatusLookup");
    }

    /**Container's getter for ContractTermLengthLookup
     */
    public ViewObjectImpl getContractTermLengthLookup() {
        return (ViewObjectImpl)findViewObject("ContractTermLengthLookup");
    }

    /**Container's getter for ContractExclusivityLookup
     */
    public ViewObjectImpl getContractExclusivityLookup() {
        return (ViewObjectImpl)findViewObject("ContractExclusivityLookup");
    }


    /**Container's getter for ContractFormatCompSubLookup
     */
    public ViewObjectImpl getContractFormatCompSubLookup() {
        return (ViewObjectImpl)findViewObject("ContractFormatCompSubLookup");
    }


    /**Container's getter for ContractMasterOwnerLookup
     */
    public ViewObjectImpl getContractMasterOwnerLookup() {
        return (ViewObjectImpl)findViewObject("ContractMasterOwnerLookup");
    }

    /**Container's getter for ContractRightRetainedLookup
     */
    public ViewObjectImpl getContractRightRetainedLookup() {
        return (ViewObjectImpl)findViewObject("ContractRightRetainedLookup");
    }

    /**Container's getter for ContractFormLookup
     */
    public ViewObjectImpl getContractFormLookup() {
        return (ViewObjectImpl)findViewObject("ContractFormLookup");
    }


    /**Container's getter for ContentOwnerLOV1
     */
    public ViewObjectImpl getContentOwnerLOV1() {
        return (ViewObjectImpl)findViewObject("ContentOwnerLOV1");
    }


    /**Container's getter for LanguageLookup
     */
    public ViewObjectImpl getLanguageLookup() {
        return (ViewObjectImpl)findViewObject("LanguageLookup");
    }

    /**Container's getter for CountryLookup
     */
    public ViewObjectImpl getCountryLookup() {
        return (ViewObjectImpl)findViewObject("CountryLookup");
    }


    /**Container's getter for ContractAttachmentView1
     */
    public ContractAttachmentViewImpl getContractAttachmentView1() {
        return (ContractAttachmentViewImpl)findViewObject("ContractAttachmentView1");
    }

    /**Container's getter for ContractAttachmentFkLink1
     */
    public ViewLinkImpl getContractAttachmentFkLink1() {
        return (ViewLinkImpl)findViewLink("ContractAttachmentFkLink1");
    }


    /**Container's getter for UsersLOV1
     */
    public UsersLOVImpl getUsersLOV1() {
        return (UsersLOVImpl)findViewObject("UsersLOV1");
    }


    /**Container's getter for TitleView1
     */
    public ViewObjectImpl getTitleView1() {
        return (ViewObjectImpl)findViewObject("TitleView1");
    }

    /**Container's getter for JhsModelService
     */
    public ApplicationModuleImpl getJhsModelService() {
        return (ApplicationModuleImpl)findApplicationModule("JhsModelService");
    }

    /**Container's getter for TitleRecordView1
     */
    public ViewObjectImpl getTitleRecordView1() {
        return (ViewObjectImpl)findViewObject("TitleRecordView1");
    }

    /**Container's getter for TitleSubjectView1
     */
    public ViewObjectImpl getTitleSubjectView1() {
        return (ViewObjectImpl)findViewObject("TitleSubjectView1");
    }


    /**Container's getter for TitleRecordViewLink1
     */
    public ViewLinkImpl getTitleRecordViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleRecordViewLink1");
    }

    /**Container's getter for TitleSubjectViewLink1
     */
    public ViewLinkImpl getTitleSubjectViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleSubjectViewLink1");
    }


    /**Container's getter for COTitlesReadOnlyView1
     */
    public ViewObjectImpl getCOTitlesReadOnlyView1() {
        return (ViewObjectImpl)findViewObject("COTitlesReadOnlyView1");
    }

    /**Container's getter for COToTitlesVL1
     */
    public ViewLinkImpl getCOToTitlesVL1() {
        return (ViewLinkImpl)findViewLink("COToTitlesVL1");
    }


    /**Container's getter for TitleContractView1
     */
    public TitleContractViewImpl getTitleContractView1() {
        return (TitleContractViewImpl)findViewObject("TitleContractView1");
    }

    /**Container's getter for TitlesContractLink1
     */
    public ViewLinkImpl getTitlesContractLink1() {
        return (ViewLinkImpl)findViewLink("TitlesContractLink1");
    }


    /**Container's getter for ContractRightView1
     */
    public ContractRightViewImpl getContractRightView1() {
        return (ContractRightViewImpl)findViewObject("ContractRightView1");
    }

    /**Container's getter for ContractRightCategoryView1
     */
    public ContractRightCategoryViewImpl getContractRightCategoryView1() {
        return (ContractRightCategoryViewImpl)findViewObject("ContractRightCategoryView1");
    }

    /**Container's getter for ContractRightContractFkLink2
     */
    public ViewLinkImpl getContractRightContractFkLink2() {
        return (ViewLinkImpl)findViewLink("ContractRightContractFkLink2");
    }

    /**Container's getter for ContractRightToCategoryViewLink1
     */
    public ViewLinkImpl getContractRightToCategoryViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractRightToCategoryViewLink1");
    }


    /**Container's getter for CustomSecurityUserVO1
     */
    public CustomSecurityUserVOImpl getCustomSecurityUserVO1() {
        return (CustomSecurityUserVOImpl)findViewObject("CustomSecurityUserVO1");
    }


    /**Container's getter for ContractRightTypeLookup
     */
    public ViewObjectImpl getContractRightTypeLookup() {
        return (ViewObjectImpl)findViewObject("ContractRightTypeLookup");
    }

    /**Container's getter for TitleClassificationsLookup
     */
    public ViewObjectImpl getTitleClassificationsLookup() {
        return (ViewObjectImpl)findViewObject("TitleClassificationsLookup");
    }

    /**Container's getter for ProductLineLookup
     */
    public ViewObjectImpl getProductLineLookup() {
        return (ViewObjectImpl)findViewObject("ProductLineLookup");
    }

    /**Container's getter for FilmAvailabilityLookup
     */
    public ViewObjectImpl getFilmAvailabilityLookup() {
        return (ViewObjectImpl)findViewObject("FilmAvailabilityLookup");
    }


    /**Container's getter for SerialSubTypeLookup
     */
    public ViewObjectImpl getSerialSubTypeLookup() {
        return (ViewObjectImpl)findViewObject("SerialSubTypeLookup");
    }

    /**Container's getter for PMClassLookup
     */
    public ViewObjectImpl getPMClassLookup() {
        return (ViewObjectImpl)findViewObject("PMClassLookup");
    }

    /**Container's getter for PMSubClassLookup
     */
    public ViewObjectImpl getPMSubClassLookup() {
        return (ViewObjectImpl)findViewObject("PMSubClassLookup");
    }

    /**Container's getter for PublicationFrequencyLookup
     */
    public ViewObjectImpl getPublicationFrequencyLookup() {
        return (ViewObjectImpl)findViewObject("PublicationFrequencyLookup");
    }

    /**Container's getter for PaymentFrequencyLookup
     */
    public ViewObjectImpl getPaymentFrequencyLookup() {
        return (ViewObjectImpl)findViewObject("PaymentFrequencyLookup");
    }

    /**Container's getter for GuaranteeFrequencyLookup
     */
    public ViewObjectImpl getGuaranteeFrequencyLookup() {
        return (ViewObjectImpl)findViewObject("GuaranteeFrequencyLookup");
    }

    /**Container's getter for PaymentTermLookup
     */
    public ViewObjectImpl getPaymentTermLookup() {
        return (ViewObjectImpl)findViewObject("PaymentTermLookup");
    }

    /**Container's getter for CurrencyLookup
     */
    public ViewObjectImpl getCurrencyLookup() {
        return (ViewObjectImpl)findViewObject("CurrencyLookup");
    }


    /**Container's getter for TitleNoteView1
     */
    public TitleNoteViewImpl getTitleNoteView1() {
        return (TitleNoteViewImpl)findViewObject("TitleNoteView1");
    }

    /**Container's getter for AddedEntryView1
     */
    public AddedEntryViewImpl getAddedEntryView1() {
        return (AddedEntryViewImpl)findViewObject("AddedEntryView1");
    }

    /**Container's getter for TitleToTileNoteLink1
     */
    public ViewLinkImpl getTitleToTileNoteLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTileNoteLink1");
    }

    /**Container's getter for TitleAddedEntryViewLink1
     */
    public ViewLinkImpl getTitleAddedEntryViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleAddedEntryViewLink1");
    }


    /**Container's getter for VaryingFormTypeLookup
     */
    public ViewObjectImpl getVaryingFormTypeLookup() {
        return (ViewObjectImpl)findViewObject("VaryingFormTypeLookup");
    }


    /**Container's getter for RelationShipReasonLookup
     */
    public ViewObjectImpl getRelationShipReasonLookup() {
        return (ViewObjectImpl)findViewObject("RelationShipReasonLookup");
    }


    /**Container's getter for ContractNoteTypeLookup
     */
    public ViewObjectImpl getContractNoteTypeLookup() {
        return (ViewObjectImpl)findViewObject("ContractNoteTypeLookup");
    }


    /**Container's getter for JContractRightTitlesView1
     */
    public JContractRightTitlesViewImpl getJContractRightTitlesView1() {
        return (JContractRightTitlesViewImpl)findViewObject("JContractRightTitlesView1");
    }

    /**Container's getter for JContractRightTitlesViewLink1
     */
    public ViewLinkImpl getJContractRightTitlesViewLink1() {
        return (ViewLinkImpl)findViewLink("JContractRightTitlesViewLink1");
    }


    /**Container's getter for JobRoleLookup
     */
    public ViewObjectImpl getJobRoleLookup() {
        return (ViewObjectImpl)findViewObject("JobRoleLookup");
    }


    /**Container's getter for RelatedTitlesLOV
     */
    public ViewObjectImpl getRelatedTitlesLOV() {
        return (ViewObjectImpl)findViewObject("RelatedTitlesLOV");
    }


    /**Container's getter for TitleLanguageView1
     */
    public TitleLanguageViewImpl getTitleLanguageView1() {
        return (TitleLanguageViewImpl)findViewObject("TitleLanguageView1");
    }


    /**Container's getter for TitlesToLanguageLink1
     */
    public ViewLinkImpl getTitlesToLanguageLink1() {
        return (ViewLinkImpl)findViewLink("TitlesToLanguageLink1");
    }


    /**Container's getter for ExUserChangeDetailsView1
     */
    public ExUserChangeDetailsViewImpl getExUserChangeDetailsView1() {
        return (ExUserChangeDetailsViewImpl)findViewObject("ExUserChangeDetailsView1");
    }

    /**Container's getter for TitleSeriesView1
     */
    public TitleSeriesViewImpl getTitleSeriesView1() {
        return (TitleSeriesViewImpl)findViewObject("TitleSeriesView1");
    }

    /**Container's getter for TitlesToTitleSeriesLink1
     */
    public ViewLinkImpl getTitlesToTitleSeriesLink1() {
        return (ViewLinkImpl)findViewLink("TitlesToTitleSeriesLink1");
    }

    /**Container's getter for RelatedTitleView1
     */
    public RelatedTitleViewImpl getRelatedTitleView1() {
        return (RelatedTitleViewImpl)findViewObject("RelatedTitleView1");
    }

    /**Container's getter for TitlesToRelatedTitlesLink1
     */
    public ViewLinkImpl getTitlesToRelatedTitlesLink1() {
        return (ViewLinkImpl)findViewLink("TitlesToRelatedTitlesLink1");
    }


    /**Container's getter for PMTypeLookup
     */
    public ViewObjectImpl getPMTypeLookup() {
        return (ViewObjectImpl)findViewObject("PMTypeLookup");
    }

    /**Container's getter for PMGroupLookup
     */
    public ViewObjectImpl getPMGroupLookup() {
        return (ViewObjectImpl)findViewObject("PMGroupLookup");
    }

    /**Container's getter for PMFamilyLookup
     */
    public ViewObjectImpl getPMFamilyLookup() {
        return (ViewObjectImpl)findViewObject("PMFamilyLookup");
    }


    /**Container's getter for SubjectLookup1
     */
    public ViewObjectImpl getSubjectLookup1() {
        return (ViewObjectImpl)findViewObject("SubjectLookup1");
    }


    /**Container's getter for ManufacturingProcessLookup
     */
    public ViewObjectImpl getManufacturingProcessLookup() {
        return (ViewObjectImpl)findViewObject("ManufacturingProcessLookup");
    }

    /**Container's getter for ImageStorageLookup
     */
    public ViewObjectImpl getImageStorageLookup() {
        return (ViewObjectImpl)findViewObject("ImageStorageLookup");
    }


    /**Container's getter for TitleNoteTypeLookup
     */
    public ViewObjectImpl getTitleNoteTypeLookup() {
        return (ViewObjectImpl)findViewObject("TitleNoteTypeLookup");
    }


    /**Container's getter for TitlesContractRightLookUp1
     */
    public TitlesContractRightLookUpImpl getTitlesContractRightLookUp1() {
        return (TitlesContractRightLookUpImpl)findViewObject("TitlesContractRightLookUp1");
    }

    /**Container's getter for TitleLOV1
     */
    public TitleLOVImpl getTitleLOV1() {
        return (TitleLOVImpl)findViewObject("TitleLOV1");
    }


    /**Container's getter for TitleSeriesTypeLOV
     */
    public ViewObjectImpl getTitleSeriesTypeLOV() {
        return (ViewObjectImpl)findViewObject("TitleSeriesTypeLOV");
    }

    /**Container's getter for LegacySourceTypeLookup
     */
    public ViewObjectImpl getLegacySourceTypeLookup() {
        return (ViewObjectImpl)findViewObject("LegacySourceTypeLookup");
    }


    /**Container's getter for JTraxTitleContractRightView1
     */
    public JTraxTitleContractRightViewImpl getJTraxTitleContractRightView1() {
        return (JTraxTitleContractRightViewImpl)findViewObject("JTraxTitleContractRightView1");
    }

    /**Container's getter for JTitleContractRightViewLink1
     */
    public ViewLinkImpl getJTitleContractRightViewLink1() {
        return (ViewLinkImpl)findViewLink("JTitleContractRightViewLink1");
    }

    public void createCatalogNumberForTarget() {
        TitleViewImpl titles = this.getNewTargetedTitleView();
        TitleViewRowImpl title = (TitleViewRowImpl)titles.getCurrentRow();
        if (title.getContentOwnerId() != null) {
            if (title.getCatalogNumber() == null ||
                title.getCatalogNumber().trim().length() == 0) {
                String catNum =
                    this.generateCatalogNumber("" + (title.getContentOwnerId()).intValue(),
                                               title.getCatalogRoot(),
                                               title.getProductLine());

                if (catNum != null && catNum.trim().length() > 0) {
                    String root = catNum.substring(0, catNum.indexOf("."));
                    String suffix = catNum.substring(catNum.indexOf(".") + 1);
                    title.setCatalogRoot(root);
                    title.setCatalogSuffix(suffix);
                    title.setCataloguedBy(this.getUsername());
                }
                title.setCatalogNumber(catNum);
                title.setEditableFlag("N");
                this.getDBTransaction().commit();
            }
        } else {
            createCatalogNumberOwnerValidation();
        }
    }
    /*
     * Fires a validation message when user selects catalog new new title
     * without adding a content owner
     */

    public String createCatalogNumberOwnerValidation() {
        String messageText = ("Please select a Primary Content Owner.");
        FacesMessage fm;
        fm = new FacesMessage(messageText);
        /**
             * set the type of the message.
             * Valid types: error, fatal,info,warning
             */
        fm.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public String generateCatalogNumber(String contentOwnerId,
                                        String catalogRoot,
                                        String productLine) {

        String sql =
            "SELECT CatalogNumberSequence.ID, CatalogNumberSequence.DESCRIPTION, " +
            "       CatalogNumberSequence.CATALOG_ROOT_MINIMUM, " +
            "       CatalogNumberSequence.CATALOG_ROOT_MAXIMUM, " +
            "       CatalogNumberSequence.CATALOG_ROOT_NEXTVAL, " +
            "       CatalogNumberSequence.CATALOG_SUFFIX_START, " +
            "       CatalogNumberSequence.PRODUCT_LINE, " +
            "       CatalogNumberSequence.CONTENT_OWNER_ID " +
            "FROM TRAX_CATALOG_NUMBER_SEQUENCE CatalogNumberSequence " +
            "WHERE CONTENT_OWNER_ID IS NULL " + "AND PRODUCT_LINE IS NULL";

        // initialize blank catalog number
        String catalogNumber = "";

        // if the title has no content owner, return null
        if (contentOwnerId == null || contentOwnerId.trim().length() == 0) {
            throw new JboException("Please enter a valid Content Owner");
        }
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            // check for a catalog number sequence for the content owner
            conn =
getDBTransaction().createPreparedStatement("commit", 1).getConnection();

            stmt =
conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);

            rs.last();
            int rowcount = rs.getRow();

            if (rowcount == 0) {
                throw new JboException("Catalog sequence not found.");
            }

            if (rowcount == 1) {
                // there is one valid sequence, pull it
                rs.beforeFirst();
                rs.next();

                // make sure the new catalog number will still be within the valid sequence range
                String nextVal = rs.getString("CATALOG_ROOT_NEXTVAL");
                int nVal = Integer.parseInt(nextVal);
                int maxVal =
                    Integer.parseInt(rs.getString("CATALOG_ROOT_MAXIMUM"));
                int minVal =
                    Integer.parseInt(rs.getString("CATALOG_ROOT_MINIMUM"));

                if (nVal >= minVal) {

                    nVal = nVal + 1;

                } else {
                    throw new JboException("Catalog sequence number is less than minimum value.");
                }
                if (nVal > maxVal) {
                    throw new JboException("Catalog sequence exceeds the maximum value.");
                }

                // set the new catalog number
                catalogNumber =
                        nVal + "." + rs.getString("CATALOG_SUFFIX_START");

                // increment the sequence in the catalog sequence table
                Statement stmt1 = conn.createStatement();
                stmt1.executeUpdate("UPDATE TRAX_CATALOG_NUMBER_SEQUENCE SET CATALOG_ROOT_NEXTVAL='" +
                                    nVal + "' WHERE ID=" + rs.getInt("ID"));

            } else {
                throw new JboException("More than one catalog sequence exist.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new JboException("Failed catlog number generation. Error :" +
                                   e.toString());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
            } catch (Exception eee) {
                eee.printStackTrace();
            }
        }

        return catalogNumber;
    }


    /**Container's getter for ContractTitleLookup
     */
    public ContractTitleLookupImpl getContractTitleLookup() {
        return (ContractTitleLookupImpl)findViewObject("ContractTitleLookup");
    }


    /**Container's getter for SearchView1
     */
    public SearchViewImpl getSearchView1() {
        return (SearchViewImpl)findViewObject("SearchView1");
    }

    /**Container's getter for SearchAddressesView1
     */
    public ViewObjectImpl getSearchAddressesView1() {
        return (ViewObjectImpl)findViewObject("SearchAddressesView1");
    }

    /**Container's getter for AddressesLink1
     */
    public ViewLinkImpl getAddressesLink1() {
        return (ViewLinkImpl)findViewLink("AddressesLink1");
    }


    /**Container's getter for SearchContractRightsView1
     */
    public ViewObjectImpl getSearchContractRightsView1() {
        return (ViewObjectImpl)findViewObject("SearchContractRightsView1");
    }

    /**Container's getter for SearchRoyaltyInfoView1
     */
    public ViewObjectImpl getSearchRoyaltyInfoView1() {
        return (ViewObjectImpl)findViewObject("SearchRoyaltyInfoView1");
    }


    /**Container's getter for ContractRightsLink1
     */
    public ViewLinkImpl getContractRightsLink1() {
        return (ViewLinkImpl)findViewLink("ContractRightsLink1");
    }

    /**Container's getter for RoyaltyInfoLink1
     */
    public ViewLinkImpl getRoyaltyInfoLink1() {
        return (ViewLinkImpl)findViewLink("RoyaltyInfoLink1");
    }


    /**Container's getter for RoyaltyRateView1
     */
    public RoyaltyRateViewImpl getRoyaltyRateView1() {
        return (RoyaltyRateViewImpl)findViewObject("RoyaltyRateView1");
    }

    /**Container's getter for ContractRoyaltyRateViewLink1
     */
    public ViewLinkImpl getContractRoyaltyRateViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractRoyaltyRateViewLink1");
    }

    /**Container's getter for ContractGuaranteeView1
     */
    public ContractGuaranteeViewImpl getContractGuaranteeView1() {
        return (ContractGuaranteeViewImpl)findViewObject("ContractGuaranteeView1");
    }

    /**Container's getter for ContractGuaranteeFkLink1
     */
    public ViewLinkImpl getContractGuaranteeFkLink1() {
        return (ViewLinkImpl)findViewLink("ContractGuaranteeFkLink1");
    }

    /**Container's getter for ContractMediaCodeLookup
     */
    public ViewObjectImpl getContractMediaCodeLookup() {
        return (ViewObjectImpl)findViewObject("ContractMediaCodeLookup");
    }


    /**Container's getter for ContractProductCodeLookup
     */
    public ViewObjectImpl getContractProductCodeLookup() {
        return (ViewObjectImpl)findViewObject("ContractProductCodeLookup");
    }

    /**Container's getter for ContractInventoryDivisionLookup
     */
    public ViewObjectImpl getContractInventoryDivisionLookup() {
        return (ViewObjectImpl)findViewObject("ContractInventoryDivisionLookup");
    }


    /**Container's getter for ContractRoyaltyTypeLookup
     */
    public ViewObjectImpl getContractRoyaltyTypeLookup() {
        return (ViewObjectImpl)findViewObject("ContractRoyaltyTypeLookup");
    }

    /**Container's getter for RightPermissionTypeLookup
     */
    public ViewObjectImpl getRightPermissionTypeLookup() {
        return (ViewObjectImpl)findViewObject("RightPermissionTypeLookup");
    }

    /**Container's getter for RightIncludesorExcludesLookup
     */
    public ViewObjectImpl getRightIncludesorExcludesLookup() {
        return (ViewObjectImpl)findViewObject("RightIncludesorExcludesLookup");
    }


    /**Container's getter for RightorRestrictionTypeLookup
     */
    public ViewObjectImpl getRightorRestrictionTypeLookup() {
        return (ViewObjectImpl)findViewObject("RightorRestrictionTypeLookup");
    }

    /**Container's getter for RightStatusLookup
     */
    public ViewObjectImpl getRightStatusLookup() {
        return (ViewObjectImpl)findViewObject("RightStatusLookup");
    }

    /**Container's getter for RightPermissionTypeLook
     */
    public ViewObjectImpl getRightPermissionTypeLook() {
        return (ViewObjectImpl)findViewObject("RightPermissionTypeLook");
    }


    /**Container's getter for TitleAbstractLanguageView1
     */
    public ViewObjectImpl getTitleAbstractLanguageView1() {
        return (ViewObjectImpl)findViewObject("TitleAbstractLanguageView1");
    }

    /**Container's getter for TitleAbstractLanguageViewLink1
     */
    public ViewLinkImpl getTitleAbstractLanguageViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleAbstractLanguageViewLink1");
    }

    /**Container's getter for ContractTitleStatusLookup
     */
    public ViewObjectImpl getContractTitleStatusLookup() {
        return (ViewObjectImpl)findViewObject("ContractTitleStatusLookup");
    }

    /**Container's getter for ContractTitleSubStatusLookup
     */
    public ViewObjectImpl getContractTitleSubStatusLookup() {
        return (ViewObjectImpl)findViewObject("ContractTitleSubStatusLookup");
    }

    /**Container's getter for ContractBasedTitleLOV1
     */
    public ContractBasedTitleLOVImpl getContractBasedTitleLOV1() {
        return (ContractBasedTitleLOVImpl)findViewObject("ContractBasedTitleLOV1");
    }

    /**Container's getter for ContractContactROView1
     */
    public ContractContactROViewImpl getContractContactROView1() {
        return (ContractContactROViewImpl)findViewObject("ContractContactROView1");
    }


    /**Container's getter for CategoryValueLookup1
     */
    public ViewObjectImpl getCategoryValueLookup1() {
        return (ViewObjectImpl)findViewObject("CategoryValueLookup1");
    }


    /**Container's getter for RoyaltyRateTitlesLOV1
     */
    public ViewObjectImpl getRoyaltyRateTitlesLOV1() {
        return (ViewObjectImpl)findViewObject("RoyaltyRateTitlesLOV1");
    }

    /**Container's getter for ContractGuaranteeTitlesLOV1
     */
    public ViewObjectImpl getContractGuaranteeTitlesLOV1() {
        return (ViewObjectImpl)findViewObject("ContractGuaranteeTitlesLOV1");
    }


    /**Container's getter for LegacyNameLookup
     */
    public ViewObjectImpl getLegacyNameLookup() {
        return (ViewObjectImpl)findViewObject("LegacyNameLookup");
    }


    /**Container's getter for RoutingLookup
     */
    public ViewObjectImpl getRoutingLookup() {
        return (ViewObjectImpl)findViewObject("RoutingLookup");
    }


    /**Container's getter for NotExercisingRightsLookup
     */
    public ViewObjectImpl getNotExercisingRightsLookup() {
        return (ViewObjectImpl)findViewObject("NotExercisingRightsLookup");
    }


    /**Container's getter for TitleSeriesTypeLookup
     */
    public ViewObjectImpl getTitleSeriesTypeLookup() {
        return (ViewObjectImpl)findViewObject("TitleSeriesTypeLookup");
    }


    /**Container's getter for ContractGuaranteeTitleView1
     */
    public ContractGuaranteeTitleViewImpl getContractGuaranteeTitleView1() {
        return (ContractGuaranteeTitleViewImpl)findViewObject("ContractGuaranteeTitleView1");
    }

    /**Container's getter for ContractGuaranteeTitleViewLink1
     */
    public ViewLinkImpl getContractGuaranteeTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractGuaranteeTitleViewLink1");
    }


    /**Container's getter for TitleRoyaltyRateLookup1
     */
    public TitleRoyaltyRateLookupImpl getTitleRoyaltyRateLookup1() {
        return (TitleRoyaltyRateLookupImpl)findViewObject("TitleRoyaltyRateLookup1");
    }


    /**Container's getter for PrintMessageLookup
     */
    public ViewObjectImpl getPrintMessageLookup() {
        return (ViewObjectImpl)findViewObject("PrintMessageLookup");
    }


    /**Container's getter for ContractTitleView1
     */
    public ContractTitleViewImpl getContractTitleView1() {
        return (ContractTitleViewImpl)findViewObject("ContractTitleView1");
    }


    /**Container's getter for ContractTitleRoyaltyRateView1
     */
    public ContractTitleRoyaltyRateViewImpl getContractTitleRoyaltyRateView1() {
        return (ContractTitleRoyaltyRateViewImpl)findViewObject("ContractTitleRoyaltyRateView1");
    }

    /**Container's getter for JContractTitleContractRightView1
     */
    public JContractTitleContractRightViewImpl getJContractTitleContractRightView1() {
        return (JContractTitleContractRightViewImpl)findViewObject("JContractTitleContractRightView1");
    }

    /**Container's getter for ContractContractTitleViewLink1
     */
    public ViewLinkImpl getContractContractTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractContractTitleViewLink1");
    }


    /**Container's getter for ContractTitleRoyaltyRateViewLink1
     */
    public ViewLinkImpl getContractTitleRoyaltyRateViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractTitleRoyaltyRateViewLink1");
    }

    /**Container's getter for JContractTitleContractRightFkLink1
     */
    public ViewLinkImpl getJContractTitleContractRightFkLink1() {
        return (ViewLinkImpl)findViewLink("JContractTitleContractRightFkLink1");
    }


    /**Container's getter for ContentOwnerTitlesLookup1
     */
    public ContentOwnerTitlesLookupImpl getContentOwnerTitlesLookup1() {
        return (ContentOwnerTitlesLookupImpl)findViewObject("ContentOwnerTitlesLookup1");
    }


    /**Container's getter for TitleContentOwnerTypeLookup
     */
    public ViewObjectImpl getTitleContentOwnerTypeLookup() {
        return (ViewObjectImpl)findViewObject("TitleContentOwnerTypeLookup");
    }

    /**Container's getter for TitleContentOwnerView1
     */
    public TitleContentOwnerViewImpl getTitleContentOwnerView1() {
        return (TitleContentOwnerViewImpl)findViewObject("TitleContentOwnerView1");
    }

    /**Container's getter for TitleContentOwnerTitleViewLink1
     */
    public ViewLinkImpl getTitleContentOwnerTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleContentOwnerTitleViewLink1");
    }


    /**Container's getter for ContractGuaranteeMultiSelectLOV1
     */
    public ContractGuaranteeMultiSelectLOVImpl getContractGuaranteeMultiSelectLOV1() {
        return (ContractGuaranteeMultiSelectLOVImpl)findViewObject("ContractGuaranteeMultiSelectLOV1");
    }

    /**Container's getter for ContractTitleRightMultiSelectLOV1
     */
    public ContractTitleRightMultiSelectLOVImpl getContractTitleRightMultiSelectLOV1() {
        return (ContractTitleRightMultiSelectLOVImpl)findViewObject("ContractTitleRightMultiSelectLOV1");
    }


    /**Container's getter for TitleClassificationsLookup99
     */
    public ViewObjectImpl getTitleClassificationsLookup99() {
        return (ViewObjectImpl)findViewObject("TitleClassificationsLookup99");
    }

    /**Container's getter for TitleRecordView2
     */
    public TitleRecordViewImpl getTitleRecordView2() {
        return (TitleRecordViewImpl)findViewObject("TitleRecordView2");
    }

    /**Container's getter for ClassificationView2
     */
    public ClassificationViewImpl getClassificationView2() {
        return (ClassificationViewImpl)findViewObject("ClassificationView2");
    }

    /**Container's getter for DeliveryRightView2
     */
    public DeliveryRightViewImpl getDeliveryRightView2() {
        return (DeliveryRightViewImpl)findViewObject("DeliveryRightView2");
    }

    /**Container's getter for TitleLanguageView3
     */
    public TitleLanguageViewImpl getTitleLanguageView3() {
        return (TitleLanguageViewImpl)findViewObject("TitleLanguageView3");
    }

    /**Container's getter for TitleRecordHistoryView2
     */
    public TitleRecordHistoryViewImpl getTitleRecordHistoryView2() {
        return (TitleRecordHistoryViewImpl)findViewObject("TitleRecordHistoryView2");
    }

    /**Container's getter for TitleRecordLegacyDataView2
     */
    public TitleRecordLegacyDataViewImpl getTitleRecordLegacyDataView2() {
        return (TitleRecordLegacyDataViewImpl)findViewObject("TitleRecordLegacyDataView2");
    }

    /**Container's getter for TitleRecordPmClassView2
     */
    public TitleRecordPmClassViewImpl getTitleRecordPmClassView2() {
        return (TitleRecordPmClassViewImpl)findViewObject("TitleRecordPmClassView2");
    }


    /**Container's getter for TitleRecordScheduleView2
     */
    public TitleRecordScheduleViewImpl getTitleRecordScheduleView2() {
        return (TitleRecordScheduleViewImpl)findViewObject("TitleRecordScheduleView2");
    }

    /**Container's getter for TitleSubjectView2
     */
    public TitleSubjectViewImpl getTitleSubjectView2() {
        return (TitleSubjectViewImpl)findViewObject("TitleSubjectView2");
    }

    /**Container's getter for TraxTitleRecordRightView4
     */
    public TraxTitleRecordRightViewImpl getTraxTitleRecordRightView4() {
        return (TraxTitleRecordRightViewImpl)findViewObject("TraxTitleRecordRightView4");
    }

    /**Container's getter for VaryingFormView2
     */
    public VaryingFormViewImpl getVaryingFormView2() {
        return (VaryingFormViewImpl)findViewObject("VaryingFormView2");
    }

    /**Container's getter for TraxTitleRecRightCategoryView4
     */
    public TraxTitleRecRightCategoryViewImpl getTraxTitleRecRightCategoryView4() {
        return (TraxTitleRecRightCategoryViewImpl)findViewObject("TraxTitleRecRightCategoryView4");
    }


    /**Container's getter for TitleRecordClassificationViewLink2
     */
    public ViewLinkImpl getTitleRecordClassificationViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordClassificationViewLink2");
    }

    /**Container's getter for DeliveryRightTitleRecordViewLink2
     */
    public ViewLinkImpl getDeliveryRightTitleRecordViewLink2() {
        return (ViewLinkImpl)findViewLink("DeliveryRightTitleRecordViewLink2");
    }

    /**Container's getter for TitleRecordLanguageViewLink2
     */
    public ViewLinkImpl getTitleRecordLanguageViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordLanguageViewLink2");
    }

    /**Container's getter for TitleRecordToRecordHistoryLink2
     */
    public ViewLinkImpl getTitleRecordToRecordHistoryLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordToRecordHistoryLink2");
    }

    /**Container's getter for TitleRecordLegacyDataViewLink2
     */
    public ViewLinkImpl getTitleRecordLegacyDataViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordLegacyDataViewLink2");
    }

    /**Container's getter for TitleRecordPmClassViewLink2
     */
    public ViewLinkImpl getTitleRecordPmClassViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordPmClassViewLink2");
    }


    /**Container's getter for TitleRecordScheduleViewLink2
     */
    public ViewLinkImpl getTitleRecordScheduleViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordScheduleViewLink2");
    }

    /**Container's getter for TitleRecordSubjectViewLink2
     */
    public ViewLinkImpl getTitleRecordSubjectViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordSubjectViewLink2");
    }

    /**Container's getter for TitleRecTitleRecRightViewLink4
     */
    public ViewLinkImpl getTitleRecTitleRecRightViewLink4() {
        return (ViewLinkImpl)findViewLink("TitleRecTitleRecRightViewLink4");
    }

    /**Container's getter for TitleRecordVaryingFormViewLink2
     */
    public ViewLinkImpl getTitleRecordVaryingFormViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleRecordVaryingFormViewLink2");
    }

    /**Container's getter for TraxTitleRecRightCategoFkLink5
     */
    public ViewLinkImpl getTraxTitleRecRightCategoFkLink5() {
        return (ViewLinkImpl)findViewLink("TraxTitleRecRightCategoFkLink5");
    }


    /**Container's getter for TraxTitleRecordRestrictionsView2
     */
    public TraxTitleRecordRightViewImpl getTraxTitleRecordRestrictionsView2() {
        return (TraxTitleRecordRightViewImpl)findViewObject("TraxTitleRecordRestrictionsView2");
    }

    /**Container's getter for TitleRecTitleRecRightViewLink6
     */
    public ViewLinkImpl getTitleRecTitleRecRightViewLink6() {
        return (ViewLinkImpl)findViewLink("TitleRecTitleRecRightViewLink6");
    }


    /**Container's getter for TraxTitleRecRightCategoryView6
     */
    public TraxTitleRecRightCategoryViewImpl getTraxTitleRecRightCategoryView6() {
        return (TraxTitleRecRightCategoryViewImpl)findViewObject("TraxTitleRecRightCategoryView6");
    }


    /**Container's getter for TraxTitleRecRightCategoFkLink7
     */
    public ViewLinkImpl getTraxTitleRecRightCategoFkLink7() {
        return (ViewLinkImpl)findViewLink("TraxTitleRecRightCategoFkLink7");
    }


    /**Container's getter for OVRTitlesLOV1
     */
    public ViewObjectImpl getOVRTitlesLOV1() {
        return (ViewObjectImpl)findViewObject("OVRTitlesLOV1");
    }


    /**Container's getter for SearchClassificationsView1
     */
    public ViewObjectImpl getSearchClassificationsView1() {
        return (ViewObjectImpl)findViewObject("SearchClassificationsView1");
    }

    /**Container's getter for ClassificationsLink1
     */
    public ViewLinkImpl getClassificationsLink1() {
        return (ViewLinkImpl)findViewLink("ClassificationsLink1");
    }

    /**Container's getter for ContactView2
     */
    public ContactViewImpl getContactView2() {
        return (ContactViewImpl)findViewObject("ContactView2");
    }

    /**Container's getter for ActivityView4
     */
    public ActivityViewImpl getActivityView4() {
        return (ActivityViewImpl)findViewObject("ActivityView4");
    }

    /**Container's getter for OvrBrowseTypeView1
     */
    public ViewObjectImpl getOvrBrowseTypeView1() {
        return (ViewObjectImpl)findViewObject("OvrBrowseTypeView1");
    }

    /**Container's getter for OvrBrowseTypeViewLink1
     */
    public ViewLinkImpl getOvrBrowseTypeViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrBrowseTypeViewLink1");
    }

    /**Container's getter for OvrLOV1
     */
    public ViewObjectImpl getOvrLOV1() {
        return (ViewObjectImpl)findViewObject("OvrLOV1");
    }

    /**Container's getter for CoverImageTypeLookup
     */
    public LookupCodeLookupImpl getCoverImageTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("CoverImageTypeLookup");
    }

    /**Container's getter for SubjectTypeLookup
     */
    public LookupCodeLookupImpl getSubjectTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("SubjectTypeLookup");
    }

    /**Container's getter for SubjectVerticalView1
     */
    public ViewObjectImpl getSubjectVerticalView1() {
        return (ViewObjectImpl)findViewObject("SubjectVerticalView1");
    }

    /**Container's getter for TitleSubjectVerticalViewLink1
     */
    public ViewLinkImpl getTitleSubjectVerticalViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleSubjectVerticalViewLink1");
    }

    /**Container's getter for SubjectVerticalView2
     */
    public ViewObjectImpl getSubjectVerticalView2() {
        return (ViewObjectImpl)findViewObject("SubjectVerticalView2");
    }

    /**Container's getter for OvrSubjectVerticalViewLink1
     */
    public ViewLinkImpl getOvrSubjectVerticalViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrSubjectVerticalViewLink1");
    }

    /**Container's getter for SearchSubjectsView1
     */
    public ViewObjectImpl getSearchSubjectsView1() {
        return (ViewObjectImpl)findViewObject("SearchSubjectsView1");
    }

    /**Container's getter for SubjectsViewLink1
     */
    public ViewLinkImpl getSubjectsViewLink1() {
        return (ViewLinkImpl)findViewLink("SubjectsViewLink1");
    }


    /**Container's getter for OtherEditorContributorView1
     */
    public ViewObjectImpl getOtherEditorContributorView1() {
        return (ViewObjectImpl)findViewObject("OtherEditorContributorView1");
    }

    /**Container's getter for TitleOtherEditorContributorViewLink1
     */
    public ViewLinkImpl getTitleOtherEditorContributorViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleOtherEditorContributorViewLink1");
    }

    /**Container's getter for RolesRootReadOnlyView1
     */
    public ViewObjectImpl getRolesRootReadOnlyView1() {
        return (ViewObjectImpl)findViewObject("RolesRootReadOnlyView1");
    }

    /**Container's getter for RolesView1
     */
    public RolesViewImpl getRolesView1() {
        return (RolesViewImpl)findViewObject("RolesView1");
    }

    /**Container's getter for GroupPermissionsView1
     */
    public GroupPermissionsViewImpl getGroupPermissionsView1() {
        return (GroupPermissionsViewImpl)findViewObject("GroupPermissionsView1");
    }

    /**Container's getter for RootToRolesVL1
     */
    public ViewLinkImpl getRootToRolesVL1() {
        return (ViewLinkImpl)findViewLink("RootToRolesVL1");
    }

    /**Container's getter for RolesToPermissionsVL1
     */
    public ViewLinkImpl getRolesToPermissionsVL1() {
        return (ViewLinkImpl)findViewLink("RolesToPermissionsVL1");
    }

    public TitleViewRowImpl executeNameChange() {
        // get the title view
        TitleViewImpl tvo = (TitleViewImpl)getTitleView1();

        // get the current title (row)
        TitleViewRowImpl currentTitleRow =
            (TitleViewRowImpl)tvo.getCurrentRow();

        // get the catalog root and suffix for the current title
        String catRoot = (String)currentTitleRow.getAttribute("CatalogRoot");
        String suffix = (String)currentTitleRow.getAttribute("CatalogSuffix");

        // generate a new catalog suffix
        String newSuffix = getNewCatalogNumber(suffix);
        // use the catalog root and new suffix to create a new catalog number
        String newCatNum = catRoot + "." + newSuffix;

        // check if the new catalog number already exists
        Statement stmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            Connection conn =
                getDBTransaction().createPreparedStatement("commit",
                                                           1).getConnection();
            stmt = conn.createStatement();
            rs =
 stmt.executeQuery("SELECT COUNT(*) FROM TRAX_TITLE WHERE CATALOG_NUMBER='" +
                   newCatNum + "'");
            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (Exception ee) {
                ee.printStackTrace();
            }

            try {
                if (stmt != null)
                    stmt.close();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        if (count > 0)
            throw new JboException("Catalog number '" + newCatNum +
                                   "' already exist with newly generating catalog number. Please change the suffix and execute again or contact the administrator.");

        return this.copyTitle(false, tvo, currentTitleRow, newCatNum,
                              newSuffix, null);
    }

    public TitleViewRowImpl copyTitle() {
        // get the title view
        TitleViewImpl tvo = (TitleViewImpl)getTitleView1();

        // get the current title (row)
        TitleViewRowImpl currentTitleRow =
            (TitleViewRowImpl)tvo.getCurrentRow();

        String newSuffix = null;
        String newCatNum = null;
        String newRoot = null;
        
        int dotPos;
        
        newCatNum =
                this.generateCatalogNumber(currentTitleRow.getContentOwnerId().toString(),
                                           currentTitleRow.getCatalogRoot(),
                                           currentTitleRow.getProductLine());
        dotPos = newCatNum.indexOf(".");
        newRoot = newCatNum.substring(0, dotPos);
        newSuffix = newCatNum.substring(dotPos + 1);

        return this.copyTitle(true, tvo, currentTitleRow, newCatNum, newSuffix,
                              newRoot);
    }

    private TitleViewRowImpl copyTitle(Boolean newCatRoot, TitleViewImpl tvo,
                                       TitleViewRowImpl currentTitleRow,
                                       String newCatNum, String newSuffix,
                                       String newRoot) {

        // create a copy of the current title and set the new catalog number and suffix
        //TitleViewRowImpl newTitleRow = (TitleViewRowImpl)duplicateRow(tvo, currentTitleRow);

        TitleViewRowImpl newTitleRow = (TitleViewRowImpl)tvo.createRow();
        this.duplicateRow(newTitleRow, currentTitleRow,
                          currentTitleRow.getViewObject().getAttributeDefs(),
                          null);

        newTitleRow.setAttribute("CatalogNumber", newCatNum);
        newTitleRow.setAttribute("CatalogSuffix", newSuffix);
      
        //ContentOwnerId was getting nulled from LoV,
        //so reset to avoid error
        newTitleRow.setContentOwnerId(currentTitleRow.getContentOwnerId());
        if (newCatRoot) {
            newTitleRow.setAttribute("CatalogRoot", newRoot);
        }

        // create a new primary key ID for the title
        //        SequenceImpl seq = new SequenceImpl("JHS_SEQ", getDBTransaction());
        //        titleRow.setAttribute("Id", seq.getSequenceNumber());

        try {
            SequenceImpl trackingSeq =
                new SequenceImpl("PRM_TARGET_TRACKING_NO_SEQ",
                                 getDBTransaction());
            newTitleRow.setTargetTrackingNo(trackingSeq.getSequenceNumber());

        } catch (Exception e1) {
            System.out.println("*******************Exception while creating target tracking number***********************");
            System.out.println("Error :" + e1.toString());
            //throw new JboException("Invalid primary key value.");
        }

        oracle.jbo.domain.Number titleId = newTitleRow.getId();

        //tvo.insertRowAtRangeIndex(0, newTitleRow);
        //tvo.setCurrentRowAtRangeIndex(0);

        if (!newCatRoot) {
            // set the current catalog number for the old title
            currentTitleRow.setCurrentCatalogId(newTitleRow.getId());

            // move OVRs to the new catalog number
            RowIterator currentOVRs = currentTitleRow.getTitleRecordView();
            currentOVRs.reset();

            while (currentOVRs.hasNext()) {
                TitleRecordViewRowImpl currentOVR =
                    (TitleRecordViewRowImpl)currentOVRs.next();
                currentOVR.setTitleId(titleId);
            }

            // reset the current catalog number for any other previous versions of the title
            RowIterator childTitles =
                currentTitleRow.getTraxTitleChildTitleView();
            childTitles.reset();

            while (childTitles.hasNext()) {
                TraxTitleChildTitleViewRowImpl childTitle =
                    (TraxTitleChildTitleViewRowImpl)childTitles.next();
                childTitle.setCurrentCatalogId(titleId);
            }
        }

        this.copyChildren(currentTitleRow.getTitleSubjectView(),
                          newTitleRow.getTitleSubjectView(), "TitleId");
        this.copyChildren(currentTitleRow.getTitleSeriesView(),
                          newTitleRow.getTitleSeriesView(), "TitleId");
        this.copyChildren(currentTitleRow.getTitleLanguageView(),
                          newTitleRow.getTitleLanguageView(), "TitleId");
        this.copyChildren(currentTitleRow.getTitleAbstractLanguageView(),
                          newTitleRow.getTitleAbstractLanguageView(),
                          "TitleId");
        //this.copyChildren(currentTitleRow.getTitleContentOwnerView(), newTitleRow.getTitleContentOwnerView(), "TitleId");

        // copy content owners
        RowIterator tcovo = currentTitleRow.getTitleContentOwnerView();
        tcovo.reset();

        oracle.jbo.domain.Number contentOwnerId =
            newTitleRow.getContentOwnerId();

        while (tcovo.hasNext()) {
            Row tcoRow = tcovo.next();
            if (contentOwnerId.compareTo((oracle.jbo.domain.Number)tcoRow.getAttribute("ContentOwnerId")) !=
                0) {
                Row tconRow = tcovo.createRow();
                tconRow.setAttribute("TitleId", titleId);
                tconRow.setAttribute("ContentOwnerId",
                                     tcoRow.getAttribute("ContentOwnerId"));
                tconRow.setAttribute("OwnerType",
                                     tcoRow.getAttribute("OwnerType"));
                tconRow.setAttribute("PrimaryFlag",
                                     tcoRow.getAttribute("PrimaryFlag"));
                newTitleRow.getTitleContentOwnerView().insertRow(tconRow);
            }
            tcoRow = tcovo.next();
        }
        return newTitleRow;

    } // end copyTitle

    public void copyChildren(RowIterator currentChildRows,
                             RowIterator newChildRows, String fKey) {
        currentChildRows.reset();

        while (currentChildRows.hasNext()) {
            ViewRowImpl currentChildRow = (ViewRowImpl)currentChildRows.next();
            ViewRowImpl newChildRow = (ViewRowImpl)newChildRows.createRow();
            duplicateRow(newChildRow, currentChildRow,
                         currentChildRow.getViewObject().getAttributeDefs(),
                         fKey);
            newChildRows.insertRow(newChildRow);
        }

    }

    public void duplicateRow(Row newRow, Row currentRow, AttributeDef[] attrs,
                             String fKey) {

        for (int i = 0; i < attrs.length; i++) {
            String attrName = attrs[i].getName();
            if (!attrName.equalsIgnoreCase(fKey) && !attrs[i].isPrimaryKey() &&
                attrs[i].getAttributeKind() !=
                AttributeDef.ATTR_ASSOCIATED_ROW &&
                attrs[i].getAttributeKind() !=
                AttributeDef.ATTR_ASSOCIATED_ROWITERATOR &&
                attrs[i].getUpdateableFlag() != AttributeDef.READONLY &&
                (attrs[i].getUpdateableFlag() == AttributeDef.UPDATEABLE ||
                 attrs[i].getUpdateableFlag() ==
                 AttributeDef.UPDATEABLE_WHILE_NEW) &&
                currentRow.getAttribute(attrName) != null) {

                try {
                    newRow.setAttribute(attrName,
                                        currentRow.getAttribute(attrName));
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }

    } // duplicate row

    public Row duplicateRow(ViewObjectImpl vo, Row currentRow) {
        Row row = vo.createRow();
        AttributeDef[] attrs = vo.getAttributeDefs();

        for (int i = 0; i < attrs.length; i++) {
            if (!attrs[i].isPrimaryKey() &&
                attrs[i].getAttributeKind() != AttributeDef.ATTR_ASSOCIATED_ROW &&
                attrs[i].getAttributeKind() !=
                AttributeDef.ATTR_ASSOCIATED_ROWITERATOR &&
                (attrs[i].getUpdateableFlag() == AttributeDef.UPDATEABLE ||
                 attrs[i].getUpdateableFlag() ==
                 AttributeDef.UPDATEABLE_WHILE_NEW)) {
                String attrName = attrs[i].getName();
                try {
                    row.setAttribute(attrName,
                                     currentRow.getAttribute(attrName));
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }

        return row;
    } // duplicate row

    private String getNewCatalogNumber(String catSuffix) {

        String alphabates = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabates1 = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        if (catSuffix == null || catSuffix.trim().length() == 0)
            return null;

        String lastChar = catSuffix.substring(catSuffix.length() - 1);

        String newChar = "";
        if (alphabates.indexOf(lastChar) != -1) {
            newChar =
                    alphabates.substring(alphabates.indexOf(lastChar) + 1, alphabates.indexOf(lastChar) +
                                         2);
        } else if (alphabates1.indexOf(lastChar) != -1) {
            newChar =
                    alphabates1.substring(alphabates1.indexOf(lastChar) + 1, alphabates1.indexOf(lastChar) +
                                          2);
        } else if (numbers.indexOf(lastChar) != -1) {
            try {
                newChar =
                        numbers.substring(numbers.indexOf(lastChar) + 1, numbers.indexOf(lastChar) +
                                          2);
            } catch (Exception eee) {
                throw new JboException("Catalog number suffix last charecter exceeds 9");
            }
        }

        catSuffix = catSuffix.substring(0, catSuffix.length() - 1) + newChar;

        return catSuffix;
    }

    private void SetNlsComp() {
        try {
            getDBTransaction().executeCommand("ALTER SESSION SET NLS_COMP=LINGUISTIC");
            getDBTransaction().executeCommand("ALTER SESSION SET NLS_SORT=generic_m_ai");

        } catch (Exception e) {
            System.out.println("ERROR IN APP MODULE :TRACSSERVICE");
            e.printStackTrace();
        }

    }

    private void UnSetNlsComp() {
        try {
            getDBTransaction().executeCommand("ALTER SESSION SET NLS_COMP=BINARY");
            getDBTransaction().executeCommand("ALTER SESSION SET NLS_SORT=BINARY");

        } catch (Exception e) {
            System.out.println("ERROR IN APP MODULE :TRACSSERVICE");
            e.printStackTrace();
        }

    }

    public void advancedSearch(String viewObjectUsage, ArrayList arguments,
                               Boolean allConditionsMet) {
        if (arguments.size() > 0 &&
            arguments.get(0).getClass().toString().contains("Boolean")) {
            arguments.remove(0);
            SetNlsComp();
        } else {
            UnSetNlsComp();
        }
        super.advancedSearch(viewObjectUsage, arguments, allConditionsMet);

    }

    /**Container's getter for DeliveryRightTemplateROView1
     */
    public ViewObjectImpl getDeliveryRightTemplateROView1() {
        return (ViewObjectImpl)findViewObject("DeliveryRightTemplateROView1");
    }


    /**Container's getter for RestrictionTemplateROView2
     */
    public ViewObjectImpl getRestrictionTemplateROView2() {
        return (ViewObjectImpl)findViewObject("RestrictionTemplateROView2");
    }


    /**Container's getter for ContractRightTemplateROView1
     */
    public ViewObjectImpl getContractRightTemplateROView1() {
        return (ViewObjectImpl)findViewObject("ContractRightTemplateROView1");
    }

    /**Container's getter for ContractTemplateROView1
     */
    public ViewObjectImpl getContractTemplateROView1() {
        return (ViewObjectImpl)findViewObject("ContractTemplateROView1");
    }


    /**Container's getter for NoteTypeLookup
     */
    public LookupCodeLookupImpl getNoteTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("NoteTypeLookup");
    }

    /**Container's getter for VaultNameLookup1
     */
    public LookupCodeLookupImpl getVaultNameLookup1() {
        return (LookupCodeLookupImpl)findViewObject("VaultNameLookup1");
    }

    /**Container's getter for EfeedFormatLookup1
     */
    public LookupCodeLookupImpl getEfeedFormatLookup1() {
        return (LookupCodeLookupImpl)findViewObject("EfeedFormatLookup1");
    }


    /**Container's getter for ScheduleFrequencySourceLookup
     */
    public LookupCodeLookupImpl getScheduleFrequencySourceLookup() {
        return (LookupCodeLookupImpl)findViewObject("ScheduleFrequencySourceLookup");
    }

    /**Container's getter for ScheduleFrequencyTypeLookup
     */
    public LookupCodeLookupImpl getScheduleFrequencyTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("ScheduleFrequencyTypeLookup");
    }


    /**Container's getter for ScheduleRegularityLookup
     */
    public LookupCodeLookupImpl getScheduleRegularityLookup() {
        return (LookupCodeLookupImpl)findViewObject("ScheduleRegularityLookup");
    }


    /**Container's getter for RoyaltyRateExceptionView1
     */
    public RoyaltyRateExceptionViewImpl getRoyaltyRateExceptionView1() {
        return (RoyaltyRateExceptionViewImpl)findViewObject("RoyaltyRateExceptionView1");
    }

    /**Container's getter for ContractRoyaltyRateTitleView1
     */
    public ContractRoyaltyRateTitleViewImpl getContractRoyaltyRateTitleView1() {
        return (ContractRoyaltyRateTitleViewImpl)findViewObject("ContractRoyaltyRateTitleView1");
    }

    /**Container's getter for RoyaltyRateRoyaltyRateExceptionViewLink1
     */
    public ViewLinkImpl getRoyaltyRateRoyaltyRateExceptionViewLink1() {
        return (ViewLinkImpl)findViewLink("RoyaltyRateRoyaltyRateExceptionViewLink1");
    }

    /**Container's getter for ContractRoyaltyRateTitleViewLink1
     */
    public ViewLinkImpl getContractRoyaltyRateTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractRoyaltyRateTitleViewLink1");
    }

    /**Container's getter for PublisherView1
     */
    public ViewObjectImpl getPublisherView1() {
        return (ViewObjectImpl)findViewObject("PublisherView1");
    }

    /**Container's getter for PublisherAddressView1
     */
    public ViewObjectImpl getPublisherAddressView1() {
        return (ViewObjectImpl)findViewObject("PublisherAddressView1");
    }

    /**Container's getter for PublisherToPublisherAddressViewLink1
     */
    public ViewLinkImpl getPublisherToPublisherAddressViewLink1() {
        return (ViewLinkImpl)findViewLink("PublisherToPublisherAddressViewLink1");
    }

    /**Container's getter for OvrPublisherView1
     */
    public ViewObjectImpl getOvrPublisherView1() {
        return (ViewObjectImpl)findViewObject("OvrPublisherView1");
    }

    /**Container's getter for TitleRecordToOvrPublisherViewLink1
     */
    public ViewLinkImpl getTitleRecordToOvrPublisherViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleRecordToOvrPublisherViewLink1");
    }

    /**Container's getter for OvrPublisherROView1
     */
    public ViewObjectImpl getOvrPublisherROView1() {
        return (ViewObjectImpl)findViewObject("OvrPublisherROView1");
    }

    /**Container's getter for PublisherToOvrPubliserROViewLink1
     */
    public ViewLinkImpl getPublisherToOvrPubliserROViewLink1() {
        return (ViewLinkImpl)findViewLink("PublisherToOvrPubliserROViewLink1");
    }

    /**Container's getter for PublisherROView1
     */
    public ViewObjectImpl getPublisherROView1() {
        return (ViewObjectImpl)findViewObject("PublisherROView1");
    }

    /**Container's getter for PublisherAddressView2
     */
    public ViewObjectImpl getPublisherAddressView2() {
        return (ViewObjectImpl)findViewObject("PublisherAddressView2");
    }

    /**Container's getter for OvrPublisherToPublisherAddressViewLink1
     */
    public ViewLinkImpl getOvrPublisherToPublisherAddressViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrPublisherToPublisherAddressViewLink1");
    }

    /**Container's getter for PublisherAddressView3
     */
    public ViewObjectImpl getPublisherAddressView3() {
        return (ViewObjectImpl)findViewObject("PublisherAddressView3");
    }


    /**Container's getter for TraxRightTemplateView1
     */
    public TraxRightTemplateViewImpl getTraxRightTemplateView1() {
        return (TraxRightTemplateViewImpl)findViewObject("TraxRightTemplateView1");
    }

    /**Container's getter for DeliveryRightTemplateView1
     */
    public ViewObjectImpl getDeliveryRightTemplateView1() {
        return (ViewObjectImpl)findViewObject("DeliveryRightTemplateView1");
    }


    /**Container's getter for RestrictionTemplateView
     */
    public ViewObjectImpl getRestrictionTemplateView() {
        return (ViewObjectImpl)findViewObject("RestrictionTemplateView");
    }

    /**Container's getter for PublisherUrlView1
     */
    public PublisherUrlViewImpl getPublisherUrlView1() {
        return (PublisherUrlViewImpl)findViewObject("PublisherUrlView1");
    }

    /**Container's getter for OpenAccessLookup
     */
    public LookupCodeLookupImpl getOpenAccessLookup() {
        return (LookupCodeLookupImpl)findViewObject("OpenAccessLookup");
    }

    /**Container's getter for IntegrationQueueROView1
     */
    public ViewObjectImpl getIntegrationQueueROView1() {
        return (ViewObjectImpl)findViewObject("IntegrationQueueROView1");
    }

    /**Container's getter for IntegrationMessageROView1
     */
    public ViewObjectImpl getIntegrationMessageROView1() {
        return (ViewObjectImpl)findViewObject("IntegrationMessageROView1");
    }

    /**Container's getter for TitleRecordToIntegrationQueueViewLink1
     */
    public ViewLinkImpl getTitleRecordToIntegrationQueueViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleRecordToIntegrationQueueViewLink1");
    }

    /**Container's getter for TraxIntegrationMessagesFkLink1
     */
    public ViewLinkImpl getTraxIntegrationMessagesFkLink1() {
        return (ViewLinkImpl)findViewLink("TraxIntegrationMessagesFkLink1");
    }

    /**Container's getter for OvrByTitleLov1
     */
    public ViewObjectImpl getOvrByTitleLov1() {
        return (ViewObjectImpl)findViewObject("OvrByTitleLov1");
    }

    /**
     * Container's getter for TraxUlrichsTitleView1.
     * @return TraxUlrichsTitleView1
     */
    public ViewObjectImpl getTraxUlrichsTitleView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsTitleView1");
    }

    /**
     * Container's getter for TraxUlrichsAbstractIndexView1.
     * @return TraxUlrichsAbstractIndexView1
     */
    public ViewObjectImpl getTraxUlrichsAbstractIndexView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsAbstractIndexView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsAbstractIndexViewLink1.
     * @return UlrichsTitleToUlrichsAbstractIndexViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsAbstractIndexViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsAbstractIndexViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsClassificationView1.
     * @return TraxUlrichsClassificationView1
     */
    public ViewObjectImpl getTraxUlrichsClassificationView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsClassificationView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsClassificationViewLink1.
     * @return UlrichsTitleToUlrichsClassificationViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsClassificationViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsClassificationViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsEditorView1.
     * @return TraxUlrichsEditorView1
     */
    public ViewObjectImpl getTraxUlrichsEditorView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsEditorView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsEditorViewLink1.
     * @return UlrichsTitleToUlrichsEditorViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsEditorViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsEditorViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsLanguageView1.
     * @return TraxUlrichsLanguageView1
     */
    public ViewObjectImpl getTraxUlrichsLanguageView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsLanguageView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsLanguageViewLink1.
     * @return UlrichsTitleToUlrichsLanguageViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsLanguageViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsLanguageViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsOnlineVendorView1.
     * @return TraxUlrichsOnlineVendorView1
     */
    public ViewObjectImpl getTraxUlrichsOnlineVendorView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsOnlineVendorView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsOnlineVendorViewLink1.
     * @return UlrichsTitleToUlrichsOnlineVendorViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsOnlineVendorViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsOnlineVendorViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsPublisherView1.
     * @return TraxUlrichsPublisherView1
     */
    public ViewObjectImpl getTraxUlrichsPublisherView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsPublisherView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsPublisherViewLink1.
     * @return UlrichsTitleToUlrichsPublisherViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsPublisherViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsPublisherViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsSubjectView1.
     * @return TraxUlrichsSubjectView1
     */
    public ViewObjectImpl getTraxUlrichsSubjectView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsSubjectView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsTitleSubjectViewLink1.
     * @return UlrichsTitleToUlrichsTitleSubjectViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsTitleSubjectViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsTitleSubjectViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsVariantTitleView1.
     * @return TraxUlrichsVariantTitleView1
     */
    public ViewObjectImpl getTraxUlrichsVariantTitleView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsVariantTitleView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsAlternateTitleViewLink1.
     * @return UlrichsTitleToUlrichsAlternateTitleViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsAlternateTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsAlternateTitleViewLink1");
    }


    /**
     * Container's getter for TraxUlrichsWireServiceView1.
     * @return TraxUlrichsWireServiceView1
     */
    public ViewObjectImpl getTraxUlrichsWireServiceView1() {
        return (ViewObjectImpl)findViewObject("TraxUlrichsWireServiceView1");
    }

    /**
     * Container's getter for UlrichsTitleToUlrichsWireServiceViewLink1.
     * @return UlrichsTitleToUlrichsWireServiceViewLink1
     */
    public ViewLinkImpl getUlrichsTitleToUlrichsWireServiceViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsTitleToUlrichsWireServiceViewLink1");
    }

    /**
     * Container's getter for UnifiedTitleSearchView1.
     * @return UnifiedTitleSearchView1
     */
    public ViewObjectImpl getUnifiedTitleSearchView1() {
        return (ViewObjectImpl)findViewObject("UnifiedTitleSearchView1");
    }

    /**
     * Container's getter for TraxTitleActivityView1.
     * @return TraxTitleActivityView1
     */
    public ViewObjectImpl getTraxTitleActivityView1() {
        return (ViewObjectImpl)findViewObject("TraxTitleActivityView1");
    }

    /**
     * Container's getter for TitleToTitleActivityViewLink1.
     * @return TitleToTitleActivityViewLink1
     */
    public ViewLinkImpl getTitleToTitleActivityViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTitleActivityViewLink1");
    }

    /**
     * Container's getter for TraxContentOwnerActivityView1.
     * @return TraxContentOwnerActivityView1
     */
    public ViewObjectImpl getTraxContentOwnerActivityView1() {
        return (ViewObjectImpl)findViewObject("TraxContentOwnerActivityView1");
    }

    /**
     * Container's getter for ContentOwnerToContentOwnerActivityViewLink1.
     * @return ContentOwnerToContentOwnerActivityViewLink1
     */
    public ViewLinkImpl getContentOwnerToContentOwnerActivityViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToContentOwnerActivityViewLink1");
    }

    /**
     * Container's getter for TraxContractActivityView1.
     * @return TraxContractActivityView1
     */
    public ViewObjectImpl getTraxContractActivityView1() {
        return (ViewObjectImpl)findViewObject("TraxContractActivityView1");
    }

    /**
     * Container's getter for ContractToContractActivityViewLink1.
     * @return ContractToContractActivityViewLink1
     */
    public ViewLinkImpl getContractToContractActivityViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractToContractActivityViewLink1");
    }

    /**
     * Container's getter for TraxActivityContentOwnerView1.
     * @return TraxActivityContentOwnerView1
     */
    public ViewObjectImpl getTraxActivityContentOwnerView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityContentOwnerView1");
    }

    /**
     * Container's getter for ActivityToActivityContentOwnerViewLink1.
     * @return ActivityToActivityContentOwnerViewLink1
     */
    public ViewLinkImpl getActivityToActivityContentOwnerViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToActivityContentOwnerViewLink1");
    }

    /**
     * Container's getter for TraxActivityContractView1.
     * @return TraxActivityContractView1
     */
    public ViewObjectImpl getTraxActivityContractView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityContractView1");
    }

    /**
     * Container's getter for ActivityToActivityContractViewLink1.
     * @return ActivityToActivityContractViewLink1
     */
    public ViewLinkImpl getActivityToActivityContractViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToActivityContractViewLink1");
    }

    /**
     * Container's getter for TraxActivityOpportunityView1.
     * @return TraxActivityOpportunityView1
     */
    public ViewObjectImpl getTraxActivityOpportunityView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityOpportunityView1");
    }

    /**
     * Container's getter for ActivityToActivityOpportunityViewLink1.
     * @return ActivityToActivityOpportunityViewLink1
     */
    public ViewLinkImpl getActivityToActivityOpportunityViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToActivityOpportunityViewLink1");
    }

    /**
     * Container's getter for TraxActivityTitleView1.
     * @return TraxActivityTitleView1
     */
    public ViewObjectImpl getTraxActivityTitleView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityTitleView1");
    }

    /**
     * Container's getter for ActivityToActivityTitleViewLink1.
     * @return ActivityToActivityTitleViewLink1
     */
    public ViewLinkImpl getActivityToActivityTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToActivityTitleViewLink1");
    }

    /**
     * Container's getter for TraxActivityUserView1.
     * @return TraxActivityUserView1
     */
    public ViewObjectImpl getTraxActivityUserView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityUserView1");
    }

    /**
     * Container's getter for ActivityToActivityUserViewLink1.
     * @return ActivityToActivityUserViewLink1
     */
    public ViewLinkImpl getActivityToActivityUserViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToActivityUserViewLink1");
    }

    /**
     * Container's getter for DashboardUserView1.
     * @return DashboardUserView1
     */
    public ViewObjectImpl getDashboardUserView1() {
        return (ViewObjectImpl)findViewObject("DashboardUserView1");
    }


    /**
     * Container's getter for ActivityDashboardView1.
     * @return ActivityDashboardView1
     */
    public ViewObjectImpl getActivityDashboardView1() {
        return (ViewObjectImpl)findViewObject("ActivityDashboardView1");
    }

    /**
     * Container's getter for DashboardToActivityDashboardViewLink1.
     * @return DashboardToActivityDashboardViewLink1
     */
    public ViewLinkImpl getDashboardToActivityDashboardViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardToActivityDashboardViewLink1");
    }

    /**
     * Container's getter for PrmOpportunityView1.
     * @return PrmOpportunityView1
     */
    public ViewObjectImpl getPrmOpportunityView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityView1");
    }

    /**
     * Container's getter for PrmOpportunityAgreementDataView1.
     * @return PrmOpportunityAgreementDataView1
     */
    public PrmOpportunityAgreementDataViewImpl getPrmOpportunityAgreementDataView1() {
        return (PrmOpportunityAgreementDataViewImpl)findViewObject("PrmOpportunityAgreementDataView1");
    }

    /**
     * Container's getter for OpportunityToAgreementDataViewLink1.
     * @return OpportunityToAgreementDataViewLink1
     */
    public ViewLinkImpl getOpportunityToAgreementDataViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToAgreementDataViewLink1");
    }

    /**
     * Container's getter for PrmOpportunityContractView1.
     * @return PrmOpportunityContractView1
     */
    public ViewObjectImpl getPrmOpportunityContractView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityContractView1");
    }

    /**
     * Container's getter for OpportunityToOpportunityContractViewLink1.
     * @return OpportunityToOpportunityContractViewLink1
     */
    public ViewLinkImpl getOpportunityToOpportunityContractViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityContractViewLink1");
    }

    /**
     * Container's getter for PrmOpportunityTargetView1.
     * @return PrmOpportunityTargetView1
     */
    public ViewObjectImpl getPrmOpportunityTargetView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityTargetView1");
    }

    /**
     * Container's getter for OpportunityToOpportunityTargetViewLink1.
     * @return OpportunityToOpportunityTargetViewLink1
     */
    public ViewLinkImpl getOpportunityToOpportunityTargetViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityTargetViewLink1");
    }


    public void createTargetFromUlrichs() {
        try {

            TraxUlrichsTitleViewImpl ulrichsTitles =
                (TraxUlrichsTitleViewImpl)this.getTraxUlrichsTitleView1();
            TraxUlrichsTitleViewRowImpl ulrichsTitle =
                (TraxUlrichsTitleViewRowImpl)ulrichsTitles.getCurrentRow();

            Number ulrichsTitleId = ulrichsTitle.getId();
            Integer UlrichsTitleIdInt = new Integer(ulrichsTitleId.toString());

            String uName = this.getUsername();

            DatabaseProcedure createTargetFromUlrichsProc =
                DatabaseProcedure.define("procedure pk_prm_ulrichs_methods.create_target_from_ulrichs" +
                                         "( p_ulrichs_title_id in number, p_username varchar2)");
            DatabaseProcedure.Result result =
                createTargetFromUlrichsProc.call(this.getDBTransaction(),
                                                 UlrichsTitleIdInt, uName);

            this.getDBTransaction().commit();
            //this.getTraxUlrichsTitleView1().executeQuery();
            this.getTraxUlrichsTitleRelationView1().executeQuery();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("New target created."));
        } catch (Exception ex) {
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getMessage()));
        }
    } // createTargetFromUlrichs

    /**
     * @param pFileId
     */
    public void validateImportData(Number pFileId) {
        try {
            Integer importFileIdInt = new Integer(pFileId.toString());

            //this.getNlsParams();
            
            String uName = this.getUsername();

            DatabaseProcedure validateImportDataProc =
                DatabaseProcedure.define("procedure pk_trax_import_valid_methods.validate_import_data" +
                                         "( p_file_id in number, p_username varchar2)");

            DatabaseProcedure.Result result1 =
                validateImportDataProc.call(this.getDBTransaction(),
                                            importFileIdInt, uName);

            DatabaseProcedure matchImportDataProc =
                DatabaseProcedure.define("procedure pk_trax_import_matching.find_potential_matches" +
                                         "( p_file_id in number, p_username varchar2)");

            DatabaseProcedure.Result result2 =
                matchImportDataProc.call(this.getDBTransaction(),
                                         importFileIdInt, uName);

            this.getDBTransaction().commit();

            this.getTraxImportFileView1().executeQuery();

            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("Import data validated."));
        } catch (Exception ex) {
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getMessage()));
        }
    } // validateImportData

    public void saveImportData(Number pFileId) {

        try {
            Integer fileIdInt = new Integer(pFileId.toString());

            String uName = this.getUsername();

            DatabaseProcedure saveImportDataProc =
                DatabaseProcedure.define("procedure pk_trax_import_methods.save_import_data" +
                                         "( p_file_id in number, p_username varchar2 )");

            DatabaseProcedure.Result result =
                saveImportDataProc.call(this.getDBTransaction(), fileIdInt,
                                        uName);

            this.getDBTransaction().commit();

            this.getTraxImportFileView1().executeQuery();

            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("Import Completed."));
        } catch (Exception ex) {
            ex.printStackTrace();
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getCause().getMessage()));
        }
    } // saveImportData

    public void forwardToApex() {
        /*
      Following is the process to call Apex reports without logging in to the Apex application.

      On click of "Reports" in PRM application:
      " Call PL/SQL function "Generate_token" with username as parameter
      " Function returns the token
      " Build the following URL
      o http://dtgoas301v.aa1.pqe:7777/pls/apex/f?p=103:1:: BRANCH_TO_PAGE_ACCEPT:::P101_USERNAME,P101_TOKEN:<username>,<token>
      " Forward to the URL
    */

        String uName = this.getUsername();

        DatabaseProcedure helloWorldProc =
            DatabaseProcedure.define("function generate_token(p_username in varchar2) return varchar2");
        String token =
            (String)helloWorldProc.call(this.getDBTransaction(), uName).getReturnValue();

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();

        String url = ectx.getInitParameter("APEX_URL");
        url = url.concat(uName).concat(",").concat(token);

        // Open the APEX site in a separate browser window
        ExtendedRenderKitService erks =
            Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        StringBuilder script = new StringBuilder();
        script.append("window.open('" + url + "', '', '');");
        erks.addScript(FacesContext.getCurrentInstance(), script.toString());

    } // forwardToApex

    public void createContractFromOpp(Number pAgreementId) {

        try {
            Integer agreementIdInt = new Integer(pAgreementId.toString());

            String uName = this.getUsername();

            DatabaseProcedure createContractFromOppProc =
                DatabaseProcedure.define("procedure pk_trax_contract_methods.create_contract_from_opp" +
                                         "( p_agreement_id in number, p_username varchar2)");

            DatabaseProcedure.Result result =
                createContractFromOppProc.call(this.getDBTransaction(),
                                               agreementIdInt, uName);

            this.getDBTransaction().commit();
            this.getPrmOpportunityAgreementDataView1().executeQuery();

            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage("Contract created successfully."));
        } catch (Exception ex) {
            ex.printStackTrace();
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getMessage()));
        }
    } // createContractFromOpp

    public void addTitlesToContract(Number pContractId, Number pOppId) {
        String statusMessage = null;

        try {
            Integer contractIdInt = new Integer(pContractId.toString());
            Integer oppIdInt = new Integer(pOppId.toString());

            String uName = this.getUsername();

            DatabaseProcedure createContractFromOppProc =
                DatabaseProcedure.define("procedure pk_trax_contract_methods.add_opp_titles_to_contract" +
                                         "( p_contract_id in number, p_opp_id in number, p_username varchar2)");

            DatabaseProcedure.Result result =
                createContractFromOppProc.call(this.getDBTransaction(),
                                               contractIdInt, oppIdInt, uName);

            statusMessage = "Titles attached to contract.";
            this.getDBTransaction().commit();

            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(statusMessage));
        } catch (Exception ex) {
            ex.printStackTrace();
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getMessage()));
        }
    } // attachTitlesToContract


    private String attachTitlesToRRG(Number pContractId, String rrg) {
        String statusMessage = null;

        //try {
        Integer contractIdInt = new Integer(pContractId.toString());

        String uName = this.getUsername();

        DatabaseProcedure createContractFromOppProc =
            DatabaseProcedure.define("procedure pk_trax_contract_methods.attach_titles_to_" + rrg +
                                     "(p_contract_id in number, p_username varchar2, p_status_code out number, p_status_message out varchar2)");

        DatabaseProcedure.Result result =
            createContractFromOppProc.call(this.getDBTransaction(),
                                           contractIdInt, uName);

        statusMessage = (String)result.getOutputValue("p_status_message");
        BigDecimal statusCode =
            (BigDecimal)result.getOutputValue("p_status_code");

        if (statusCode.compareTo(new BigDecimal(0)) == 0) {
            statusMessage = "Titles attached to " + rrg + ".";

        }

        return statusMessage;
    } // attachTitlesToRRG

    public String attachTitlesToRights(Number pContractId) {
        return this.attachTitlesToRRG(pContractId, "rights");
    } // attachTitlesToRights

    public String attachTitlesToRates(Number pContractId) {
        return this.attachTitlesToRRG(pContractId, "rates");
    } // attachTitlesToRates

    public String attachTitlesToGuarantees(Number pContractId) {
        return this.attachTitlesToRRG(pContractId, "guarantees");
    } // attachTitlesToGuarantees

    public void copyRights(RowIterator currentChildRows,
                             RowIterator newChildRows, String fKey) {
        currentChildRows.reset();

        while (currentChildRows.hasNext()) {
            ContractRightViewRowImpl currentChildRow = (ContractRightViewRowImpl)currentChildRows.next();
            ContractRightViewRowImpl newChildRow = (ContractRightViewRowImpl)newChildRows.createRow();
            duplicateRow(newChildRow, currentChildRow,
                         currentChildRow.getViewObject().getAttributeDefs(),
                         fKey);
            newChildRows.insertRow(newChildRow);
            
            this.copyChildren(currentChildRow.getContractRightCategoryView(), newChildRow.getContractRightCategoryView(), "ContractRightId");
        }

    }

    public void copyRoyalties(RowIterator currentChildRows,
                             RowIterator newChildRows, String fKey) {
        currentChildRows.reset();

        while (currentChildRows.hasNext()) {
            RoyaltyRateViewRowImpl currentChildRow = (RoyaltyRateViewRowImpl)currentChildRows.next();
            RoyaltyRateViewRowImpl newChildRow = (RoyaltyRateViewRowImpl)newChildRows.createRow();
            duplicateRow(newChildRow, currentChildRow,
                         currentChildRow.getViewObject().getAttributeDefs(),
                         fKey);
            newChildRows.insertRow(newChildRow);
            
            this.copyChildren(currentChildRow.getRoyaltyRateExceptionView(), newChildRow.getRoyaltyRateExceptionView(), "RoyaltyRateId");
        }

    }

    public ContractViewRowImpl copyContract() {
        ContractViewRowImpl newContractRow;
        try {

            ViewObjectImpl contracts = this.getContractView2();
            ContractViewRowImpl currentContract =
                (ContractViewRowImpl)contracts.getCurrentRow();

            AttributeDef[] attrs = contracts.getAttributeDefs();
            newContractRow = (ContractViewRowImpl)contracts.createRow();
            newContractRow.setWarrantyAndIndemnification(currentContract.getWarrantyAndIndemnification());
            newContractRow.setGovernance(currentContract.getGovernance());
            newContractRow.setAssignment(currentContract.getAssignment());
            this.duplicateRow(newContractRow, currentContract, attrs, null);

            contracts.setCurrentRow(newContractRow);
            
            // copy child records of contract

            this.copyRights(currentContract.getContractRightView(),
                              newContractRow.getContractRightView(), "ContractId");
            this.copyChildren(currentContract.getContractNoteView(),
                              newContractRow.getContractNoteView(), "ContractId");
            this.copyChildren(currentContract.getRoyaltyInformationView(),
                              newContractRow.getRoyaltyInformationView(), "ContractId");
            this.copyRoyalties(currentContract.getRoyaltyRateView(),
                              newContractRow.getRoyaltyRateView(),
                              "ContractId");

            FacesContext fctx = FacesContext.getCurrentInstance();
            fctx.addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Contract copied successfully.",
                                             "Contract copied successfully."));
        } catch (Exception ex) {
            System.out.println("Failed copy contract :" + ex.getMessage());
            ex.printStackTrace();
            throw new JboException(ex.toString());
        } finally {
        }
        return newContractRow;
    }

    public String getUsername() {
        try {
            Object user = this.getUser();
            JhsUserContext userContext = (JhsUserContext)user;
            return userContext.getUserId();
        } catch (Exception ex) {
            return "TRACS";
        }
    }


    /**
     * Container's getter for NewTargetedTitleView.
     * @return NewTargetedTitleView
     */
    public TitleViewImpl getNewTargetedTitleView() {
        return (TitleViewImpl)findViewObject("NewTargetedTitleView");
    }


    /**
     * Container's getter for TitleSubjectView3.
     * @return TitleSubjectView3
     */
    public TitleSubjectViewImpl getTitleSubjectView3() {
        return (TitleSubjectViewImpl)findViewObject("TitleSubjectView3");
    }

    /**
     * Container's getter for TitleSubjectViewLink2.
     * @return TitleSubjectViewLink2
     */
    public ViewLinkImpl getTitleSubjectViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleSubjectViewLink2");
    }


    /**
     * Container's getter for TraxContactMethodView1.
     * @return TraxContactMethodView1
     */
    public ViewObjectImpl getTraxContactMethodView1() {
        return (ViewObjectImpl)findViewObject("TraxContactMethodView1");
    }

    /**
     * Container's getter for ContactToContactMethodViewLink1.
     * @return ContactToContactMethodViewLink1
     */
    public ViewLinkImpl getContactToContactMethodViewLink1() {
        return (ViewLinkImpl)findViewLink("ContactToContactMethodViewLink1");
    }

    /**
     * Container's getter for PrmAccountContactMethodView1.
     * @return PrmAccountContactMethodView1
     */
    public ViewObjectImpl getPrmAccountContactMethodView1() {
        return (ViewObjectImpl)findViewObject("PrmAccountContactMethodView1");
    }

    /**
     * Container's getter for ContentOwnerToContactMethodViewLink1.
     * @return ContentOwnerToContactMethodViewLink1
     */
    public ViewLinkImpl getContentOwnerToContactMethodViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToContactMethodViewLink1");
    }

    /**
     * Container's getter for ContentOwnerContactView1.
     * @return ContentOwnerContactView1
     */
    public ContentOwnerContactViewImpl getContentOwnerContactView1() {
        return (ContentOwnerContactViewImpl)findViewObject("ContentOwnerContactView1");
    }

    /**
     * Container's getter for ContentOwnerToContactViewLink1.
     * @return ContentOwnerToContactViewLink1
     */
    public ViewLinkImpl getContentOwnerToContactViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToContactViewLink1");
    }

    /**
     * Container's getter for ContactContentOwnerView1.
     * @return ContactContentOwnerView1
     */
    public ViewObjectImpl getContactContentOwnerView1() {
        return (ViewObjectImpl)findViewObject("ContactContentOwnerView1");
    }

    /**
     * Container's getter for ContactToContentOwnerViewLink1.
     * @return ContactToContentOwnerViewLink1
     */
    public ViewLinkImpl getContactToContentOwnerViewLink1() {
        return (ViewLinkImpl)findViewLink("ContactToContentOwnerViewLink1");
    }


    /**
     * Container's getter for TraxActivityAttachmentView1.
     * @return TraxActivityAttachmentView1
     */
    public ViewObjectImpl getTraxActivityAttachmentView1() {
        return (ViewObjectImpl)findViewObject("TraxActivityAttachmentView1");
    }

    /**
     * Container's getter for ActivityToAttachmentViewLink1.
     * @return ActivityToAttachmentViewLink1
     */
    public ViewLinkImpl getActivityToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("ActivityToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxContentOwnerAttachmentView1.
     * @return TraxContentOwnerAttachmentView1
     */
    public ViewObjectImpl getTraxContentOwnerAttachmentView1() {
        return (ViewObjectImpl)findViewObject("TraxContentOwnerAttachmentView1");
    }

    /**
     * Container's getter for ContentOwnerToAttachmentViewLink1.
     * @return ContentOwnerToAttachmentViewLink1
     */
    public ViewLinkImpl getContentOwnerToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxTitleAttachmentView1.
     * @return TraxTitleAttachmentView1
     */
    public ViewObjectImpl getTraxTitleAttachmentView1() {
        return (ViewObjectImpl)findViewObject("TraxTitleAttachmentView1");
    }

    /**
     * Container's getter for TitleToAttachmentViewLink1.
     * @return TitleToAttachmentViewLink1
     */
    public ViewLinkImpl getTitleToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToAttachmentViewLink1");
    }

    /**
     * Container's getter for PrmAgreementDataAttachmentView1.
     * @return PrmAgreementDataAttachmentView1
     */
    public ViewObjectImpl getPrmAgreementDataAttachmentView1() {
        return (ViewObjectImpl)findViewObject("PrmAgreementDataAttachmentView1");
    }

    /**
     * Container's getter for AgreementDateToAttachmentViewLink1.
     * @return AgreementDateToAttachmentViewLink1
     */
    public ViewLinkImpl getAgreementDateToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("AgreementDateToAttachmentViewLink1");
    }

    /**
     * Container's getter for PrmOpportunityAttachmentView1.
     * @return PrmOpportunityAttachmentView1
     */
    public ViewObjectImpl getPrmOpportunityAttachmentView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityAttachmentView1");
    }

    /**
     * Container's getter for OpportunityToAttachmentViewLink1.
     * @return OpportunityToAttachmentViewLink1
     */
    public ViewLinkImpl getOpportunityToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxEventView1.
     * @return TraxEventView1
     */
    public ViewObjectImpl getTraxEventView1() {
        return (ViewObjectImpl)findViewObject("TraxEventView1");
    }

    /**
     * Container's getter for TraxEventActivityView1.
     * @return TraxEventActivityView1
     */
    public ViewObjectImpl getTraxEventActivityView1() {
        return (ViewObjectImpl)findViewObject("TraxEventActivityView1");
    }

    /**
     * Container's getter for EventToEventActivityViewLink1.
     * @return EventToEventActivityViewLink1
     */
    public ViewLinkImpl getEventToEventActivityViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventActivityViewLink1");
    }

    /**
     * Container's getter for TraxEventAttachmentView1.
     * @return TraxEventAttachmentView1
     */
    public ViewObjectImpl getTraxEventAttachmentView1() {
        return (ViewObjectImpl)findViewObject("TraxEventAttachmentView1");
    }

    /**
     * Container's getter for EventToEventAttachmentViewLink1.
     * @return EventToEventAttachmentViewLink1
     */
    public ViewLinkImpl getEventToEventAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxEventContentOwnerView1.
     * @return TraxEventContentOwnerView1
     */
    public ViewObjectImpl getTraxEventContentOwnerView1() {
        return (ViewObjectImpl)findViewObject("TraxEventContentOwnerView1");
    }

    /**
     * Container's getter for EventToEventContentOwnerViewLink1.
     * @return EventToEventContentOwnerViewLink1
     */
    public ViewLinkImpl getEventToEventContentOwnerViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventContentOwnerViewLink1");
    }

    /**
     * Container's getter for TraxEventContractView1.
     * @return TraxEventContractView1
     */
    public ViewObjectImpl getTraxEventContractView1() {
        return (ViewObjectImpl)findViewObject("TraxEventContractView1");
    }

    /**
     * Container's getter for EventToEventContractViewLink1.
     * @return EventToEventContractViewLink1
     */
    public ViewLinkImpl getEventToEventContractViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventContractViewLink1");
    }

    /**
     * Container's getter for TraxEventNoteView1.
     * @return TraxEventNoteView1
     */
    public ViewObjectImpl getTraxEventNoteView1() {
        return (ViewObjectImpl)findViewObject("TraxEventNoteView1");
    }

    /**
     * Container's getter for EventToEventNoteViewLink1.
     * @return EventToEventNoteViewLink1
     */
    public ViewLinkImpl getEventToEventNoteViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventNoteViewLink1");
    }

    /**
     * Container's getter for TraxEventOpportunityView1.
     * @return TraxEventOpportunityView1
     */
    public ViewObjectImpl getTraxEventOpportunityView1() {
        return (ViewObjectImpl)findViewObject("TraxEventOpportunityView1");
    }

    /**
     * Container's getter for EventToEventOpportunityViewLink1.
     * @return EventToEventOpportunityViewLink1
     */
    public ViewLinkImpl getEventToEventOpportunityViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventOpportunityViewLink1");
    }

    /**
     * Container's getter for TraxEventTitleView1.
     * @return TraxEventTitleView1
     */
    public ViewObjectImpl getTraxEventTitleView1() {
        return (ViewObjectImpl)findViewObject("TraxEventTitleView1");
    }

    /**
     * Container's getter for EventToEventTitleViewLink1.
     * @return EventToEventTitleViewLink1
     */
    public ViewLinkImpl getEventToEventTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventTitleViewLink1");
    }

    /**
     * Container's getter for TraxEventUserView1.
     * @return TraxEventUserView1
     */
    public ViewObjectImpl getTraxEventUserView1() {
        return (ViewObjectImpl)findViewObject("TraxEventUserView1");
    }

    /**
     * Container's getter for EventToEventUserViewLink1.
     * @return EventToEventUserViewLink1
     */
    public ViewLinkImpl getEventToEventUserViewLink1() {
        return (ViewLinkImpl)findViewLink("EventToEventUserViewLink1");
    }


    /**
     * Container's getter for PrmOpportunityActivityView1.
     * @return PrmOpportunityActivityView1
     */
    public ViewObjectImpl getPrmOpportunityActivityView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityActivityView1");
    }

    /**
     * Container's getter for OpportunityToOpportunityActivityViewLink1.
     * @return OpportunityToOpportunityActivityViewLink1
     */
    public ViewLinkImpl getOpportunityToOpportunityActivityViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityActivityViewLink1");
    }

    // Custom method

    public void createTitleNote(Number titleId, String noteType,
                                ClobDomain noteText) {

        String entityName = "com.pq.tracs.model.bo.TitleNote";
        // 1. Find the entity definition for the TitleNote entity
        EntityDefImpl titleNoteDef = EntityDefImpl.findDefObject(entityName);
        // 2. Create a new instance of a TitleNote entity
        TitleNoteImpl newTitleNote =
            (TitleNoteImpl)titleNoteDef.createInstance2(getDBTransaction(),
                                                        null);

        // 3. Set attribute values
        newTitleNote.setTitleId(titleId);
        newTitleNote.setNoteType(noteType);
        newTitleNote.setNoteText(noteText);
        try {
            // 4. Commit the transaction
            getDBTransaction().commit();
        } catch (JboException ex) {
            getDBTransaction().rollback();
            throw ex;
        }
    }
    
    private void getNlsParams() {
        // this is a debug procedure, it should not be called in any production deployment
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt =
                    getDBTransaction().createPreparedStatement("select parameter, value from nls_Session_parameters", 1);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public Number getTitleIdByCatalog(String catalogNumber) {
        Number catalogId = null;

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt =
                    getDBTransaction().createPreparedStatement("select ID from trax_title where catalog_number = '" +
                                                               catalogNumber +
                                                               "'", 1);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                catalogId = new Number(rs.getInt(1));
            }
        } catch (Exception ex) {

            ex.printStackTrace();
            return null;
        } finally {

            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return catalogId;
    }

    public void reAssignChildCatalog(Number titleId, Number newCurrentId) {

        // 3. Set attribute values
        if (newCurrentId != null) {
            String entityName = "com.pq.tracs.model.bo.Title";
            // 1. Find the entity definition for the Product entity
            EntityDefImpl titleDef = EntityDefImpl.findDefObject(entityName);
            // 2. Create a new instance of a Product entity
            TitleImpl title =
                (TitleImpl)titleDef.findByPrimaryKey(getDBTransaction(),
                                                     new Key(new Object[] { titleId }));

            title.setCurrentCatalogId(newCurrentId);
            try {
                // 4. Commit the transaction
                getDBTransaction().commit();
            } catch (JboException ex) {
                getDBTransaction().rollback();
                throw ex;
            }
        }

    }

    /**
     * Container's getter for ContactLOV.
     * @return ContactLOV
     */
    public ContactViewImpl getContactLOV() {
        return (ContactViewImpl)findViewObject("ContactLOV");
    }

    /**
     * Container's getter for PrmTitleProductView1.
     * @return PrmTitleProductView1
     */
    public ViewObjectImpl getPrmTitleProductView1() {
        return (ViewObjectImpl)findViewObject("PrmTitleProductView1");
    }

    /**
     * Container's getter for TitleToTitleProductViewLink1.
     * @return TitleToTitleProductViewLink1
     */
    public ViewLinkImpl getTitleToTitleProductViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTitleProductViewLink1");
    }

    /**
     * Container's getter for PrmTitleTargetedProductView1.
     * @return PrmTitleTargetedProductView1
     */
    public ViewObjectImpl getPrmTitleTargetedProductView1() {
        return (ViewObjectImpl)findViewObject("PrmTitleTargetedProductView1");
    }

    /**
     * Container's getter for TitleToTitleTargetedProductViewLink1.
     * @return TitleToTitleTargetedProductViewLink1
     */
    public ViewLinkImpl getTitleToTitleTargetedProductViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTitleTargetedProductViewLink1");
    }

    public void switchTarget(Number pTitleId, Number pOppId,
                             String pTrackingNo, String pCatalogNo) {
        String statusMessage = null;

        try {
            Integer titleIdInt = new Integer(pTitleId.toString());
            Integer oppIdInt = new Integer(pOppId.toString());
            Integer trackingNoInt = new Integer(pTrackingNo);

            String uName = this.getUsername();

            DatabaseProcedure switchTargetProc =
                DatabaseProcedure.define("procedure pk_prm_targeting_methods.change_targeted_title" +
                                         "( p_opp_id in number, p_title_id in number, p_tracking_no in number, p_catalog_num in varchar2, " +
                                         "p_username in varchar2, p_status_code out number, p_status_message out varchar2)");

            DatabaseProcedure.Result result =
                switchTargetProc.call(this.getDBTransaction(), oppIdInt,
                                      titleIdInt, trackingNoInt, pCatalogNo,
                                      uName);

            statusMessage = (String)result.getOutputValue("p_status_message");
            BigDecimal statusCode =
                (BigDecimal)result.getOutputValue("p_status_code");

            if (statusCode.compareTo(new BigDecimal(0)) == 0) {
                statusMessage = "Targeted title switched.";
                this.getDBTransaction().commit();
                this.getContractRightView1().executeQuery();

            }

            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(statusMessage));
        } catch (Exception ex) {
            ex.printStackTrace();
            this.getDBTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null,
                                                         new FacesMessage(ex.getMessage()));
        }

    }

    public void updateCIR(Number titleId, String newCIR) {

        String entityName = "com.pq.tracs.model.bo.Title";
        // 1. Find the entity definition for the Product entity
        EntityDefImpl titleDef = EntityDefImpl.findDefObject(entityName);
        // 2. Create a new instance of a Product entity
        TitleImpl title =
            (TitleImpl)titleDef.findByPrimaryKey(getDBTransaction(),
                                                 new Key(new Object[] { titleId }));

        // 3. Set attribute values
        if (newCIR != null) {
            title.setCheckInRequirements(newCIR);
        }

        try {
            // 4. Commit the transaction
            getDBTransaction().commit();
        } catch (JboException ex) {
            getDBTransaction().rollback();
            throw ex;
        }

    }

    /**
     * Container's getter for TitleOpportunityView1.
     * @return TitleOpportunityView1
     */
    public ViewObjectImpl getTitleOpportunityView1() {
        return (ViewObjectImpl)findViewObject("TitleOpportunityView1");
    }

    /**
     * Container's getter for TitleToROTitleOpportunityViewLink1.
     * @return TitleToROTitleOpportunityViewLink1
     */
    public ViewLinkImpl getTitleToROTitleOpportunityViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToROTitleOpportunityViewLink1");
    }

    /**
     * Container's getter for PrmTitleTargetedProductView2.
     * @return PrmTitleTargetedProductView2
     */
    public ViewObjectImpl getPrmTitleTargetedProductView2() {
        return (ViewObjectImpl)findViewObject("PrmTitleTargetedProductView2");
    }

    /**
     * Container's getter for TitleToTitleTargetedProductViewLink2.
     * @return TitleToTitleTargetedProductViewLink2
     */
    public ViewLinkImpl getTitleToTitleTargetedProductViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToTitleTargetedProductViewLink2");
    }

    /**
     * Container's getter for TitleOpportunityView2.
     * @return TitleOpportunityView2
     */
    public ViewObjectImpl getTitleOpportunityView2() {
        return (ViewObjectImpl)findViewObject("TitleOpportunityView2");
    }

    /**
     * Container's getter for TitleToROTitleOpportunityViewLink2.
     * @return TitleToROTitleOpportunityViewLink2
     */
    public ViewLinkImpl getTitleToROTitleOpportunityViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToROTitleOpportunityViewLink2");
    }


    /**
     * Container's getter for PrmOpportunityProcessStatusView1.
     * @return PrmOpportunityProcessStatusView1
     */
    public ViewObjectImpl getPrmOpportunityProcessStatusView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityProcessStatusView1");
    }

    /**
     * Container's getter for OpportunityToProcessStatusViewLink1.
     * @return OpportunityToProcessStatusViewLink1
     */
    public ViewLinkImpl getOpportunityToProcessStatusViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToProcessStatusViewLink1");
    }

    /**
     * Container's getter for ProcessStatusTypeLookup.
     * @return ProcessStatusTypeLookup
     */
    public LookupCodeLookupImpl getProcessStatusTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("ProcessStatusTypeLookup");
    }

    /**
     * Container's getter for ProcessStatusCodeLookup.
     * @return ProcessStatusCodeLookup
     */
    public ViewObjectImpl getProcessStatusCodeLookup() {
        return (ViewObjectImpl)findViewObject("ProcessStatusCodeLookup");
    }

    /**
     * Container's getter for PreStatusCodeLookup.
     * @return PreStatusCodeLookup
     */
    public LookupCodeLookupImpl getPreStatusCodeLookup() {
        return (LookupCodeLookupImpl)findViewObject("PreStatusCodeLookup");
    }


    /**
     * Container's getter for OnHoldOpportunitiesDashboardView2.
     * @return OnHoldOpportunitiesDashboardView2
     */
    public ViewObjectImpl getOnHoldOpportunitiesDashboardView2() {
        return (ViewObjectImpl)findViewObject("OnHoldOpportunitiesDashboardView2");
    }

    /**
     * Container's getter for DashboardUserToOnHoldOpportunitiesViewLink1.
     * @return DashboardUserToOnHoldOpportunitiesViewLink1
     */
    public ViewLinkImpl getDashboardUserToOnHoldOpportunitiesViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToOnHoldOpportunitiesViewLink1");
    }

    /**
     * Container's getter for InProcessOpportunitiesDashboardView2.
     * @return InProcessOpportunitiesDashboardView2
     */
    public ViewObjectImpl getInProcessOpportunitiesDashboardView2() {
        return (ViewObjectImpl)findViewObject("InProcessOpportunitiesDashboardView2");
    }

    /**
     * Container's getter for DashboardUserToInProcessOpportunitiesViewLink1.
     * @return DashboardUserToInProcessOpportunitiesViewLink1
     */
    public ViewLinkImpl getDashboardUserToInProcessOpportunitiesViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToInProcessOpportunitiesViewLink1");
    }

    /**
     * Container's getter for RecentOpportunitiesDashboardView2.
     * @return RecentOpportunitiesDashboardView2
     */
    public ViewObjectImpl getRecentOpportunitiesDashboardView2() {
        return (ViewObjectImpl)findViewObject("RecentOpportunitiesDashboardView2");
    }

    /**
     * Container's getter for DashboardUserToRecentOpportunitiesViewLink1.
     * @return DashboardUserToRecentOpportunitiesViewLink1
     */
    public ViewLinkImpl getDashboardUserToRecentOpportunitiesViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToRecentOpportunitiesViewLink1");
    }

    public void deleteSelectedRows(Iterator selection, String viewForDelete) {
        ViewObjectImpl deleteView = null;

        deleteView = (ViewObjectImpl)this.findViewObject(viewForDelete);
        RowSetIterator rowSet = deleteView.getRowSetIterator();

        while (selection.hasNext()) {
            Key key = (Key)((List)selection.next()).get(0);
            Row row = rowSet.getRow(key);
            row.remove();
        }

        //committing the transaction
        this.getTransaction().commit();
        rowSet.closeRowSetIterator();
    }

    public void excludeAll() {

        ViewObjectImpl dtlView = null;
        dtlView =
                (ViewObjectImpl)this.findViewObject("TraxBlockingRuleDtlView2");
        TraxBlockingRuleDtlViewRowImpl r =
            (TraxBlockingRuleDtlViewRowImpl)dtlView.first();
        while (dtlView.hasNext()) {
            //getting the selected row index one by one
            r = (TraxBlockingRuleDtlViewRowImpl)dtlView.next();
            r.setAttribute("BlockedFlag", "Y");
        }

    }

    /**
     * Container's getter for TitleContentOwnerView2.
     * @return TitleContentOwnerView2
     */
    public TitleContentOwnerViewImpl getTitleContentOwnerView2() {
        return (TitleContentOwnerViewImpl)findViewObject("TitleContentOwnerView2");
    }

    /**
     * Container's getter for TitleContentOwnerTitleViewLink2.
     * @return TitleContentOwnerTitleViewLink2
     */
    public ViewLinkImpl getTitleContentOwnerTitleViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleContentOwnerTitleViewLink2");
    }

    /**
     * Container's getter for CADashboardUserView.
     * @return CADashboardUserView
     */
    public ViewObjectImpl getCADashboardUserView() {
        return (ViewObjectImpl)findViewObject("CADashboardUserView");
    }

    /**
     * Container's getter for ActivityDashboardView2.
     * @return ActivityDashboardView2
     */
    public ViewObjectImpl getActivityDashboardView2() {
        return (ViewObjectImpl)findViewObject("ActivityDashboardView2");
    }

    /**
     * Container's getter for DashboardToActivityDashboardViewLink2.
     * @return DashboardToActivityDashboardViewLink2
     */
    public ViewLinkImpl getDashboardToActivityDashboardViewLink2() {
        return (ViewLinkImpl)findViewLink("DashboardToActivityDashboardViewLink2");
    }


    /**
     * Container's getter for PrmOpportunityStatusView1.
     * @return PrmOpportunityStatusView1
     */
    public ViewObjectImpl getPrmOpportunityStatusView1() {
        return (ViewObjectImpl)findViewObject("PrmOpportunityStatusView1");
    }

    /**
     * Container's getter for OpportunityToOpportunityStatusViewLink1.
     * @return OpportunityToOpportunityStatusViewLink1
     */
    public ViewLinkImpl getOpportunityToOpportunityStatusViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityStatusViewLink1");
    }

    /**
     * Container's getter for InProcessOpportunitiesCADashboardView1.
     * @return InProcessOpportunitiesCADashboardView1
     */
    public ViewObjectImpl getInProcessOpportunitiesCADashboardView1() {
        return (ViewObjectImpl)findViewObject("InProcessOpportunitiesCADashboardView1");
    }

    /**
     * Container's getter for DashboardUserToInProcessOppCAViewLink1.
     * @return DashboardUserToInProcessOppCAViewLink1
     */
    public ViewLinkImpl getDashboardUserToInProcessOppCAViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToInProcessOppCAViewLink1");
    }

    /**
     * Container's getter for NewOpportunitiesCADashboardView1.
     * @return NewOpportunitiesCADashboardView1
     */
    public ViewObjectImpl getNewOpportunitiesCADashboardView1() {
        return (ViewObjectImpl)findViewObject("NewOpportunitiesCADashboardView1");
    }

    /**
     * Container's getter for DashboardUserToNewOppCAViewLink1.
     * @return DashboardUserToNewOppCAViewLink1
     */
    public ViewLinkImpl getDashboardUserToNewOppCAViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToNewOppCAViewLink1");
    }

    /**
     * Container's getter for OnHoldOpportunitiesCADashboardView1.
     * @return OnHoldOpportunitiesCADashboardView1
     */
    public ViewObjectImpl getOnHoldOpportunitiesCADashboardView1() {
        return (ViewObjectImpl)findViewObject("OnHoldOpportunitiesCADashboardView1");
    }

    /**
     * Container's getter for DashboardUserToOnHoldOppCAViewLink1.
     * @return DashboardUserToOnHoldOppCAViewLink1
     */
    public ViewLinkImpl getDashboardUserToOnHoldOppCAViewLink1() {
        return (ViewLinkImpl)findViewLink("DashboardUserToOnHoldOppCAViewLink1");
    }

    /**
     * Container's getter for TitleManufacturingView1.
     * @return TitleManufacturingView1
     */
    public ViewObjectImpl getTitleManufacturingView1() {
        return (ViewObjectImpl)findViewObject("TitleManufacturingView1");
    }

    /**
     * Container's getter for DeliveryRightView1.
     * @return DeliveryRightView1
     */
    public DeliveryRightViewImpl getDeliveryRightView1() {
        return (DeliveryRightViewImpl)findViewObject("DeliveryRightView1");
    }

    /**
     * Container's getter for TitleManufacturingToDelivieryRightsViewLink1.
     * @return TitleManufacturingToDelivieryRightsViewLink1
     */
    public ViewLinkImpl getTitleManufacturingToDelivieryRightsViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacturingToDelivieryRightsViewLink1");
    }

    /**
     * Container's getter for JTraxTitleContractRightView3.
     * @return JTraxTitleContractRightView3
     */
    public JTraxTitleContractRightViewImpl getJTraxTitleContractRightView3() {
        return (JTraxTitleContractRightViewImpl)findViewObject("JTraxTitleContractRightView3");
    }

    /**
     * Container's getter for TitleManufacturingToContractRightsViewLink1.
     * @return TitleManufacturingToContractRightsViewLink1
     */
    public ViewLinkImpl getTitleManufacturingToContractRightsViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacturingToContractRightsViewLink1");
    }


    /**
     * Container's getter for TitleContractView3.
     * @return TitleContractView3
     */
    public TitleContractViewImpl getTitleContractView3() {
        return (TitleContractViewImpl)findViewObject("TitleContractView3");
    }

    /**
     * Container's getter for TitleManufacturingToTitleContractViewLink1.
     * @return TitleManufacturingToTitleContractViewLink1
     */
    public ViewLinkImpl getTitleManufacturingToTitleContractViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacturingToTitleContractViewLink1");
    }

    /**
     * Container's getter for TraxTitleActivityView3.
     * @return TraxTitleActivityView3
     */
    public ViewObjectImpl getTraxTitleActivityView3() {
        return (ViewObjectImpl)findViewObject("TraxTitleActivityView3");
    }

    /**
     * Container's getter for TitleManufacturingToActivitiesViewLink1.
     * @return TitleManufacturingToActivitiesViewLink1
     */
    public ViewLinkImpl getTitleManufacturingToActivitiesViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacturingToActivitiesViewLink1");
    }


    /**
     * Container's getter for TitleNoteView2.
     * @return TitleNoteView2
     */
    public TitleNoteViewImpl getTitleNoteView2() {
        return (TitleNoteViewImpl)findViewObject("TitleNoteView2");
    }

    /**
     * Container's getter for TitleManufacturingToTitleNoteViewLink1.
     * @return TitleManufacturingToTitleNoteViewLink1
     */
    public ViewLinkImpl getTitleManufacturingToTitleNoteViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacturingToTitleNoteViewLink1");
    }

    /**
     * Container's getter for TitleOpportunityView3.
     * @return TitleOpportunityView3
     */
    public ViewObjectImpl getTitleOpportunityView3() {
        return (ViewObjectImpl)findViewObject("TitleOpportunityView3");
    }

    /**
     * Container's getter for TitleManufacuringToOpportunityViewLink1.
     * @return TitleManufacuringToOpportunityViewLink1
     */
    public ViewLinkImpl getTitleManufacuringToOpportunityViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleManufacuringToOpportunityViewLink1");
    }


    /**
     * Container's getter for TraxBlockingRuleHdrView1.
     * @return TraxBlockingRuleHdrView1
     */
    public ViewObjectImpl getTraxBlockingRuleHdrView1() {
        return (ViewObjectImpl)findViewObject("TraxBlockingRuleHdrView1");
    }


    /**
     * Container's getter for TraxBlockingRuleOvrView2.
     * @return TraxBlockingRuleOvrView2
     */
    public ViewObjectImpl getTraxBlockingRuleOvrView2() {
        return (ViewObjectImpl)findViewObject("TraxBlockingRuleOvrView2");
    }

    /**
     * Container's getter for SysC0023415Link1.
     * @return SysC0023415Link1
     */
    public ViewLinkImpl getSysC0023415Link1() {
        return (ViewLinkImpl)findViewLink("SysC0023415Link1");
    }

    /**
     * Container's getter for SysC0023419Link1.
     * @return SysC0023419Link1
     */
    public ViewLinkImpl getSysC0023419Link1() {
        return (ViewLinkImpl)findViewLink("SysC0023419Link1");
    }


    /**
     * Container's getter for BlockingRuleToOverViewLink1.
     * @return BlockingRuleToOverViewLink1
     */
    public ViewLinkImpl getBlockingRuleToOverViewLink1() {
        return (ViewLinkImpl)findViewLink("BlockingRuleToOverViewLink1");
    }

    /**
     * Container's getter for TraxBlockingRuleFTView.
     * @return TraxBlockingRuleFTView
     */
    public ViewObjectImpl getTraxBlockingRuleFTView() {
        return (ViewObjectImpl)findViewObject("TraxBlockingRuleFTView");
    }

    /**
     * Container's getter for BlockingRuleHdrToDtlViewLink1.
     * @return BlockingRuleHdrToDtlViewLink1
     */
    public ViewLinkImpl getBlockingRuleHdrToDtlViewLink1() {
        return (ViewLinkImpl)findViewLink("BlockingRuleHdrToDtlViewLink1");
    }

    /**
     * Container's getter for TraxBlockingRuleCountryView.
     * @return TraxBlockingRuleCountryView
     */
    public ViewObjectImpl getTraxBlockingRuleCountryView() {
        return (ViewObjectImpl)findViewObject("TraxBlockingRuleCountryView");
    }

    /**
     * Container's getter for BlockingRuleHdrToDtlViewLink2.
     * @return BlockingRuleHdrToDtlViewLink2
     */
    public ViewLinkImpl getBlockingRuleHdrToDtlViewLink2() {
        return (ViewLinkImpl)findViewLink("BlockingRuleHdrToDtlViewLink2");
    }

    /**
     * Container's getter for TraxBlockingRuleMktView.
     * @return TraxBlockingRuleMktView
     */
    public ViewObjectImpl getTraxBlockingRuleMktView() {
        return (ViewObjectImpl)findViewObject("TraxBlockingRuleMktView");
    }

    /**
     * Container's getter for BlockingRuleHdrToDtlViewLink3.
     * @return BlockingRuleHdrToDtlViewLink3
     */
    public ViewLinkImpl getBlockingRuleHdrToDtlViewLink3() {
        return (ViewLinkImpl)findViewLink("BlockingRuleHdrToDtlViewLink3");
    }

    /**
     * Container's getter for CategoryValueLookup2.
     * @return CategoryValueLookup2
     */
    public TracsView getCategoryValueLookup2() {
        return (TracsView)findViewObject("CategoryValueLookup2");
    }

    /**
     * Container's getter for TraxBlockingRuleDtlView1.
     * @return TraxBlockingRuleDtlView1
     */
    public TracsView getTraxBlockingRuleDtlView1() {
        return (TracsView)findViewObject("TraxBlockingRuleDtlView1");
    }


    /**
     * Container's getter for TraxBlockingRuleDtlView2.
     * @return TraxBlockingRuleDtlView2
     */
    public TracsView getTraxBlockingRuleDtlView2() {
        return (TracsView)findViewObject("TraxBlockingRuleDtlView2");
    }

    /**
     * Container's getter for BrDtlToRelatedBrDtlViewLink1.
     * @return BrDtlToRelatedBrDtlViewLink1
     */
    public ViewLinkImpl getBrDtlToRelatedBrDtlViewLink1() {
        return (ViewLinkImpl)findViewLink("BrDtlToRelatedBrDtlViewLink1");
    }

    /**
     * Container's getter for SubCategoryValueLookup1.
     * @return SubCategoryValueLookup1
     */
    public TracsView getSubCategoryValueLookup1() {
        return (TracsView)findViewObject("SubCategoryValueLookup1");
    }

    /**
     * Container's getter for TraxUlrichsTitleRelationView1.
     * @return TraxUlrichsTitleRelationView1
     */
    public TracsView getTraxUlrichsTitleRelationView1() {
        return (TracsView)findViewObject("TraxUlrichsTitleRelationView1");
    }

    /**
     * Container's getter for UlrichsToTitleRelationViewLink1.
     * @return UlrichsToTitleRelationViewLink1
     */
    public ViewLinkImpl getUlrichsToTitleRelationViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsToTitleRelationViewLink1");
    }


    /**
     * Container's getter for BlockingRuleFormatLookup.
     * @return BlockingRuleFormatLookup
     */
    public LookupCodeLookupImpl getBlockingRuleFormatLookup() {
        return (LookupCodeLookupImpl)findViewObject("BlockingRuleFormatLookup");
    }

    /**
     * Container's getter for PrmOpportunitiesDashboardVO1.
     * @return PrmOpportunitiesDashboardVO1
     */
    public OpportunitiesDashboardViewImpl getPrmOpportunitiesDashboardVO1() {
        return (OpportunitiesDashboardViewImpl)findViewObject("PrmOpportunitiesDashboardVO1");
    }

    /**
     * Container's getter for DashboardUserView2.
     * @return DashboardUserView2
     */
    public TracsView getDashboardUserView2() {
        return (TracsView)findViewObject("DashboardUserView2");
    }


    /**
     * Container's getter for InProcessOpportunitiesDashboardView1.
     * @return InProcessOpportunitiesDashboardView1
     */
    public TracsView getInProcessOpportunitiesDashboardView1() {
        return (TracsView)findViewObject("InProcessOpportunitiesDashboardView1");
    }

    /**
     * Container's getter for DashboardUserToInProcessOpportunitiesViewLink2.
     * @return DashboardUserToInProcessOpportunitiesViewLink2
     */
    public ViewLinkImpl getDashboardUserToInProcessOpportunitiesViewLink2() {
        return (ViewLinkImpl)findViewLink("DashboardUserToInProcessOpportunitiesViewLink2");
    }

    /**
     * Container's getter for OnHoldOpportunitiesDashboardView1.
     * @return OnHoldOpportunitiesDashboardView1
     */
    public TracsView getOnHoldOpportunitiesDashboardView1() {
        return (TracsView)findViewObject("OnHoldOpportunitiesDashboardView1");
    }

    /**
     * Container's getter for DashboardUserToOnHoldOpportunitiesViewLink2.
     * @return DashboardUserToOnHoldOpportunitiesViewLink2
     */
    public ViewLinkImpl getDashboardUserToOnHoldOpportunitiesViewLink2() {
        return (ViewLinkImpl)findViewLink("DashboardUserToOnHoldOpportunitiesViewLink2");
    }

    /**
     * Container's getter for RecentOpportunitiesDashboardView1.
     * @return RecentOpportunitiesDashboardView1
     */
    public TracsView getRecentOpportunitiesDashboardView1() {
        return (TracsView)findViewObject("RecentOpportunitiesDashboardView1");
    }

    /**
     * Container's getter for DashboardUserToRecentOpportunitiesViewLink2.
     * @return DashboardUserToRecentOpportunitiesViewLink2
     */
    public ViewLinkImpl getDashboardUserToRecentOpportunitiesViewLink2() {
        return (ViewLinkImpl)findViewLink("DashboardUserToRecentOpportunitiesViewLink2");
    }

    public void setLastLoginForUser() {
        String sql =
            "update jhs_users set last_login_time = sysdate, last_login_app = 'TRACS' where username = '" +
            this.getUsername() + "'";
        PreparedStatement setTime =
            this.getDBTransaction().createPreparedStatement(sql, 1);

        try {
            setTime.execute();
            this.getDBTransaction().commit();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }


    /**
     * Container's getter for TraxTitleIndexInclusionView1.
     * @return TraxTitleIndexInclusionView1
     */
    public TracsView getTraxTitleIndexInclusionView1() {
        return (TracsView)findViewObject("TraxTitleIndexInclusionView1");
    }

    /**
     * Container's getter for TitleToTitleIndexInclusionViewLink1.
     * @return TitleToTitleIndexInclusionViewLink1
     */
    public ViewLinkImpl getTitleToTitleIndexInclusionViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTitleIndexInclusionViewLink1");
    }

    /**
     * Container's getter for TraxTitleIndexInclusionView2.
     * @return TraxTitleIndexInclusionView2
     */
    public TracsView getTraxTitleIndexInclusionView2() {
        return (TracsView)findViewObject("TraxTitleIndexInclusionView2");
    }

    /**
     * Container's getter for TitleToTitleIndexInclusionViewLink2.
     * @return TitleToTitleIndexInclusionViewLink2
     */
    public ViewLinkImpl getTitleToTitleIndexInclusionViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToTitleIndexInclusionViewLink2");
    }

    /**
     * Container's getter for ExternalIndexLookup.
     * @return ExternalIndexLookup
     */
    public LookupCodeLookupImpl getExternalIndexLookup() {
        return (LookupCodeLookupImpl)findViewObject("ExternalIndexLookup");
    }

    /**
     * Container's getter for TraxTitleChildTitleView1.
     * @return TraxTitleChildTitleView1
     */
    public TraxTitleChildTitleViewImpl getTraxTitleChildTitleView1() {
        return (TraxTitleChildTitleViewImpl)findViewObject("TraxTitleChildTitleView1");
    }

    /**
     * Container's getter for TitleToChildTitleViewLink1.
     * @return TitleToChildTitleViewLink1
     */
    public ViewLinkImpl getTitleToChildTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToChildTitleViewLink1");
    }

    /**
     * Container's getter for OptyTypeLookup.
     * @return OptyTypeLookup
     */
    public LookupCodeLookupImpl getOptyTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyTypeLookup");
    }

    /**
     * Container's getter for OPtyCurStatusLookup.
     * @return OPtyCurStatusLookup
     */
    public LookupCodeLookupImpl getOPtyCurStatusLookup() {
        return (LookupCodeLookupImpl)findViewObject("OPtyCurStatusLookup");
    }

    /**
     * Container's getter for OptyReasonLostLookup.
     * @return OptyReasonLostLookup
     */
    public TracsView getOptyReasonLostLookup() {
        return (TracsView)findViewObject("OptyReasonLostLookup");
    }

    /**
     * Container's getter for OptyPriorityLookup.
     * @return OptyPriorityLookup
     */
    public LookupCodeLookupImpl getOptyPriorityLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyPriorityLookup");
    }

    /**
     * Container's getter for OptyExpectPipeLookup.
     * @return OptyExpectPipeLookup
     */
    public LookupCodeLookupImpl getOptyExpectPipeLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyExpectPipeLookup");
    }

    /**
     * Container's getter for OptyEstCloseQuartLookup.
     * @return OptyEstCloseQuartLookup
     */
    public LookupCodeLookupImpl getOptyEstCloseQuartLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyEstCloseQuartLookup");
    }

    /**
     * Container's getter for OptyDocSignLookup.
     * @return OptyDocSignLookup
     */
    public LookupCodeLookupImpl getOptyDocSignLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyDocSignLookup");
    }

    /**
     * Container's getter for OptyTargetStatusLookup.
     * @return OptyTargetStatusLookup
     */
    public LookupCodeLookupImpl getOptyTargetStatusLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyTargetStatusLookup");
    }

    /**
     * Container's getter for TargetPriorityLookup.
     * @return TargetPriorityLookup
     */
    public LookupCodeLookupImpl getOptyTargetPriorityLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyTargetPriorityLookup");
    }

    /**
     * Container's getter for OptyTargetTypeLookup.
     * @return OptyTargetTypeLookup
     */
    public LookupCodeLookupImpl getOptyTargetTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("OptyTargetTypeLookup");
    }

    /**
     * Container's getter for TraxOvrBrDetailsView1.
     * @return TraxOvrBrDetailsView1
     */
    public TracsView getTraxOvrBrDetailsView1() {
        return (TracsView)findViewObject("TraxOvrBrDetailsView1");
    }

    /**
     * Container's getter for TraxTitleRecordToTraxBRDeatilsViewLink1.
     * @return TraxTitleRecordToTraxBRDeatilsViewLink1
     */
    public ViewLinkImpl getTraxTitleRecordToTraxBRDeatilsViewLink1() {
        return (ViewLinkImpl)findViewLink("TraxTitleRecordToTraxBRDeatilsViewLink1");
    }

    /**
     * Container's getter for GenerationMethodLookup.
     * @return GenerationMethodLookup
     */
    public LookupCodeLookupImpl getGenerationMethodLookup() {
        return (LookupCodeLookupImpl)findViewObject("GenerationMethodLookup");
    }

    /**
     * Container's getter for PublisherView2.
     * @return PublisherView2
     */
    public TracsView getPublisherView2() {
        return (TracsView)findViewObject("PublisherView2");
    }

    /**
     * Container's getter for ContentOwnerToPublisherViewLink1.
     * @return ContentOwnerToPublisherViewLink1
     */
    public ViewLinkImpl getContentOwnerToPublisherViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToPublisherViewLink1");
    }


    /**
     * Container's getter for OptyReasonLostLookup1.
     * @return OptyReasonLostLookup1
     */
    public TracsView getOptyReasonLostLookup1() {
        return (TracsView)findViewObject("OptyReasonLostLookup1");
    }


    /**
     * Container's getter for ContractRoyaltyBearingLookup.
     * @return ContractRoyaltyBearingLookup
     */
    public LookupCodeLookupImpl getContractRoyaltyBearingLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractRoyaltyBearingLookup");
    }

    /**
     * Container's getter for ContractFairTreatmentClauseLookup.
     * @return ContractFairTreatmentClauseLookup
     */
    public LookupCodeLookupImpl getContractFairTreatmentClauseLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractFairTreatmentClauseLookup");
    }

    /**
     * Container's getter for ContractIssueEditionCoverageLookup.
     * @return ContractIssueEditionCoverageLookup
     */
    public LookupCodeLookupImpl getContractIssueEditionCoverageLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractIssueEditionCoverageLookup");
    }


    /**
     * Container's getter for ContractWarrantyAndIndemnificationLookup.
     * @return ContractWarrantyAndIndemnificationLookup
     */
    public LookupCodeLookupImpl getContractWarrantyAndIndemnificationLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractWarrantyAndIndemnificationLookup");
    }

    /**
     * Container's getter for ContractGovernanceLookup.
     * @return ContractGovernanceLookup
     */
    public LookupCodeLookupImpl getContractGovernanceLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGovernanceLookup");
    }

    /**
     * Container's getter for TraxImportFileView1.
     * @return TraxImportFileView1
     */
    public TracsView getTraxImportFileView1() {
        return (TracsView)findViewObject("TraxImportFileView1");
    }

    /**
     * Container's getter for TraxImportDataParseView1.
     * @return TraxImportDataParseView1
     */
    public TracsView getTraxImportDataParseView1() {
        return (TracsView)findViewObject("TraxImportDataParseView1");
    }

    /**
     * Container's getter for TraxImportDataParseFkLink1.
     * @return TraxImportDataParseFkLink1
     */
    public ViewLinkImpl getTraxImportDataParseFkLink1() {
        return (ViewLinkImpl)findViewLink("TraxImportDataParseFkLink1");
    }

    /**
     * Container's getter for TraxImportPotentialMatchView1.
     * @return TraxImportPotentialMatchView1
     */
    public TracsView getTraxImportPotentialMatchView1() {
        return (TracsView)findViewObject("TraxImportPotentialMatchView1");
    }

    /**
     * Container's getter for TracsImportMatchFileFkLink1.
     * @return TracsImportMatchFileFkLink1
     */
    public ViewLinkImpl getTracsImportMatchFileFkLink1() {
        return (ViewLinkImpl)findViewLink("TracsImportMatchFileFkLink1");
    }

    /**
     * Container's getter for TraxImportValidationMessageView1.
     * @return TraxImportValidationMessageView1
     */
    public TracsView getTraxImportValidationMessageView1() {
        return (TracsView)findViewObject("TraxImportValidationMessageView1");
    }

    /**
     * Container's getter for TraxImportValidationMeFk1Link1.
     * @return TraxImportValidationMeFk1Link1
     */
    public ViewLinkImpl getTraxImportValidationMeFk1Link1() {
        return (ViewLinkImpl)findViewLink("TraxImportValidationMeFk1Link1");
    }

    /**
     * Container's getter for CurrManuTypesLookup.
     * @return CurrManuTypesLookup
     */
    public LookupCodeLookupImpl getLookupCodeLookup1() {
        return (LookupCodeLookupImpl)findViewObject("LookupCodeLookup1");
    }

    /**
     * Container's getter for ImportStatusLookup.
     * @return ImportStatusLookup
     */
    public LookupCodeLookupImpl getImportStatusLookup() {
        return (LookupCodeLookupImpl)findViewObject("ImportStatusLookup");
    }

    /**
     * Container's getter for ImportTypeLookup.
     * @return ImportTypeLookup
     */
    public LookupCodeLookupImpl getImportTypeLookup() {
        return (LookupCodeLookupImpl)findViewObject("ImportTypeLookup");
    }

    /**
     * Container's getter for TraxImportParseErrorView1.
     * @return TraxImportParseErrorView1
     */
    public TracsView getTraxImportParseErrorView1() {
        return (TracsView)findViewObject("TraxImportParseErrorView1");
    }

    /**
     * Container's getter for ImportFileToParseErrorViewLink1.
     * @return ImportFileToParseErrorViewLink1
     */
    public ViewLinkImpl getImportFileToParseErrorViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportFileToParseErrorViewLink1");
    }

    /**
     * Container's getter for TraxImportResultsView1.
     * @return TraxImportResultsView1
     */
    public TracsView getTraxImportResultsView1() {
        return (TracsView)findViewObject("TraxImportResultsView1");
    }

    /**
     * Container's getter for ImportFileToResultsViewLink1.
     * @return ImportFileToResultsViewLink1
     */
    public ViewLinkImpl getImportFileToResultsViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportFileToResultsViewLink1");
    }

    /**
     * Container's getter for TraxImportOvrDataParseView1.
     * @return TraxImportOvrDataParseView1
     */
    public TracsView getTraxImportOvrDataParseView1() {
        return (TracsView)findViewObject("TraxImportOvrDataParseView1");
    }

    /**
     * Container's getter for ImportFileToOvrParseViewLink1.
     * @return ImportFileToOvrParseViewLink1
     */
    public ViewLinkImpl getImportFileToOvrParseViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportFileToOvrParseViewLink1");
    }

    /**
     * Container's getter for TraxImportOvrLegacyParseView1.
     * @return TraxImportOvrLegacyParseView1
     */
    public TracsView getTraxImportOvrLegacyParseView1() {
        return (TracsView)findViewObject("TraxImportOvrLegacyParseView1");
    }

    /**
     * Container's getter for ImportFileToLegacyParseViewLink1.
     * @return ImportFileToLegacyParseViewLink1
     */
    public ViewLinkImpl getImportFileToLegacyParseViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportFileToLegacyParseViewLink1");
    }

    /**
     * Container's getter for TraxImportOvrLegacyParseView2.
     * @return TraxImportOvrLegacyParseView2
     */
    public TracsView getTraxImportOvrLegacyParseView2() {
        return (TracsView)findViewObject("TraxImportOvrLegacyParseView2");
    }

    /**
     * Container's getter for OvrDataParseToLegacyViewLink1.
     * @return OvrDataParseToLegacyViewLink1
     */
    public ViewLinkImpl getOvrDataParseToLegacyViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrDataParseToLegacyViewLink1");
    }

    /**
     * Container's getter for TraxImportOvrResultsView1.
     * @return TraxImportOvrResultsView1
     */
    public TracsView getTraxImportOvrResultsView1() {
        return (TracsView)findViewObject("TraxImportOvrResultsView1");
    }

    /**
     * Container's getter for ImportToOvrResultViewLink1.
     * @return ImportToOvrResultViewLink1
     */
    public ViewLinkImpl getImportToOvrResultViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportToOvrResultViewLink1");
    }

    /**
     * Container's getter for TraxImportOvrMatchView1.
     * @return TraxImportOvrMatchView1
     */
    public TracsView getTraxImportOvrMatchView1() {
        return (TracsView)findViewObject("TraxImportOvrMatchView1");
    }

    /**
     * Container's getter for ImportToOvrMatchesViewLink1.
     * @return ImportToOvrMatchesViewLink1
     */
    public ViewLinkImpl getImportToOvrMatchesViewLink1() {
        return (ViewLinkImpl)findViewLink("ImportToOvrMatchesViewLink1");
    }

    @Override
    public void applyBindParams(String voUsage, HashMap args,
                                Boolean doRequeryWhenParamsChanged) {
        if (args != null) {
            super.applyBindParams(voUsage, args, doRequeryWhenParamsChanged);
        }
    }

    /**
     * Container's getter for TraxOvrAttributeView1.
     * @return TraxOvrAttributeView1
     */
    public TracsView getTraxOvrAttributeView1() {
        return (TracsView)findViewObject("TraxOvrAttributeView1");
    }

    /**
     * Container's getter for OvrToOvrAttributeViewLink1.
     * @return OvrToOvrAttributeViewLink1
     */
    public ViewLinkImpl getOvrToOvrAttributeViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrToOvrAttributeViewLink1");
    }

    /**
     * Container's getter for TraxOvrAttributeTypeView1.
     * @return TraxOvrAttributeTypeView1
     */
    public TracsView getTraxOvrAttributeTypeView1() {
        return (TracsView)findViewObject("TraxOvrAttributeTypeView1");
    }

    /**
     * Container's getter for OvrAttributeListLookup.
     * @return OvrAttributeListLookup
     */
    public LookupCodeLookupImpl getOvrAttributeListLookup() {
        return (LookupCodeLookupImpl)findViewObject("OvrAttributeListLookup");
    }

    /**
     * Container's getter for TraxTitleUlrichsTitleView1.
     * @return TraxTitleUlrichsTitleView1
     */
    public TracsView getTraxTitleUlrichsTitleView1() {
        return (TracsView)findViewObject("TraxTitleUlrichsTitleView1");
    }

    /**
     * Container's getter for TitleToUlrichsTitleViewLink1.
     * @return TitleToUlrichsTitleViewLink1
     */
    public ViewLinkImpl getTitleToUlrichsTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToUlrichsTitleViewLink1");
    }

    /**
     * Container's getter for UlrichsTitleLookupView1.
     * @return UlrichsTitleLookupView1
     */
    public TracsView getUlrichsTitleLookupView1() {
        return (TracsView)findViewObject("UlrichsTitleLookupView1");
    }

    /**
     * Container's getter for TraxJuContentOwnerView1.
     * @return TraxJuContentOwnerView1
     */
    public TracsView getTraxJuContentOwnerView1() {
        return (TracsView)findViewObject("TraxJuContentOwnerView1");
    }

    /**
     * Container's getter for ContentOwnerToJournalViewLink1.
     * @return ContentOwnerToJournalViewLink1
     */
    public ViewLinkImpl getContentOwnerToJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToJournalViewLink1");
    }

    /**
     * Container's getter for TraxJuContractView1.
     * @return TraxJuContractView1
     */
    public TracsView getTraxJuContractView1() {
        return (TracsView)findViewObject("TraxJuContractView1");
    }

    /**
     * Container's getter for ContractToContractJournalViewLink1.
     * @return ContractToContractJournalViewLink1
     */
    public ViewLinkImpl getContractToContractJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractToContractJournalViewLink1");
    }

    /**
     * Container's getter for TraxJuTitleRecordView1.
     * @return TraxJuTitleRecordView1
     */
    public TracsView getTraxJuTitleRecordView1() {
        return (TracsView)findViewObject("TraxJuTitleRecordView1");
    }

    /**
     * Container's getter for OvrToOvrJournalViewLink1.
     * @return OvrToOvrJournalViewLink1
     */
    public ViewLinkImpl getOvrToOvrJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrToOvrJournalViewLink1");
    }

    /**
     * Container's getter for TraxJuTitleView1.
     * @return TraxJuTitleView1
     */
    public TracsView getTraxJuTitleView1() {
        return (TracsView)findViewObject("TraxJuTitleView1");
    }

    /**
     * Container's getter for TitleToTitleJournalViewLink1.
     * @return TitleToTitleJournalViewLink1
     */
    public ViewLinkImpl getTitleToTitleJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToTitleJournalViewLink1");
    }

    /**
     * Container's getter for TraxJuTitleView2.
     * @return TraxJuTitleView2
     */
    public TracsView getTraxJuTitleView2() {
        return (TracsView)findViewObject("TraxJuTitleView2");
    }

    /**
     * Container's getter for TitleToTitleJournalViewLink2.
     * @return TitleToTitleJournalViewLink2
     */
    public ViewLinkImpl getTitleToTitleJournalViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToTitleJournalViewLink2");
    }

    /**
     * Container's getter for TraxTitleUlrichsTitleView2.
     * @return TraxTitleUlrichsTitleView2
     */
    public TracsView getTraxTitleUlrichsTitleView2() {
        return (TracsView)findViewObject("TraxTitleUlrichsTitleView2");
    }

    /**
     * Container's getter for TitleToUlrichsTitleViewLink2.
     * @return TitleToUlrichsTitleViewLink2
     */
    public ViewLinkImpl getTitleToUlrichsTitleViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToUlrichsTitleViewLink2");
    }

    /**
     * Container's getter for TraxJuContractRightView1.
     * @return TraxJuContractRightView1
     */
    public TracsView getTraxJuContractRightView1() {
        return (TracsView)findViewObject("TraxJuContractRightView1");
    }

    /**
     * Container's getter for ContractRightToJournalViewLink1.
     * @return ContractRightToJournalViewLink1
     */
    public ViewLinkImpl getContractRightToJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("ContractRightToJournalViewLink1");
    }

    /**
     * Container's getter for PrmJuOpportunityView1.
     * @return PrmJuOpportunityView1
     */
    public TracsView getPrmJuOpportunityView1() {
        return (TracsView)findViewObject("PrmJuOpportunityView1");
    }

    /**
     * Container's getter for OpportunityToJournalViewLink1.
     * @return OpportunityToJournalViewLink1
     */
    public ViewLinkImpl getOpportunityToJournalViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToJournalViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsFormerTitleView1.
     * @return TraxUlrichsFormerTitleView1
     */
    public TracsView getTraxUlrichsFormerTitleView1() {
        return (TracsView)findViewObject("TraxUlrichsFormerTitleView1");
    }

    /**
     * Container's getter for UlrichsToFormerTitleViewLink1.
     * @return UlrichsToFormerTitleViewLink1
     */
    public ViewLinkImpl getUlrichsToFormerTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsToFormerTitleViewLink1");
    }

    /**
     * Container's getter for TraxUlrichsResmpNotationView1.
     * @return TraxUlrichsResmpNotationView1
     */
    public TracsView getTraxUlrichsResmpNotationView1() {
        return (TracsView)findViewObject("TraxUlrichsResmpNotationView1");
    }

    /**
     * Container's getter for UlrichsToResumptionViewLink1.
     * @return UlrichsToResumptionViewLink1
     */
    public ViewLinkImpl getUlrichsToResumptionViewLink1() {
        return (ViewLinkImpl)findViewLink("UlrichsToResumptionViewLink1");
    }

    /**
     * Container's getter for TitleNoteLookup.
     * @return TitleNoteLookup
     */
    public LookupCodeLookupImpl getTitleNoteLookup() {
        return (LookupCodeLookupImpl)findViewObject("TitleNoteLookup");
    }

    /**
     * Container's getter for PrmTargetGroupView1.
     * @return PrmTargetGroupView1
     */
    public TracsView getPrmTargetGroupView1() {
        return (TracsView)findViewObject("PrmTargetGroupView1");
    }

    /**
     * Container's getter for PrmTargetGroupTitleView1.
     * @return PrmTargetGroupTitleView1
     */
    public TracsView getPrmTargetGroupTitleView1() {
        return (TracsView)findViewObject("PrmTargetGroupTitleView1");
    }

    /**
     * Container's getter for TargetGroupToGroupTitleViewLink1.
     * @return TargetGroupToGroupTitleViewLink1
     */
    public ViewLinkImpl getTargetGroupToGroupTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("TargetGroupToGroupTitleViewLink1");
    }

    /**
     * Container's getter for PrmTargetedProductTitleView1.
     * @return PrmTargetedProductTitleView1
     */
    public TracsView getPrmTargetedProductTitleView1() {
        return (TracsView)findViewObject("PrmTargetedProductTitleView1");
    }

    /**
     * Container's getter for TargetGroupToTargetViewLink1.
     * @return TargetGroupToTargetViewLink1
     */
    public ViewLinkImpl getTargetGroupToTargetViewLink1() {
        return (ViewLinkImpl)findViewLink("TargetGroupToTargetViewLink1");
    }

    /**
     * Container's getter for ProcessingGroupView.
     * @return ProcessingGroupView
     */
    public TracsView getProcessingGroupView() {
        return (TracsView)findViewObject("ProcessingGroupView");
    }

    /**
     * Container's getter for PrmJuOpportunityView2.
     * @return PrmJuOpportunityView2
     */
    public TracsView getPrmJuOpportunityView2() {
        return (TracsView)findViewObject("PrmJuOpportunityView2");
    }

    /**
     * Container's getter for OpportunityToJournalViewLink2.
     * @return OpportunityToJournalViewLink2
     */
    public ViewLinkImpl getOpportunityToJournalViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToJournalViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityActivityView2.
     * @return PrmOpportunityActivityView2
     */
    public TracsView getPrmOpportunityActivityView2() {
        return (TracsView)findViewObject("PrmOpportunityActivityView2");
    }

    /**
     * Container's getter for OpportunityToOpportunityActivityViewLink2.
     * @return OpportunityToOpportunityActivityViewLink2
     */
    public ViewLinkImpl getOpportunityToOpportunityActivityViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityActivityViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityAttachmentView2.
     * @return PrmOpportunityAttachmentView2
     */
    public TracsView getPrmOpportunityAttachmentView2() {
        return (TracsView)findViewObject("PrmOpportunityAttachmentView2");
    }

    /**
     * Container's getter for OpportunityToAttachmentViewLink2.
     * @return OpportunityToAttachmentViewLink2
     */
    public ViewLinkImpl getOpportunityToAttachmentViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToAttachmentViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityContractView2.
     * @return PrmOpportunityContractView2
     */
    public TracsView getPrmOpportunityContractView2() {
        return (TracsView)findViewObject("PrmOpportunityContractView2");
    }

    /**
     * Container's getter for OpportunityToOpportunityContractViewLink2.
     * @return OpportunityToOpportunityContractViewLink2
     */
    public ViewLinkImpl getOpportunityToOpportunityContractViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityContractViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityProcessStatusView2.
     * @return PrmOpportunityProcessStatusView2
     */
    public TracsView getPrmOpportunityProcessStatusView2() {
        return (TracsView)findViewObject("PrmOpportunityProcessStatusView2");
    }

    /**
     * Container's getter for OpportunityToProcessStatusViewLink2.
     * @return OpportunityToProcessStatusViewLink2
     */
    public ViewLinkImpl getOpportunityToProcessStatusViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToProcessStatusViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityStatusView2.
     * @return PrmOpportunityStatusView2
     */
    public TracsView getPrmOpportunityStatusView2() {
        return (TracsView)findViewObject("PrmOpportunityStatusView2");
    }

    /**
     * Container's getter for OpportunityToOpportunityStatusViewLink2.
     * @return OpportunityToOpportunityStatusViewLink2
     */
    public ViewLinkImpl getOpportunityToOpportunityStatusViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityStatusViewLink2");
    }

    /**
     * Container's getter for PrmOpportunityTargetView2.
     * @return PrmOpportunityTargetView2
     */
    public TracsView getPrmOpportunityTargetView2() {
        return (TracsView)findViewObject("PrmOpportunityTargetView2");
    }

    /**
     * Container's getter for OpportunityToOpportunityTargetViewLink2.
     * @return OpportunityToOpportunityTargetViewLink2
     */
    public ViewLinkImpl getOpportunityToOpportunityTargetViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToOpportunityTargetViewLink2");
    }

    /**
     * Container's getter for TraxTitleActivityView2.
     * @return TraxTitleActivityView2
     */
    public TracsView getNewTitleActivityView2() {
        return (TracsView)findViewObject("NewTitleActivityView2");
    }

    /**
     * Container's getter for TitleToTitleActivityViewLink2.
     * @return TitleToTitleActivityViewLink2
     */
    public ViewLinkImpl getTitleToTitleActivityViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToTitleActivityViewLink2");
    }

    /**
     * Container's getter for TraxTitleAttachmentView2.
     * @return TraxTitleAttachmentView2
     */
    public TracsView getTraxTitleAttachmentView2() {
        return (TracsView)findViewObject("TraxTitleAttachmentView2");
    }

    /**
     * Container's getter for TitleToAttachmentViewLink2.
     * @return TitleToAttachmentViewLink2
     */
    public ViewLinkImpl getTitleToAttachmentViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToAttachmentViewLink2");
    }

    /**
     * Container's getter for COActiveContractView.
     * @return COActiveContractView
     */
    public ContractViewImpl getCOActiveContractView() {
        return (ContractViewImpl)findViewObject("COActiveContractView");
    }

    /**
     * Container's getter for ProcessGroupToCOContractViewLink1.
     * @return ProcessGroupToCOContractViewLink1
     */
    public ViewLinkImpl getProcessGroupToCOContractViewLink1() {
        return (ViewLinkImpl)findViewLink("ProcessGroupToCOContractViewLink1");
    }

    /**
     * Container's getter for ContractGuaranteeDeliveryFormatLookup.
     * @return ContractGuaranteeDeliveryFormatLookup
     */
    public LookupCodeLookupImpl getContractGuaranteeDeliveryFormatLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGuaranteeDeliveryFormatLookup");
    }

    /**
     * Container's getter for ContractGuaranteeInventoryDivisionLookup.
     * @return ContractGuaranteeInventoryDivisionLookup
     */
    public LookupCodeLookupImpl getContractGuaranteeInventoryDivisionLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGuaranteeInventoryDivisionLookup");
    }

    /**
     * Container's getter for ContractGuaranteeMediaCodeLookup.
     * @return ContractGuaranteeMediaCodeLookup
     */
    public LookupCodeLookupImpl getContractGuaranteeMediaCodeLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGuaranteeMediaCodeLookup");
    }

    /**
     * Container's getter for ContractGuaranteeProductCodeLookup.
     * @return ContractGuaranteeProductCodeLookup
     */
    public LookupCodeLookupImpl getContractGuaranteeProductCodeLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGuaranteeProductCodeLookup");
    }

    /**
     * Container's getter for ContractGuaranteeCurrencyLookup.
     * @return ContractGuaranteeCurrencyLookup
     */
    public LookupCodeLookupImpl getContractGuaranteeCurrencyLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContractGuaranteeCurrencyLookup");
    }

    /**
     * Container's getter for PrmOpportunityView2.
     * @return PrmOpportunityView2
     */
    public TracsView getPrmOpportunityView2() {
        return (TracsView)findViewObject("PrmOpportunityView2");
    }

    /**
     * Container's getter for ContentOwnerToOpportunityViewLink1.
     * @return ContentOwnerToOpportunityViewLink1
     */
    public ViewLinkImpl getContentOwnerToOpportunityViewLink1() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToOpportunityViewLink1");
    }

    /**
     * Container's getter for VaryingFormView1.
     * @return VaryingFormView1
     */
    public VaryingFormViewImpl getVaryingFormView1() {
        return (VaryingFormViewImpl)findViewObject("VaryingFormView1");
    }

    /**
     * Container's getter for TitleToVaryingFormViewLink1.
     * @return TitleToVaryingFormViewLink1
     */
    public ViewLinkImpl getTitleToVaryingFormViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToVaryingFormViewLink1");
    }

    /**
     * Container's getter for ClassificationView1.
     * @return ClassificationView1
     */
    public ClassificationViewImpl getClassificationView1() {
        return (ClassificationViewImpl)findViewObject("ClassificationView1");
    }

    /**
     * Container's getter for TitleToClassificationViewLink1.
     * @return TitleToClassificationViewLink1
     */
    public ViewLinkImpl getTitleToClassificationViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleToClassificationViewLink1");
    }

    /**
     * Container's getter for ClassificationView3.
     * @return ClassificationView3
     */
    public ClassificationViewImpl getClassificationView3() {
        return (ClassificationViewImpl)findViewObject("ClassificationView3");
    }

    /**
     * Container's getter for TitleToClassificationViewLink2.
     * @return TitleToClassificationViewLink2
     */
    public ViewLinkImpl getTitleToClassificationViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToClassificationViewLink2");
    }

    /**
     * Container's getter for VaryingFormView3.
     * @return VaryingFormView3
     */
    public VaryingFormViewImpl getVaryingFormView3() {
        return (VaryingFormViewImpl)findViewObject("VaryingFormView3");
    }

    /**
     * Container's getter for TitleToVaryingFormViewLink2.
     * @return TitleToVaryingFormViewLink2
     */
    public ViewLinkImpl getTitleToVaryingFormViewLink2() {
        return (ViewLinkImpl)findViewLink("TitleToVaryingFormViewLink2");
    }

    /**
     * Container's getter for ProcessGroupsView1.
     * @return ProcessGroupsView1
     */
    public TracsView getProcessingGroupView1() {
        return (TracsView)findViewObject("ProcessingGroupView1");
    }

    /**
     * Container's getter for ContentOwnerToOpportunityViewLink2.
     * @return ContentOwnerToOpportunityViewLink2
     */
    public ViewLinkImpl getContentOwnerToOpportunityViewLink2() {
        return (ViewLinkImpl)findViewLink("ContentOwnerToOpportunityViewLink2");
    }

    /**
     * Container's getter for ContentSourceLookup.
     * @return ContentSourceLookup
     */
    public LookupCodeLookupImpl getContentSourceLookup() {
        return (LookupCodeLookupImpl)findViewObject("ContentSourceLookup");

    }

    /**
     * Container's getter for AutoGenRuleSetLookup.
     * @return AutoGenRuleSetLookup
     */
    public LookupCodeLookupImpl getAutoGenRuleSetLookup() {
        return (LookupCodeLookupImpl)findViewObject("AutoGenRuleSetLookup");
    }
    
    public void CreateOVR(Number pTitleId, String pPmid, String pContentSource, String pAutoGenRuleSet) {

        //try {
        Integer titleIdInt = new Integer(pTitleId.toString());

        String uName = this.getUsername();

        DatabaseProcedure createOVR =
            DatabaseProcedure.define("procedure pk_trax_ovr_creation.create_ovr(p_title_id integer, p_content_source varchar2, p_pmid varchar2, " + 
                "p_autogen_rule_set varchar2, p_username varchar2, p_title_record_id out integer)");

        DatabaseProcedure.Result result =
            createOVR.call(this.getDBTransaction(),
                                           titleIdInt, pContentSource, pPmid, pAutoGenRuleSet, uName);

        Integer titleRecordId =
            (Integer)result.getOutputValue("p_title_record_id");

        Integer pubIdInt = null;
        String contentSource = pContentSource;
        String source_status = "application";
        if (pAutoGenRuleSet != null) {
            contentSource = pAutoGenRuleSet;
        }

        DatabaseProcedure autoFillChildren =
            DatabaseProcedure.define("procedure pk_trax_ovr_creation.auto_fill_child_records" + 
                "( p_title_record_id integer, p_title_id integer, p_content_source varchar2, p_username varchar2, p_pub_id integer, p_source_status varchar2 )");

        DatabaseProcedure.Result result2 =
            autoFillChildren.call(this.getDBTransaction(),
                                           titleRecordId, titleIdInt, contentSource, uName, pubIdInt, source_status);

    }

    /**
     * Container's getter for ContractRightCategoryView2.
     * @return ContractRightCategoryView2
     */
    public ContractRightCategoryViewImpl getContractRightCategoryView2() {
        return (ContractRightCategoryViewImpl)findViewObject("ContractRightCategoryView2");
    }

    /**
     * Container's getter for TitleContractRightToCategoryViewLink1.
     * @return TitleContractRightToCategoryViewLink1
     */
    public ViewLinkImpl getTitleContractRightToCategoryViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleContractRightToCategoryViewLink1");
    }

    /**
     * Container's getter for TraxPreResultView1.
     * @return TraxPreResultView1
     */
    public TracsView getTraxPreResultView1() {
        return (TracsView)findViewObject("TraxPreResultView1");
    }

    /**
     * Container's getter for OpportunityToTraxPreResultViewLink1.
     * @return OpportunityToTraxPreResultViewLink1
     */
    public ViewLinkImpl getOpportunityToTraxPreResultViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToTraxPreResultViewLink1");
    }

    /**
     * Container's getter for TraxPreResultTargetView1.
     * @return TraxPreResultTargetView1
     */
    public TracsView getTraxPreResultTargetView1() {
        return (TracsView)findViewObject("TraxPreResultTargetView1");
    }

    /**
     * Container's getter for TraxPreResultToTraxPreResultTargetViewLink1.
     * @return TraxPreResultToTraxPreResultTargetViewLink1
     */
    public ViewLinkImpl getTraxPreResultToTraxPreResultTargetViewLink1() {
        return (ViewLinkImpl)findViewLink("TraxPreResultToTraxPreResultTargetViewLink1");
    }

    /**
     * Container's getter for TraxPreResultView2.
     * @return TraxPreResultView2
     */
    public TracsView getTraxPreResultView2() {
        return (TracsView)findViewObject("TraxPreResultView2");
    }

    /**
     * Container's getter for OpportunityToTraxPreResultViewLink2.
     * @return OpportunityToTraxPreResultViewLink2
     */
    public ViewLinkImpl getOpportunityToTraxPreResultViewLink2() {
        return (ViewLinkImpl)findViewLink("OpportunityToTraxPreResultViewLink2");
    }

    /**
     * Container's getter for TraxOvrRightsNoteView1.
     * @return TraxOvrRightsNoteView1
     */
    public TracsView getTraxOvrRightsNoteView1() {
        return (TracsView)findViewObject("TraxOvrRightsNoteView1");
    }

    /**
     * Container's getter for TitleRecordRightsNoteViewLink1.
     * @return TitleRecordRightsNoteViewLink1
     */
    public ViewLinkImpl getTitleRecordRightsNoteViewLink1() {
        return (ViewLinkImpl)findViewLink("TitleRecordRightsNoteViewLink1");
    }

    /**
     * Container's getter for PrmTargetedProductLOV.
     * @return PrmTargetedProductLOV
     */
    public TracsView getPrmTargetedProductLOV() {
        return (TracsView)findViewObject("PrmTargetedProductLOV");
    }

    /**
     * Container's getter for PrmOpportunityView3.
     * @return PrmOpportunityView3
     */
    public TracsView getPrmOpportunityLookupView() {
        return (TracsView)findViewObject("PrmOpportunityLookupView");
    }

    /**
     * Container's getter for PrmOpportunityTargetAssignmentView1.
     * @return PrmOpportunityTargetAssignmentView1
     */
    public TracsView getPrmOpportunityTargetAssignmentView1() {
        return (TracsView)findViewObject("PrmOpportunityTargetAssignmentView1");
    }

    /**
     * Container's getter for OpportunityToTargetAssignmentViewLink1.
     * @return OpportunityToTargetAssignmentViewLink1
     */
    public ViewLinkImpl getOpportunityToTargetAssignmentViewLink1() {
        return (ViewLinkImpl)findViewLink("OpportunityToTargetAssignmentViewLink1");
    }

    /**
     * Container's getter for PrmTargetedProductTitleLookup1.
     * @return PrmTargetedProductTitleLookup1
     */
    public TracsView getPrmTargetedProductTitleLookup1() {
        return (TracsView)findViewObject("PrmTargetedProductTitleLookup1");
    }

    /**
     * Container's getter for PrmProcessingGroupStatusView1.
     * @return PrmProcessingGroupStatusView1
     */
    public TracsView getPrmProcessingGroupStatusView1() {
        return (TracsView)findViewObject("PrmProcessingGroupStatusView1");
    }

    /**
     * Container's getter for ProcessingGroupToProcessingGroupViewLink1.
     * @return ProcessingGroupToProcessingGroupViewLink1
     */
    public ViewLinkImpl getProcessingGroupToProcessingGroupViewLink1() {
        return (ViewLinkImpl)findViewLink("ProcessingGroupToProcessingGroupViewLink1");
    }

    /**
     * Container's getter for PublisherVPIdView.
     * @return PublisherVPIdView
     */
    public TracsView getPublisherVPIdView() {
        return (TracsView)findViewObject("PublisherVPIdView");
    }

    /**
     * Container's getter for PublisherToPublisherAddressViewLink2.
     * @return PublisherToPublisherAddressViewLink2
     */
    public ViewLinkImpl getPublisherToPublisherAddressViewLink2() {
        return (ViewLinkImpl)findViewLink("PublisherToPublisherAddressViewLink2");
    }


    /**
     * Container's getter for PublisherVpIdOvrView1.
     * @return PublisherVpIdOvrView1
     */
    public TracsView getPublisherVpIdOvrView1() {
        return (TracsView)findViewObject("PublisherVpIdOvrView1");
    }

    /**
     * Container's getter for PublisherVpidOvrViewLink1.
     * @return PublisherVpidOvrViewLink1
     */
    public ViewLinkImpl getPublisherVpidOvrViewLink1() {
        return (ViewLinkImpl)findViewLink("PublisherVpidOvrViewLink1");
    }

    /**
     * Container's getter for SearchPublisherVpIdView1.
     * @return SearchPublisherVpIdView1
     */
    public TracsView getSearchPublisherVpIdView1() {
        return (TracsView)findViewObject("SearchPublisherVpIdView1");
    }

    /**
     * Container's getter for PublisherVpIdLink1.
     * @return PublisherVpIdLink1
     */
    public ViewLinkImpl getPublisherVpIdLink1() {
        return (ViewLinkImpl)findViewLink("PublisherVpIdLink1");
    }

    /**
     * Container's getter for TitleNTCView1.
     * @return TitleNTCView1
     */
    public NTCTitleViewImpl getNTCTitleView1() {
        return (NTCTitleViewImpl)findViewObject("NTCTitleView1");
    }

    /**
     * Container's getter for NTCPublisherView1.
     * @return NTCPublisherView1
     */
    public NTCPublisherViewImpl getNTCPublisherView1() {
        return (NTCPublisherViewImpl)findViewObject("NTCPublisherView1");
    }

    /**
     * Container's getter for TraxActivityTitleView2.
     * @return TraxActivityTitleView2
     */
    public TracsView getTraxActivityTitleView2() {
        return (TracsView)findViewObject("TraxActivityTitleView2");
    }

    /**
     * Container's getter for NTCPublisherToTitleViewLink1.
     * @return NTCPublisherToTitleViewLink1
     */
    public ViewLinkImpl getNTCPublisherToTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCPublisherToTitleViewLink1");
    }

    /**
     * Container's getter for TraxActivityTitleView3.
     * @return TraxActivityTitleView3
     */
    public TracsView getTraxActivityTitleView3() {
        return (TracsView)findViewObject("TraxActivityTitleView3");
    }

    /**
     * Container's getter for NTCTitleToTitleViewLink1.
     * @return NTCTitleToTitleViewLink1
     */
    public ViewLinkImpl getNTCTitleToTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCTitleToTitleViewLink1");
    }

    /**
     * Container's getter for TraxActivityAttachmentView2.
     * @return TraxActivityAttachmentView2
     */
    public TracsView getTraxActivityAttachmentView2() {
        return (TracsView)findViewObject("TraxActivityAttachmentView2");
    }

    /**
     * Container's getter for NTCTitleToAttachmentViewLink1.
     * @return NTCTitleToAttachmentViewLink1
     */
    public ViewLinkImpl getNTCTitleToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCTitleToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxActivityAttachmentView3.
     * @return TraxActivityAttachmentView3
     */
    public TracsView getTraxActivityAttachmentView3() {
        return (TracsView)findViewObject("TraxActivityAttachmentView3");
    }

    /**
     * Container's getter for NTCPublisherToAttachmentViewLink1.
     * @return NTCPublisherToAttachmentViewLink1
     */
    public ViewLinkImpl getNTCPublisherToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCPublisherToAttachmentViewLink1");
    }

    /**
     * Container's getter for NTCTitleLov1.
     * @return NTCTitleLov1
     */
    public TracsView getNTCTitleLov1() {
        return (TracsView)findViewObject("NTCTitleLov1");
    }

    /**
     * Container's getter for NTCActivityView1.
     * @return NTCActivityView1
     */
    public TracsView getNTCActivityView1() {
        return (TracsView)findViewObject("NTCActivityView1");
    }

    /**
     * Container's getter for TraxActivityTitleView4.
     * @return TraxActivityTitleView4
     */
    public TracsView getTraxActivityTitleView4() {
        return (TracsView)findViewObject("TraxActivityTitleView4");
    }

    /**
     * Container's getter for NTCActivityToTitleViewLink1.
     * @return NTCActivityToTitleViewLink1
     */
    public ViewLinkImpl getNTCActivityToTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCActivityToTitleViewLink1");
    }

    /**
     * Container's getter for TraxTitleChangeView1.
     * @return TraxTitleChangeView1
     */
    public TracsView getTraxTitleChangeView1() {
        return (TracsView)findViewObject("TraxTitleChangeView1");
    }

    /**
     * Container's getter for NTCActivityToTitleChangeViewLink1.
     * @return NTCActivityToTitleChangeViewLink1
     */
    public ViewLinkImpl getNTCActivityToTitleChangeViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCActivityToTitleChangeViewLink1");
    }

    /**
     * Container's getter for TraxActivityAttachmentView4.
     * @return TraxActivityAttachmentView4
     */
    public TracsView getTraxActivityAttachmentView4() {
        return (TracsView)findViewObject("TraxActivityAttachmentView4");
    }

    /**
     * Container's getter for NTCActivityToAttachmentViewLink1.
     * @return NTCActivityToAttachmentViewLink1
     */
    public ViewLinkImpl getNTCActivityToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCActivityToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxPublisherChangeView1.
     * @return TraxPublisherChangeView1
     */
    public TracsView getTraxPublisherChangeView1() {
        return (TracsView)findViewObject("TraxPublisherChangeView1");
    }

    /**
     * Container's getter for NTCActivityToPublisherChangeViewLink1.
     * @return NTCActivityToPublisherChangeViewLink1
     */
    public ViewLinkImpl getNTCActivityToPublisherChangeViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCActivityToPublisherChangeViewLink1");
    }

    /**
     * Container's getter for NTCRightsView1.
     * @return NTCRightsView1
     */
    public NTCRightsViewImpl getNTCRightsView1() {
        return (NTCRightsViewImpl)findViewObject("NTCRightsView1");
    }

    /**
     * Container's getter for TraxActivityTitleView5.
     * @return TraxActivityTitleView5
     */
    public TracsView getTraxActivityTitleView5() {
        return (TracsView)findViewObject("TraxActivityTitleView5");
    }

    /**
     * Container's getter for NTCRightsToTitleViewLink1.
     * @return NTCRightsToTitleViewLink1
     */
    public ViewLinkImpl getNTCRightsToTitleViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCRightsToTitleViewLink1");
    }

    /**
     * Container's getter for TraxActivityAttachmentView5.
     * @return TraxActivityAttachmentView5
     */
    public TracsView getTraxActivityAttachmentView5() {
        return (TracsView)findViewObject("TraxActivityAttachmentView5");
    }

    /**
     * Container's getter for NTCRightsToAttachmentViewLink1.
     * @return NTCRightsToAttachmentViewLink1
     */
    public ViewLinkImpl getNTCRightsToAttachmentViewLink1() {
        return (ViewLinkImpl)findViewLink("NTCRightsToAttachmentViewLink1");
    }

    /**
     * Container's getter for TraxOvrLegacyContractNotesView1.
     * @return TraxOvrLegacyContractNotesView1
     */
    public TracsView getTraxOvrLegacyContractNotesView1() {
        return (TracsView)findViewObject("TraxOvrLegacyContractNotesView1");
    }

    /**
     * Container's getter for OvrToOvrLegacyContractNotesViewLink1.
     * @return OvrToOvrLegacyContractNotesViewLink1
     */
    public ViewLinkImpl getOvrToOvrLegacyContractNotesViewLink1() {
        return (ViewLinkImpl)findViewLink("OvrToOvrLegacyContractNotesViewLink1");
    }

    /**
     * Container's getter for TraxOvrCSCutoverView1.
     * @return TraxOvrCSCutoverView1
     */
    public TracsView getTraxOvrCSCutoverView1() {
        return (TracsView)findViewObject("TraxOvrCSCutoverView1");
    }

    /**
     * Container's getter for TraxOvrCSCutoverViewLink1.
     * @return TraxOvrCSCutoverViewLink1
     */
    public ViewLinkImpl getTraxOvrCSCutoverViewLink1() {
        return (ViewLinkImpl)findViewLink("TraxOvrCSCutoverViewLink1");
    }

}
