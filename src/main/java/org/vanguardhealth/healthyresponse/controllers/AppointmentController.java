package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Appointment;
import org.vanguardhealth.healthyresponse.models.Consequence;
import org.vanguardhealth.healthyresponse.repositories.*;


import javax.annotation.Resource;
import java.util.Collection;

@CrossOrigin
@RestController

public class AppointmentController {

    @Resource
    AppointmentRepo appointmentRepo;
    @GetMapping("/appointment")
    public Collection<Appointment> getAppointment() {
        return (Collection<Appointment>) appointmentRepo.findAll();
    }
    @GetMapping("/appointment/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        return (Appointment) appointmentRepo.findById(id).get();
    }




}
