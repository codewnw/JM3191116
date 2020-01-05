<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
<style type="text/css">
.required{
	color:red;
}
</style>
</head>
<body>
	<form:form action="registration" method="post" modelAttribute="student">
		<table>
			<tr>
				<td><label>Name<span class="required">*</span>: </label></td>
				<td><form:input path="name"/>
				<form:errors path="name" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Student Code: </label></td>
				<td><form:input path="studentCode"/>
				<form:errors path="studentCode" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Batch Code: </label></td>
				<td><form:input path="batchCode"/>
				<form:errors path="batchCode" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Age: </label></td>
				<td><form:input path="age"/>
				<form:errors path="age" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Email: </label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><label>DOB: </label></td>
				<td><form:input path="dob"/><form:errors path="dob" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Certificate Expiry: </label></td>
				<td><form:input path="certificateExpiry"/>
				<form:errors path="certificateExpiry" cssClass="required"/></td>
			</tr>
			<tr>
				<td><label>Gender: </label></td>
				<td><form:radiobutton path="gender" value="Male"/>Male &nbsp; <form:radiobutton path="gender" value="Female"/>Female</td>
			</tr>
			<tr>
				<td><label>Country: </label></td>
				<td>
				<form:select path="country">
				<form:option value="">--Select--</form:option>
				<form:option value="IND">India</form:option>
				<form:option value="USA">America</form:option>
				<form:option value="UK">Britain</form:option>
				</form:select>
				</td>
			</tr>
			<tr>
				<td><label>Courses: </label></td>
				<td><form:checkbox path="courses" value="M1" />Core Java &nbsp;
				<form:checkbox path="courses" value="M2"/>Advance Java &nbsp;
				<form:checkbox path="courses" value="M3"/>Java Frameworks &nbsp;
				</td>
			</tr>
			<tr>
				<td><label>Are you a graduate?: </label></td>
				<td><form:checkbox path="graduate" />
				</td>
			</tr>
			<tr>
				<td><label>Comment: </label></td>
				<td><form:textarea path="comment" cols="20" rows="5" />
				</td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>