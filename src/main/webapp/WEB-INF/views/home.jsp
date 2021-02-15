<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza App</title>
        <c:url value="/static/css/style.css" var="cssLink"/>
        <link rel="stylesheet" href="${cssLink}">
    </head>
    <body>
        <h3>Welcome to Pizza Application</h3>
        <a href="${pageContext.request.contextPath}/order">Order your pizza</a>
    </body>
</html>
