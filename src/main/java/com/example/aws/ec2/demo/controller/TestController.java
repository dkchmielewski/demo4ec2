package com.example.aws.ec2.demo.controller;

import com.example.aws.ec2.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "AWS EC2 is working fine!";
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        // Here you would typically save the user to a database
        // For this example, we'll just return a success message
        return "User created successfully with name: " + user.getName() + " and age: " + user.getAge();
    }
}
