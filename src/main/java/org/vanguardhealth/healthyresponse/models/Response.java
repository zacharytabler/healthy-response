package org.vanguardhealth.healthyresponse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Response {
    @Id
    @GeneratedValue
    private Long id;
    private Mood mood;
    private Category category;
    private CopingMechanism copingMechanism;
    private Consequence consequence;
    private Result result;

    public Long getId() {
        return id;
    }

    public Mood getMood() {
        return mood;
    }

    public Category getCategory() {
        return category;
    }

    public CopingMechanism getCopingMechanism() {
        return copingMechanism;
    }

    public Consequence getConsequence() {
        return consequence;
    }

    public Result getResult() {
        return result;
    }

    public Response(){}
    public Response(Mood mood,Category category,CopingMechanism copingMechanism,
                    Consequence consequence,Result result){

        this.mood = mood;
        this.category = category;
        this.copingMechanism = copingMechanism;
        this.consequence = consequence;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return Objects.equals(id, response.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
