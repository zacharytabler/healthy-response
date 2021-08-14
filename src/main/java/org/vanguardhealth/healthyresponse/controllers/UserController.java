package org.vanguardhealth.healthyresponse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.vanguardhealth.healthyresponse.models.Message;
import org.vanguardhealth.healthyresponse.models.User;
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


    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepo.findAll();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepo.findById(id).get();
    }

    @PostMapping(value = "/create_user_profile")
    public Iterable<User> createUserProfile(@RequestBody String body)throws JSONException{
        JSONObject newUser = new JSONObject(body);
        String userName = newUser.getString("userName");
        String password = newUser.getString("password");
        Optional<User> optionalUser = userRepo.findByUserName(userName);

        if(optionalUser.isEmpty()){
            User userToAdd = new User(userName,password);
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

}
