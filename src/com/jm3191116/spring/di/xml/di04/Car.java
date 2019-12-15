package com.jm3191116.spring.di.xml.di04;

public class Car {

	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	public Car(Engine engine) {
		System.out.println("Putting engine into car.");
		this.engine = engine;
	}

}
