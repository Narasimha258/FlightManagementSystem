package com.cp.flightmanagementsystem.dao;

import java.util.List;

import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;

public interface UserDao {
	public User addUserDao(User user);

	public List<User> viewUserDao();

	public User viewUserByUserIdDao(long userid);

	public User deleteUserDao(long userid);

	public User updateUserDao(long id);

}
