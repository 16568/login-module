<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

form {
  border: 3px solid #f1f1f1;
  position:absolute;
top:30%;
left:44%;
transform:translate(-30%,-30%);
max-width:350px;
width:100%;
padding: 25px;
border-radius:5px;	
background-color: gray;
}


input[type=text], input[type=password] {
  width: 35%;
  padding: 8px 10px;
  margin: 8px 0;
  border: 1px solid #ccc;
 
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 5px 7px;
  width: auto;
  border-radius: 4px;
}


.cancelbtn {
  width: auto;
   padding: 5px 7px;
  background-color: #f44336;
}

.container {
  padding: 16px;
}

@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 50%;
  }
}
</style>
</head>
<body>


<br>
<center>

<form class="form" action="login" method="post">
<h3 class="h3"><marquee behavior="alternate">***ENTER LOGIN CREDENTIALS</marquee></h3>
  <h3><LABEL>LOGIN PAGE</LABEL></h3>
  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username.." name="username" required>
    <br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password.." name="password" required>
<br>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
  <button type="submit">Login</button>
    <button type="button"  onclick="location.href='home.jsp'" class="cancelbtn">Cancel</button>
    
  </div>

    </form>
    </center>
</body>
</html>