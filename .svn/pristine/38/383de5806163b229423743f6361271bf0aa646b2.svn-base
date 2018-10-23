package com.pq.tracs.view.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCControlBinding;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeDef;
import oracle.jbo.uicli.binding.JUCtrlActionBinding;
import oracle.jbo.uicli.binding.JUCtrlValueBinding;

import oracle.jheadstart.controller.jsf.bean.JhsSearchBean;
import oracle.jheadstart.controller.jsf.util.JsfUtils;

public class TracsSearchBean extends JhsSearchBean {


    private static final ADFLogger sLog =
        ADFLogger.createADFLogger(JhsSearchBean.class);

    private static final String FROM_SUFFIX = "_From";
    private static final String TO_SUFFIX = "_To";

    // search item (attribute name prefixed with group name)
    private boolean diacriticNeutral = false;

    public TracsSearchBean() {
        super();
    }

    /**
     * Creates List of PrmQueryConditions from the search bean
     * with entered search criteria. Processing is as follows:
     * <ul>
     * <li>Loop over all the control bindings in the current binding container.</li>
     * <li>Skip controlbindings that are no queriable valuebindings.</li>
     * <li>For each queriable valuebinding, check for the existence of
     * a corresponding form bean value. When a form bean value exist,
     * create a new PrmQueryCondition. </li>
     * </ul>
     * @return A List with PrmQueryConditions
     * @see oracle.jheadstart.model.QueryCondition
     */
    @Override
    protected List createArgumentListForAdvancedSearch(boolean forceStartsWithClause) {
        sLog.info("initializing method params for advancedSearch");

        DCBindingContainer container = getBindingsInternal();
        DCControlBinding binding = null;
        JUCtrlValueBinding vb = null;
        AttributeDef def = null;
        ArrayList queryConditions = new ArrayList();

        if (diacriticNeutral) {
            queryConditions.add(Boolean.TRUE);
        }
        Iterator searchItems = super.getCriteria().keySet().iterator();
        while (searchItems.hasNext()) {
            def = null;

            String property = (String)searchItems.next();
            // lookup value binding for this property. Does not need
            // to exist when search item matches query bind param!
            String bindingName = property;
            //      String operator =
            //        forceStartsWithClause? PrmQueryCondition.OPERATOR_STARTS_WITH:
            //        (String) operators.get(property);
            String operator = (String)super.getOperators().get(property);
            if (TracsQueryCondition.OPERATOR_GREATER_THAN_OR_EQUAL.equals(operator)) {
                // strip of suffix to _From to find bindingName
                if (property.endsWith(FROM_SUFFIX)) {
                    bindingName =
                            property.substring(0, property.length() - FROM_SUFFIX.length());
                }
            } else if (TracsQueryCondition.OPERATOR_LESS_THAN_OR_EQUAL.equals(operator)) {
                // strip of suffix to _To to find bindingName
                if (property.endsWith(TO_SUFFIX)) {
                    bindingName =
                            property.substring(0, property.length() - TO_SUFFIX.length());
                }
            }

            binding = container.findCtrlBinding(bindingName);
            if (isAttributeBinding(binding)) {
                vb = (JUCtrlValueBinding)binding;
                // def can be null when binding is variable binding!
                // Removed check on queryability of attr def to allow passing
                //                search criterium based on transient EO attr.
                //        if (def==null || !def.isQueriable())
                def = vb.getAttributeDef(0);
            }
            Object value = super.getCriteria().get(property);
            // when def is null, the search item matches a bind param, and we ALWAYS
            // include it then in the argumnets list, otherwise old bind param
            // values would be used ....
            if ((value != null && !"".equals(value)) || def == null) {
                TracsQueryCondition qa = null;
                if (def != null) {
                    qa = new TracsQueryCondition(def, value);
                } else {
                    value = value == null ? "" : value;
                    qa =
 new TracsQueryCondition(property, value, value.getClass());
                }
                qa.setCaseInsensitive(!super.isCaseSensitive());
                String setByUserOperator =
                    (String)super.getOperators().get(property +
                                                     "_QcSetByUser");
                if (setByUserOperator != null && !forceStartsWithClause) {
                    operator = setByUserOperator;
                }

                if (operator != null && !"".equals(operator)) {
                    qa.setOperator(operator);
                } else if (qa.isString()) {
                    qa.setOperator(super.getDefaultStringOperator());
                } else {
                    qa.setOperator(super.getDefaultNonStringOperator());
                }
                queryConditions.add(qa);
            }
        }
        return queryConditions;
    }

    private DCBindingContainer getBindingsInternal() {
        return (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //    return (DCBindingContainer)JsfUtils.getExpressionValue(getBindings());
    }

    private JUCtrlActionBinding getSearchBindingInternal() {
        return (JUCtrlActionBinding)JsfUtils.getExpressionValue(super.getSearchBinding());
    }


    public void setDiacriticNeutral(boolean diacriticNeutral) {
        this.diacriticNeutral = diacriticNeutral;
    }

    public boolean isDiacriticNeutral() {
        return diacriticNeutral;
    }

}
