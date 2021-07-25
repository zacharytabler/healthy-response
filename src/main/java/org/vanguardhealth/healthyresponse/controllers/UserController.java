package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserRepo userRepo;
    @Resource
    private CopingMechanismRepo copingRepo;
    @Resource
    private ResultRepo resultRepo;
    @Resource
    private ConsequenceRepo consequenceRepo;
    @Resource
    private TriggerRepo triggerRepo;
    @Resource
    private MoodRepo moodRepo;


    @GetMapping("/user_login")
    public Iterable<User> getUser(){
        return userRepo.findAll();
    }
}
