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
<div class="container text-center">
    <h3>Manage Task</h3>
    <hr>
    spring:url value="/project/add" var="formUrl"/>
    <form class="form-horizontal" method="POST" action="/saveTourPlan">
        <div class="form-group">
            <label class="control-label col-md-3">Place</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="place" value="${tourPlan.place}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Last Name</label>
            <div class="col-md-7">
                <input type="date" class="form-control" name="lname" value="${tourPlan.startDay}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Email</label>
            <div class="col-md-7">
                <input type="date" class="form-control" name="email" value="${tourPlan.endDay}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Phone Number</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="phone" value="${tourPlan.phone}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">User Name</label>
            <div class="col-md-7">
                <input type="number" class="form-control" name="username" value="${tourPlan.price}"/>
            </div>
        </div>


        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="tourplan/saveTourPlan"/>
        </div>
    </form>
</div>

<script src="/js/jquery-1.11.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>