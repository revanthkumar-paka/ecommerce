<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.Phase3_Project.entity.User, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
<h1>Display Users</h1>
<form action="displayuser" method="post">
<%
List<User> users=(List<User>)request.getAttribute("users");
 out.println("<table border=5px>");
 out.println("<tr>");
	out.println("<td>");
	out.println("Userid");
	out.println("</td>");
	out.println("<td>");
	out.println("Username");
	out.println("</td>");
	out.println("<td>");
	out.println("Useraddress");
	out.println("</td>");
	out.println("<td>");
	out.println("Userregister");
	out.println("</td>");
	out.println("<td>");
	out.println("Usernumber");
	out.println("</td>");
	out.println("</tr>");
for(User user:users){
	out.println("<tr>");
	out.println("<td>");
	out.println(user.getUserid());
	out.println("</td>");
	out.println("<td>");
	out.println(user.getUsername());
	out.println("</td>");
	out.println("<td>");
	out.println(user.getUseraddress());
	out.println("</td>");
	out.println("<td>");
	out.println(user.getUserregister());
	out.println("</td>");
	out.println("<td>");
	out.println(user.getUsernumber());
	out.println("</td>");
	out.println("</tr>");
}
 out.println("</table>");
%>
</form>
</body>
</html>