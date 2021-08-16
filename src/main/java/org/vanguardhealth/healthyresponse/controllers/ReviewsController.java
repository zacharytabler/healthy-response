package org.vanguardhealth.healthyresponse.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.Reviews;
import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class ReviewsController {
    @Resource
    private  ReviewsRepo reviewsRepo;

    @GetMapping("/reviews")
    public Iterable<Reviews> getReviews(){
        return  reviewsRepo.findAll();
    }
    @GetMapping("/reviews/{id}")
    public Reviews getReviews(@PathVariable Long id){
        return (Reviews) reviewsRepo.findById(id).get();
    }

}
