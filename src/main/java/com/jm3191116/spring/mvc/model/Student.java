package com.jm3191116.spring.mvc.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	@Size(min = 2, max = 20, message = " should be between 2 to 20 length")
	@NotNull(message = " is required")
	private String name;
	@Min(value = 18, message = " minimum age should be 18 years")
	@Max(value = 100, message = " age should not be greater that 100")
	private int age;
	private String email;
	private String gender;
	private String country = "IND";
	private String[] courses;
	private boolean graduate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	private Date dob;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future
	private Date certificateExpiry;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getCertificateExpiry() {
		return certificateExpiry;
	}

	public void setCertificateExpiry(Date certificateExpiry) {
		this.certificateExpiry = certificateExpiry;
	}

	private String comment;

	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = " should contain combination of at most 6 digits and character")
	private String studentCode;

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
