package com.wp.authservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.authservice.exception.InvalidCredentialException;
import com.wp.authservice.model.UserCredential;
import com.wp.authservice.model.UserModel;
import com.wp.authservice.repository.UserRepository;
import com.wp.authservice.util.JwtUtil;

@Service
public  class UserSeviceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	JwtUtil jwtUtil;

	@Override
	public String loginwithCredentials(UserCredential creds) {
		boolean valid = repo.existsByUsernameAndPassword(creds.getUsername(), creds.getPassword());
		if(!valid) {
			throw new InvalidCredentialException("Incorrect Username or Password");
		}
		return jwtUtil.generateToken(creds.getUsername());
	}
	
	@Override
	public UserModel authorizeWithToken(String token) {
		
		String username = jwtUtil.decodeToken(token);
		UserModel user = repo.findByUsername(username);
		return user;	
	}

	@Override
	public UserModel addUser(UserModel user) {
		return repo.save(user);
	}

	@Override
	public List<UserModel> getAllUserDetails() {
		return repo.findAll();
	}

	
}
