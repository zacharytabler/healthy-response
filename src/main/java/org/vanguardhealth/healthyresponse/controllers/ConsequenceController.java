package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Consequence;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@CrossOrigin
public class ConsequenceController {
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

    @GetMapping("/consequences")
    public Iterable<Consequence> getConsequences(){
        return consequenceRepo.findAll();
    }
    @GetMapping("/consequence/{id}")
    public Consequence getConsequence(@PathVariable Long id){
        return consequenceRepo.findById(id).get();
    }
}
