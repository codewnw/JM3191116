package com.jm3191116.spring.mvc.scope.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class RandomNumberGeneratorForSessionScope {

	private long randomNumber;

	public long getRandomNumber() {
		return randomNumber;
	}

	public void generateAndSetRandomNumber() {
		randomNumber = (long) (Math.random() * 10000);
	}

}
