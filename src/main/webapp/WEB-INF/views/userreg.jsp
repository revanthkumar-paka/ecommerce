<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
<h1>Add Product</h1>
<form action="registerproduct" method="post">
<table>

<tr><td>Id:</td>
<td><input type="number" name="productid"/></td></tr>
<tr><td>Name:</td>
<td><input type="text" name="productname"/></td></tr>
<tr><td>Price:</td>
<td><input type="number" name="productprice"/></td></tr>
<tr><td>Category:</td>
<td><input type="text" name="productcat"/></td></tr>
<tr><td>Date:</td>
<td><input type="text" name="productdate"/></td></tr>
<tr>
<td/>
<td><input type="submit" value="Add"/></td></tr>
</table>
</form>
<p>${result}</p>
</body>
</html>