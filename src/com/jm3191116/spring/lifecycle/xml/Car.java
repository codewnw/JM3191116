package com.jm3191116.spring.lifecycle.xml;

public class Car {

	public Car() {
		System.out.println("Car is being manufacrtured.");
	}

	public void drive() {
		System.out.println("Car is being driven...");
	}

	public void notifyBuyer() {
		System.out.println("Car is ready.");
	}

	public void auctionTheCar() {
		System.out.println("Actioning the car...");
	}
}
