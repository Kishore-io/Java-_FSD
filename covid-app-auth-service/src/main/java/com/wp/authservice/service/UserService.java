package com.wp.authservice.service;

import java.util.List;

import com.wp.authservice.model.UserCredential;
import com.wp.authservice.model.UserModel;

public interface UserService {
		
	public UserModel addUser(UserModel user);
	
	public List<UserModel> getAllUserDetails();

	String loginwithCredentials(UserCredential creds);
	
	UserModel authorizeWithToken(String token);
	
}
	