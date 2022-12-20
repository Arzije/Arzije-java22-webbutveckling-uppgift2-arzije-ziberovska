<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>You are successfully logged in!</p>
							
	<form action="<%=request.getContextPath()%>/LoggedIn"> 
			<h1>Welcome, ${correctUser.getUsername()} </h1> 	
	</form> 

	<form action="<%=request.getContextPath()%>/SnackServlet">
		<label>Your favorite snack is: ${Snack} </label> <br>
		<label>Favorite snack:  </label>
		<input type="text" name="snack">
		<button type="submit">send</button>
	</form>
	
		<p>Press this button to log out:</p>
	<form action="<%=request.getContextPath()%>/LoggedOut" method="get">
		<button type="submit">Log out</button>
	</form>

</body>
</html>