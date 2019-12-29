package com.jm3191116.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3191116.spring.mvc.model.Student;

@Controller
@RequestMapping(value = "/students")
public class StudentController {

	@GetMapping(value = "/registration")
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@PostMapping(value = "/registration")
	public String processStudentForm(@ModelAttribute("student") Student student/*, Model model*/){
//		model.addAttribute("student", student);
		return "student-profile";
	}

}
