package com.wp.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wp.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//Here i will create fake userlist
	
	List<User> list = List.of(
			new User(101L,"anil","123456789"),
			new User(102L,"amith","98765432"),
			new User(103L,"arjun","98776655")
			);

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user ->user.getUserId()==id).findAny().orElse(null);
	}

}
