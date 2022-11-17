package com.wp.country_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CovidAppCountryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppCountryServiceApplication.class, args);
	}
	
	
	@Bean("rt-with eureka")
	@LoadBalanced
	public RestTemplate getRestTemplateBean() {
		
		return new RestTemplate();
		
	}
	
	@Bean("rt-without-eureka")
	public RestTemplate getRestTemplateBeanWithoutEureka() {
		
		return new RestTemplate();
		
	}

}
