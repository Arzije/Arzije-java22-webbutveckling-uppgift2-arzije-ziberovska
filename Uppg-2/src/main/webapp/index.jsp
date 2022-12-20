<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Please log in</h2>
	
	<p>${wrong}</p>

	<form action="<%=request.getContextPath()%>/LoggedIn" method="post">
		<label for="username">Username: </label>
		<input type="text" name="username"> <br>
		<br>
		<label for="password">Password: </label>
		<input type="password" name="password">
		<input type="submit" value="Login" />
	</form>
</body>
</html>