<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
    <h2>Delete Student</h2>
    <form action="deleteStudent" method="get">
        Student ID: <input type="text" name="studentId"><br>
        <input type="submit" value="Delete Student">
    </form>
</body>
</html>
