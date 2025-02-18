<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<html>
<head>
    <title>User List</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }
        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }
        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }
    </style>
</head>
<body>
 
<h1>Users List</h1>
 
<c:if test="${not empty systemUsers}">
    <table class="tg">
        <tr>
            <th width="80">User ID</th>
            <th width="120">User Name</th>
            <th width="120">Email</th>
            <th width="60">Place Of Residence</th>
			<th width="60">Action</th>
        </tr>
 
        <c:forEach items="${systemUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.email}</td>
				<td>${user.placeOfResidence}</td>
				<td><a href="<c:url value='/deleteUser/${user.id}' />">Delete</a></td>
				<td><a href="<c:url value='/userToUpdate/${user.id}' />">Update</a></td>

            </tr>
        </c:forEach>
    </table>
</c:if>
 
<c:if test="${empty systemUsers}">
    <p>No users available.</p>
</c:if>
 
</body>
</html>
 