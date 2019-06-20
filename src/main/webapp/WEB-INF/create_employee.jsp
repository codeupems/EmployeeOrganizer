<%--
  Created by IntelliJ IDEA.
  User: mykalclinard
  Date: 2019-06-19
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <%@ include file="/WEB-INF/partials/head.jsp" %>

</head>
<body>
<%@ include file="/WEB-INF/partials/navbar.jsp" %>

<div class="container">
    <h1>Please fill in your information.</h1>
    <form action="/registeremployee" method="post">
        <div class="form-group">
            <label for="gender">What is your Gender?</label>
            <select class="custom-select my-1 mr-sm-2" id="gender" name="gender" required>
                <option selected>Choose...</option>
                <option value="M">Male</option>
                <option value="F">Female</option>
             </select>
        </div>
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
            <input id="birth_date" name="birth_date" class="form-control" type="date" placeholder="YYYMMDD" required>
        </div>
        <div class="form-group">
            <label for="hire_date">Hire Date</label>
            <input id="hire_date" name="hire_date" class="form-control" type="date" placeholder="YYYMMDD" required>
        </div>
        <div class="form-group">
            <label for="salary">Salary</label>
            <input id="salary" name="salary" class="form-control" type="text" placeholder="Enter current salary" required>
        </div>
        <div class="form-group">
            <label for="bio">Bio</label>
            <textarea class="form-control" id="bio" name="bio" placeholder="Enter you're bio..."></textarea>
        </div>
        <div class="form-group">
            <label for="goals">Goals</label>
            <input id="goals" name="goals" class="form-control" type="text" placeholder="Enter you're goals..." required>
        </div>
        <div class="form-group">
            <label for="dept_id">Department ID</label>
            <select class="form-control my-1 mr-sm-2" id="dept_id" name="dept_id" onClick="getJobTitle()" required>
<%--                <option selected>Choose...</option>--%>
<%--                <option value="1" id="Tech">Technology</option>--%>
<%--                <option value="2" id="HR">HR</option>--%>
<%--                <option value="3" id="Fin">Finance</option>--%>
<%--                <option value="4" id="Mar">Marketing</option>--%>
<%--                <option value="5" id="Prod">Production</option>--%>
            </select>
        </div>
        <div class="form-group">
            <label for="job_id">Job Title</label>
            <select class="form-control my-1 mr-sm-2" id="job_id" name="job_id" required>
<%--                <option selected>Choose...</option>--%>
<%--                <option value="1" id="clerk">Clerk</option>--%>
<%--                <option value="2" id="Admin">Administrator</option>--%>
<%--                <option value="3" id="LAdmin">Lead Administrator</option>--%>
<%--                <option value="4" id="Pro">Programmer</option>--%>
<%--                <option value="5" id="SPro">Senior Programmer</option>--%>
<%--                <option value="6" id="ProA">Program Architect</option>--%>
<%--                <option value="7" id="SProA">Senior Program Architect</option>--%>
<%--                <option value="8" id="Acc">Accountant</option>--%>
<%--                <option value="9" id="LAcc">Lead Accountant</option>--%>
<%--                <option value="10" id="Consult">Consultant</option>--%>
            </select>
        </div>
        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>

<%@ include file="/WEB-INF/partials/footer.jsp" %>
</body>
</html>
