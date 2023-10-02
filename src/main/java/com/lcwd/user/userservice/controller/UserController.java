package com.lcwd.user.userservice.controller;

import com.lcwd.user.userservice.entities.User;
import com.lcwd.user.userservice.repository.UserRepository;
import com.lcwd.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    //save users

    @PostMapping
    public ResponseEntity<User> createUsers(@RequestBody User user){
        User user1 =  userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId){
       User user =  userService.getUser(userId);
       return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity <List<User>> getAllUser(){
        List<User> allUsers = userService.getAllUser();
        return ResponseEntity.ok(allUsers);
    }
}
