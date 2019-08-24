package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name="confirmed")
	private boolean confirmed;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	public User(){
	}
	
	public User(int userId, String userName, String password, String userType, String email, long mobileNumber,
			boolean confirmed) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", userName=" + userName + ", Password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + "]";
	}
	
	
}
