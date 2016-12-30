<%@ page import="com.zing.domain.User" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    User user = (User) request.getSession().getAttribute("user");
    if(user == null){
        response.setStatus(302);
        return;
    }
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/asserts/bootstrap/css/bootstrap.css">
    <title>admin</title>
</head>
<body>
<div class="container">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${sessionScope.get("user").username}</td>
            <td>${sessionScope.get("user").password}</td>
        </tr>
        </tbody>
    </table>
</div>
<%
%>
<s:debug/>
</body>
</html>