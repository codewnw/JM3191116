package com.jm3191116.spring.di.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	@Qualifier("fordEngine")
	public void setEngine(Engine engine) {
		System.out.println("Putting engine into car.");
		this.engine = engine;
	}
	
}
