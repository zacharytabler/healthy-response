package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Consequence {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @ManyToMany
    private Collection<Result> results;
    public Collection<Result> getResults() {
        return results;
    }

    public Consequence(){}
    public Consequence(String title,String description, Result...results){
        this.title = title;
        this.description = description;
        this.results = Arrays.asList(results);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consequence that = (Consequence) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
