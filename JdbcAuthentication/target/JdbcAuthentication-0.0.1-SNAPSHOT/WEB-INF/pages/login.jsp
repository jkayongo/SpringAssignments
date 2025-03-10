<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <title>Login Page</title>
    <style>
        .error {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
            color: #a94442;
            background-color: #f2dede;
            border-color: #ebccd1;
        }
 
        .msg {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
            color: #31708f;
            background-color: #d9edf7;
            border-color: #bce8f1;
        }
 
        #login-box {
            width: 300px;
            padding: 20px;
            margin: 100px auto;
            background: #fff;
            border-radius: 5px;
            border: 1px solid #000;
        }
    </style>
</head>
<body onload='document.loginForm.username.focus();'>
 
    <h1>Spring Security Custom Login Form (XML)</h1>
 
    <div id="login-box">
        <h3>Login with Username and Password</h3>
 
        <!-- Display error messages -->
        <c:if test="${param.error != null}">
            <div class="error">Invalid username or password</div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="msg">You have been logged out successfully.</div>
        </c:if>
 
        <!-- Login Form -->
        <form name='loginForm' action="<c:url value='/login' />" method='POST'>
 
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type='text' name='username' required></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password' required /></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="Login" /></td>
                </tr>
            </table>
 
            <!-- CSRF Token (for Spring Security protection) -->
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
 
        </form>
    </div>
 
</body>
</html>