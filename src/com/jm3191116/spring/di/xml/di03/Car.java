package com.jm3191116.spring.di.xml.di03;

public class Car {

	private Engine engine;

	public Car() {
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Putting engine into car");
		this.engine = engine;
	}
}
