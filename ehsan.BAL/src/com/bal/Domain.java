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
public class Domain {
    // basic info about domain buisness object
    private String domainHash;
    private String domainURL;
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;

    public String getDomainHash() {
        return domainHash;
    }

    public String getDomainURL() {
        return domainURL;
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

    public Domain(String domainURL) throws Exception{
        this.domainHash = Hasher.toSha256(domainURL);
        this.domainURL = domainURL;
        this.activated=true;
        this.modified=SameBal.getTimestamp();
    
        this.created=SameBal.getTimestamp();
    }
    public Domain(String domainHash,String domainURL)
    {
        this.domainHash=domainHash;
        this.domainURL=domainURL;
    }
//used when loading data from database
    public Domain(String domainHash, String domainURL, boolean activated, Timestamp modified, Timestamp created) {
        this.domainHash = domainHash;
        this.domainURL = domainURL;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }
    
    
}
