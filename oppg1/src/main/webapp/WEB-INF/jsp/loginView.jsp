<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
  </head>
  <body>
    <h1>Login</h1>
    <p style="color: red">${loginFailedMessage}</p>
    <form method="post" action="login">
      <label for="password">Password</label>
      <input type="password" name="password" />
      <input type="submit" value="login" />
    </form>
  </body>
</html>
