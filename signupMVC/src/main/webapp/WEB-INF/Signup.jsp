<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
form{
text-align=center;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert Title here</title>
</head>
<body text=white bgcolor="purple">
<h1 align="center">Enter your Username and Password</h1>

	<form action="/signupMVC/signupsuccessfull">

	<h2 align="center">
	User_Name : <input type="text" placeholder="enter Username" required="required" name="name1"/>
	</h2>
	
	<h2 align="center">
	Password : <input type="password" placeholder="enter Password" required="required" name="Password1"/>
	</h2>
	
<button>Submit</button>
</form>
</body>
</html>
