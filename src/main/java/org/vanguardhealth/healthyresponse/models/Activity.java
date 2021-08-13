package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String description;
    @OneToOne
    private Worksheet worksheet;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Activity() {}

    public Activity(String title, String description, Worksheet worksheet) {
        this.title = title;
        this.description = description;
        this.worksheet = worksheet;
    }

//    may not be necessary - revisit after worksheets are built out
    public Activity(String title, String description, Worksheet worksheet, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.worksheet = worksheet;
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

    public User getUser() {
        return user;
    }

    //    public Collection<Worksheet> getWorksheets() {
//        return worksheets;
//    }
    public Worksheet getWorksheet() {
        return worksheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity that = (Activity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
