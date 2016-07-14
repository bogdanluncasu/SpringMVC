<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <c:choose>
        <c:when test="${bool}">
            You are logged in!
        </c:when>
        <c:otherwise>
            Wrong creditentials!
        </c:otherwise>
    </c:choose>

</body>
</html>
