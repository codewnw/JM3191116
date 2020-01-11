package com.jm3191116.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.jm3191116.spring.mvc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public void save(Student student) {
		System.out.println("Saved the student");
	}

}
