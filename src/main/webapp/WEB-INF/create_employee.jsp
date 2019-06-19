<%--
  Created by IntelliJ IDEA.
  User: mykalclinard
  Date: 2019-06-19
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/WEB-INF/partials/head.jsp" %>

</head>
<body>
<%@ include file="/WEB-INF/partials/navbar.jsp" %>

<div class="container">
    <h1>Please fill in your information.</h1>
    <form action="/register-employee" method="post">
        <div class="form-group">

<%--            //  Make this a drop down  \\--%>
            <label for="gender">What is your Gender? M or F</label>
            <input id="gender" name="gender" class="form-control" type="text" required>
        </div>
<%--        *************************--%>
        <div class="form-group">
            <label for="first_name">First Name</label>
            <input id="first_name" name="first_name" class="form-control" type="text" required>
        </div>
        <div class="form-group">
            <label for="last_name">Last Name</label>
            <input id="last_name" name="last_name" class="form-control" type="text" required>
        </div>
        <div class="form-group">
            <label for="birth_date">Birthday</label>
            <input id="birth_date" name="birth_date" class="form-control" type="number" required>
        </div>
        <div class="form-group">
            <label for="hire_date">Hire Date</label>
            <input id="hire_date" name="hire_date" class="form-control" type="number" required>
        </div>
        <div class="form-group">
            <label for="salary">Salary</label>
            <input id="salary" name="salary" class="form-control" type="number" required>
        </div>

        <%--            //  Make this a text area  \\--%>
        <div class="form-group">
            <label for="bio">Bio</label>
            <input id="bio" name="bio" class="form-control" type="text" required>
        </div>
        <%--        *************************--%>

        <div class="form-group">
            <label for="goals">Goals</label>
            <input id="goals" name="goals" class="form-control" type="text" required>
        </div>

        <%--            //  Make this a drop down  \\--%>
        <div class="form-group">
            <label for="dept_id">Department ID</label>
            <input id="dept_id" name="dept_id" class="form-control" type="number" required>
        </div>
        <%--        *************************--%>


    <%--            //  Make this a drop down  \\--%>
        <div class="form-group">
            <label for="job_id">Job Title</label>
            <input id="job_id" name="job_id" class="form-control" type="number" required>
        </div>
        <%--        *************************--%>

        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>

</body>
</html>
