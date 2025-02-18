<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete Employee</title>
    <meta http-equiv="refresh" content="2;url=${pageContext.request.contextPath}/viewUsers">
</head>
<body>
    <h1>Employee Deleted Successfully!</h1>
    <p>${deleteMessage}</p>
    <p>Redirecting to the employee list...</p>
</body>
</html>