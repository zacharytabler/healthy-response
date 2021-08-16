package org.vanguardhealth.healthyresponse.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Reviews {
    @Id
    @GeneratedValue
    private long id;
    private String fname;
    private String lname;
    private String email;
    private String subject;

    public Reviews(long id, String fname, String lname, String email, String subject) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
