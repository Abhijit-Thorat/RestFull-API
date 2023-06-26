package com.webapp.model;



public class User {

	int id;
	int age;
	String username;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User(int id, int age, String username) {
		super();
		this.id = id;
		this.age = age;
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", username=" + username + "]";
	}
	
	
}
