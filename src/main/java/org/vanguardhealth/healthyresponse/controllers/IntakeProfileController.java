package org.vanguardhealth.healthyresponse.controllers;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Badge;
import org.vanguardhealth.healthyresponse.models.IntakeProfile;
import org.vanguardhealth.healthyresponse.models.Worksheet;
import org.vanguardhealth.healthyresponse.repositories.IntakeProfileRepository;
import org.vanguardhealth.healthyresponse.repositories.WorksheetRepo;

import javax.annotation.Resource;
import java.util.Optional;
@CrossOrigin
@RestController
public class IntakeProfileController {

    @Resource
    private IntakeProfileRepository intakeRepo;

    @Resource
    private WorksheetRepo worksheetRepo;


    @GetMapping("/intake_profile")
    public Iterable<IntakeProfile> getProfiles(){
        return intakeRepo.findAll();
    }
    @GetMapping("/intake_profile/{id}")
    public IntakeProfile getProfile(@PathVariable Long id){
        return intakeRepo.findById(id).get();
    }

    @PatchMapping("intake_profile/{id}/add-badge")
    public Optional<IntakeProfile> addBadge(@RequestBody Badge badgeToAdd, Long id) throws JSONException{
        Optional<IntakeProfile> profileToModify = intakeRepo.findById(id);
        badgeToAdd.addProfile(profileToModify.get());

    return profileToModify;
    }



    @PostMapping(value = "/create_intake_profile")
    public Iterable<IntakeProfile> createProfile(@RequestBody String body) throws JSONException{
        JSONObject userProfile = new JSONObject(body);
        String firstName = userProfile.getString("firstName");
        String lastName = userProfile.getString("lastName");
        String ethnicity = userProfile.getString("ethnicity");
        String city = userProfile.getString("city");
        String state = userProfile.getString("state");
        String status = userProfile.getString("status");
        String aboutMe = userProfile.getString("aboutMe");

        Optional<IntakeProfile> profileOptional = intakeRepo.findByLastName(lastName);
        if(profileOptional.isEmpty()){
            IntakeProfile newProfile = new IntakeProfile(firstName,lastName,
                    ethnicity,city,state,status,aboutMe);
            intakeRepo.save(newProfile);
        }
            return intakeRepo.findAll();
    }

    @PostMapping("/profile/{id}/addWorksheetAnswers")
    public Optional <IntakeProfile> addWorksheetAnswers(@PathVariable Long id, @RequestBody String body) {
//        User user = userRepo.findById(id).get();
        IntakeProfile intakeProfile = intakeRepo.findById(id).get();
        JSONObject newWorksheet = new JSONObject(body);
//        String title = newWorksheet.getString("title");
//        if(!newWorksheet.getString("answer1").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer1"));
//        }
//        if(!newWorksheet.getString("answer2").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer2"));
//        }
//        if(!newWorksheet.getString("answer3").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer3"));
//        }
//        if(!newWorksheet.getString("answer4").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer4"));
//        }
//        if(!newWorksheet.getString("answer5").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer5"));
//        }
//        if(!newWorksheet.getString("answer6").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer6"));
//        }
//        if(!newWorksheet.getString("answer7").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer7"));
//        }
//        if(!newWorksheet.getString("answer8").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer8"));
//        }
//        if(!newWorksheet.getString("answer9").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer9"));
//        }
//        if(!newWorksheet.getString("answer10").isEmpty()) {
//            worksheet.addWorksheetAnswers(newWorksheet.getString("answer10"));
//        }

        System.out.println("JSON OBJECT !!! " + newWorksheet);

        String title = newWorksheet.getString("title");
        String ans1 = newWorksheet.getString("answer1");
        String ans2 = newWorksheet.getString("answer2");
        String ans3 = newWorksheet.getString("answer3");
        String ans4 = newWorksheet.getString("answer4");

        System.out.println("TITLE !!!" + title);
        System.out.println("ANSWER1 !!!  " + ans1);
        System.out.println("ANSWER2 !!!  " + ans2);
        System.out.println("ANSWER3 !!!  " + ans3);
        System.out.println("ANSWER4 !!!  " + ans4);

        Worksheet worksheetToAdd = new Worksheet(title, ans1, ans2, ans3, ans4);
        System.out.println("NEW WORKSHEET!!! " + worksheetToAdd.getAnswer1());

        intakeProfile.addWorksheet(worksheetToAdd);
        worksheetRepo.save(worksheetToAdd);
        intakeRepo.save(intakeProfile);
        return intakeRepo.findById(id);
    }

    @DeleteMapping("/profile/{profileId}/deleteWorksheet/{worksheetId}")
    public Optional<IntakeProfile> deleteWorksheet(@PathVariable Long profileId, @PathVariable Long worksheetId) {
        Worksheet worksheetToDelete = worksheetRepo.findById(worksheetId).get();
        worksheetRepo.delete(worksheetToDelete);
        return intakeRepo.findById(profileId);
    }
}
