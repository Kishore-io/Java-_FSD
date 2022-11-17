package com.wp.employeeauto;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private int deptId;
	private String name;
	private String role;
	private String exper;
	
	public Department() {
		deptId=1214;
		name="Computer Science";
		role="Student";
		exper="4Years";
	}

	public Department(int deptId, String name, String role, String exper) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.role = role;
		this.exper = exper;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getExper() {
		return exper;
	}

	public void setExper(String exper) {
		this.exper = exper;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", role=" + role + ", exper=" + exper + "]";
	}
	
	
}
