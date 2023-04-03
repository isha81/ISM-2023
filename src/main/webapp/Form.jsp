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
<form action="Form" method="post">
	First Name: <input type="text" name="firstName"/>
	<br>
	Last Name: <input type="text" name="lastName"/>
	<br>
	<input type="submit" name="Submit"/>
	<br>
</form>


<%=error%>

</body>
</html>