package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IpoPlaned;
import com.example.stockspring.model.User;
import com.example.stockspring.service.*;



@RestController
public class UserController {
	@Autowired
	UserService userService;

	
	@GetMapping("/user/signUp/{userId}/{userName}/{password}/{userType}/{email}/{mobileNumber}/{confirmed}")
    public User storeUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName, @PathVariable("password") String password, @PathVariable("userType") String userType, @PathVariable("email") String email, @PathVariable("mobileNumber") long mobileNumber, @PathVariable("confirmed") boolean confirmed) throws Exception
    {
           User userDetails = new User(userId, userName, password, userType, email, mobileNumber, confirmed);
           return userService.addUser(userDetails);
    }

}
