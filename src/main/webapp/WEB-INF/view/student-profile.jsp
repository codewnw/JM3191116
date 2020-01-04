<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Profile</title>
</head>
<body>
	<table>
		<tr>
			<td><label>Name: </label></td>
			<td>${student.studentCode}</td>
		</tr>
		<tr>
			<td><label>Name: </label></td>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td><label>Age: </label></td>
			<td>${student.age}</td>
		</tr>
		<tr>
			<td><label>Email: </label></td>
			<td>${student.email}</td>
		</tr>
		<tr>
			<td><label>Gender: </label></td>
			<td>${student.gender}</td>
		</tr>
		<tr>
			<td><label>Country: </label></td>
			<td>${student.country}</td>
		</tr>
		<tr>
			<td><label>DOB: </label></td>
			<td>${student.dob}</td>
		</tr>
		<tr>
			<td><label>Certificate Expiry: </label></td>
			<td>${student.certificateExpiry}</td>
		</tr>
		<tr>
			<td><label>Courses: </label></td>
			<td>${student.courses[0]}&nbsp; ${student.courses[1]} &nbsp;
				${student.courses[2]}</td>
		</tr>
		<tr>
			<td><label>Graduate: </label></td>
			<td>${student.graduate}</td>
		</tr>
		<tr>
			<td><label>Comment: </label></td>
			<td>${student.comment}</td>
		</tr>
	</table>
</body>
</html>