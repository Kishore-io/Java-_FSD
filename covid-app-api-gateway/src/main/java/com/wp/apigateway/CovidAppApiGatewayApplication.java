package com.wp.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CovidAppApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppApiGatewayApplication.class, args);
	}

}
