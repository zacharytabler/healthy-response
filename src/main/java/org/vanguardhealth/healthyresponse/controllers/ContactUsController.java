package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.ContactUs;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;
import org.vanguardhealth.healthyresponse.models.User;
import org.vanguardhealth.healthyresponse.repositories.*;


import javax.annotation.Resource;
import java.util.Optional;

@CrossOrigin
@RestController
public class ContactUsController {

    @Resource
    private ContactUsRepo contactUsRepo;

    @Resource
    private ReviewsRepo reviewsRepo;


    @GetMapping("/contact")
    public Iterable<User> getContact(){
        return contactUsRepo.findAll();
    }

        return findContact.getContactUs();
}
