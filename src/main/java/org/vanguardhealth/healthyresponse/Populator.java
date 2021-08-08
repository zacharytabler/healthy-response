package org.vanguardhealth.healthyresponse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.vanguardhealth.healthyresponse.models.*;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private UserRepo userRepo;
    @Resource
    private MoodRepo moodRepo;
    @Resource
    private TriggerRepo triggerRepo;
    @Resource
    private CopingMechanismRepo copingMechanismRepo;
    @Resource
    private ConsequenceRepo consequenceRepo;
    @Resource
    private ResultRepo resultRepo;
    @Resource
    private ResponseRepo responseRepo;
    @Resource
    private AlternativesRepo alternativesRepo;
    @Resource ActivityRepo activityRepo;
    @Override
    public void run(String... args) throws Exception {




        Alternatives testAlternative = new Alternatives("test alternatives title","test alternatives description");
        alternativesRepo.save(testAlternative);

        Result testResult = new Result("test result title","test result impact",testAlternative);
        resultRepo.save(testResult);

        Consequence testConsequence = new Consequence("test consequence title","test consequence description",testResult);
        consequenceRepo.save(testConsequence);

        CopingMechanism testCopingMechinism = new CopingMechanism("test coping title","test cpoing description",testConsequence);
        copingMechanismRepo.save(testCopingMechinism);


        Trigger testTrigger = new Trigger("test title trigger","test trigger description",testCopingMechinism);
        Trigger finances = new Trigger("Financial Issues","Having financial problems means being unable to pay debts over the short or long term. ... " +
                "Financial difficulties become a source of stress until all debts are paid.");
        Trigger domestic = new Trigger("Domestic Relationship","\"domestic relationship\" means a personal relationship between 2 adults in which one " +
                "provides personal or financial commitment and support of a domestic nature for the material benefit of the other and includes a domestic partnership " +
                "but does not include a legal marriage.");
        Trigger occupation = new Trigger("Workplace Stress","A term commonly used in the professional business industry, occupational stress refers to " +
                "the ongoing or progressing stress an employee experiences due to the responsibilities, conditions, environment, or other pressures of the workplace.");
        triggerRepo.save(domestic);
        triggerRepo.save(finances);
        triggerRepo.save(occupation);
        triggerRepo.save(testTrigger);


        Response testResponse = new Response(testTrigger,testCopingMechinism,testConsequence,testResult,testAlternative);
        responseRepo.save(testResponse);

        Mood afraid = new Mood("Afraid");
        Mood anxious = new Mood("Anxious");
        Mood sad = new Mood("Sad");
        Mood lonely = new Mood("Lonely");
        Mood depressed = new Mood("Depressed");
        Mood hopeless = new Mood("Hopeless");
        Mood suicidal = new Mood("Suicidal");
        Mood homicidal = new Mood("Homicidal");
        Mood exhausted = new Mood("Exhausted");
        moodRepo.save(afraid);
        moodRepo.save(anxious);
        moodRepo.save(depressed);
        moodRepo.save(exhausted);
        moodRepo.save(homicidal);
        moodRepo.save(hopeless);
        moodRepo.save(lonely);
        moodRepo.save(sad);
        moodRepo.save(suicidal);

        String activityDescription1 = "Self-criticism can be regarded as the opposite of self-compassion.";
//                "Whereas self-compassion involves a positive and accepting relationship with the self, self-criticism can be construed as negative and punishing thoughts directed toward one‘s personal characteristics. Self-criticism typically concerns judgment and self-blame regarding shortcomings, such as the inability to accomplish personal goals or meet other people’s expectations.The goal of this exercise is to increase awareness of inner criticism and promote a more self-compassionate stance towards the self.";

        String activityDescription2 = "A key technique in Positive CBT is borrowed from solution-focused therapy, namely first identifying and then analysing times when a client’s presenting complaint or problem did not happen.";
//                "The practitioner invites the client to consider what was different when the problem was absent (Molnar and de Shazer, 1987). Rather than focusing on the who, what, when, and where of problems, exception finding about focusing on the who, what, when, and where of exception times. Consequently, clients become aware of their strengths relative to their goals, rather than their deficiencies relative to their problems.";

        Activity activity1 = new Activity("Reframing Critical Self Talk", activityDescription1);
        Activity activity2 = new Activity("Strengths Spotting by Exception Finding", activityDescription2);

        activityRepo.save(activity1);
        activityRepo.save(activity2);


        User testUser = new User("TESTusername","password",21,sad,testCopingMechinism, testTrigger);
        userRepo.save(testUser);




    }
}
