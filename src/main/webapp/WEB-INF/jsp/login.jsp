<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form:form modelAttribute="user" style="padding:5% 40%">
    <p>Username:</p>
    <form:input  path="username"/>
    <p>Password:</p>
    <form:password  path="password"/>
    <p>Age:</p>
    <form:input type="number"  path="age"/><br/>
    <input type="submit" />
</form:form>
</body>
</html>
