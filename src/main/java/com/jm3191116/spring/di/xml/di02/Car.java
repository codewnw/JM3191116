package com.jm3191116.spring.di.xml.di02;

public class Car {

	private Engine engine;
	
	private MusicSystem musicSystem;
	
	public Car(Engine engine, MusicSystem musicSystem) {
		System.out.println("Putting engine into car");
		this.engine = engine;
		System.out.println("Putting music system into car");
		this.musicSystem = musicSystem;
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
		musicSystem.play();
	}
}
