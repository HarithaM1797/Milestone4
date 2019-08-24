package com.example.stockspring.service;

import com.example.stockspring.model.User;

public interface UserService {
	 public User registerUser(User user) throws Exception;
	 public User updateUser(User user)throws Exception;
	public User newSignup(User user)throws Exception;
	public User addUser(User userDetails)throws Exception;
	 
}
