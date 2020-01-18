package com.jm3191116.spring.mvc.scope.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/numbers/app")
public class RandomNumberControllerForAppScope {
	
	@Autowired
	private RandomNumberGeneratorForAppScope rng;

	@GetMapping("/random")
	public String getNumber(Model model) {
		model.addAttribute("previousNumber", rng.getRandomNumber());
		rng.generateAndSetRandomNumber();
		model.addAttribute("currentNumber", rng.getRandomNumber());
		return "display-random-numbers";
	}
}
