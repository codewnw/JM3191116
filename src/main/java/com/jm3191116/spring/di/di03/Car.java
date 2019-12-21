package com.jm3191116.spring.di.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("Putting engine into car");
		this.engine = engine;
	}
}
