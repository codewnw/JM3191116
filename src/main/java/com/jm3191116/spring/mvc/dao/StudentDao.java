package com.jm3191116.spring.mvc.dao;

import com.jm3191116.spring.mvc.model.Student;

public interface StudentDao {
	void save(Student student);
	Student emptyStudent();
}
