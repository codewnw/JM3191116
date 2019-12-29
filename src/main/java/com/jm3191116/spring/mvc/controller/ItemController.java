package com.jm3191116.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

	
	@GetMapping(value = "/category/{categoryName}/id/{itemId}")
	public String item(@PathVariable("categoryName") String catNm, @PathVariable("itemId") Long id, Model model) {
		model.addAttribute("myCatNm", catNm);
		model.addAttribute("myId", id);
		return "item";
	}

}
