<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body
 {
 
 background-color: gray;
 background-position: center;

}
input[type=submit]{
 background-color: black;
  color: white;
}
.form{
border-radius: 12px; 
}

input {
  width: 8%;
}
</style>

</head>
<body>
<center>
<br>
<br>
<br>
<br>
<h2>WELCOME!!!</h2>
<br>
<form method="post" action="adduser">
<input type="submit" value="ADD" >

</form>
<br>
<br>
<form method="post" action="viewuser">
<input type="submit" value="VIEW" >
</form>
<br>
<br>
<form method="post" action="updateuser">
<input type="submit" value="UPDATE" >
</form>
<br>
<br>
<form method="post" action="loginuser">
<input type="submit" value="LOGIN" >
</form>
</center>

</body>
</html>