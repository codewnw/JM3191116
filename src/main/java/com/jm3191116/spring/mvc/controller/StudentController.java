package com.jm3191116.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3191116.spring.mvc.model.Student;
import com.jm3191116.spring.mvc.service.StudentService;

@Controller
@RequestMapping(value = "/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping(value = "/registration")
	public String showStudentForm(Model model) {
		model.addAttribute("student", studentService.emptyStudent());
		return "student-form";
	}

	@PostMapping(value = "/registration")
	public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "student-form";
		}
		studentService.save(student);
		return "student-profile";
	}

}
