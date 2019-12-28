<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greeting form</title>
</head>
<body>
	<h1>GET Greeting form</h1>
	<form action="process">
		<input type="text" name="nm" placeholder="Enter your name" />
		<input type="submit" value="Greet Me" />
	</form>
	<hr>
	<h1>POST Greeting form</h1>
	<form action="process" method="post">
		<input type="text" name="nm" placeholder="Enter your name" />
		<input type="submit" value="Greet Me" />
	</form>
</body>
</html>