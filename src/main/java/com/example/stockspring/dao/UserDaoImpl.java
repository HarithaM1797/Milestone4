package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	public static Connection connect() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		System.out.println("connect");
		return con;  
	}

/*	public User registerUser(User user) throws Exception {
		Connection con=connect();
		PreparedStatement stmt=con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		stmt.setInt(1, user.getUserId());
		stmt.setString(2, user.getUserName());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getUserType());
		stmt.setString(5,user.getEmail());
		stmt.setLong(6, user.getMobileNumber());
		stmt.setBoolean(7, user.isConfirmed());
		System.out.println(stmt.execute());
		return user;
	}

	
	public User updateUser(User user) throws Exception {
		Connection con=connect();
		PreparedStatement stmt=con.prepareStatement("UPDATE user SET id=?,username=?,password=?,usertype=?,email=?,mobilenumber?,confirmed=?");
		
		return user;
	}
*/
	

	@Override
	public User registerUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUserName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
