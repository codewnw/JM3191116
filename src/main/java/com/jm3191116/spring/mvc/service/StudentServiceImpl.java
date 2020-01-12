package com.jm3191116.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm3191116.spring.mvc.dao.StudentDao;
import com.jm3191116.spring.mvc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void save(Student student) {
		System.out.println("Calling Dao layer");
		studentDao.save(student);
	}

	@Override
	public Student emptyStudent() {
		return studentDao.emptyStudent();
	}

}
