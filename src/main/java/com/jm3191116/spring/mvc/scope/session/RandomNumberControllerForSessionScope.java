package com.jm3191116.spring.mvc.scope.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/numbers/session")
public class RandomNumberControllerForSessionScope {
	
	@Autowired
	private RandomNumberGeneratorForSessionScope rng;

	@GetMapping("/random")
	public String getNumber(Model model) {
		model.addAttribute("previousNumber", rng.getRandomNumber());
		rng.generateAndSetRandomNumber();
		model.addAttribute("currentNumber", rng.getRandomNumber());
		return "display-random-numbers";
	}
}
