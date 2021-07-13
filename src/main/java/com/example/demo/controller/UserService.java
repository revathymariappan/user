package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public List<User> getUsers() {
		// this method will find all users
		return userRepo.findAll();
	}

	public User getUserById(int id) {
		// this method will find one user based on the id
		return userRepo.findUserById(id);
	}

	public User saveUserDetails(User user) {
		// this method will save the user details
		return userRepo.save(user);
	}

	public String deleteUserById(int id) {
		// this method will delete one user based on the id
		User user = new User();
		user.setId(id);
		userRepo.deleteById(user);
		return "User Deleted";
	}
}