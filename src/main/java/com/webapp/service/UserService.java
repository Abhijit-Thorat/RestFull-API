package com.webapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.model.User;

@Service
public class UserService {
	private List<User> userList;
	
	public UserService() {
		
		userList =new ArrayList<>();
		
		User u1 = new User(101,22,"Ramesh");
		User u2 = new User(102,25,"Rakesh");
		User u3 = new User(103,26,"Rajesh");
		User u4 = new User(104,42,"Shramesh");
		User u5 = new User(105,52,"Prathamesh");
		User u6 = new User(106,27,"Mukesh");
		
		userList.addAll(Arrays.asList(u1,u2,u3,u4,u5,u6));
	
	}
	
	public User getUser(int id) {
		for(User u:userList) {
			if (u.getId()==id)
				return u;
		}
		return null;
	}

	public List<User> getAllUsers() {
		
		return userList;
	}

	public User adduser(User user) {
		userList.add(user);	
		return this.getUser(user.getId());
	}

}
