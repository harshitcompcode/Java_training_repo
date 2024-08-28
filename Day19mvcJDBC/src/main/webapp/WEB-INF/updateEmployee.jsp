<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>
    <h1>Update Employee</h1>
    <form action="../update" method="post">
        <input type="hidden" name="empId" value="${employee.empId}" />
        <p>Employee Name: <input type="text" name="empName" value="${employee.empName}" /></p>
        <p>Employee Salary: <input type="text" name="empSal" value="${employee.empSal}" /></p>
        <p><input type="submit" value="Update Employee" /></p>
    </form>
    <a href="../employee">Back to Employee List</a>
</body>
</html>
