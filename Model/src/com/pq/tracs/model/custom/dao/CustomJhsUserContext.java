package com.pq.tracs.model.custom.dao;

import oracle.jheadstart.model.JhsUserContext;

public class CustomJhsUserContext extends JhsUserContext {

    private int id;
    private String email;
    
    public CustomJhsUserContext() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
