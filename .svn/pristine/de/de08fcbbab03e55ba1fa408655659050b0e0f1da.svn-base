package com.pq.tracs.view.beans;

import java.util.List;
import java.util.Map;

import oracle.jbo.Row;

import oracle.jheadstart.controller.jsf.bean.LovItemBean;

public class TracsLovItemBean extends LovItemBean {
    public TracsLovItemBean() {
        super();
    }

    @Override
    public void copyMultiSelectReturnValues(List<Map> rowDataList) {
        super.getTableBean().setCreateNewRowAtTop(false);
        super.copyMultiSelectReturnValues(rowDataList);
        super.getTableBean().setCreateNewRowAtTop(true);
    }

    @Override
    public void copyReturnValues(Map selectedRowData, Row baseRow,
                                 boolean copyToUI, boolean commaSeparated) {
        super.copyReturnValues(selectedRowData, baseRow, true, commaSeparated);
    }
}
