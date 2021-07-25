package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Result {

    private final String impact;
    private String title;
    private String weight;


    public String getTitle() {
        return title;
    }

    public String getWeight() {
        return weight;
    }

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue
    private Long id;

    public Result(String title,String impact){
        this.title = title;
        this.impact = impact;
    }
    public Result(String impact){
        this.impact = impact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result results = (Result) o;
        return Objects.equals(id, results.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}