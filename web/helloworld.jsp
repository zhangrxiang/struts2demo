<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/12/28
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>hello world</h1>
<h1>${message}</h1>
<h1><s:property value="message" /></h1>
${applicationScope.get("user")}
</body>
</html>
