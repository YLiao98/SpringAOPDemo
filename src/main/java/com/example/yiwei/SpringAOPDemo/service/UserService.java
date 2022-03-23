package com.example.yiwei.SpringAOPDemo.service;

import com.example.yiwei.SpringAOPDemo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User createUser(String id, String username){
        User newuser = new User();
        newuser.setId(id);
        newuser.setUserName(username);
        return newuser;
    }
}
