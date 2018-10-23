package com.pq.tracs.view.beans;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Locale;

import oracle.jbo.AttributeDef;

import oracle.jbo.common.DefLocaleContext;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.format.Formatter;

import oracle.jheadstart.model.QueryCondition;
import oracle.jheadstart.util.DateFormatUtils;

public class TracsQueryCondition extends QueryCondition {

    public TracsQueryCondition(String name, Object value, Class javaType) {
        super(name, value, javaType);

    }

    public TracsQueryCondition(AttributeDef def, Object value) {
        super(def, value);

    }

    /**
     * Set the query operator that must be used for this attribute.
     * The following conversions are executed to convert the logical operator
     * to SQL-based operator:
     * <pre>
     *  "contains" is converted to LIKE, and wildcardUsage is set to surround
     *  "doesNotContain" is converted to NOT LIKE, and wildcardUsage is set to surround
     *  "startsWith" is converted to LIKE, and wildcardUsage is set to suffix
     *  "endsWith" is converted to LIKE, and wildcardUsage is set to prefix
     *  "greaterThan" is converted to &gt;
     *  "greaterThanOrEqual" is converted to &gt;=
     *  "lessThan" is converted to &lt;
     *  "lessThanOrEqual" is converted to &lt;=
     *  "is" is converted to =
     *  "isNot" is converted to &lt;&gt;
     * </pre>
     * If the operator does not match any of the above values, no transformation
     * is applied, and the passed in value is set directly as operator
     * @param operator
     */
    public void setOperator(String operator) {
        super.setOperator(operator);
        if (operator.equals(OPERATOR_CONTAINS)) {
            this.setOperator("like");
            this.setWildcardUsage(null);
        } else if (operator.equals(OPERATOR_STARTS_WITH)) {
            this.setOperator("like");
            this.setWildcardUsage(null);
        }
    }

}
