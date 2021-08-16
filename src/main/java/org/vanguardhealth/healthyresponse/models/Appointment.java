package org.vanguardhealth.healthyresponse.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Appointment {
    @Id
    @GeneratedValue
    private long id;
    private String date;
    private String time;
    private String martialStatus;
    private String  disability;
    private String veteranStatus;
    private String subject;
    private String contact_name;
    private String phoneNumber;
    private String email;


    public Appointment(String date, String time, String martialStatus, String disability, String veteranStatus, String subject, String contact_name, String phoneNumber, String email) {
        this.date = date;
        this.time = time;
        this.martialStatus = martialStatus;
        this.disability = disability;
        this.veteranStatus = veteranStatus;
        this.subject = subject;
        this.contact_name = contact_name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public String getDisability() {
        return disability;
    }

    public String getVeteranStatus() {
        return veteranStatus;
    }

    public String getSubject() {
        return subject;
    }

    public String getContact_name() {
        return contact_name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
