package com.gradbook.gradbookregistration.controllers;

import com.gradbook.gradbookregistration.controllers.helper.RegistrationHelper;
import com.gradbook.gradbookregistration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Munna on 24-Jun-17.
 */
@RestController
public class RegistrationController {

    @Autowired
    private RegistrationHelper registrationHelper;

    @PostMapping("/register")
    ResponseEntity<?> registerUser(@RequestBody User user){
        return registrationHelper.registerUser(user);
    }
}
