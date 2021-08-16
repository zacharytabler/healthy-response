package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Alternatives;
import org.vanguardhealth.healthyresponse.repositories.*;


import javax.annotation.Resource;

@CrossOrigin
@RestController

public class AppointmentController {

    @Resource
    AppointmentRepo appointmentRepo;
    @GetMapping("/appointment")
    public Iterable<Alternatives> getAppointment(){
        return  appointmentRepo.findAll();
    }
    @GetMapping("/appointment/{id}")
    public Alternatives getAppointment(@PathVariable Long id){
        return appointmentRepo.findById(id).get();
    }





}
