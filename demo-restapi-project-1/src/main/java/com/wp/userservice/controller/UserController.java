package com.wp.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wp.userservice.entity.Contact;
import com.wp.userservice.entity.User;
import com.wp.userservice.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable long userId) {
		
		User user = service.getUser(userId);
		
//		http://localhost:9002/contact/user/103
		String baseUrl = "http://localhost:9002/contact/user/";
		
		List contact = restTemplate.getForObject(baseUrl+userId, List.class);
		user.setContacts(contact);
		return user;
				
	}
	
}
