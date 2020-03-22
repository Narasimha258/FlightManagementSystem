package com.cp.flightmanagementsystem.servicetest;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cp.flightmanagementsystem.dao.UserDaoImp;
import com.cp.flightmanagementsystem.dto.User;

public class UserDaoTest {
	UserDaoImp userdao=new UserDaoImp();
	@Test
	public void addUserServiceTest()
	{
		User user=new User("admin",123, "nara", "pass", BigInteger.valueOf(Long.parseLong("9177112587")), "kasy@gmail.com");
		Assertions.assertEquals(userdao.addUserDao(user),user);
	}
	@Test
	public void viewUserService()
	{
		List<User> userlist=userdao.viewUserDao();
		Assertions.assertEquals(123,userlist.get(0).getUserId());
	}
	

}
