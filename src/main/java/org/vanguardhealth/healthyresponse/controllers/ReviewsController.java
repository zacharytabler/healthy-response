package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Reviews;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class ReviewsController {
    @Resource
    private  ContactUsRepo contactUsRepo;


}
