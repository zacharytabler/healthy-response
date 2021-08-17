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
    @Resource
    private ActivityRepo activityRepo;
    @Resource
    private WorksheetRepo worksheetRepo;
    @Resource
    private IntakeProfileRepository profileRepo;

    @Override
    public void run(String... args) throws Exception {

        Consequence jail = new Consequence("Jail","no bueno");
        consequenceRepo.save(jail);

        Mood afraid = new Mood("Afraid", "https://i.ibb.co/wcg76Dp/Afraid.jpg", "The definition of afraid is to be filled with fear or regret. Having feelings of aversion or unwillingness in regard to something.","https://www.verywellmind.com/the-psychology-of-fear-2671696", "https://www.verywellmind.com/healthy-ways-to-face-your-fears-4165487", "https://www.verywellmind.com/7-ways-to-feel-more-courageous-5089058", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood anxious = new Mood("Anxious","https://i.ibb.co/ZcdsPNB/Anxious.jpg", "The definition of anxious is a feeling uneasy and worried but not always with a specific focus. The American Psychological Association (APA) defines anxiety as “an emotion characterized by feelings of tension, worried thoughts and physical changes like increased blood pressure.", "https://www.verywellmind.com/9-things-to-do-if-you-feel-anxious-5087875", "https://www.verywellmind.com/ways-to-defuse-anxious-thoughts-3863037", "https://www.verywellmind.com/journaling-a-great-tool-for-coping-with-anxiety-3144672", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood sad = new Mood("Sad", "https://i.ibb.co/ZWc6p9H/Sad.jpg", "The definition of sad is being affected by unhappiness or grief; sorrowful or mournful.", "https://www.verywellmind.com/can-you-be-depressed-but-not-know-it-yet-1066886", "https://www.verywellmind.com/sadness-is-not-depression-2330492", "https://www.medicalnewstoday.com/articles/284741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)",  "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood lonely = new Mood("Lonely", "https://i.ibb.co/DkPKB17/Lonely.jpg", "The definition of lonely is sad from being apart from other people or causing sad feelings that come from being apart from other people.", "https://www.verywellmind.com/loneliness-causes-effects-and-treatments-2795749", "https://www.verywellmind.com/how-to-cope-with-loneliness-3144939", "https://www.verywellmind.com/things-to-do-if-you-feel-lonely-5081371", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/itZMM5gCboo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood depressed = new Mood("Depressed", "https://i.ibb.co/3SfxPdm/Depressed.jpg", "The definition for depressed is a state of general unhappiness or despondency. A person suffering from clinical depression.", "https://www.verywellmind.com/how-do-i-tell-a-doctor-im-depressed-1067387", "https://www.verywellmind.com/is-it-my-fault-that-im-depressed-1066597", "https://www.verywellmind.com/what-depression-feels-like-5088793", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" );
        Mood hopeless = new Mood("Hopeless", "https://i.ibb.co/LNDqPDH/Hopeless.jpg", "The definition for hopeless is having no expectation of good or success; beyond optimism or hope; desperate.", "https://www.verywellmind.com/9-things-to-do-if-you-feel-hopeless-5081877", "https://www.psychologytoday.com/us/blog/science-and-sensibility/201502/overcome-hopelessness-thinking-and-stop-feeling-depressed", "https://www.verywellmind.com/things-to-do-if-you-feel-helpless-5093315", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/xRxT9cOKiM8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood suicidal = new Mood("Suicidal", "https://i.ibb.co/SJZQKSr/Suicidal.png", "The definition of suicidal is deeply unhappy or depressed and likely to commit suicide.", "Suicide: What will happen to you when you ask for help?", "https://www.mentalhelp.net/suicide/why-does-it-seem-like-a-solution/", "https://www.mentalhelp.net/depression/when-to-seek-professional-help/", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "Dial 911", "", "");
        Mood homicidal = new Mood("Violent", "https://i.ibb.co/stzKxDz/Homicidal.jpg", "The definition of violence is using or involving physical force intended to hurt, damage, or kill someone or something.", "https://www.verywellmind.com/is-depression-linked-to-violence-1067393", "https://www.mentalhelp.net/blogs/the-link-between-anger-and-stress/", "https://www.mentalhelp.net/anger/management/deciding-to-do-something/", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/wkse4PPxkk4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood exhausted = new Mood("Exhausted", "https://i.ibb.co/d5NLbdW/Exhausted.jpg", "The definition of exhaustion is a state of extreme physical or mental fatigue.", "https://www.verywellmind.com/feeling-exhausted-easy-stress-management-3144713", "https://www.verywellmind.com/stress-relief-for-tired-people-3145199", "https://www.mentalhelp.net/blogs/give-yourself-a-break", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/z6X5oEIg6Ak\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        moodRepo.save(afraid);
        moodRepo.save(anxious);
        moodRepo.save(depressed);
        moodRepo.save(exhausted);
        moodRepo.save(homicidal);
        moodRepo.save(hopeless);
        moodRepo.save(lonely);
        moodRepo.save(sad);
        moodRepo.save(suicidal);



        User user1 = new User("user1", "user1");
        User admin1 = new User("admin1", "admin1");

        String activityTitle1 = "Reframing Critical Self Talk";
        String worksheetTitle1 = "ReframingCriticalSelfTalk";
        String activityTitle2 = "Strengths Spotting by Exception Finding";
        String worksheetTitle2 = "StrengthsSpottingByExceptionFinding";

        Worksheet worksheet1 = new Worksheet(worksheetTitle1, false);
        Worksheet worksheet2 = new Worksheet(worksheetTitle2, true);

        String activityDescription1 = "Self-criticism can be regarded as the opposite of self-compassion. Whereas self-compassion involves a positive and accepting relationship with the self, self-criticism can be construed as negative and punishing thoughts directed toward one‘s personal characteristics. Self-criticism typically concerns judgment and self-blame regarding shortcomings, such as the inability to accomplish personal goals or meet other people’s expectations.The goal of this exercise is to increase awareness of inner criticism and promote a more self-compassionate stance towards the self.";
        String activityDescription2 = "A key technique in Positive CBT is borrowed from solution-focused therapy, namely first identifying and then analyzing times when a problem did not exist. Consider what was different when the problem was absent (Molnar and de Shazer, 1987). Rather than focusing on the who, what, when, and where of problems, exception finding about focusing on the who, what, when, and where of exception times. Consequently, this increases awareness of strengths relative to goals, rather than deficiencies relative to problems.";

        Activity activity1 = new Activity(activityTitle1, activityDescription1, worksheet1);
        Activity activity2 = new Activity(activityTitle2, activityDescription2, worksheet2);

        worksheetRepo.save(worksheet1);
        worksheetRepo.save(worksheet2);

        activityRepo.save(activity1);
        activityRepo.save(activity2);

//        user1.addWorksheet(worksheet1);
//        user1.addWorksheet(worksheet2);

        userRepo.save(user1);
        userRepo.save(admin1);

//        user1.addWorksheet(worksheet1);
//        user1.addWorksheet(worksheet2);

        IntakeProfile profile = new IntakeProfile("John", "Doe", "Asian", "Columbus", "OH", "status", "About Me" );
        profileRepo.save(profile);

        Trigger finances = new Trigger("Financial Issues", "Financial issues means being unable to pay debts over the short or long term. Financial difficulties become a source of stress until all debts are paid.","https://i.ibb.co/r2S5ZhK/Financial-Issues.jpg", "https://www.verywellmind.com/how-to-handle-the-stress-of-a-financial-crisis-3144545", "https://www.verywellmind.com/understanding-and-preventing-financial-stress-3144546", "https://www.mentalhelp.net/blogs/how-to-untangle-the-money-issues-in-your-relationship/", "","","");
        Trigger domestic = new Trigger("Relationship Issues","Relationship issues are issues between two individuals in an interpersonal relationship. Relationship issues may include infidelity, loss of intimacy, communication difficulties, coping with stress challenges, financial pressures, boundary violations, difficulty balancing individual and couple expectations, divorce, separation and breaking up.", "https://i.ibb.co/v4GMTdn/Relationship-Issues.jpg", "https://www.verywellmind.com/all-about-healthy-relationship-4774802", "https://www.verywellmind.com/the-toll-of-conflict-in-relationships-3144952", "https://www.mentalhelp.net/articles/relationship-problems/", "Love Is Respect: 1-866-331-9474", "", "");
        Trigger occupation = new Trigger("Occupational Stress","Occupational stress is term commonly used in the professional business industry, occupational stress refers to the ongoing or progressing stress an employee experiences due to the responsibilities, conditions, environment, or other pressures of the workplace.", "https://i.ibb.co/LgZ8csD/Occupational-Stress.jpg", "https://www.verywellmind.com/how-to-deal-with-stress-at-work-3145273", "https://www.mayoclinic.org/healthy-lifestyle/stress-management/in-depth/coping-with-stress/art-20048369", "https://www.chihealth.com/en/services/eap/stress-at-work.html", "", "", "");
        Trigger parental = new Trigger("Parental Stress","Parental arises when parenting demands exceed the expected and actual resources available to the parents that permit them to succeed in the parent role. Parental stress is a normal part of the parenting experience.","https://i.ibb.co/wp123Rv/Parental-Stress.jpg", "https://health.clevelandclinic.org/ready-snap-tips-for-stressed-out-parents", "https://www.psychologytoday.com/us/blog/the-race-good-health/201306/4-tips-managing-parenting-stress", "https://parentingscience.com/parenting-stress-evidence-based-tips", "Parental Stress Line: (800) 632-8188", "", "");
        Trigger gunViolence = new Trigger("Gun Violence","Gun violence is violence committed with the use of firearms, for example pistols, shotguns, assault rifles or machine guns.", "https://i.ibb.co/X7Rt5Tj/Gun-Violence.jpg", "https://www.verywellmind.com/shooting-ptsd-from-a-shooting-2797200", "https://www.counseling.org/knowledge-center/coping-in-the-aftermath-of-a-shooting", "https://www.apa.org/topics/gun-violence-crime/mass-shooting", "National Center for Victims of Crime: (800) 394-2255", "Disaster Distress Helpline: (800) 985-5990", "Sidran Institute: (410)-825-8888");
        Trigger domesticViolence = new Trigger("Domestic Violence","Domestic violence is defined as violent or aggressive behavior within the home, typically involving the violent abuse of a spouse or partner.","https://i.ibb.co/FHPKJh8/Domestic-Violence.jpg", "https://www.verywellmind.com/signs-that-a-relationship-could-turn-violent-4100203", "https://www.verywellmind.com/different-types-of-domestic-violence-5119884", "https://www.verywellmind.com/domestic-violence-danger-assessment-quiz-66532", "National Domestic Violence Hotline: 800-799-7233", "Take the Night Foundation Hotline: 567-742-8837", "Victim Contact Resource Center: 800-656-4673");
        Trigger bullying = new Trigger("Bullying","The definition of bullying is unwanted, aggressive behavior that involves a real or perceived power imbalance.", "https://i.ibb.co/0yxpnS3/Bullyinhg.jpg", "https://www.stompoutbullying.org/bullying-prevention-tip-sheet", "https://www.verywellfamily.com/how-building-selfesteem-can-prevent-bullying-460679", "https://www.verywellfamily.com/how-bullying-hotlines-work-4589992", "NoBully.org Help Hotline: 1-866-488-7386", "Crisis Text Line: Type HOME to 741741", "Cyber Civil Rights Initiative Crisis Helpline: 1-844-878-2274");
        triggerRepo.save(bullying);
        triggerRepo.save(domesticViolence);
        triggerRepo.save(gunViolence);
        triggerRepo.save(parental);
        triggerRepo.save(domestic);
        triggerRepo.save(finances);
        triggerRepo.save(occupation);
        CopingMechanism doDrugs = new CopingMechanism("Abuse Drugs","Drug abuse is is the use of a drug in amounts or by methods which are harmful to the individual or others.", "https://i.ibb.co/0q57ZTJ/Abuse-Drugs.jpg", "http://www.12steps.org/", "https://drugabuse.com/drug-addiction-quiz/", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)", "Narcotics Anonymous: (818) 773-9999", "", "");
        CopingMechanism drinkAlcohol = new CopingMechanism("Consume Alcohol","Alcoholism is defined as an addiction to the consumption of alcoholic liquor or the mental illness and compulsive behavior resulting from alcohol dependency.", "https://i.ibb.co/ChZF8Sy/Consume-Alcohol.jpg", "https://www.verywellmind.com/frequently-asked-questions-about-alcohol-problems-3865910", "https://www.verywellmind.com/alcohol-is-a-dangerous-drug-66528", "https://www.verywellmind.com/could-you-have-an-alcohol-abuse-problem-3894213", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)","Alcoholics Anonymous: (212) 870-3400", "Al-Anon Family Groups: (888) 425-2666");
        CopingMechanism violence = new CopingMechanism("Commit Violence","To commit violence is to use physical force so as to injure, abuse, damage, or destroy.","https://i.ibb.co/d2fYwtZ/Commit-Violence.jpg", "https://www.mentalhelp.net/abuse/are-you-the-abuser/", "https://www.psychologistworld.com/stress/anger-test", "", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)");
        CopingMechanism suicide = new CopingMechanism("Self-Harm","Self-harm is the act of purposely hurting oneself as an emotional coping mechanism.", "https://i.ibb.co/FzPtGHM/Self-Harm.jpg", "", "", "", "", "", "");
        CopingMechanism isolate = new CopingMechanism("Isolate","Isolation is the experience of being separated from others. It may result from being physically separated from others, or it can also result from being emotionally removed from a community", "https://i.ibb.co/GsJ1NjR/Isolate.jpg", "", "", "", "", "", "");
        CopingMechanism eatStarve = new CopingMechanism("Eat/Starve","Eating disorders can be varied but are characterized by abnormal or disturbed eating habits", "https://i.ibb.co/ZKc5Ztw/Eat-Starve.jpg", "", "", "", "", "", "");
        CopingMechanism divorce = new CopingMechanism("File for Divorce","The definition of divorce is the legal dissolution of a marriage by a court or other competent body", "https://i.ibb.co/TvhVNt0/Divorce.jpg", "", "", "", "", "", "");
        copingMechanismRepo.save(isolate);
        copingMechanismRepo.save(eatStarve);
        copingMechanismRepo.save(divorce);
        copingMechanismRepo.save(suicide);
        copingMechanismRepo.save(violence);
        copingMechanismRepo.save(doDrugs);
        copingMechanismRepo.save(drinkAlcohol);

    }
}
