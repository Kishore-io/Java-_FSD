package com.wp.employee.employee_core_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Address getAddress() {
		return new Address(534207, "3-84","Bhimavaram" , "Andhra Pradesh", "India");
	}
	
	@Bean
	public Department getDepartment() {
		return new Department(1213, "Computer Science", "Student", "4years");
	}
	
	@Bean
	public Employee getEmployee() {
		Employee emp = new Employee("Venkata Swamy",70,50000);
		emp.setAddress(getAddress());
		emp.setDepartment(getDepartment());
		return emp;
		
	}

}
