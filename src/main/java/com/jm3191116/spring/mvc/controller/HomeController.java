package com.jm3191116.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public @ResponseBody String message() {
		return "How are you?";
	}
}
