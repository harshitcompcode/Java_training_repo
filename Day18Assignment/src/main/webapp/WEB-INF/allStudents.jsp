<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Students</title>
</head>
<body>
    <h2>All Students</h2>
    <c:if test="${not empty students}">
        <ul>
            <c:forEach var="student" items="${students}">
                <li>${student.studentName} (ID: ${student.studentId})</li>
            </c:forEach>
        </ul>
    </c:if>
    <c:if test="${empty students}">
        <p>No students found.</p>
    </c:if>
    <a href="welcome.jsp">Back to Welcome Page</a>
</body>
</html>
