package com.jm3191116.spring.mvc.dao;

import org.springframework.stereotype.Repository;

import com.jm3191116.spring.mvc.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public void save(Student student) {
		//int i = 10/0;
		System.out.println("Saved the student");
	}

	@Override
	public Student emptyStudent() {
		return new Student();
	}

}
