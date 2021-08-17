package org.vanguardhealth.healthyresponse.controllers;

import org.hibernate.jdbc.Work;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import org.vanguardhealth.healthyresponse.models.*;

import org.vanguardhealth.healthyresponse.repositories.*;

import javax.annotation.Resource;
import java.util.Optional;

@CrossOrigin
@RestController
public class UserController {

    @Resource
    private UserRepo userRepo;
    @Resource

    private MessageRepository messageRepo;

    private CopingMechanismRepo copingRepo;
    @Resource
    private ResultRepo resultRepo;
    @Resource
    private ConsequenceRepo consequenceRepo;
    @Resource
    private TriggerRepo triggerRepo;
    @Resource
    private MoodRepo moodRepo;
    @Resource
    private IntakeProfileRepository intakeRepo;
    @Resource
    private WorksheetRepo worksheetRepo;



    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @PostMapping(value = "/create_user_profile")
    public Iterable<User> createUserProfile(@RequestBody String body) throws JSONException {
        JSONObject newUser = new JSONObject(body);
        String userName = newUser.getString("userName");
        String password = newUser.getString("password");

        Optional<User> optionalUser = userRepo.findByUserName(userName);

        if (optionalUser.isEmpty()) {
            User userToAdd = new User(userName, password);
            userRepo.save(userToAdd);
        }
        return userRepo.findAll();

    }
    @PostMapping(value = "/user/{id}/post_reply")
    public Optional <User> postMessageReply(@RequestBody String body, @PathVariable Long id)throws JSONException{
        JSONObject newPost = new JSONObject(body);
        String content = newPost.getString("content");
        Optional<Message> optionalMessage = messageRepo.findByContent(content);

        if(optionalMessage.isPresent()){
            Optional <User> userToAddMessageToOpt = userRepo.findById(id);
            User userToAddMessageTo = userToAddMessageToOpt.get();
            userToAddMessageTo.addMessage(optionalMessage.get());
            userRepo.save(userToAddMessageTo);

        }
        return userRepo.findById(id);
    }

//    @PutMapping("/worksheets/{id}/addAnswers")
//    public Worksheet addAnswer(@PathVariable Long id, @RequestBody String answers) {
//        JSONObject formAnswers = new JSONObject(answers);
//        Worksheet worksheet = worksheetRepo.findById(id).get();
//        worksheet.addAnswer(formAnswers.getString());
//    }


//    @PostMapping("/user/{id}/create_profile")
//    public Optional<User> createProfile(@RequestBody String body, @PathVariable Long id) throws JSONException {
//        JSONObject userProfile = new JSONObject(body);
//        String firstName = userProfile.getString("firstName");
//        String lastName = userProfile.getString("lastName");
//        String ethnicity = userProfile.getString("ethnicity");
//        String city = userProfile.getString("city");
//        String state = userProfile.getString("state");
//        String status = userProfile.getString("status");
//        String aboutMe = userProfile.getString("aboutMe");
//        IntakeProfile newProfile = new IntakeProfile(firstName, lastName, ethnicity,
//                city, state, status, aboutMe);
//        Optional<IntakeProfile> profileOptional = intakeRepo.findByLastName(lastName);
//        if (profileOptional.isPresent()) {
//            Optional<User> userToAddProfileToOpt = userRepo.findById(id);
//            User userToAddProfileTo = userToAddProfileToOpt.get();
//            userToAddProfileTo.addProfile(profileOptional.get());
//            userRepo.save(userToAddProfileTo);
//        }
//
//        return userRepo.findById(id);
//    }
}
