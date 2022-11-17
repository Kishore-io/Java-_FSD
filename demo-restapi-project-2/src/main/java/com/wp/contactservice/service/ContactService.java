package com.wp.contactservice.service;

import java.util.List;

import com.wp.contactservice.entity.Contact;

public interface ContactService {

	public List<Contact> getContactOfUser(int userId);	
}
