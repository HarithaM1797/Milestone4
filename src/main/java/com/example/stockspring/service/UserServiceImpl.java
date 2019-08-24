package com.example.stockspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.*;
import com.example.stockspring.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User registerUser(User user) throws Exception {
		return userDao.registerUser(user);

	}

	
	public User updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	
	}


	@Override
	public User newSignup(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User addUser(User userDetails) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
