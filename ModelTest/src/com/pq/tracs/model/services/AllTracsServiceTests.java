package com.pq.tracs.model.services;

import com.pq.tracs.model.services.applicationModule.TracsServiceAMFixture;
import com.pq.tracs.model.services.applicationModule.TracsServiceAMTest;
import com.pq.tracs.model.services.view.ActivityDashboardView1VO.ActivityDashboardView1VOTest;
import com.pq.tracs.model.services.view.ActivityDashboardView2VO.ActivityDashboardView2VOTest;
import com.pq.tracs.model.services.view.ActivityView4VO.ActivityView4VOTest;
import com.pq.tracs.model.services.view.AddedEntryView1VO.AddedEntryView1VOTest;
import com.pq.tracs.model.services.view.AdditionalUrlView1VO.AdditionalUrlView1VOTest;
import com.pq.tracs.model.services.view.AddressView1VO.AddressView1VOTest;
import com.pq.tracs.model.services.view.BlockingRuleFormatLookupVO.BlockingRuleFormatLookupVOTest;
import com.pq.tracs.model.services.view.CADashboardUserViewVO.CADashboardUserViewVOTest;
import com.pq.tracs.model.services.view.COActiveContractViewVO.COActiveContractViewVOTest;
import com.pq.tracs.model.services.view.COTitlesReadOnlyView1VO.COTitlesReadOnlyView1VOTest;
import com.pq.tracs.model.services.view.CategoryValueLookup1VO.CategoryValueLookup1VOTest;
import com.pq.tracs.model.services.view.CategoryValueLookup2VO.CategoryValueLookup2VOTest;
import com.pq.tracs.model.services.view.ClassificationView1VO.ClassificationView1VOTest;
import com.pq.tracs.model.services.view.ClassificationView2VO.ClassificationView2VOTest;
import com.pq.tracs.model.services.view.ClassificationView3VO.ClassificationView3VOTest;
import com.pq.tracs.model.services.view.ContactContentOwnerView1VO.ContactContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.ContactLOVVO.ContactLOVVOTest;
import com.pq.tracs.model.services.view.ContactView2VO.ContactView2VOTest;
import com.pq.tracs.model.services.view.ContentOwnerContactView1VO.ContentOwnerContactView1VOTest;
import com.pq.tracs.model.services.view.ContentOwnerLOV1VO.ContentOwnerLOV1VOTest;
import com.pq.tracs.model.services.view.ContentOwnerNoteView1VO.ContentOwnerNoteView1VOTest;
import com.pq.tracs.model.services.view.ContentOwnerTitlesLookup1VO.ContentOwnerTitlesLookup1VOTest;
import com.pq.tracs.model.services.view.ContentOwnerView1VO.ContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.ContractAttachmentView1VO.ContractAttachmentView1VOTest;
import com.pq.tracs.model.services.view.ContractBasedTitleLOV1VO.ContractBasedTitleLOV1VOTest;
import com.pq.tracs.model.services.view.ContractContactROView1VO.ContractContactROView1VOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeMultiSelectLOV1VO.ContractGuaranteeMultiSelectLOV1VOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeCurrencyLookupVO.ContractGuaranteeCurrencyLookupVOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeDeliveryFormatLookupVO.ContractGuaranteeDeliveryFormatLookupVOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeInventoryDivisionLookupVO.ContractGuaranteeInventoryDivisionLookupVOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeMediaCodeLookupVO.ContractGuaranteeMediaCodeLookupVOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeProductCodeLookupVO.ContractGuaranteeProductCodeLookupVOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeTitleView1VO.ContractGuaranteeTitleView1VOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeTitlesLOV1VO.ContractGuaranteeTitlesLOV1VOTest;
import com.pq.tracs.model.services.view.ContractGuaranteeView1VO.ContractGuaranteeView1VOTest;
import com.pq.tracs.model.services.view.ContractNoteView2VO.ContractNoteView2VOTest;
import com.pq.tracs.model.services.view.ContractRightCategoryView1VO.ContractRightCategoryView1VOTest;
import com.pq.tracs.model.services.view.ContractRightTemplateROView1VO.ContractRightTemplateROView1VOTest;
import com.pq.tracs.model.services.view.ContractRightView1VO.ContractRightView1VOTest;
import com.pq.tracs.model.services.view.ContractRoyaltyRateTitleView1VO.ContractRoyaltyRateTitleView1VOTest;
import com.pq.tracs.model.services.view.ContractTemplateROView1VO.ContractTemplateROView1VOTest;
import com.pq.tracs.model.services.view.ContractTitleLookupVO.ContractTitleLookupVOTest;
import com.pq.tracs.model.services.view.ContractTitleRightMultiSelectLOV1VO.ContractTitleRightMultiSelectLOV1VOTest;
import com.pq.tracs.model.services.view.ContractTitleRoyaltyRateView1VO.ContractTitleRoyaltyRateView1VOTest;
import com.pq.tracs.model.services.view.ContractTitleView1VO.ContractTitleView1VOTest;
import com.pq.tracs.model.services.view.ContractView1VO.ContractView1VOTest;
import com.pq.tracs.model.services.view.ContractView2VO.ContractView2VOTest;
import com.pq.tracs.model.services.view.CountryLookupVO.CountryLookupVOTest;
import com.pq.tracs.model.services.view.CustomSecurityUserVO1VO.CustomSecurityUserVO1VOTest;
import com.pq.tracs.model.services.view.DashboardUserView1VO.DashboardUserView1VOTest;
import com.pq.tracs.model.services.view.DashboardUserView2VO.DashboardUserView2VOTest;
import com.pq.tracs.model.services.view.DeliveryRightTemplateROView1VO.DeliveryRightTemplateROView1VOTest;
import com.pq.tracs.model.services.view.DeliveryRightTemplateView1VO.DeliveryRightTemplateView1VOTest;
import com.pq.tracs.model.services.view.DeliveryRightView1VO.DeliveryRightView1VOTest;
import com.pq.tracs.model.services.view.DeliveryRightView2VO.DeliveryRightView2VOTest;
import com.pq.tracs.model.services.view.EfeedFormatView1VO.EfeedFormatView1VOTest;
import com.pq.tracs.model.services.view.ExUserChangeDetailsView1VO.ExUserChangeDetailsView1VOTest;
import com.pq.tracs.model.services.view.GenerationMethodLookupVO.GenerationMethodLookupVOTest;
import com.pq.tracs.model.services.view.GroupPermissionsView1VO.GroupPermissionsView1VOTest;
import com.pq.tracs.model.services.view.InProcessOpportunitiesCADashboardView1VO.InProcessOpportunitiesCADashboardView1VOTest;
import com.pq.tracs.model.services.view.InProcessOpportunitiesDashboardView1VO.InProcessOpportunitiesDashboardView1VOTest;
import com.pq.tracs.model.services.view.InProcessOpportunitiesDashboardView2VO.InProcessOpportunitiesDashboardView2VOTest;
import com.pq.tracs.model.services.view.IntegrationMessageROView1VO.IntegrationMessageROView1VOTest;
import com.pq.tracs.model.services.view.IntegrationQueueROView1VO.IntegrationQueueROView1VOTest;
import com.pq.tracs.model.services.view.JContractRightTitlesView1VO.JContractRightTitlesView1VOTest;
import com.pq.tracs.model.services.view.JContractTitleContractRightView1VO.JContractTitleContractRightView1VOTest;
import com.pq.tracs.model.services.view.JTraxTitleContractRightView1VO.JTraxTitleContractRightView1VOTest;
import com.pq.tracs.model.services.view.JTraxTitleContractRightView3VO.JTraxTitleContractRightView3VOTest;
import com.pq.tracs.model.services.view.NewOpportunitiesCADashboardView1VO.NewOpportunitiesCADashboardView1VOTest;
import com.pq.tracs.model.services.view.NewTargetedTitleViewVO.NewTargetedTitleViewVOTest;
import com.pq.tracs.model.services.view.NewTitleActivityView2VO.NewTitleActivityView2VOTest;
import com.pq.tracs.model.services.view.NoteTypeLookupVO.NoteTypeLookupVOTest;
import com.pq.tracs.model.services.view.OVRTitlesLOV1VO.OVRTitlesLOV1VOTest;
import com.pq.tracs.model.services.view.OnHoldOpportunitiesCADashboardView1VO.OnHoldOpportunitiesCADashboardView1VOTest;
import com.pq.tracs.model.services.view.OnHoldOpportunitiesDashboardView1VO.OnHoldOpportunitiesDashboardView1VOTest;
import com.pq.tracs.model.services.view.OnHoldOpportunitiesDashboardView2VO.OnHoldOpportunitiesDashboardView2VOTest;
import com.pq.tracs.model.services.view.OtherEditorContributorView1VO.OtherEditorContributorView1VOTest;
import com.pq.tracs.model.services.view.OvrBrowseTypeView1VO.OvrBrowseTypeView1VOTest;
import com.pq.tracs.model.services.view.OvrByTitleLov1VO.OvrByTitleLov1VOTest;
import com.pq.tracs.model.services.view.OvrLOV1VO.OvrLOV1VOTest;
import com.pq.tracs.model.services.view.OvrPublisherROView1VO.OvrPublisherROView1VOTest;
import com.pq.tracs.model.services.view.OvrPublisherView1VO.OvrPublisherView1VOTest;
import com.pq.tracs.model.services.view.PrmAccountContactMethodView1VO.PrmAccountContactMethodView1VOTest;
import com.pq.tracs.model.services.view.PrmAgreementDataAttachmentView1VO.PrmAgreementDataAttachmentView1VOTest;
import com.pq.tracs.model.services.view.PrmJuOpportunityView1VO.PrmJuOpportunityView1VOTest;
import com.pq.tracs.model.services.view.PrmJuOpportunityView2VO.PrmJuOpportunityView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunitiesDashboardVO1VO.PrmOpportunitiesDashboardVO1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityActivityView1VO.PrmOpportunityActivityView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityActivityView2VO.PrmOpportunityActivityView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityAgreementDataView1VO.PrmOpportunityAgreementDataView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityAttachmentView1VO.PrmOpportunityAttachmentView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityAttachmentView2VO.PrmOpportunityAttachmentView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityContractView1VO.PrmOpportunityContractView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityContractView2VO.PrmOpportunityContractView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityProcessStatusView1VO.PrmOpportunityProcessStatusView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityProcessStatusView2VO.PrmOpportunityProcessStatusView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityStatusView1VO.PrmOpportunityStatusView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityStatusView2VO.PrmOpportunityStatusView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityTargetView1VO.PrmOpportunityTargetView1VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityTargetView2VO.PrmOpportunityTargetView2VOTest;
import com.pq.tracs.model.services.view.PrmOpportunityView1VO.PrmOpportunityView1VOTest;
import com.pq.tracs.model.services.view.PrmTargetGroupTitleView1VO.PrmTargetGroupTitleView1VOTest;
import com.pq.tracs.model.services.view.PrmTargetGroupView1VO.PrmTargetGroupView1VOTest;
import com.pq.tracs.model.services.view.PrmTargetedProductTitleView1VO.PrmTargetedProductTitleView1VOTest;
import com.pq.tracs.model.services.view.PrmTitleProductView1VO.PrmTitleProductView1VOTest;
import com.pq.tracs.model.services.view.PrmTitleTargetedProductView1VO.PrmTitleTargetedProductView1VOTest;
import com.pq.tracs.model.services.view.PrmTitleTargetedProductView2VO.PrmTitleTargetedProductView2VOTest;
import com.pq.tracs.model.services.view.ProcessingGroupViewVO.ProcessingGroupViewVOTest;
import com.pq.tracs.model.services.view.PublisherAddressView1VO.PublisherAddressView1VOTest;
import com.pq.tracs.model.services.view.PublisherAddressView2VO.PublisherAddressView2VOTest;
import com.pq.tracs.model.services.view.PublisherAddressView3VO.PublisherAddressView3VOTest;
import com.pq.tracs.model.services.view.PublisherROView1VO.PublisherROView1VOTest;
import com.pq.tracs.model.services.view.PublisherUrlView1VO.PublisherUrlView1VOTest;
import com.pq.tracs.model.services.view.PublisherView1VO.PublisherView1VOTest;
import com.pq.tracs.model.services.view.PublisherView2VO.PublisherView2VOTest;
import com.pq.tracs.model.services.view.RecentOpportunitiesDashboardView1VO.RecentOpportunitiesDashboardView1VOTest;
import com.pq.tracs.model.services.view.RecentOpportunitiesDashboardView2VO.RecentOpportunitiesDashboardView2VOTest;
import com.pq.tracs.model.services.view.RelatedTitleView1VO.RelatedTitleView1VOTest;
import com.pq.tracs.model.services.view.RelatedTitlesLOVVO.RelatedTitlesLOVVOTest;
import com.pq.tracs.model.services.view.RestrictionTemplateROView2VO.RestrictionTemplateROView2VOTest;
import com.pq.tracs.model.services.view.RestrictionTemplateViewVO.RestrictionTemplateViewVOTest;
import com.pq.tracs.model.services.view.RolesRootReadOnlyView1VO.RolesRootReadOnlyView1VOTest;
import com.pq.tracs.model.services.view.RolesView1VO.RolesView1VOTest;
import com.pq.tracs.model.services.view.RoyaltyInformationView3VO.RoyaltyInformationView3VOTest;
import com.pq.tracs.model.services.view.RoyaltyRateExceptionView1VO.RoyaltyRateExceptionView1VOTest;
import com.pq.tracs.model.services.view.RoyaltyRateTitlesLOV1VO.RoyaltyRateTitlesLOV1VOTest;
import com.pq.tracs.model.services.view.RoyaltyRateView1VO.RoyaltyRateView1VOTest;
import com.pq.tracs.model.services.view.SearchAddressesView1VO.SearchAddressesView1VOTest;
import com.pq.tracs.model.services.view.SearchClassificationsView1VO.SearchClassificationsView1VOTest;
import com.pq.tracs.model.services.view.SearchContractRightsView1VO.SearchContractRightsView1VOTest;
import com.pq.tracs.model.services.view.SearchRoyaltyInfoView1VO.SearchRoyaltyInfoView1VOTest;
import com.pq.tracs.model.services.view.SearchSubjectsView1VO.SearchSubjectsView1VOTest;
import com.pq.tracs.model.services.view.SearchView1VO.SearchView1VOTest;
import com.pq.tracs.model.services.view.SubCategoryValueLookup1VO.SubCategoryValueLookup1VOTest;
import com.pq.tracs.model.services.view.SubjectVerticalView1VO.SubjectVerticalView1VOTest;
import com.pq.tracs.model.services.view.SubjectVerticalView2VO.SubjectVerticalView2VOTest;
import com.pq.tracs.model.services.view.TitleContentOwnerView1VO.TitleContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.TitleContentOwnerView2VO.TitleContentOwnerView2VOTest;
import com.pq.tracs.model.services.view.TitleContractView1VO.TitleContractView1VOTest;
import com.pq.tracs.model.services.view.TitleContractView3VO.TitleContractView3VOTest;
import com.pq.tracs.model.services.view.TitleLOV1VO.TitleLOV1VOTest;
import com.pq.tracs.model.services.view.TitleLanguageView1VO.TitleLanguageView1VOTest;
import com.pq.tracs.model.services.view.TitleLanguageView3VO.TitleLanguageView3VOTest;
import com.pq.tracs.model.services.view.TitleManufacturingView1VO.TitleManufacturingView1VOTest;
import com.pq.tracs.model.services.view.TitleNoteLookupVO.TitleNoteLookupVOTest;
import com.pq.tracs.model.services.view.TitleNoteTypeLookupVO.TitleNoteTypeLookupVOTest;
import com.pq.tracs.model.services.view.TitleNoteView1VO.TitleNoteView1VOTest;
import com.pq.tracs.model.services.view.TitleNoteView2VO.TitleNoteView2VOTest;
import com.pq.tracs.model.services.view.TitleOpportunityView1VO.TitleOpportunityView1VOTest;
import com.pq.tracs.model.services.view.TitleOpportunityView2VO.TitleOpportunityView2VOTest;
import com.pq.tracs.model.services.view.TitleOpportunityView3VO.TitleOpportunityView3VOTest;
import com.pq.tracs.model.services.view.TitleRecordHistoryView2VO.TitleRecordHistoryView2VOTest;
import com.pq.tracs.model.services.view.TitleRecordLegacyDataView2VO.TitleRecordLegacyDataView2VOTest;
import com.pq.tracs.model.services.view.TitleRecordPmClassView2VO.TitleRecordPmClassView2VOTest;
import com.pq.tracs.model.services.view.TitleRecordScheduleView2VO.TitleRecordScheduleView2VOTest;
import com.pq.tracs.model.services.view.TitleRecordView1VO.TitleRecordView1VOTest;
import com.pq.tracs.model.services.view.TitleRecordView2VO.TitleRecordView2VOTest;
import com.pq.tracs.model.services.view.TitleRoyaltyRateLookup1VO.TitleRoyaltyRateLookup1VOTest;
import com.pq.tracs.model.services.view.TitleSeriesTypeLOVVO.TitleSeriesTypeLOVVOTest;
import com.pq.tracs.model.services.view.TitleSeriesView1VO.TitleSeriesView1VOTest;
import com.pq.tracs.model.services.view.TitleSubjectView1VO.TitleSubjectView1VOTest;
import com.pq.tracs.model.services.view.TitleSubjectView2VO.TitleSubjectView2VOTest;
import com.pq.tracs.model.services.view.TitleSubjectView3VO.TitleSubjectView3VOTest;
import com.pq.tracs.model.services.view.TitleView1VO.TitleView1VOTest;
import com.pq.tracs.model.services.view.TitlesContractRightLookUp1VO.TitlesContractRightLookUp1VOTest;
import com.pq.tracs.model.services.view.TraxActivityAttachmentView1VO.TraxActivityAttachmentView1VOTest;
import com.pq.tracs.model.services.view.TraxActivityContentOwnerView1VO.TraxActivityContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.TraxActivityContractView1VO.TraxActivityContractView1VOTest;
import com.pq.tracs.model.services.view.TraxActivityOpportunityView1VO.TraxActivityOpportunityView1VOTest;
import com.pq.tracs.model.services.view.TraxActivityTitleView1VO.TraxActivityTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxActivityUserView1VO.TraxActivityUserView1VOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleCountryViewVO.TraxBlockingRuleCountryViewVOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleDtlView1VO.TraxBlockingRuleDtlView1VOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleDtlView2VO.TraxBlockingRuleDtlView2VOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleFTViewVO.TraxBlockingRuleFTViewVOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleHdrView1VO.TraxBlockingRuleHdrView1VOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleMktViewVO.TraxBlockingRuleMktViewVOTest;
import com.pq.tracs.model.services.view.TraxBlockingRuleOvrView2VO.TraxBlockingRuleOvrView2VOTest;
import com.pq.tracs.model.services.view.TraxContactMethodView1VO.TraxContactMethodView1VOTest;
import com.pq.tracs.model.services.view.TraxContentOwnerActivityView1VO.TraxContentOwnerActivityView1VOTest;
import com.pq.tracs.model.services.view.TraxContentOwnerAttachmentView1VO.TraxContentOwnerAttachmentView1VOTest;
import com.pq.tracs.model.services.view.TraxContractActivityView1VO.TraxContractActivityView1VOTest;
import com.pq.tracs.model.services.view.TraxEventActivityView1VO.TraxEventActivityView1VOTest;
import com.pq.tracs.model.services.view.TraxEventAttachmentView1VO.TraxEventAttachmentView1VOTest;
import com.pq.tracs.model.services.view.TraxEventContentOwnerView1VO.TraxEventContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.TraxEventContractView1VO.TraxEventContractView1VOTest;
import com.pq.tracs.model.services.view.TraxEventNoteView1VO.TraxEventNoteView1VOTest;
import com.pq.tracs.model.services.view.TraxEventOpportunityView1VO.TraxEventOpportunityView1VOTest;
import com.pq.tracs.model.services.view.TraxEventTitleView1VO.TraxEventTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxEventUserView1VO.TraxEventUserView1VOTest;
import com.pq.tracs.model.services.view.TraxEventView1VO.TraxEventView1VOTest;
import com.pq.tracs.model.services.view.TraxImportDataParseView1VO.TraxImportDataParseView1VOTest;
import com.pq.tracs.model.services.view.TraxImportFileView1VO.TraxImportFileView1VOTest;
import com.pq.tracs.model.services.view.TraxImportOvrDataParseView1VO.TraxImportOvrDataParseView1VOTest;
import com.pq.tracs.model.services.view.TraxImportOvrLegacyParseView1VO.TraxImportOvrLegacyParseView1VOTest;
import com.pq.tracs.model.services.view.TraxImportOvrLegacyParseView2VO.TraxImportOvrLegacyParseView2VOTest;
import com.pq.tracs.model.services.view.TraxImportOvrMatchView1VO.TraxImportOvrMatchView1VOTest;
import com.pq.tracs.model.services.view.TraxImportOvrResultsView1VO.TraxImportOvrResultsView1VOTest;
import com.pq.tracs.model.services.view.TraxImportParseErrorView1VO.TraxImportParseErrorView1VOTest;
import com.pq.tracs.model.services.view.TraxImportPotentialMatchView1VO.TraxImportPotentialMatchView1VOTest;
import com.pq.tracs.model.services.view.TraxImportResultsView1VO.TraxImportResultsView1VOTest;
import com.pq.tracs.model.services.view.TraxImportValidationMessageView1VO.TraxImportValidationMessageView1VOTest;
import com.pq.tracs.model.services.view.TraxJuContentOwnerView1VO.TraxJuContentOwnerView1VOTest;
import com.pq.tracs.model.services.view.TraxJuContractRightView1VO.TraxJuContractRightView1VOTest;
import com.pq.tracs.model.services.view.TraxJuContractView1VO.TraxJuContractView1VOTest;
import com.pq.tracs.model.services.view.TraxJuTitleRecordView1VO.TraxJuTitleRecordView1VOTest;
import com.pq.tracs.model.services.view.TraxJuTitleView1VO.TraxJuTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxJuTitleView2VO.TraxJuTitleView2VOTest;
import com.pq.tracs.model.services.view.TraxOvrAttributeTypeView1VO.TraxOvrAttributeTypeView1VOTest;
import com.pq.tracs.model.services.view.TraxOvrAttributeView1VO.TraxOvrAttributeView1VOTest;
import com.pq.tracs.model.services.view.TraxOvrBrDetailsView1VO.TraxOvrBrDetailsView1VOTest;
import com.pq.tracs.model.services.view.TraxRightTemplateView1VO.TraxRightTemplateView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleActivityView1VO.TraxTitleActivityView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleActivityView3VO.TraxTitleActivityView3VOTest;
import com.pq.tracs.model.services.view.TraxTitleAttachmentView1VO.TraxTitleAttachmentView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleAttachmentView2VO.TraxTitleAttachmentView2VOTest;
import com.pq.tracs.model.services.view.TraxTitleChildTitleView1VO.TraxTitleChildTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleIndexInclusionView1VO.TraxTitleIndexInclusionView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleIndexInclusionView2VO.TraxTitleIndexInclusionView2VOTest;
import com.pq.tracs.model.services.view.TraxTitleRecRightCategoryView4VO.TraxTitleRecRightCategoryView4VOTest;
import com.pq.tracs.model.services.view.TraxTitleRecRightCategoryView6VO.TraxTitleRecRightCategoryView6VOTest;
import com.pq.tracs.model.services.view.TraxTitleRecordRestrictionsView2VO.TraxTitleRecordRestrictionsView2VOTest;
import com.pq.tracs.model.services.view.TraxTitleRecordRightView4VO.TraxTitleRecordRightView4VOTest;
import com.pq.tracs.model.services.view.TraxTitleUlrichsTitleView1VO.TraxTitleUlrichsTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxTitleUlrichsTitleView2VO.TraxTitleUlrichsTitleView2VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsAbstractIndexView1VO.TraxUlrichsAbstractIndexView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsClassificationView1VO.TraxUlrichsClassificationView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsEditorView1VO.TraxUlrichsEditorView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsFormerTitleView1VO.TraxUlrichsFormerTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsLanguageView1VO.TraxUlrichsLanguageView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsOnlineVendorView1VO.TraxUlrichsOnlineVendorView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsPublisherView1VO.TraxUlrichsPublisherView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsResmpNotationView1VO.TraxUlrichsResmpNotationView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsSubjectView1VO.TraxUlrichsSubjectView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsTitleRelationView1VO.TraxUlrichsTitleRelationView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsTitleView1VO.TraxUlrichsTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsVariantTitleView1VO.TraxUlrichsVariantTitleView1VOTest;
import com.pq.tracs.model.services.view.TraxUlrichsWireServiceView1VO.TraxUlrichsWireServiceView1VOTest;
import com.pq.tracs.model.services.view.UlrichsTitleLookupView1VO.UlrichsTitleLookupView1VOTest;
import com.pq.tracs.model.services.view.UnifiedTitleSearchView1VO.UnifiedTitleSearchView1VOTest;
import com.pq.tracs.model.services.view.UsersLOV1VO.UsersLOV1VOTest;
import com.pq.tracs.model.services.view.VaryingFormView1VO.VaryingFormView1VOTest;
import com.pq.tracs.model.services.view.VaryingFormView2VO.VaryingFormView2VOTest;
import com.pq.tracs.model.services.view.VaryingFormView3VO.VaryingFormView3VOTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { COActiveContractViewVOTest.class,
                       TraxTitleAttachmentView2VOTest.class,
                       NewTitleActivityView2VOTest.class,
                       PrmOpportunityTargetView2VOTest.class,
                       PrmOpportunityStatusView2VOTest.class,
                       PrmOpportunityProcessStatusView2VOTest.class,
                       PrmOpportunityContractView2VOTest.class,
                       PrmOpportunityAttachmentView2VOTest.class,
                       PrmOpportunityActivityView2VOTest.class,
                       PrmJuOpportunityView2VOTest.class,
                       ProcessingGroupViewVOTest.class,
                       PrmTargetedProductTitleView1VOTest.class,
                       PrmTargetGroupTitleView1VOTest.class,
                       PrmTargetGroupView1VOTest.class,
                       TitleNoteLookupVOTest.class,
                       TraxUlrichsResmpNotationView1VOTest.class,
                       TraxUlrichsFormerTitleView1VOTest.class,
                       PrmJuOpportunityView1VOTest.class,
                       TraxJuContractRightView1VOTest.class,
                       TraxTitleUlrichsTitleView2VOTest.class,
                       TraxJuTitleView2VOTest.class,
                       TraxJuTitleView1VOTest.class,
                       TraxJuTitleRecordView1VOTest.class,
                       TraxJuContractView1VOTest.class,
                       TraxJuContentOwnerView1VOTest.class,
                       UlrichsTitleLookupView1VOTest.class,
                       TraxTitleUlrichsTitleView1VOTest.class,
                       TraxOvrAttributeTypeView1VOTest.class,
                       TraxOvrAttributeView1VOTest.class,
                       TraxImportOvrMatchView1VOTest.class,
                       TraxImportOvrResultsView1VOTest.class,
                       TraxImportOvrLegacyParseView2VOTest.class,
                       TraxImportOvrLegacyParseView1VOTest.class,
                       TraxImportOvrDataParseView1VOTest.class,
                       TraxImportResultsView1VOTest.class,
                       TraxImportParseErrorView1VOTest.class,
                       TraxImportValidationMessageView1VOTest.class,
                       TraxImportPotentialMatchView1VOTest.class,
                       TraxImportDataParseView1VOTest.class,
                       TraxImportFileView1VOTest.class,
                       PublisherView2VOTest.class,
                       GenerationMethodLookupVOTest.class,
                       TraxOvrBrDetailsView1VOTest.class,
                       TraxTitleChildTitleView1VOTest.class,
                       TraxTitleIndexInclusionView2VOTest.class,
                       TraxTitleIndexInclusionView1VOTest.class,
                       RecentOpportunitiesDashboardView1VOTest.class,
                       OnHoldOpportunitiesDashboardView1VOTest.class,
                       InProcessOpportunitiesDashboardView1VOTest.class,
                       DashboardUserView2VOTest.class,
                       PrmOpportunitiesDashboardVO1VOTest.class,
                       BlockingRuleFormatLookupVOTest.class,
                       TraxUlrichsTitleRelationView1VOTest.class,
                       SubCategoryValueLookup1VOTest.class,
                       TraxBlockingRuleDtlView2VOTest.class,
                       TraxBlockingRuleDtlView1VOTest.class,
                       CategoryValueLookup2VOTest.class,
                       TraxBlockingRuleMktViewVOTest.class,
                       TraxBlockingRuleCountryViewVOTest.class,
                       TraxBlockingRuleFTViewVOTest.class,
                       TraxBlockingRuleOvrView2VOTest.class,
                       TraxBlockingRuleHdrView1VOTest.class,
                       TitleOpportunityView3VOTest.class,
                       TitleNoteView2VOTest.class,
                       TraxTitleActivityView3VOTest.class,
                       TitleContractView3VOTest.class,
                       JTraxTitleContractRightView3VOTest.class,
                       DeliveryRightView1VOTest.class,
                       TitleManufacturingView1VOTest.class,
                       OnHoldOpportunitiesCADashboardView1VOTest.class,
                       NewOpportunitiesCADashboardView1VOTest.class,
                       InProcessOpportunitiesCADashboardView1VOTest.class,
                       PrmOpportunityStatusView1VOTest.class,
                       ActivityDashboardView2VOTest.class,
                       CADashboardUserViewVOTest.class,
                       TitleContentOwnerView2VOTest.class,
                       RecentOpportunitiesDashboardView2VOTest.class,
                       InProcessOpportunitiesDashboardView2VOTest.class,
                       OnHoldOpportunitiesDashboardView2VOTest.class,
                       PrmOpportunityProcessStatusView1VOTest.class,
                       TitleOpportunityView2VOTest.class,
                       PrmTitleTargetedProductView2VOTest.class,
                       TitleOpportunityView1VOTest.class,
                       PrmTitleTargetedProductView1VOTest.class,
                       PrmTitleProductView1VOTest.class,
                       ContactLOVVOTest.class,
                       PrmOpportunityActivityView1VOTest.class,
                       TraxEventUserView1VOTest.class,
                       TraxEventTitleView1VOTest.class,
                       TraxEventOpportunityView1VOTest.class,
                       TraxEventNoteView1VOTest.class,
                       TraxEventContractView1VOTest.class,
                       TraxEventContentOwnerView1VOTest.class,
                       TraxEventAttachmentView1VOTest.class,
                       TraxEventActivityView1VOTest.class,
                       TraxEventView1VOTest.class,
                       PrmOpportunityAttachmentView1VOTest.class,
                       PrmAgreementDataAttachmentView1VOTest.class,
                       TraxTitleAttachmentView1VOTest.class,
                       TraxContentOwnerAttachmentView1VOTest.class,
                       TraxActivityAttachmentView1VOTest.class,
                       ContactContentOwnerView1VOTest.class,
                       ContentOwnerContactView1VOTest.class,
                       PrmAccountContactMethodView1VOTest.class,
                       TraxContactMethodView1VOTest.class,
                       VaryingFormView3VOTest.class,
                       TitleSubjectView3VOTest.class,
                       ClassificationView3VOTest.class,
                       NewTargetedTitleViewVOTest.class,
                       PrmOpportunityTargetView1VOTest.class,
                       PrmOpportunityContractView1VOTest.class,
                       PrmOpportunityAgreementDataView1VOTest.class,
                       PrmOpportunityView1VOTest.class,
                       ActivityDashboardView1VOTest.class,
                       DashboardUserView1VOTest.class,
                       TraxActivityUserView1VOTest.class,
                       TraxActivityTitleView1VOTest.class,
                       TraxActivityOpportunityView1VOTest.class,
                       TraxActivityContractView1VOTest.class,
                       TraxActivityContentOwnerView1VOTest.class,
                       TraxContractActivityView1VOTest.class,
                       TraxContentOwnerActivityView1VOTest.class,
                       TraxTitleActivityView1VOTest.class,
                       UnifiedTitleSearchView1VOTest.class,
                       TraxUlrichsWireServiceView1VOTest.class,
                       TraxUlrichsVariantTitleView1VOTest.class,
                       TraxUlrichsSubjectView1VOTest.class,
                       TraxUlrichsPublisherView1VOTest.class,
                       TraxUlrichsOnlineVendorView1VOTest.class,
                       TraxUlrichsLanguageView1VOTest.class,
                       TraxUlrichsEditorView1VOTest.class,
                       TraxUlrichsClassificationView1VOTest.class,
                       TraxUlrichsAbstractIndexView1VOTest.class,
                       TraxUlrichsTitleView1VOTest.class,
                       OvrByTitleLov1VOTest.class,
                       IntegrationMessageROView1VOTest.class,
                       IntegrationQueueROView1VOTest.class,
                       PublisherUrlView1VOTest.class,
                       RestrictionTemplateViewVOTest.class,
                       DeliveryRightTemplateView1VOTest.class,
                       TraxRightTemplateView1VOTest.class,
                       PublisherAddressView3VOTest.class,
                       PublisherAddressView2VOTest.class,
                       PublisherROView1VOTest.class,
                       OvrPublisherROView1VOTest.class,
                       OvrPublisherView1VOTest.class,
                       PublisherAddressView1VOTest.class,
                       PublisherView1VOTest.class,
                       ContractRoyaltyRateTitleView1VOTest.class,
                       RoyaltyRateExceptionView1VOTest.class,
                       NoteTypeLookupVOTest.class,
                       ContractTemplateROView1VOTest.class,
                       ContractRightTemplateROView1VOTest.class,
                       RestrictionTemplateROView2VOTest.class,
                       DeliveryRightTemplateROView1VOTest.class,
                       GroupPermissionsView1VOTest.class,
                       RolesView1VOTest.class,
                       RolesRootReadOnlyView1VOTest.class,
                       OtherEditorContributorView1VOTest.class,
                       SearchSubjectsView1VOTest.class,
                       SubjectVerticalView2VOTest.class,
                       SubjectVerticalView1VOTest.class,
                       OvrLOV1VOTest.class,
                       OvrBrowseTypeView1VOTest.class,
                       ActivityView4VOTest.class, ContactView2VOTest.class,
                       SearchClassificationsView1VOTest.class,
                       OVRTitlesLOV1VOTest.class,
                       TraxTitleRecRightCategoryView6VOTest.class,
                       TraxTitleRecordRestrictionsView2VOTest.class,
                       TraxTitleRecRightCategoryView4VOTest.class,
                       VaryingFormView2VOTest.class,
                       TraxTitleRecordRightView4VOTest.class,
                       TitleSubjectView2VOTest.class,
                       TitleRecordScheduleView2VOTest.class,
                       TitleRecordPmClassView2VOTest.class,
                       TitleRecordLegacyDataView2VOTest.class,
                       TitleRecordHistoryView2VOTest.class,
                       TitleLanguageView3VOTest.class,
                       DeliveryRightView2VOTest.class,
                       ClassificationView2VOTest.class,
                       TitleRecordView2VOTest.class,
                       ContractTitleRightMultiSelectLOV1VOTest.class,
                       ContractGuaranteeMultiSelectLOV1VOTest.class,
                       TitleContentOwnerView1VOTest.class,
                       ContentOwnerTitlesLookup1VOTest.class,
                       JContractTitleContractRightView1VOTest.class,
                       ContractTitleRoyaltyRateView1VOTest.class,
                       ContractTitleView1VOTest.class,
                       TitleRoyaltyRateLookup1VOTest.class,
                       ContractGuaranteeTitleView1VOTest.class,
                       ContractGuaranteeTitlesLOV1VOTest.class,
                       RoyaltyRateTitlesLOV1VOTest.class,
                       CategoryValueLookup1VOTest.class,
                       ContractContactROView1VOTest.class,
                       ContractBasedTitleLOV1VOTest.class,
                       ContractGuaranteeView1VOTest.class,
                       RoyaltyRateView1VOTest.class,
                       SearchRoyaltyInfoView1VOTest.class,
                       SearchContractRightsView1VOTest.class,
                       SearchAddressesView1VOTest.class,
                       SearchView1VOTest.class,
                       ContractTitleLookupVOTest.class,
                       JTraxTitleContractRightView1VOTest.class,
                       TitleSeriesTypeLOVVOTest.class, TitleLOV1VOTest.class,
                       TitlesContractRightLookUp1VOTest.class,
                       TitleNoteTypeLookupVOTest.class,
                       RelatedTitleView1VOTest.class,
                       TitleSeriesView1VOTest.class,
                       //ExUserChangeDetailsView1VOTest.class,
                       TitleLanguageView1VOTest.class,
                       RelatedTitlesLOVVOTest.class,
                       JContractRightTitlesView1VOTest.class,
                       VaryingFormView1VOTest.class,
                       AddedEntryView1VOTest.class, TitleNoteView1VOTest.class,
                       CustomSecurityUserVO1VOTest.class,
                       ContractRightCategoryView1VOTest.class,
                       ContractRightView1VOTest.class,
                       TitleContractView1VOTest.class,
                       COTitlesReadOnlyView1VOTest.class,
                       ClassificationView1VOTest.class,
                       TitleSubjectView1VOTest.class,
                       TitleRecordView1VOTest.class,
                       TitleView1VOTest.class, UsersLOV1VOTest.class,
                       ContractAttachmentView1VOTest.class,
                       CountryLookupVOTest.class,
                       ContentOwnerLOV1VOTest.class,
                       RoyaltyInformationView3VOTest.class,
                       ContractNoteView2VOTest.class,
                       ContractView2VOTest.class, AddressView1VOTest.class,
                       EfeedFormatView1VOTest.class, ContractView1VOTest.class,
                       ContentOwnerNoteView1VOTest.class,
                       AdditionalUrlView1VOTest.class,
                       ContentOwnerView1VOTest.class,
                       ContractGuaranteeCurrencyLookupVOTest.class,
                       ContractGuaranteeDeliveryFormatLookupVOTest.class,
                       ContractGuaranteeInventoryDivisionLookupVOTest.class,
                       ContractGuaranteeMediaCodeLookupVOTest.class,
                       ContractGuaranteeProductCodeLookupVOTest.class,
                       TracsServiceAMTest.class })
public class AllTracsServiceTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        TracsServiceAMFixture.getInstance().release();
    }
}
