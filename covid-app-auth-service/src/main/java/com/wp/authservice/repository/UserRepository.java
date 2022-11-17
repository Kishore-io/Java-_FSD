package com.wp.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wp.authservice.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

	public boolean existsByUsernameAndPassword(String username,String password);
	
	public UserModel findByUsername(String username);
}
