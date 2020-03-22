package com.cp.flightmanagementsystem.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.cp.flightmanagementsystem.dto.User;

public class UserRepository {
	private static List<User>userList=new ArrayList<User>();
	public UserRepository()
	{
		//super();
		//userList.add(new User("admin",123, "Narasimha", "Simham258@", BigInteger.valueOf(Long.parseLong("9177112587")), "kasulu9704@gmail.com"));
	}
	
	public List<User> getUserList() {
		return userList;
	}
	


}
