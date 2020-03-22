package com.cp.flightmanagementsystem.dao;

import java.util.List;

import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;
import com.cp.flightmanagementsystem.util.UserRepository;

public class UserDaoImp implements UserDao{
	UserRepository userRepository=new UserRepository();
	List<User>userList=userRepository.getUserList();
	public User addUserDao(User user)
	{
		boolean result=userList.add(user);
		if(result) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<User> viewUserDao()
	{
		List<User> userList=userRepository.getUserList();
		try {
		if(userList==null) {
			throw new UserListNotFoundException();
		}
		}
		catch(UserListNotFoundException e)
		{
			e.printStackTrace();
		}
		return userList;
	}
	public User viewUserByUserIdDao(long userid)
	{
		List<User> userList=userRepository.getUserList();
		for(User user:userList)
		{
			if(user.getUserId()==userid)
				return user;
		}
		return null;
	}
	public User deleteUserDao(long userid)
	{
		List<User> userList=userRepository.getUserList();
		for(User user:userList)
		{
			if(user.getUserId()==userid)
			{
				userList.remove(user);
				return user;
			}
		}
		return null;
		
	}
	public User updateUserDao(long id)
	{
		List<User> userList=userRepository.getUserList();
		for(User user1:userList)
		{
			if(user1.getUserId()==id)
			{
				return user1;
			}
			
			
		}
		return null;
	}

}
