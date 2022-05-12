<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.Phase3_Project.entity.Product, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
<h1>Display Product</h1>
<form action="displayproduct" method="post">
<%
List<Product> products=(List<Product>)request.getAttribute("products");
 out.println("<table border=5px>");
 out.println("<tr>");
	out.println("<td>");
	out.println("Productid");
	out.println("</td>");
	out.println("<td>");
	out.println("Productname");
	out.println("</td>");
	out.println("<td>");
	out.println("Productprice");
	out.println("</td>");
	out.println("<td>");
	out.println("Productcat");
	out.println("</td>");
	out.println("<td>");
	out.println("Productdate");
	out.println("</td>");
	out.println("</tr>");
for(Product product:products){
	out.println("<tr>");
	out.println("<td>");
	out.println(product.getProductid());
	out.println("</td>");
	out.println("<td>");
	out.println(product.getProductname());
	out.println("</td>");
	out.println("<td>");
	out.println(product.getProductprice());
	out.println("</td>");
	out.println("<td>");
	out.println(product.getProductcat());
	out.println("</td>");
	out.println("<td>");
	out.println(product.getProductdate());
	out.println("</td>");
	out.println("</tr>");
}
 out.println("</table>");
%>
</form>
</body>
</html>