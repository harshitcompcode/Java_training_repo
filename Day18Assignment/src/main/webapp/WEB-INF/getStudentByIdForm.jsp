<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Get Student by ID</title>
</head>
<body>
    <h2>Get Student by ID</h2>
    <form action="getStudentById" method="get">
        Student ID: <input type="text" name="studentId"><br>
        <input type="submit" value="Get Student">
    </form>
</body>
</html>
