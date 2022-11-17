package com.wp.spring.simple_phone_app;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Phone implements InitializingBean {
	
	public Phone() {
		System.out.println("Phone Bean Created");
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("All the Properties are set, we can use apis, loading functionalities here");
		
	}
	
	@Autowired
	@Qualifier("jio")
	private Sim sim;
	
	@Value("${phone.brand}")
	private String brand;
	
	@Value("${phone.ram}")
	private int ram;
	
	@Value("${phone.storage}")
	private int storage;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void call(long phNumber) {
		sim.call(phNumber);
	}
	
	public void sendSMS(String sms,long phNumber) {
		sim.sendSMS(sms, phNumber);
	}
	
	
	public void showInfo() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Phone [sim=" + sim.getClass().getSimpleName() + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	

}
