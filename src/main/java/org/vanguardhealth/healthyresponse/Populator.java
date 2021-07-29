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
        triggerRepo.save(testTrigger);


        Response testResponse = new Response(testTrigger,testCopingMechinism,testConsequence,testResult,testAlternative);
        responseRepo.save(testResponse);

        Mood testMood = new Mood("ok", testTrigger);
        moodRepo.save(testMood);

        User testUser = new User("TESTusername","password",21,testMood,testCopingMechinism, testTrigger);
        userRepo.save(testUser);




    }
}
