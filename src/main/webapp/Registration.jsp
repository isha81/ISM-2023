<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String error=(String)request.getAttribute("error");
%>
<form action="Registration" method="post">
First Name:<input type="text" name="firstName"/><br>
Last Name:<input type="text" name="lastName"/><br>
Email :<input type="text" name="email"/><br>
Password :<input type="text" name="password"/><br>
Confirm-Password :<input type="text" name="confirmpassword"/><br>
Gender:<input type="Radio" name="gender" value="Female"/>Female
<input type="Radio" name="gender" value="Male"/>Male<br>
Hobbies:<input type="checkbox" name="hobbies" value="Dancing">Dancing
<input type="checkbox" name="hobbies" value="crafting">Crafting
<input type="checkbox" name="hobbies" value="cooking">Cooking 
City:
<select name="city">
<option value="">`Choose city</option>
<option value="Surendranagar">Surendranagar</option>
<option value="Ahmedabad">Ahmedabad</option>
<option value="Rajkot">Rajkot</option>
<option value="Mumbai">Mumbai</option>
</select>
<input type="submit" value="submit"/>

</form>
<%=error %>

</body>
</html>