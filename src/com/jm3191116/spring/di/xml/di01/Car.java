package com.jm3191116.spring.di.xml.di01;

public class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		System.out.println("Putting engine into car");
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		System.out.println("Car is being driven..");
	}
}
