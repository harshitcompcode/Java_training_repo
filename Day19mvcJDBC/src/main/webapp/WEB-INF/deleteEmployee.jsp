<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>
    <h1>Delete Employee</h1>
    <form action="../delete" method="post">
    ID to delete:
        <input type="text" name="empId" value="${employee.empId}" />
        
        <p><input type="submit" value="Delete Employee" /></p>
    </form>
    
    <a href="../employee">Back to Employee List</a>
    
    
</body>
</html>
