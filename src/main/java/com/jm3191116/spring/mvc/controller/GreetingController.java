package com.jm3191116.spring.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greet")
public class GreetingController {

	@GetMapping
	public @ResponseBody String greetMe() {
		return "Good Morning!!!";
	}

	@GetMapping(value = "/form")
	public String greetForm() {
		return "greeting-form";
	}

	@GetMapping(value = "/process")
	public String greetFormProcess(@RequestParam("nm") String name, Model model) {
		model.addAttribute("msg", "Good Morning");
		model.addAttribute("date", new Date());
		model.addAttribute("nm", name);
		return "greeting-message";
	}
	
	@PostMapping(value = "/process")
	public String greetFormProcessUsingPost(@RequestParam("nm") String name, Model model) {
		model.addAttribute("msg", "Good Evening");
		model.addAttribute("date", new Date());
		model.addAttribute("nm", name);
		return "greeting-message";
	}

}
