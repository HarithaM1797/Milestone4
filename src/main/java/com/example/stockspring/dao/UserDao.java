package com.example.stockspring.dao;

import com.example.stockspring.model.User;

public interface UserDao {
	 public User registerUser(User user) throws Exception;
	 public User updateUser(User user)throws Exception;
	 User findByUserName(String Name);
 
}
