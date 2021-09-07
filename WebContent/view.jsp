<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resource/style.css" rel="stylesheet" />
</head>
<body class="body">
<center>
<div class="search">

<form class="form" action="search" method="post">
<h3 class="h3" ><marquee behavior="alternate">***ENTER USERNAME</marquee></h3>
<h3><LABEL><b>VIEW PAGE</LABEL></b><br></h3>
<input type="text" placeholder="Search..." name="search" title="please enter username" required/>
<button class="button1" type="submit">Search</button>
<button  class="cancelbtn" onclick="location.href='home.jsp'">Cancel</button>

<table><tr>
<td>UserName:</td>
<td>
<input type="text" name="username"
value="${exists.username}"></td></tr>
<br>	
	
<tr>
<td>Password:</td>
<td>
<input type="password" name="password"
value="${exists.password}"></td>
</tr>
<br>
<tr>
<td>Email:</td>
<td>
<input type="text" name="email"
value="${exists.email}" ></td>
</tr>
<br>

<tr>
<td>Contact:</td>
<td>
<input type="text" name="contact"
value="${exists.contact}"></td>
</tr>
<br>
<tr>
<td>Address:</td>
<td>
<input type="text" name="address"
value="${exists.address}"></td>
</tr>
</table>
</div>  
 </form>

	</center>

	</body>
	</html>
	