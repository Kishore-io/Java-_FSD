package com.wp.spring.simple_phone_app;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.wp.spring.simple_phone_app"})
@PropertySource("app.properties")
public class AppConfig {
	
//	@Bean(name="airtel")
//	public AirtelSim getAirtelSimBean() {
//		return new AirtelSim();
//	}
//	
//	@Bean(name="phone")
//	public Phone getPhoneBean() {
//		return new Phone();
////		phone.setSim(getAirtelSimBean());
////		return phone;
//	}
}
