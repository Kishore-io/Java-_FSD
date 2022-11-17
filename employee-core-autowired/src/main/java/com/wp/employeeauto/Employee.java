package com.wp.employeeauto;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private int empId;
	private int salary;
	
	@Autowired
	private Address address;
	@Autowired
	private Department department;
	
	public Employee() {
		name="Venkata Swamy";
		empId=70;
		salary=50000;
				
	}

	public Employee(String name, int empId, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", address=" + address
				+ ", department=" + department + "]";
	}
	
	

}
