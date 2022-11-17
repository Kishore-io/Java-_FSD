package com.wp.employeeauto;

import org.springframework.stereotype.Component;

@Component

public class Address {
	
	private int pincode;
	private String doorNo;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		pincode=534207;
		doorNo="3-84";
		city="Bhimavaram";
		state="Andhra Pradesh";
		country="India";
	}

	public Address(int pincode, String doorNo, String city, String state, String country) {
		super();
		this.pincode = pincode;
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", doorNo=" + doorNo + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	

}
