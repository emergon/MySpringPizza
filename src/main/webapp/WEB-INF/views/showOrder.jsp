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
        <strong>Size:</strong> ${paragelia.pizza.size.sname}
        <br/>
        <br/>
        <strong>Ingredients:</strong>
        <ul>
            <c:forEach items="${paragelia.pizza.ingredients}" var="ingr">
                <li>${ingr.iname}</li>
                </c:forEach>
        </ul>
        <strong>Payment Method:</strong> ${paragelia.payment.pname}
        <br/>
        <strong>Your name:</strong>${paragelia.customer.cname}
        <br/>
        <strong>Your age:</strong> ${paragelia.customer.cage}
        <br/>
        <strong>Order date:</strong> ${paragelia.orderDate}
        <h3>Thank you for your order</h3>
    </body>
</html>
