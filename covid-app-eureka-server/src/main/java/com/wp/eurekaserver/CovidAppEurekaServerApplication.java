package com.wp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CovidAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppEurekaServerApplication.class, args);
	}

}
