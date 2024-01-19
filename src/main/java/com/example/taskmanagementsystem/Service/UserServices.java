package com.example.taskmanagementsystem.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.taskmanagementsystem.API.Model.User;

@Service
public class UserServices {

    private List<User> userlList;

    public UserServices() {
        userlList = new ArrayList<>();
        User user = new User(1, "nikhil", 23, "nikhil1233kumar@gmail.com");
        User user1 = new User(1, "nikhil", 23, "nikhil1233kumar@gmail.com");
        userlList.addAll(Arrays.asList(user, user1));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userlList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;

    }
}
