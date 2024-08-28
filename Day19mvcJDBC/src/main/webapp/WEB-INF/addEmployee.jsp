<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
    <h1>Add New Employee</h1>
    <form action="add" method="post">
        <p>Employee Name: <input type="text" name="empName" /></p>
        <p>Employee Salary: <input type="text" name="empSal" /></p>
        <p>employee Id: <input type = "text" name = "empId"/></p>
        <p><input type="submit" value="Add Employee" /></p>
    </form>
    <a href="../employee">Back to Employee List</a>
</body>
</html>
