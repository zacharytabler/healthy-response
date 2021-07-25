package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Collection<Mood> moods;

    @ManyToMany
    @OrderColumn
    private Collection<CopingMechanism> copingMechanism;

    @OneToMany(mappedBy = "category")
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public Collection<CopingMechanism> getCopingMechanism() {
        return copingMechanism;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public Category(){}

    public Category(String name, String description, CopingMechanism...copingMechanism){
        this.name = name;
        this.description = description;
        this.copingMechanism = Arrays.asList(copingMechanism);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}