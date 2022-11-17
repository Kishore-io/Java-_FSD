package com.wp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value("${car.model}")
	private String model;
	@Value("${car.color}")
	private String color;
	@Autowired
	private Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Car(String model, String color, Engine engine) {
		super();
		this.model = model;
		this.color = color;
		this.engine = engine;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	
	
	public void showCarInfo() {
		System.out.println(this);
	}
	
	public void start() {
		 engine.startEngine();
	}
}
