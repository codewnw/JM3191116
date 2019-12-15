package com.jm3191116.spring.di.xml.di05;

public class FordEngine implements Engine {

	public FordEngine() {
		System.out.println(this.getClass().getSimpleName() + " manufactured");
	}

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
