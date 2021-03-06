package com.baidubce.services.lss.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

/**
 * Created by wuyafei on 16/10/17.
 */
public class PauseDomainStreamRequest extends AbstractBceRequest {

    private String domain = null;

    private String app = null;

    private String stream = null;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public PauseDomainStreamRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public PauseDomainStreamRequest withApp(String app) {
        this.app = app;
        return this;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public PauseDomainStreamRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    public PauseDomainStreamRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class PauseDomainStreamRequest {\n");
        sb.append("    domain: ").append(domain).append("\n");
        sb.append("    app: ").append(app).append("\n");
        sb.append("    stream: ").append(stream).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
