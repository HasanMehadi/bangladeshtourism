<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<div class="container">

    <h2>Users</h2>
    <table class="table table-dark">
        <tbody>
        <tr>
            <td>Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Phone</td>
            <td>Email</td>
            <td>User Name</td>
        </tr>
        <tr>
            <td>${users.id}></td>
            <td>${users.fname}</td>
            <td>${users.lname}</td>
            <td>${users.phone}</td>
            <td>${users.email}</td>
            <td>${users.username}</td>
        </tr>
        </tbody>
    </table>

</div>

<script src="/js/jquery-1.11.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
