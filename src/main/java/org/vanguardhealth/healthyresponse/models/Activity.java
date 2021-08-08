package org.vanguardhealth.healthyresponse.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
//    @OneToMany
//    private Collection<Journal> journals;

    @ManyToOne
    private User user;

    public Activity() {}

    public Activity(long id, String title, String description, boolean hasWorksheet) {
        this.id = id;
        this.title = title;
        this.description = description;
//        this.journals = new ArrayList<>(Arrays.asList(journals));
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

//    public Collection<Journal> getJournals() {
//        return journals;
//    }

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
