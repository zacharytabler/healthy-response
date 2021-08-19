package org.vanguardhealth.healthyresponse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Worksheet {
    @Id
    @GeneratedValue
    private Long id;
//    private String title;
//    private long timeStamp;
    private boolean acceptUserInput;

    @ManyToOne
    private Activity activity;

    private String instructions;
    private String answer1 = "";
    private String answer2 = "";
    private String answer3 = "";
    private String answer4 = "";
    private String answer5 = "";
    private String answer6 = "";
    private String answer7 = "";
    private String answer8 = "";
    private String answer9 = "";
    private String answer10 = "";

    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    @JsonIgnore
    private IntakeProfile profile;

    public Worksheet() {}

    public Worksheet(String title, boolean acceptUserInput) {
//        this.title = title;
        this.acceptUserInput = acceptUserInput;
//        this.timeStamp = timeStamp;
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
//        this.title = title;
        this.acceptUserInput = acceptUserInput;
//        this.timeStamp = timeStamp;
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

//    public String getTitle() {
//        return title;
//    }

    public boolean isAcceptUserInput() {
        return acceptUserInput;
    }

//    public long getTimeStamp() {
//        timeStamp = System.currentTimeMillis();
//        return timeStamp;
//    }

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

        public void addWorksheetAnswers(String answer) {
            if (answer1 == null) {
                answer1 = answer;
            } else if (answer2 == null) {
                answer2 = answer;
            } else if (answer3 == null) {
                answer3 = answer;
            } else if (answer4 == null) {
                answer4 = answer;
            } else if (answer5 == null) {
                answer5 = answer;
            } else if (answer6 == null) {
                answer6 = answer;
            } else if (answer7 == null) {
                answer7 = answer;
            } else if (answer8 == null) {
                answer8 = answer;
            } else if (answer9 == null) {
                answer9 = answer;
            } else if (answer10 == null) {
                answer10 = answer;
            }
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
