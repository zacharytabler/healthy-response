package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class Worksheet {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Activity activity;

    private String q1; // Question 1 or Instructions in cases with no user input
    private String a1; // Answer 1
    private String q2;
    private String a2;
    private String q3;
    private String a3;
    private String q4;
    private String a4;
    private String q5;
    private String a5;
    private String q6;
    private String a6;
    private String q7;
    private String a7;
    private String q8;
    private String a8;
    private String q9;
    private String a9;
    private String q10;
    private String a10;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Worksheet() {}

    public Worksheet(String title, String description, Activity activity) {
        this.title = title;
        this.description = description;
        this.activity = activity;
        this.user = user;
        this.q1 = q1;
        this.a1 = a1;
        this.q2 = q2;
        this.a2 = a2;
        this.q3 = q3;
        this.a3 = a3;
        this.q4 = q4;
        this.a4 = a4;
        this.q5 = q5;
        this.a5 = a5;
        this.q6 = q6;
        this.a6 = a6;
        this.q7 = q7;
        this.a7 = a7;
        this.q8 = q8;
        this.a8 = a8;
        this.q9 = q9;
        this.a9 = a9;
        this.q10 = q10;
        this.a10 = a10;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getQ1() {
        return q1;
    }

    public String getA1() {
        return a1;
    }

    public String getQ2() {
        return q2;
    }

    public String getA2() {
        return a2;
    }

    public String getQ3() {
        return q3;
    }

    public String getA3() {
        return a3;
    }

    public String getQ4() {
        return q4;
    }

    public String getA4() {
        return a4;
    }

    public String getQ5() {
        return q5;
    }

    public String getA5() {
        return a5;
    }

    public String getQ6() {
        return q6;
    }

    public String getA6() {
        return a6;
    }

    public String getQ7() {
        return q7;
    }

    public String getA7() {
        return a7;
    }

    public String getQ8() {
        return q8;
    }

    public String getA8() {
        return a8;
    }

    public String getQ9() {
        return q9;
    }

    public String getA9() {
        return a9;
    }

    public String getQ10() {
        return q10;
    }

    public String getA10() {
        return a10;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worksheet)) return false;
        Worksheet worksheet = (Worksheet) o;
        return Objects.equals(id, worksheet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
