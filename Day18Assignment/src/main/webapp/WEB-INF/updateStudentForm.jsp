<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
    <h2>Update Student</h2>
    <form action="updateStudent" method="get">
        Student ID: <input type="text" name="studentId"><br>
        New Student Name: <input type="text" name="studentName"><br>
        <input type="submit" value="Update Student">
    </form>
</body>
</html>
