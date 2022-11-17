package com.wp.authservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.authservice.model.AuthToken;
import com.wp.authservice.model.UserCredential;
import com.wp.authservice.model.UserModel;
import com.wp.authservice.service.UserService;

@RestController
@RequestMapping("/users")
//@CrossOrigin
public class UserAuthController {

	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public AuthToken authenticateUser(@RequestBody UserCredential credentials) {
		String token = service.loginwithCredentials(credentials);
		return new AuthToken(token);
	}
	
	@PostMapping("/register")
	public UserModel addUser(@RequestBody UserModel userModel) {
		return service.addUser(userModel);
	}
	
//	@GetMapping("/users")
//	public List<UserModel> getAllUserDetails(){
//		return service.getAllUserDetails();
//	}
}
