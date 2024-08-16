<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <h2>Student Information</h2>
    <c:if test="${not empty student}">
        Name: ${student.studentName}<br>
        ID: ${student.studentId}<br>
    </c:if>
    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>
    <a href="getAllStudentInfo">Back to All Students</a>
</body>
</html>
