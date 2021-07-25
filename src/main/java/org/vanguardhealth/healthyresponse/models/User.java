package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String userName;
    private String password;
    private int age;
    @OneToOne
    private Mood mood;


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
        return mood;
    }

    public User(){}
    public User(String userName, String password, int age, Mood mood){
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mood = mood;
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
