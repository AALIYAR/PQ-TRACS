package com.pq.tracs.faces.mds;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.share.config.UserCC;

import oracle.jheadstart.model.JhsUser;
import oracle.jheadstart.model.JhsUserContext;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;

public class TracsUserCC extends UserCC {
    public TracsUserCC() {
        super();
    }

    /**
     * Overrides the UserCC
     * @param sess
     * @param mo
     * @return
     */
    public String[] getValue(RestrictedSession sess, MetadataObject mo) {
        try {
            FacesContext fc = FacesContext.getCurrentInstance();

            if (fc == null) {
                return new String[] { null };
            } else {
                ExternalContext ec = fc.getExternalContext();
                HttpSession session = (HttpSession)ec.getSession(true);
                if (session == null) {
                    return new String[] { null };
                } else {
                    Object uk = session.getAttribute(JhsUser.JHS_USER_KEY);
                    if (uk == null) {
                        return new String[] { null };
                    } else {
                        JhsUserContext juc = (JhsUserContext)uk;
                        return new String[] { juc.getUserId() };
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return new String[] { null };
        }
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public CacheHint getCacheHint() {
        return super.getCacheHint();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
