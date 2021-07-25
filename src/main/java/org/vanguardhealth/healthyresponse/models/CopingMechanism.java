package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class CopingMechanism {


    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

    @ManyToMany
    private Collection <Consequence> consequence;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Consequence> getConsequence() {
        return consequence;
    }

    public CopingMechanism(String title,String description,Consequence...consequence){
        this.title = title;
        this.description = description;
        this.consequence = Arrays.asList(consequence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopingMechanism that = (CopingMechanism) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

