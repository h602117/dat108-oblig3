<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        <form method="post" action="auth/login">
            <label for="password">
                Password
                <input type="password" name="password" />
            </label>
            <input type="submit" value="login" />
        </form>
    </body>
</html>
