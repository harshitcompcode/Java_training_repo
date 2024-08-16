<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h2>Add Student</h2>
    <form action="addStudent" method="get">
        Student Name: <input type="text" name="studentName"><br>
        Student ID: <input type="text" name="studentId"><br>
        <input type="submit" value="Add Student">
    </form>
</body>
</html>
