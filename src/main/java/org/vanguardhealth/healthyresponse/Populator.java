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



    @Override
    public void run(String... args) throws Exception {

        Consequence jail = new Consequence("Jail","no bueno");
        consequenceRepo.save(jail);

        Mood afraid = new Mood("Afraid", "https://i.ibb.co/wcg76Dp/Afraid.jpg", "The definition of afraid is to be filled with fear or regret. Having feelings of aversion or unwillingness in regard to something.","https://www.verywellmind.com/the-psychology-of-fear-2671696", "https://www.verywellmind.com/healthy-ways-to-face-your-fears-4165487", "https://www.verywellmind.com/7-ways-to-feel-more-courageous-5089058", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood anxious = new Mood("Anxious","https://i.ibb.co/ZcdsPNB/Anxious.jpg", "he definition of anxious is a feeling uneasy and worried but not always with a specific focus. The American Psychological Association (APA) defines anxiety as “an emotion characterized by feelings of tension, worried thoughts and physical changes like increased blood pressure.", "https://www.verywellmind.com/9-things-to-do-if-you-feel-anxious-5087875", "https://www.verywellmind.com/ways-to-defuse-anxious-thoughts-3863037", "https://www.verywellmind.com/journaling-a-great-tool-for-coping-with-anxiety-3144672", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "https://www.youtube.com/watch?v=O-6f5wQXSu8");
        Mood sad = new Mood("Sad", "https://i.ibb.co/ZWc6p9H/Sad.jpg", "The definition of sad is being affected by unhappiness or grief; sorrowful or mournful.", "https://www.verywellmind.com/can-you-be-depressed-but-not-know-it-yet-1066886", "https://www.verywellmind.com/sadness-is-not-depression-2330492", "https://www.medicalnewstoday.com/articles/284741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)",  "https://www.youtube.com/watch?v=j7d5Plai03g&t=267s");
        Mood lonely = new Mood("Lonely", "https://i.ibb.co/DkPKB17/Lonely.jpg", "The definition of lonely is sad from being apart from other people or causing sad feelings that come from being apart from other people.", "https://www.verywellmind.com/loneliness-causes-effects-and-treatments-2795749", "https://www.verywellmind.com/how-to-cope-with-loneliness-3144939", "https://www.verywellmind.com/things-to-do-if-you-feel-lonely-5081371", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "https://www.youtube.com/watch?v=itZMM5gCboo&t=33s");
        Mood depressed = new Mood("Depressed", "https://i.ibb.co/3SfxPdm/Depressed.jpg", "The definition for depressed is a state of general unhappiness or despondency. A person suffering from clinical depression.", "https://www.verywellmind.com/how-do-i-tell-a-doctor-im-depressed-1067387", "https://www.verywellmind.com/is-it-my-fault-that-im-depressed-1066597", "https://www.verywellmind.com/what-depression-feels-like-5088793", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "https://www.youtube.com/watch?v=j7d5Plai03g&t=267s" );
        Mood hopeless = new Mood("Hopeless", "https://i.ibb.co/LNDqPDH/Hopeless.jpg", "The definition for hopeless is having no expectation of good or success; beyond optimism or hope; desperate.", "https://www.verywellmind.com/9-things-to-do-if-you-feel-hopeless-5081877", "https://www.psychologytoday.com/us/blog/science-and-sensibility/201502/overcome-hopelessness-thinking-and-stop-feeling-depressed", "https://www.verywellmind.com/things-to-do-if-you-feel-helpless-5093315", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Hopeline Network: 1-800-SUICIDE (784-2433)", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "https://www.youtube.com/watch?v=xRxT9cOKiM8&t=55s");
        Mood suicidal = new Mood("Suicidal", "https://i.ibb.co/SJZQKSr/Suicidal.png", "The definition of suicidal is deeply unhappy or depressed and likely to commit suicide.", "Suicide: What will happen to you when you ask for help?", "https://www.mentalhelp.net/suicide/why-does-it-seem-like-a-solution/", "https://www.mentalhelp.net/depression/when-to-seek-professional-help/", "National Suicide Prevention Lifeline: 1-800-273-TALK (8255)", "Dial 911", "", "");
        Mood homicidal = new Mood("Violent", "https://i.ibb.co/stzKxDz/Homicidal.jpg", "The definition of violence is using or involving physical force intended to hurt, damage, or kill someone or something.", "https://www.verywellmind.com/is-depression-linked-to-violence-1067393", "https://www.mentalhelp.net/blogs/the-link-between-anger-and-stress/", "https://www.mentalhelp.net/anger/management/deciding-to-do-something/", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "https://www.youtube.com/watch?v=wkse4PPxkk4&t=217s");
        Mood exhausted = new Mood("Exhausted", "https://i.ibb.co/d5NLbdW/Exhausted.jpg", "The definition of exhaustion is a state of extreme physical or mental fatigue.", "https://www.verywellmind.com/feeling-exhausted-easy-stress-management-3144713", "https://www.verywellmind.com/stress-relief-for-tired-people-3145199", "https://www.mentalhelp.net/blogs/give-yourself-a-break", "Crisis Text Line: Text “home” to 741741", "Substance Abuse and Mental Health Services Administration (SAMHSA): 1-800-662-HELP (4357)", "National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)", "https://www.youtube.com/watch?v=z6X5oEIg6Ak");
        moodRepo.save(afraid);
        moodRepo.save(anxious);
        moodRepo.save(depressed);
        moodRepo.save(exhausted);
        moodRepo.save(homicidal);
        moodRepo.save(hopeless);
        moodRepo.save(lonely);
        moodRepo.save(sad);
        moodRepo.save(suicidal);

//      =========================================================================================

        User user1 = new User("user1", "user1");
        User admin1 = new User("admin1", "admin1");
        userRepo.save(user1);
        userRepo.save(admin1);

        String activityTitle1 = "Reframing Critical Self Talk";
        String activityTitle2 = "Strengths Spotting by Exception Finding";

        Worksheet worksheet1 = new Worksheet(activityTitle1 + " Worksheet", false);
        Worksheet worksheet2 = new Worksheet(activityTitle2 + " Worksheet", true);

        worksheetRepo.save(worksheet1);
        worksheetRepo.save(worksheet2);

        String activityDescription1 = "Self-criticism can be regarded as the opposite of self-compassion. Whereas self-compassion involves a positive and accepting relationship with the self, self-criticism can be construed as negative and punishing thoughts directed toward one‘s personal characteristics. Self-criticism typically concerns judgment and self-blame regarding shortcomings, such as the inability to accomplish personal goals or meet other people’s expectations.The goal of this exercise is to increase awareness of inner criticism and promote a more self-compassionate stance towards the self.";
        String activityDescription2 = "A key technique in Positive CBT is borrowed from solution-focused therapy, namely first identifying and then analyzing times when a problem did not exist. Consider what was different when the problem was absent (Molnar and de Shazer, 1987). Rather than focusing on the who, what, when, and where of problems, exception finding about focusing on the who, what, when, and where of exception times. Consequently, this increases awareness of strengths relative to goals, rather than deficiencies relative to problems.";

        Activity activity1 = new Activity(activityTitle1, activityDescription1, worksheet1);
        Activity activity2 = new Activity(activityTitle2, activityDescription2, worksheet2);

        activityRepo.save(activity1);
        activityRepo.save(activity2);

//      =========================================================================================




//      =========================================================================================

        Trigger finances = new Trigger("Financial Issues","Having financial problems means being unable to pay debts over the short or long term. ... " +
                "Financial difficulties become a source of stress until all debts are paid.");
        Trigger domestic = new Trigger("Relationship Issues","\"domestic relationship\" means a personal relationship between 2 adults in which one " +
                "provides personal or financial commitment and support of a domestic nature for the material benefit of the other and includes a domestic partnership " +
                "but does not include a legal marriage.");
        Trigger occupation = new Trigger("Occupational Stress","A term commonly used in the professional business industry, occupational stress refers to " +
                "the ongoing or progressing stress an employee experiences due to the responsibilities, conditions, environment, or other pressures of the workplace.");
        Trigger parental = new Trigger("Parental Stress","parental stress description");
        Trigger gunViolence = new Trigger("Gun Violence","gun violence description");
        Trigger domesticViolence = new Trigger("Domestic Violence","domestic violence description");
        Trigger bullying = new Trigger("Bullying","bullying description");
        triggerRepo.save(bullying);
        triggerRepo.save(domesticViolence);
        triggerRepo.save(gunViolence);
        triggerRepo.save(parental);
        triggerRepo.save(domestic);
        triggerRepo.save(finances);
        triggerRepo.save(occupation);
        CopingMechanism doDrugs = new CopingMechanism("Abuse Drugs","drug abuse description");
        CopingMechanism drinkAlcohol = new CopingMechanism("Consume Alcohol","Alcoholism");
        CopingMechanism violence = new CopingMechanism("Commit Violence","violence description",jail);
        CopingMechanism suicide = new CopingMechanism("Self-Harm","self harm description and help line");
        CopingMechanism isolate = new CopingMechanism("Isolate","isolate definition");
        CopingMechanism eatStarve = new CopingMechanism("Eat/Starve","eating disorders help");
        CopingMechanism divorce = new CopingMechanism("File for Divorce","divorce effects description");
        copingMechanismRepo.save(isolate);
        copingMechanismRepo.save(eatStarve);
        copingMechanismRepo.save(divorce);
        copingMechanismRepo.save(suicide);
        copingMechanismRepo.save(violence);
        copingMechanismRepo.save(doDrugs);
        copingMechanismRepo.save(drinkAlcohol);

    }
}
