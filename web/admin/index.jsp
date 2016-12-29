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
    <link type="text/css" rel="stylesheet" href="./asserts/bootstrap/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="./asserts/css/style.css">
</head>
<body>
    <div class="container">
        <div class="col-lg-12">
            <h1>Struts 2 Hello World Example</h1>
            <form class="form-horizontal" method="post" action="admin/user/login.action">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">Username</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="username" name="username" placeholder="username">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
