package com.pq.tracs.view.custom.beans;

import com.pq.tracs.model.services.TracsServiceImpl;
import com.pq.tracs.util.DESEncrypter;

import java.io.IOException;

import java.security.MessageDigest;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.JboException;

import oracle.jheadstart.controller.jsf.AuthenticationFilter;
import oracle.jheadstart.controller.jsf.bean.JhsModelServiceProvider;
import oracle.jheadstart.controller.jsf.bean.LocaleManager;
import oracle.jheadstart.controller.jsf.bean.LoginBean;
import oracle.jheadstart.controller.jsf.util.JhsDCErrorHandlerImpl;
import oracle.jheadstart.controller.jsf.util.JsfUtils;
import oracle.jheadstart.model.JhsUser;
import oracle.jheadstart.model.adfbc.service.common.JhsModelService;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustomLoginBean extends LoginBean {

    public static final int SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
    public static final String USER_NAME = "AFw2ER2wfg345F";
    public static final String PASSWORD = "Fg34FRewrr423";
    private String logoutDestination = "/";

    private boolean saveCookie = false;

    public CustomLoginBean() {
        try {
            loadCookieValues();
        } catch (Exception ee) {
        }
    }

    public String authenticateUser() {
        return doCustomAuthentication();

    }

    /**
     * Authenticate the userby calling the authenticateUser method
     * on the nested JhsModelService application module. By default, this method
     * will authenticate against the JHeadstart JHS_USERS table. To use your own security
     * tables, you can override method authenticateUser on the JhsModelService. See the
     * JHeadstart Developer's guide, chapter 'Application Security' for more information.
     * @return
     */
    public String doCustomAuthentication() {
        JhsModelService jms =
            JhsModelServiceProvider.getInstance().getJhsModelService();
        if (jms != null) {
            try {
                String password = getPassword();
                String userName = getUsername();
                if (userName != null)
                    userName = userName.toUpperCase();

                if (password != null) {
                    DESEncrypter encryper = new DESEncrypter();
                    password = encryper.encrypt(password);
                }

                JhsUser user = jms.authenticateUser(userName, password);
                JsfUtils.storeOnSession(JhsUser.JHS_USER_KEY, user);
                if (user != null && user.getLocale() == null) {
                    user.setLocale(LocaleManager.getInstance().getCurrentLocale());
                }

                // set the last login timestamp
                try {
                    BindingContext bindingContext =
                        BindingContext.getCurrent();
                    DCDataControl dc =
                        bindingContext.findDataControl("TracsServiceDataControl");
                    TracsServiceImpl appM =
                        (TracsServiceImpl)dc.getDataProvider();
                    appM.setLastLoginForUser();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                // redirect to originally requested page
                String requestURL =
                    (String)JsfUtils.getFromSession(AuthenticationFilter.JHS_PRE_LOGIN_URI_KEY);
                JsfUtils.redirect(requestURL);
            } catch (JboException e) {
                BindingContext bc =
                    (BindingContext)JsfUtils.getExpressionValue("#{data}");
                if (bc.getErrorHandler() instanceof JhsDCErrorHandlerImpl) {
                    JhsDCErrorHandlerImpl eru =
                        (JhsDCErrorHandlerImpl)bc.getErrorHandler();
                    String message = eru.getDisplayMessage(bc, e);
                    JsfUtils.getInstance().addFormattedError(message);
                } else {
                    throw e;
                }
            }
        }
        return null;
    }

    private void loadCookieValues() {
        try {
            Cookie[] cookies = JsfUtils.getHTTPServletRequest().getCookies();

            for (int loopIndex = 0; loopIndex < cookies.length; loopIndex++) {
                Cookie cookie1 = cookies[loopIndex];

                if (cookie1.getName().equals(USER_NAME)) {
                    setUsername(cookie1.getValue());
                } else if (cookie1.getName().equals(PASSWORD)) {
                    setPassword(cookie1.getValue());
                }
            }
            if (getUsername() != null && getPassword() != null)
                setSaveCookie(true);
        } catch (Exception eee) {
            eee.printStackTrace();
        }
    }

    private void removeCookieValues() {
        try {
            Cookie[] cookies = JsfUtils.getHTTPServletRequest().getCookies();

            for (int loopIndex = 0; loopIndex < cookies.length; loopIndex++) {
                Cookie cookie1 = cookies[loopIndex];

                if (cookie1.getName().equals(USER_NAME)) {
                    cookie1.setPath("/");
                    cookie1.setMaxAge(0);
                    JsfUtils.getHttpServletResponse().addCookie(cookie1);

                } else if (cookie1.getName().equals(PASSWORD)) {
                    setPassword(cookie1.getValue());
                    cookie1.setPath("/");
                    cookie1.setMaxAge(0);
                    JsfUtils.getHttpServletResponse().addCookie(cookie1);

                }
            }
            if (getUsername() != null && getPassword() != null)
                setSaveCookie(true);
        } catch (Exception eee) {
            eee.printStackTrace();
        }
    }


    public void setSaveCookie(boolean saveCookie) {
        this.saveCookie = saveCookie;
    }

    public boolean isSaveCookie() {
        return saveCookie;
    }


    public String logout() throws IOException {

        // set the last login timestamp
        try {
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("TracsServiceDataControl");
            TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
            appM.setLastLoginForUser();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        ExternalContext ectx =
            FacesContext.getCurrentInstance().getExternalContext();
        HttpServletResponse response = (HttpServletResponse)ectx.getResponse();
        HttpSession session = (HttpSession)ectx.getSession(false);
        session.invalidate();

        /**
       * Customized
       */
        removeCookieValues();
        // if logout dest starts with slash, then prefix with
        // context path
        String dest = getLogoutDestination();
        if (dest.startsWith("/")) {
            dest = JsfUtils.getHTTPServletRequest().getContextPath() + dest;
        }
        //sLog.debug("Redirecting to "+dest);
        response.sendRedirect(dest);
        FacesContext.getCurrentInstance().responseComplete();
        return null;
    }

    public void setLogoutDestination(String logoutDestination) {
        this.logoutDestination = logoutDestination;
    }

    public String getLogoutDestination() {
        return logoutDestination;
    }

}
