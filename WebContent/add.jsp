<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="<%=request.getContextPath()%>/resource/style.css" rel="stylesheet" />
</head>
<body class="body" >
<center>
<form class="form" action="Add"  method="post">
<div>${message }</div> 
<h3 class="h3" ><marquee behavior="alternate" >***ENTER CREDENTIALS</marquee></h3>
<h3><LABEL></b>INSERT PAGE</b></LABEL><br></h3>
 <label>USERNAME:</label>
 <input type="text" name="username" required/ >
 <br><br>
                     
 <label>PASSWORD:</label>
 <input type="password" name="password" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required />                
 <br><br>

 <label>GENDER:</label>
 <input type="radio" name="gender" value="Male">Male
 <input type="radio" name="gender" value="Female">Female
 <input type="radio" name="gender" value="Other">Other
 <br><br>
 
<label> EMAIL_ID :</label>
<input type="email" id="email" name="email" pattern=".+@gmail.com" title="Should contain @" required/>
<br> <br>
       
<label>ADDRESS  :   </label>
 <input type="text" name="address" required/>
 <br><br>
 
 <label> CONTACT : </label>
<input type="text" name="contact" pattern="[7-9]{1}[0-9]{9}"  title=" number should start with 7-9" required/>
 <br><br>
  
<button class="button" type="submit">Save</button>
<button type="button"  onclick="location.href='home.jsp'" class="cancelbtn">Cancel</button>

</form>
<br>   
</center>
</body>
</html>