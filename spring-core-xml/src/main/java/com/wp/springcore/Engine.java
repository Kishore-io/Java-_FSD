package com.wp.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value("${engine.power}")
	private double power;
	@Value("${engine.cylinders}")
	private int noOfCylinders;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Engine(double power, int noOfCylinders) {
		super();
		this.power = power;
		this.noOfCylinders = noOfCylinders;
	}


	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public int getNoOfCylinders() {
		return noOfCylinders;
	}
	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}


	@Override
	public String toString() {
		return "Engine [power=" + power + ", noOfCylinders=" + noOfCylinders + "]";
	}
	
	
	public void showEngineInfo() {
		System.out.println(this);
	}
	
	public void startEngine() {
		System.out.println("Engine Started..");
	}



}
