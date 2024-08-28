<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
    <h1>Employee List</h1>
    <a href="employee/add">Add New Employee</a>
    <c:forEach var="emp" items="${empList}">
        <p>
            ${emp.empId} - ${emp.empName} - ${emp.empSal}
            <a href="employee/update/${emp.empId}">Update</a>
            <a href="employee/delete/${emp}" >Delete</a>
        </p>
    </c:forEach>
</body>
</html>
