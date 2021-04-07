<html>
<style>
form{
text-align:center;
}
</style>

<body text=white bgcolor="voilet">
<h1><br><br></h1>
<h1 align="center"><b>Login Page</b></h1>
<form>
	<h2 align="center">
	User_Name : <input type="text" placeholder="enter Username" name="name"/>
	</h2>
	
	<h2 align="center">
	Password : <input type="password" placeholder="enter Password" name="Password"/>
	</h2>
	
	<input type="submit" value="Login" formaction="/signupMVC/validate">&nbsp<input type="submit" value="Signin" formaction="/signupMVC/signuppage"/>
</form>
</body>
</html>
