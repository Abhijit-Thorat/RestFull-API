package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.model.User;
import com.webapp.service.UserService;

@RestController
public class MainController {

	
	private UserService us;
	
	@Autowired
	public MainController(UserService us) {
		this.us = us;
	}


	@GetMapping("/user")
	public User getuser(@RequestParam Integer id) {
		return us.getUser(id);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return us.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		User temp = us.adduser(user);
		if(temp != null)
			return "User added successfully!";
		return "Failed to add the user";
	}
	
}
