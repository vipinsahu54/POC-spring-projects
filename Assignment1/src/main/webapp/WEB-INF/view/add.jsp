<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Add Product</title>
        </head>

        <body>
            <form:form id="addproduct" modelAttribute="add" action="addproduct" method="post">

                <table align="center">
                    <tr>
                        <td>
                            <form:label path="productId">Product Id</form:label>
                        </td>
                        <td>
                            <form:input path="productId" name="productId" id="productId" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="productName">Product Name</form:label>
                        </td>
                        <td>
                            <form:input path="productName" name="productName" id="productName" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="productPrice">Product Price</form:label>
                        </td>
                        <td>
                            <form:input path="productPrice" name="productPrice" id="productPrice" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="productQty">Product Qty</form:label>
                        </td>
                        <td>
                            <form:input path="productQty" name="productQty" id="productQty" />
                        </td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="add" name="add">Add Product</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>

        </body>

        </html>