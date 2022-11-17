package com.wp.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wp.contactservice.entity.Contact;
import com.wp.contactservice.service.ContactService;

@RestController
@RequestMapping("contact")
public class ContactController {

	@Autowired
	private ContactService service;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable int userId) {
		return service.getContactOfUser(userId);
	}
}
