package com.pq.tracs.model.bo;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeDef;
import oracle.jbo.AttributeList;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;

import oracle.jbo.server.TransactionEvent;

import oracle.jheadstart.model.JhsUserContext;
import oracle.jheadstart.model.adfbc.v2.JhsApplicationModule;

public class TracsBaseEntity extends EntityImpl {

    private static final String CREATED_BY = "CreatedBy";
    private static final String MODIFIED_BY = "LastUpdatedBy";
    private static final String CREATED_DATE = "CreatedDate";
    private static final String MODIFIED_DATE = "LastUpdatedDate";
    private static final String DEFAULT_USER = "TRACS";

    public TracsBaseEntity() {

    }

    private String userDisplayName;

    protected String getLoginUserId() {
        try {
            ApplicationModule am =
                getDBTransaction().getRootApplicationModule();
            JhsApplicationModule jhsAm = (JhsApplicationModule)am;
            Object user = jhsAm.getUser();
            JhsUserContext userContext = (JhsUserContext)user;

            return userContext.getUserId();
        } catch (Exception ee) {
            System.out.println("Error while getting user id in TracsBaseEntity :" +
                               ee.toString());
        }

        return DEFAULT_USER;

    }

    protected Number getJhsUsersId() {
        Number tmpId = null;
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn =
this.getDBTransaction().createPreparedStatement("commit", 1).getConnection();
            String sql1 =
                "SELECT ID, DISPLAY_NAME FROM JHS_USERS WHERE USERNAME = '" +
                this.getLoginUserId() + "'";

            stmt =
conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql1);
            rs.first();
            tmpId = new Number(rs.getInt("ID"));
            userDisplayName = rs.getString("DISPLAY_NAME");
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return tmpId;
    }

    protected void create(AttributeList atts) {

        super.create(atts);

        String userId = getLoginUserId();

        this.setAttribute(CREATED_BY, userId);
        this.setAttribute(MODIFIED_BY, userId);
        this.setAttribute(CREATED_DATE,
                          new Date(new Timestamp(System.currentTimeMillis())));
        this.setAttribute(MODIFIED_DATE,
                          new Date(new Timestamp(System.currentTimeMillis())));

        try {
            AttributeDef[] attrs = this.getEntityDef().getAttributeDefs();
            String nameKeyAttr = null;
            for (AttributeDef attr : attrs) {
                if (attr.isPrimaryKey()) {
                    nameKeyAttr = attr.getName();
                    break;
                }

            }

            int id = -1;
            try {
                id =
 ((oracle.jbo.domain.Number)this.getAttribute("Id")).intValue();
            } catch (Exception eee) {
            }

            if (nameKeyAttr != null && id <= 0) {
                SequenceImpl seq =
                    new SequenceImpl("JHS_SEQ", getDBTransaction());
                this.setAttribute(nameKeyAttr, seq.getSequenceNumber());
            }
        } catch (Exception e1) {
            System.out.println("*******************Exception while inseting(primary key generation) in TracsBaseEntity.***********************");
            System.out.println("Error :" + e1.toString());
            //throw new JboException("Invalid primary key value.");
        }
    }

    protected void prepareForDML(int operation, TransactionEvent e) {

        super.prepareForDML(operation, e);

        try {
            if (operation == DML_UPDATE || operation == DML_INSERT) {
                String userId = getLoginUserId();

                this.setAttribute(MODIFIED_BY, userId);
                this.setAttribute(MODIFIED_DATE,
                                  new Date(new Timestamp(System.currentTimeMillis())));
            }
        } catch (Exception eeee) {
            eeee.printStackTrace();
        }

    }

    public String getUserDisplayName() {
        return userDisplayName;
    }


    @Override
    protected void setAttributeInternal(int i, Object object) {
//        if (object.getClass().equals(String.class)) {
//            //  System.out.println("Before:"+(String)object);
//            object = ((String)object).trim();
//            //   System.out.println("After:"+(String)object);
//        }
        super.setAttributeInternal(i, object);

    }


}


