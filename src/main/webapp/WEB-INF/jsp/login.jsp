<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">
    <title>Bangladesh Tourism Management System</title>
</head>
<body>

<div role="navigation">
    <div class="navbar navbar-inverse">
        <spring:url value="/bangladeshTourism/login" var="login"/>
        <a href="${login}" class="navbar-brand">Bangladesh Tourism </a>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="createUser">Registration</a></li>
                <li><a href="#">View Up Coming Tour Package</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="table">
    <spring:url value="/bangladeshTourism/authUser" var="authUser"/>
    <form:form method="post" action="${authUser}">
        <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                <tr>
                    <th colspan="2">Login Here</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="username" value="" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" value="" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" class="bg-success"/></td>
                    <td><input type="reset" value="Reset" class="bg-danger"/></td>
                </tr>

                </tbody>
            </table>
        </center>
    </form:form>
    <table border="1" width="30%" cellpadding="3">
      <center>
         <tr>
            <td colspan="2">Yet Not Registered!!
                <spring:url value="/bangladeshTourism/createUser" var="createUser"/>
                <form:form method = "GET" action = "${createUser}">
                    <input type = "submit" value = "Register Now" class="hover-square"/>
                </form:form>
            </td>
          </tr>
      </center>
    </table>
</div>


<script src="/js/jquery-1.11.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>