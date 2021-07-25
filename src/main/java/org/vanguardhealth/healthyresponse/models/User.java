package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String userName;
    private String password;
    private int age;
    @ManyToOne
    private Mood mood;

    @ManyToOne
    public Category category;

    @ManyToOne
    private CopingMechanism copingMechanism;


    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }


    public Mood getMood() {
        return  mood;
    }

    public Category getCategory() {
        return category;
    }
    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }

    public User(){}
    public User(String userName, String password, int age, Mood mood,
                CopingMechanism copingMechanism, Category category){
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mood = mood;
        this.category = category;
        this.copingMechanism =  copingMechanism;
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



}
