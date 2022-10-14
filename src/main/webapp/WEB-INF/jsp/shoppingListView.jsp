<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method="post" >
            <input type="text" name="item" />
            <input type="submit" value="add" />
        </form>
    <c:forEach var="element" items="${list.items}">
        <div>
            <form method="post" action="shoppingList/delete">
                <input type="hidden" value="${element.name}"/>
                <input type="submit" value="delete"/>
                <span>${element.name}</span>
            </form>
        </div>
    </c:forEach>
    </body>
</html>
