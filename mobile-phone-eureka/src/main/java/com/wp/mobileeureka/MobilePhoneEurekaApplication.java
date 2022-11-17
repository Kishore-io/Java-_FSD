package com.wp.mobileeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobilePhoneEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhoneEurekaApplication.class, args);
	}

}
