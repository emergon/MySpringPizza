<%-- 
    Document   : orderForm
    Created on : Feb 11, 2021, 8:25:34 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Order</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form action="order/process" method="POST">
            <p><strong>Choose bread size:</strong></p>
            <input type="radio" name="size" value="Large">Large<br/>
            <input type="radio" name="size" value="Medium">Medium<br/>
            <input type="radio" name="size" value="Small">Small<br/>
            <p><strong>Choose ingredients:</strong></p>
            <input type="checkbox" name="ingredients" value="Mushroom">Potatoes<br/>
            <input type="checkbox" name="ingredients" value="Tomatoes">Tomatoes<br/>
            <input type="checkbox" name="ingredients" value="Sausage">Sausage<br/>
            <input type="checkbox" name="ingredients" value="Cheese">Cheese<br/>
            <input type="checkbox" name="ingredients" value="Ham">Ham<br/>
            <p><strong>Choose payment method:</strong></p>
            <select name="payment">
                <option value="Credit Card">Credit Card</option>
                <option value="Cash">Cash</option>
            </select>
            <br/>
            <p><strong>Your details:</strong></p>
            Name: <input type="text" name="name"/>
            <br/>
            Age:<input type="text" name="age"/>
            <br/>
            Date of order:<input type="date" name="order_date" />
            <br/>
            <input type="submit" value="Submit"/>
            
        </form>
    </body>
</html>