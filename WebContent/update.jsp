<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resource/style.css" rel="stylesheet" />
</head>
<body class="body">
<center>
<form class="form" action="checktoupdate" method="post">
<br>
${valid}
<div class="result"> 
 <h3 class="h3" ><marquee behavior="alternate">***ENTER THE USERNAME</marquee></h3>
 
<h3><LABEL><b>UPDATE PAGE</b></LABEL><br></h3>
<input type ="text" placeholder="Search..." id="search" name="search" title="please enter the username" >
<button class="button1" type="submit" value="search">Search</button>

</div>

</form>
<form class="form2" action="updatedata" method="post">

<div class="result1"> 
<table>
<tr>
<td>UserName:</td>
<td>
<input type="text" name="username"  value="${exists.username}" readonly></td>
</tr>

<tr>
<td>Password:</td>
<td>
<input type="password"name="password" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
   title="Must contain at least one number and one uppercase and lowercase letter, 
                            and at least 8 or more characters"  value="${exists.password}"></td>
</tr>

<tr>
<td>Email:</td>
<td>
<input type="email" id="email" name="email"
       pattern=".+@gmail.com" title="Should contain @"  value="${exists.email}" ></td>
</tr>
<tr>
<td>Contact:</td>
<td>
<input type="text" name="contact" pattern="[7-9]{1}[0-9]{9}"  value="${exists.contact}" > </td>
</tr>

<tr>
<td>Address:</td>
<td>
<input type="text" name="address"
value="${exists.address}" title="This is required field" ></td>
</tr>
</table>
</div>

<button class="button" type="submit">Save</button>
  <button type="button"  onclick="location.href='home.jsp'" class="cancelbtn">Cancel</button>
<br>
<br><br>

</form>

<div class="message">

</div>

</center>
</body>
</html>