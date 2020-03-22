package com.cp.flightmanagementsystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cp.flightmanagementsystem.dao.UserDaoImp;

import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;

import com.cp.flightmanagementsystem.services.UserServiceImp;

public class UserServiceTest {
	
	
	UserServiceImp userservice=new UserServiceImp();
	//FlightService flightservice=new FlightService();
	
	@Test
	public void addUserServiceTest()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(userservice.addUserService(user),user);
	}
		
	@Test
	public void viewUserService() throws UserListNotFoundException
	{
		List<User> userlist=userservice.viewUserService();
		Assertions.assertEquals(123,userlist.get(0).getUserId());
	}
	@Test
	public void viewUserByuserId()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(user.getUserId(),userservice.viewUserService(123).getUserId());
	}
	@Test
	public void updateuserByuserId()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(null,userservice.updateUserService(12));
	}
	@Test
	public void deleteByuserId()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(null,userservice.updateUserService(13));
	}
	@Test
	public void deleteByuserIds()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(user.getUserId(),userservice.updateUserService(123).getUserId());
	}
	
	
	
}
