<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>

<body>
	<table align="center">
		<tr>
			<td><b>ProductId</b></td>
			<td><b>productName</b></td>
			<td><b>productPrice</b></td>
			<td><b>productQty</b></td>

		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td> <c:out value="${product.productId}" /></td>
				<td> <c:out value="${product.productName}" /></td>
				<td> <c:out value="${product.productPrice}" /></td>
				<td> <c:out value="${product.productQty}" /></td>
			</tr>
		</c:forEach>
		<tr>
			<td></td>
			<td><a href="home">Home</a></td>
		</tr>
	</table>

</body>

</html>