package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Worksheet {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
//    @OneToOne(mappedBy = "worksheet")
    @OneToOne
    private Activity activity;
    private boolean acceptUserInput;

    private String instructions;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;
    private String answer7;
    private String answer8;
    private String answer9;
    private String answer10;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Worksheet() {}

    public Worksheet(String title, boolean acceptUserInput) {
        this.title = title;
        this.acceptUserInput = acceptUserInput;
        this.activity = activity;
        this.instructions = instructions;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
    }

    public Worksheet(String title, boolean acceptUserInput, User user, String answer1) {
        this.title = title;
        this.acceptUserInput = acceptUserInput;
        this.user = user;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAcceptUserInput() {
        return acceptUserInput;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public String getAnswer10() {
        return answer10;
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
