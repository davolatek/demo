package com.demo.demo.services;

import org.springframework.stereotype.Service;

import com.demo.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {

        if(user.getFirstName()=="" || user.getFirstName()==null){
            return null;
        }
        User newUser = new User();
        newUser.setFirstName((user.getFirstName()));
        newUser.setLastName(user.getLastName());
        newUser.setEmail((user.getEmail()));
        newUser.setPassword(user.getPassword());

        return newUser;
       
    }
    
}
