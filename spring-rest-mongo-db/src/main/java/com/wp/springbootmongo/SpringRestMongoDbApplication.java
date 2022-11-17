package com.wp.springbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class SpringRestMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMongoDbApplication.class, args);
	}

}
