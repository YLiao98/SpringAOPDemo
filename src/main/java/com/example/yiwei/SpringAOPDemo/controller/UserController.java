package com.example.yiwei.SpringAOPDemo.controller;

import com.example.yiwei.SpringAOPDemo.model.User;
import com.example.yiwei.SpringAOPDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add/newuser", method = RequestMethod.GET)
    public User addUser(@RequestParam("username") String name, @RequestParam("userid") String id) {

        return userService.createUser(id, name);

    }

}
