package com.jm3191116.spring.di.di08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	@Autowired
	public Car(Engine engine) {
		System.out.println("Contructor: Putting engine into car");
		System.out.println("Car is being manufactured.");
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("Setter: Putting engine into car");
		this.engine = engine;
	}

}
