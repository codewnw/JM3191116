package com.jm3191116.spring.di.xml.di05;

public class HondaEngine implements Engine {

	public HondaEngine() {
		System.out.println(this.getClass().getSimpleName() + " manufactured");
	}

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
