<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>Login</title>
 <style>/* Existing styles... */

/* Form container styling */
.form-container {
    width: 100%;
    max-width: 500px;
    margin: 50px auto;
    padding: 20px;
    background: #fff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Form element styling */
form {
    display: flex;
    flex-direction: column;
}

label {
    margin-bottom: 10px;
    font-weight: bold;
}

input[type="text"], 
input[type="password"],
input[type="email"] {
    padding: 10px;
    margin-bottom: 20px;
    border: 1px solid #ddd;
    border-radius: 5px;
    font-size: 16px;
}

button {
    padding: 10px;
    border: none;
    border-radius: 5px;
    background: #007bff;
    color: #fff;
    font-size: 16px;
    cursor: pointer;
    transition: background 0.3s ease;
}

button:hover {
    background: #0056b3;
}
    </style>
</head>
<body>
    <h1>Login</h1>
    <div class = "form-container">
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Password:</label>
        <input type="text" id="password" name="password" required><br><br>
        
        <input type="submit" value="Login">
    </form>
</div>
   
</body>
</html>
