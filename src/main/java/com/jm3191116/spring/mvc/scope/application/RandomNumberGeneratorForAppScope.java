package com.jm3191116.spring.mvc.scope.application;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class RandomNumberGeneratorForAppScope {

	private long randomNumber;

	public long getRandomNumber() {
		return randomNumber;
	}

	public void generateAndSetRandomNumber() {
		randomNumber = (long) (Math.random() * 10000);
	}

}
