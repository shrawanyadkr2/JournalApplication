package com.shrawan.journal.controller;

import com.shrawan.journal.entity.User;
import com.shrawan.journal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;
    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }

    @PostMapping("create-user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.saveEntry(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
