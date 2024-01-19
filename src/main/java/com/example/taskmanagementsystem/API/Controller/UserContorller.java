package com.example.taskmanagementsystem.API.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanagementsystem.API.Model.User;
import com.example.taskmanagementsystem.Service.UserServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserContorller {

    private UserServices userServices;

    @Autowired
    public UserContorller(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        Optional user = userServices.getUser(id);
        if (user.isPresent()) {
            return (User) user.get();
        }
        return null;
    }

}
