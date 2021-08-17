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

        Mood afraid = new Mood("Afraid", "https://i.ibb.co/wcg76Dp/Afraid.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n","<a href=https://www.verywellmind.com/the-psychology-of-fear-2671696 target=_blank>What is Fear?</a>", "<a href=https://psychcentral.com/quizzes/anxiety-quiz#1 target=_blank>PsychCentral: Anxiety Screening Test</a>",
                "<a href=https://www.verywellmind.com/healthy-ways-to-face-your-fears-4165487 target=_blank>How to Face Your Fears</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>"
                , "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood anxious = new Mood("Anxious","https://i.ibb.co/ZcdsPNB/Anxious.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellhealth.com/anxiety-symptoms-5086955 target=_blank>Anxiety Symptoms</a>", "<a href=https://psychcentral.com/quizzes/anxiety-quiz#1 target=_blank>PsychCentral: Anxiety Screening Test</a>", "<a href=https://www.verywellmind.com/9-things-to-do-if-you-feel-anxious-5087875 target=_blank>9 Things To Do If You Feel Anxious</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood sad = new Mood("Sad", "https://i.ibb.co/ZWc6p9H/Sad.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/sadness-is-not-depression-2330492 target=_blank>What is Sadness?</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>",
                "<a href=https://www.gundersenhealth.org/health-wellness/live-happy/healthy-ways-to-deal-with-sadness/ target=_blank>Healthy Ways To Deal With Sadness</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433> National Hopeline Network: 1-800-SUICIDE (784-2433</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>",  "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood lonely = new Mood("Lonely", "https://i.ibb.co/DkPKB17/Lonely.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/loneliness-causes-effects-and-treatments-2795749 target=_blank>Loneliness: Causes and Health Consequences</a>", "<a href=https://psychcentral.com/quizzes/loneliness-quiz target=_blank>PsychCentral: The Loneliness Quiz</a>", "<a href=https://www.verywellmind.com/how-to-cope-with-loneliness-3144939 target=_blank>9 Ways to Cope With Loneliness</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/itZMM5gCboo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood depressed = new Mood("Depressed", "https://i.ibb.co/3SfxPdm/Depressed.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n",
                "<a href=https://www.verywellmind.com/depression-4157261 target=_blank>Depression</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>", "<a href=https://www.verywellmind.com/how-do-i-tell-a-doctor-im-depressed-1067387 target=_blank>How to Tell Your Doctor You're Depressed</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433>National Hopeline Network: 1-800-SUICIDE (784-2433)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/j7d5Plai03g\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" );
        Mood hopeless = new Mood("Hopeless", "https://i.ibb.co/LNDqPDH/Hopeless.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://psychcentral.com/blog/the-9-types-of-hopelessness-and-how-to-overcome-them target=_blank>9 Types of Hopelessness and How to Overcome Them</a>", "<a href=https://psychcentral.com/quizzes/depression-quiz target=_blank>PsychCentral: Do You Have Depression?</a>", "<a href=https://www.verywellmind.com/9-things-to-do-if-you-feel-hopeless-5081877 target=_blank>9 Things to Do If You Feel Hopeless</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-784-2433>National Hopeline Network: 1-800-SUICIDE (784-2433)</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/xRxT9cOKiM8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood suicidal = new Mood("Suicidal", "https://i.ibb.co/j3KHsM6/National-Suicide-Prevention-Hotline-1-800-273-8255.jpg", "If you are feeling suicidal, thinking about hurting yourself, or are concerned that someone you know may be in danger of hurting himself or herself, call the National Suicide Prevention Lifeline at 1-800-273-TALK (1-800-273-8255). It is available 24 hours a day, 7 days a week and is staffed by certified crisis response professionals.", "<a href=https://www.verywellmind.com/suicide-4157253 target=_blank>Understanding Suicide</a>", "",
                "<a href=https://www.mentalhelp.net/suicide/about-asking-for-help/ target=_blank>Suicide: What will happen to you when you ask for help?</a>", "<a href=tel:800-273-8255>National Suicide Prevention Lifeline: 1-800-273-TALK (8255)</a>", "<a href=tel:>Dial 911</a>", "", "");
        Mood homicidal = new Mood("Violent", "https://i.ibb.co/stzKxDz/Homicidal.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellmind.com/what-is-anger-5120208 target=_blank>What Is Anger?</a>", "<a href=https://www.psychologytoday.com/us/tests/personality/anger-management-test-abridged target=_blank>PsychCentral: Anger Management Test</a>", "<a href=https://www.mentalhelp.net/anger/management/deciding-to-do-something/ target=_blank>Deciding To Manage Anger</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>",
                "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/wkse4PPxkk4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
        Mood exhausted = new Mood("Exhausted", "https://i.ibb.co/d5NLbdW/Exhausted.jpg", "Healthy Response is not a diagnostic tool. Only a trained medical professional, like a doctor or mental health professional, can help you determine the next best steps for you.\n", "<a href=https://www.verywellhealth.com/fatigue-symptoms-causes-diagnosis-and-treatment-4768481 target=_blank>What Is Fatigue?</a>", "<a href=https://psychcentral.com/quizzes/stress-test target=_blank>PsychCentral: How Stressed Are You?</a>", "<a href=https://www.mentalhelp.net/blogs/give-yourself-a-break target=_blank>Give Yourself A Break</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "<a href=tel:800-662-4357>Substance Abuse and Mental Health Services Administration (SAMHSA) Helpline: 1-800-662-HELP (4357)</a>", "<a href=tel:800-950-6264>National Alliance on Mental Illness (NAMI) Helpline: 1-800-950-NAMI (6264)</a>", "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/z6X5oEIg6Ak\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
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


        Trigger finances = new Trigger("Financial Issues", "Financial issues means being unable to pay debts over the short or long term. Financial difficulties become a source of stress until all debts are paid.","https://i.ibb.co/r2S5ZhK/Financial-Issues.jpg", "<a href=https://www.apa.org/topics/stress/holiday-money target=_blank>Dealing with financial stress</a>", "<a href=https://www.verywellmind.com/understanding-and-preventing-financial-stress-3144546 target=_blank>Coping With Financial Stress in Your Life</a>", "<a href=https://www.verywellmind.com/how-to-handle-the-stress-of-a-financial-crisis-3144545 target=_blank>Dealing With the Stress of a Financial Crisis</a>", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>","","");
        Trigger domestic = new Trigger("Relationship Issues","Relationship issues are issues between two individuals in an interpersonal relationship. Relationship issues may include infidelity, loss of intimacy, communication difficulties, coping with stress challenges, financial pressures, boundary violations, difficulty balancing individual and couple expectations, divorce, separation and breaking up.", "https://i.ibb.co/v4GMTdn/Relationship-Issues.jpg", "<a href=https://www.mentalhelp.net/articles/relationship-problems/ target=_blank>Relationship Problems</a>", "<a href=https://www.verywellmind.com/the-toll-of-conflict-in-relationships-3144952 target=_blank>Effects of Conflict and Stress on Relationships</a>", "<a href=https://www.verywellmind.com/all-about-healthy-relationship-4774802 target=_blank>How to Know If You Are In a Healthy Relationship</a>", "<a href=tel:800-799-7233>National Domestic Violence Hotline: 1-800-799-SAFE</a>", "<a href=tel:866-331-9474>Love Is Respect: 1-866-331-9474</a>", "");
        Trigger occupation = new Trigger("Occupational Stress","Occupational stress is term commonly used in the professional business industry, occupational stress refers to the ongoing or progressing stress an employee experiences due to the responsibilities, conditions, environment, or other pressures of the workplace.", "https://i.ibb.co/LgZ8csD/Occupational-Stress.jpg", "https://www.verywellmind.com/how-to-deal-with-stress-at-work-3145273", "https://www.mayoclinic.org/healthy-lifestyle/stress-management/in-depth/coping-with-stress/art-20048369", "https://www.chihealth.com/en/services/eap/stress-at-work.html", "<a href=tel:741741>Crisis Text Line: Text “home” to 741741</a>", "", "");
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
