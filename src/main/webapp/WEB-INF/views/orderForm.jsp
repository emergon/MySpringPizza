<%-- 
    Document   : orderForm
    Created on : Feb 11, 2021, 8:25:34 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Order</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form:form action="order/process" method="POST" modelAttribute="paragelia">
            
            <p><strong>Choose bread size:</strong></p>
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname" itemValue="id" element="li"/>
            
            <p><strong>Choose ingredients:</strong></p>
            <%--<form:checkboxes path="pizza.ingredients" items="${ingredients}" itemLabel="iname" itemValue="id" />--%>
            <c:forEach items="${ingredients}" var="ingredient">
                <input type="checkbox" name="ingredients" value="${ingredient}">${ingredient.iname}<br/>
            </c:forEach>
                
            <p><strong>Choose payment method:</strong></p>
            <form:select path="payment" items="${payments}" itemLabel="pname" itemValue="id"/>
            
            <br/>
            <p><strong>Your details:</strong></p>
            Name: <form:input path="customer.cname"/>
            
            <br/>
            Age:<form:input path="customer.cage"/>
            
            <br/>
            Date of order:<form:input path="orderDate" type="date"/>
            
            <br/>
            <input type="submit" value="Submit"/>

        </form:form>
    </body>
</html>