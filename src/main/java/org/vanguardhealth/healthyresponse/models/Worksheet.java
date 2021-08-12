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
    private boolean acceptUserInput;

    private String instructions;
    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private String question3;
    private String answer3;
    private String question4;
    private String answer4;
    private String question5;
    private String answer5;
    private String question6;
    private String answer6;
    private String question7;
    private String answer7;
    private String question8;
    private String answer8;
    private String question9;
    private String answer9;
    private String question10;
    private String answer10;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Worksheet() {}

    public Worksheet(String title, String description, Activity activity) {
        this.title = title;
        this.description = description;
        this.activity = activity;
        this.acceptUserInput = false;
        this.instructions = instructions;
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.question3 = question3;
        this.answer3 = answer3;
        this.question4 = question4;
        this.answer4 = answer4;
        this.question5 = question5;
        this.answer5 = answer5;
        this.question6 = question6;
        this.answer6 = answer6;
        this.question7 = question7;
        this.answer7 = answer7;
        this.question8 = question8;
        this.answer8 = answer8;
        this.question9 = question9;
        this.answer9 = answer9;
        this.question10 = question10;
        this.answer10 = answer10;
    }

    public Worksheet(String title, String description, Activity activity, User user, String question1, String answer1) {
        this.title = title;
        this.description = description;
        this.activity = activity;
        this.acceptUserInput = true;
        this.user = user;
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.question3 = question3;
        this.answer3 = answer3;
        this.question4 = question4;
        this.answer4 = answer4;
        this.question5 = question5;
        this.answer5 = answer5;
        this.question6 = question6;
        this.answer6 = answer6;
        this.question7 = question7;
        this.answer7 = answer7;
        this.question8 = question8;
        this.answer8 = answer8;
        this.question9 = question9;
        this.answer9 = answer9;
        this.question10 = question10;
        this.answer10 = answer10;
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

    public String getInstructions() {
        return instructions;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getQuestion3() {
        return question3;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getQuestion4() {
        return question4;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getQuestion5() {
        return question5;
    }

    public String getAnswer5() {
        return answer5;
    }

    public String getQuestion6() {
        return question6;
    }

    public String getAnswer6() {
        return answer6;
    }

    public String getQuestion7() {
        return question7;
    }

    public String getAnswer7() {
        return answer7;
    }

    public String getQuestion8() {
        return question8;
    }

    public String getAnswer8() {
        return answer8;
    }

    public String getQuestion9() {
        return question9;
    }

    public String getAnswer9() {
        return answer9;
    }

    public String getQuestion10() {
        return question10;
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
