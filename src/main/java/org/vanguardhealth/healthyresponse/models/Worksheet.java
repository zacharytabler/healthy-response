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
    private long timeStampMillis;
    private boolean acceptUserInput;

    @ManyToOne
    private Activity activity;

    private String instructions;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    private IntakeProfile profile;

    public Worksheet() {}

    public Worksheet(String title, boolean acceptUserInput) {
        this.title = title;
        this.acceptUserInput = acceptUserInput;
        this.activity = activity;
    }

//    public Worksheet(String title, boolean acceptUserInput, User user, String answer1) {
////        this.title = title;
//        this.acceptUserInput = acceptUserInput;
////        this.timeStamp = timeStamp;
//        this.user = user;
//        this.answer1 = answer1;
//        this.answer2 = answer2;
//        this.answer3 = answer3;
//        this.answer4 = answer4;
//        this.answer5 = answer5;
//        this.answer6 = answer6;
//        this.answer7 = answer7;
//        this.answer8 = answer8;
//        this.answer9 = answer9;
//        this.answer10 = answer10;
//    }

    public Worksheet(String title, String answer1, String answer2, String answer3, String answer4) {
        this.title = title;
        this.timeStampMillis = System.currentTimeMillis();
        this.answer1= answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
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

    public long getTimeStampMillis() {
        return timeStampMillis;
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
