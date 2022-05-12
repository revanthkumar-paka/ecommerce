<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Registration</title>
</head>
<body>
<h1>Add Purchase</h1>
<form action="registerpurchase" method="post">
<table>

<tr><td>UserId:</td>
<td><input type="number" name="userid"/></td></tr>
<tr><td>ProductId:</td>
<td><input type="number" name="productid"/></td></tr>
<tr><td>ProductName:</td>
<td><input type="text" name="productname"/></td></tr>
<tr>
<td/>
<td><input type="submit" value="Add"/></td></tr>
</table>
</form>
<p>${result}</p>
</body>
</html>