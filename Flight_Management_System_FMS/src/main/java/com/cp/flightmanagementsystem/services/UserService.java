package com.cp.flightmanagementsystem.services;

import java.util.List;

import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.IDNotFoundException;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;

public interface UserService {
	public User addUserService(User user);

	public List<User> viewUserService()throws UserListNotFoundException;

	public User viewUserService(long userid);

	public User deleteUserService(long userid);

	public User updateUserService(long id);


}
