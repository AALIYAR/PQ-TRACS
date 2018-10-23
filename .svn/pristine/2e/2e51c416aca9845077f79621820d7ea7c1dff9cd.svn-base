package com.pq.tracs.view.beans;

import oracle.jheadstart.view.dyntab.DynTab;
import oracle.jheadstart.view.dyntab.DynTabContext;

public class TracsDynTabContext extends DynTabContext {
    public TracsDynTabContext() {
        super();
    }


    @Override
    protected void removeTab(DynTab tab, boolean force) {

        //Need to first check if tab is already null,
        //this prevents tabList from becoming corrupt
        if (tab.getUniqueIdentifier() != null) {
            super.removeTab(tab, force);
        }
    }
}
