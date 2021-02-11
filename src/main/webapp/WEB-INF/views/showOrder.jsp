<%-- 
    Document   : showOrder
    Created on : Feb 11, 2021, 8:26:47 PM
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Details</title>
    </head>
    <body>
        <h1>You ordered a nice pizza</h1>
        <strong>Size:</strong> ${size}
        <br/>
        <br/>
        <strong>Ingredients:</strong>
        <ul>
            <c:forEach items="${ingredients}" var="ingr">
                <li>${ingr}</li>
                </c:forEach>
        </ul>
        <strong>Payment Method:</strong> ${payment}
        <br/>
        <strong>Your name:</strong>${name}
        <br/>
        <strong>Your age:</strong> ${age}
        <br/>
        <strong>Order date:</strong> ${order_date}
        <h3>Thank you for your order</h3>
    </body>
</html>
