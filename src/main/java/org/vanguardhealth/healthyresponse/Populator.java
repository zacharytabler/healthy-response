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
    private CategoryRepo categoryRepo;
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




        Alternatives testAlternative = new Alternatives("test title","test description");
        alternativesRepo.save(testAlternative);

        Result testResult = new Result("test title","test impact",testAlternative);
        resultRepo.save(testResult);

        Consequence testConsequence = new Consequence("test title","test description",testResult);
        consequenceRepo.save(testConsequence);

        CopingMechanism testCopingMechinism = new CopingMechanism("test title","test description",testConsequence);
        copingMechanismRepo.save(testCopingMechinism);


        Category testCategory = new Category("test title","test description",testCopingMechinism);
        categoryRepo.save(testCategory);


        Response testResponse = new Response(testCategory,testCopingMechinism,testConsequence,testResult,testAlternative);
        responseRepo.save(testResponse);

        Mood testMood = new Mood("ok",testCategory);
        moodRepo.save(testMood);

        User testUser = new User("username","password",21,testMood,testCopingMechinism,testCategory);
        userRepo.save(testUser);
        User testUser2 = new User("userName2","password",23,testMood,testCopingMechinism,testCategory);
        userRepo.save(testUser2);



    }
}
