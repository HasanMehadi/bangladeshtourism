<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>

    <title>Bangladesh Tourism</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Bangladesh Tourism Management System</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <spring:url value="/tourplan/alltour" var="tourplan"/>
            <spring:url value="/tourpackage/alltour" var="tourpackage"/>
            <li><a href="${tourplan}">Tour Plan</a></li>
            <li><a href="${tourpackage}">Package Tour</a></li>
        </ul>
        <form class="navbar-form navbar-left" action="/action_page.php">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search" name="Search Tour">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</nav>
<div class="container">

    <h2>Users</h2>
    <table class="table table-dark">
        <thead>
        <tr>
            <td>Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Email</td>
            <td>Phone</td>
            <td>UserName</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="users" var="user">
            <tr contenteditable="false">
                <td >${user.id}></td>
                <td>${user.fname}</td>
                <td>${user.lname}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.username}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<div class="container">

    <h2>TOUR PLANS</h2>
    <table class="table table-dark">
        <thead>
        <tr>
            <td>Id</td>
            <td>Place</td>
            <td>Start Date</td>
            <td>End Date</td>
            <td>Cost Per Person</td>
            <td>Supervisor Contact</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="planList" var="plan">
            <tr >
                <td>${plan.id}></td>
                <td>${plan.place}</td>
                <td>${plan.startDate}</td>
                <td>${plan.endDate}</td>
                <td>${plan.costPerPerson}</td>
                <td>${plan.phone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<div class="container">

    <h2>PACKAGE TOURS</h2>
    <table class="table table-dark">
        <thead>
        <tr>
            <td>Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Phone</td>
            <td>Email</td>
            <td>User Name</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="tourPackages" var="package">
            <tr>
                <td>${package.id}></td>
                <td>${package.place1}</td>
                <td>${package.place2}</td>
                <td>${package.place3}</td>
                <td>${package.startDate}</td>
                <td>${package.endDate}</td>
                <td>${plan.costPerPerson}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
