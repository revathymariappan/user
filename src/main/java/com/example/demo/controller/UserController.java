package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/getAllUsers")
	public @ResponseBody List<User> getUsers() {

		return userService.getUsers();

	}

	@GetMapping(value = "/getId/{id}")
	public @ResponseBody User getUserById(@PathVariable int id) {

		return userService.getUserById(id);

	}

	@PostMapping(value = "/saveUser", consumes = "application/json", produces = "application/json")
	public @ResponseBody User saveUser(@RequestBody User user) {

		return userService.saveUserDetails(user);
	}

	@DeleteMapping(value = "/deleteId/{id}")
	public @ResponseBody String deleteUserById(@PathVariable int id) {

		return userService.deleteUserById(id);

	}
}