package com.beanlifecycle.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private String userName;
	private String password;

	public UserService(){
		System.out.println("Creating bean... Property initialization...");
		this.userName="admin";
		this.password="password";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Post Construct...");
		System.out.println("User Name " + this.userName);
		System.out.println("Password " + this.password);
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getUserInfo() {
		System.out.println("User Name " + this.userName);
		System.out.println("Password " + this.password);
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Pre Destroy...");
	}
}
