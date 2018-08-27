/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bal;

import java.sql.Timestamp;

/**
 *
 * @author HP Pavilion
 */
public class Anchor {
    private Domain domain;
    private String anchorHash;
    private String anchorURL;
    private int scanStatus;
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;

    public Domain getDomain() {
        return domain;
    }

    public String getAnchorHash() {
        return anchorHash;
    }

    public String getAnchorURL() {
        return anchorURL;
    }

    public int getScanStatus() {
        return scanStatus;
    }

    public boolean isActivated() {
        return activated;
    }

    public Timestamp getModified() {
        return modified;
    }

    public Timestamp getCreated() {
        return created;
    }

      public Anchor(Domain domain, String anchorURL) throws Exception {
        this.domain = domain;
        this.anchorHash = Hasher.toSha256(anchorURL);
        this.anchorURL = anchorURL;
    this.scanStatus=0;
    this.activated=true;
        this.modified=SameBal.getTimestamp();
        this.created=SameBal.getTimestamp();
    }

    public Anchor(Domain domain, String anchorHash, String anchorURL) {
        this.domain = domain;
        this.anchorHash = anchorHash;
        this.anchorURL = anchorURL;
    }

    public Anchor(Domain domain, String anchorHash, String anchorURL, int scanStatus, boolean activated, Timestamp modified, Timestamp created) {
        this.domain = domain;
        this.anchorHash = anchorHash;
        this.anchorURL = anchorURL;
        this.scanStatus = scanStatus;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }
    
}
