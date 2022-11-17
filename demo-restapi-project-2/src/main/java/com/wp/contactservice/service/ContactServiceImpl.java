package com.wp.contactservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wp.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			new Contact(111, "swamy1@gmail.com", "Swamy1", 101),
			new Contact(112, "swamy2@gmail.com", "Swamy2", 102),
			new Contact(113, "swamy3@gmail.com", "Swamy3", 103),
			new Contact(114, "swamy4@gmail.com", "Swamy4", 104)
			);

	@Override
	public List<Contact> getContactOfUser(int userId) {
		return this.list.stream().filter(contact -> contact.getUserid()==userId).collect(Collectors.toList());
	}
}
