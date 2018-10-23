package com.pq.tracs.model.services.applicationModule;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class TracsServiceAMFixture {
    private static TracsServiceAMFixture fixture1 = new TracsServiceAMFixture();
    private ApplicationModule _am;

    private TracsServiceAMFixture() {
        _am = Configuration.createRootApplicationModule("com.pq.tracs.model.services.TracsService","TracsServiceTest");
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public static TracsServiceAMFixture getInstance() {
        return fixture1;
    }

    public void release() throws Exception {
        Configuration.releaseRootApplicationModule(_am, true);
    }

    public ApplicationModule getApplicationModule() {
        return _am;
    }
}
