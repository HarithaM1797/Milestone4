package com.example.stockspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.User;

@RestController
public class LoginController {

     @Autowired
     UserDao userDao;
     

     @GetMapping("/login/{name}/{password}")
     public  String login(@PathVariable("name") String userName,@PathVariable("password") String password) 
    {
           User user= userDao.findByUserName(userName);
           String userType=user.getUserType();
           String result;
           if(userType.equals("admin")){
         result="Admin";
           }
           else {
                result="User";
           }
           return result;
    }
}
