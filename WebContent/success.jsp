<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resource/style.css" rel="stylesheet" />
</head>
<center>
<body class="body">
<br><br><br>
<h3>${login}<h3></h3>
<button class="cancelbtn" onclick="location.href='home.jsp'">Home</button>
</center>
 </body>
</html>