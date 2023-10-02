package com.lcwd.user.userservice.service;

import com.lcwd.user.userservice.entities.User;

import java.util.List;

public interface UserService {
    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUser();

    //get a single user
    User getUser(String id);


}
