package org.vanguardhealth.healthyresponse.models;


import javax.persistence.*;
import java.util.*;

@Entity
public class User {


    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    public IntakeProfile intakeProfile;

    private String userName;
    private String password;
    private String role;
    @ManyToOne
    private Mood mood;

    @ManyToOne
    public Trigger trigger;

    @ManyToOne
    private CopingMechanism copingMechanism;

//    @OneToMany(mappedBy="user")
//    private Collection<Activity> activities;

    @OneToMany(mappedBy="user")
    private Collection<Worksheet> worksheets;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Mood getMood() {
        return  mood;
    }

    public Trigger getTrigger() {
        return trigger;
    }
    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }

    public Collection<Worksheet> getWorksheets() {
        return worksheets;
    }

    public void addWorksheet(Worksheet worksheetToAdd) {
        worksheets.add(worksheetToAdd);
    }

    public User(){}
    public User(String userName,String password, Worksheet...worksheets){
        this.userName = userName;
        this.password = password;


    }
    public User(String userName, String password, String role, Worksheet...worksheets) {
        this.userName=userName;
        this.password=password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


//    public void addProfile(Set<IntakeProfile> profile) {
//        intakeProfile.add(profile);
//    }
//
//    public Collection<Set<IntakeProfile>> getIntakeProfile() {
//        return intakeProfile;
//    }
}
