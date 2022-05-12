<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<h1>Add User</h1>
<form action="registeruser" method="post">
<table>

<tr><td>Id:</td>
<td><input type="number" name="userid"/></td></tr>
<tr><td>Name:</td>
<td><input type="text" name="username"/></td></tr>
<tr><td>Address:</td>
<td><input type="text" name="useraddress"/></td></tr>
<tr><td>RegisterDate:</td>
<td><input type="text" name="userregister"/></td></tr>
<tr><td>Contact:</td>
<td><input type="text" name="usernumber"/></td></tr>
<tr>
<td/>
<td><input type="submit" value="Add"/></td></tr>
</table>
</form>
<p>${result}</p>
</body>
</html>