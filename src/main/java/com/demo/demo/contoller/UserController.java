package com.demo.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entity.User;
import com.demo.demo.services.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {

        User userCreated = userService.createUser(user);

        if(userCreated == null){
            return null;
        }
        return userCreated;
    }
}
