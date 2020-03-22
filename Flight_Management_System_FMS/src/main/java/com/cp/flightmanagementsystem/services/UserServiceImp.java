package com.cp.flightmanagementsystem.services;



import java.util.List;
import java.util.Scanner;

import com.cp.flightmanagementsystem.dao.UserDao;
import com.cp.flightmanagementsystem.dao.UserDaoImp;
import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.IDNotFoundException;
import com.cp.flightmanagementsystem.exception.NumberFormatE;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;

public class UserServiceImp implements UserService{
	UserDao userdao=new UserDaoImp();
	Scanner sc=new Scanner(System.in);
	public User addUserService(User user)
	{
		
		User result=userdao.addUserDao(user);
		if(result!=null) {
			return user;
		}
		else {
			return null;
		}
		
	}
	public List<User> viewUserService() throws UserListNotFoundException
	{
		List<User> userList=userdao.viewUserDao();

		if(userList==null) {
			throw new UserListNotFoundException();
			
		}
	
		return userList;
	}
	public User viewUserService(long userid)
	{
		try {
		  if(userid==0)
		    {
			throw new IDNotFoundException();
		    }
	   }
		catch(IDNotFoundException e)
		{
			e.printStackTrace();
		}
		User viewuser=userdao.viewUserByUserIdDao(userid);
		return viewuser;
	}
	public User deleteUserService(long userid)
	{
		if(userid==0)
		{
			return null;
		}
		User viewuser=userdao.deleteUserDao(userid);
		return viewuser;
	}
	public User updateUserService(long id)
	{
		if(id==0)
		{
		return null;
		}
		User user1=userdao.updateUserDao(id);
		if(user1==null)
		{
			return null;
		}
		return user1;
			
	}
	
	public long userid(long id)
	{
		
		List<User> userList1=userdao.viewUserDao();
		for(User use:userList1)
		{
			if(use.getUserId()==id)
			{
				System.out.println("\n Id Already Exists:");
				System.out.println("\nPlease enter another id:");
				id=sc.nextLong();
				return userid(id);
			}
			
				
		}
		return id;
			
	}
	
	
}
