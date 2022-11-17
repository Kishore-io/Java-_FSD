package com.wp.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CovidAppAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppAuthServiceApplication.class, args);
	}

}
