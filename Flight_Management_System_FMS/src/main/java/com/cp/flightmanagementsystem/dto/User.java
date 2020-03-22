package com.cp.flightmanagementsystem.dto;

import java.math.BigInteger;

public class User {
	String userType;
	long userId;
	String userName;
	String userPassword;
	BigInteger userPhone;
	String userEmail;
	public User(String userType,long userId,String userName,String userPassword,BigInteger userPhone,String userEmail)
	{
		this.userType=userType;
		this.userId=userId;
		this.userName=userName;
		this.userPassword=userPassword;
		this.userPhone=userPhone;
		this.userEmail=userEmail;
		
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	

}

