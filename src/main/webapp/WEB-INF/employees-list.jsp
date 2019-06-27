<%--
  Created by IntelliJ IDEA.
  User: johndeleon
  Date: 2019-06-14
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
    <%@ include file="/WEB-INF/partials/head.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/partials/navbar.jsp" %>
<script type="text/javascript">

</script>
<div class="container">
    <h1>Employees List</h1>
    <nav class="navbar navbar-light search-nav-style">
        <a class="navbar-brand">Employee Search</a>
        <form class="form-inline" method="post">
            <div class="form-check form-check-inline">
                <input class="form-check-input radio-btn" type="radio" id="name" value="name" name="stype"
                       checked="checked">
                <label class="form-check-label" for="name">Name</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input radio-btn" type="radio" id="id" value="id" name="stype">
                <label class="form-check-label" for="id">ID</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input radio-btn" type="radio" id="dept" value="dept" name="stype">
                <label class="form-check-label" for="dept">Department</label>
            </div>
            <input class="form-control mr-sm-5 search-bar-style"
                   type="search"
                   placeholder="Search"
                   name="search"
                   id="search"
                   aria-label="Search">

            <button class="btn my-2 my-sm-0 search-btn-style" type="submit">Search</button>
        </form>
    </nav>

    <div class="col-12">
        <c:forEach var="emp" items="${emp}">

            <div class="card float-left m-3 nav-style" style="width: 20rem;">
                <img src="https://robohash.org/${emp.first_name}?set=set5" class="card-img-top"
                     alt="...">
                <div class="card-body nav-style">
                    <h5 class="card-title"><c:out value="${emp.first_name} ${emp.last_name}"/></h5>
                    <p class="card-text">ID: <c:out value="${emp.id}"/></p>
                    <form action="/employee-info" method="post">

                        <button class="btn card-btn-style viewbutton" name="id" type="submit"
                                value="${emp.id}">View Employee</button>
                    </form>
                        <c:if test="${isadmin}" >
                            <form action="/employees-list" method="post">
                            <button class="btn btn-danger nav-style" name="stype" type="submit"
                                    value="delete">Delete Employee</button>
                                <input type="number" name="id" value="${emp.id}" hidden>
                            </form>
                        </c:if>
                </div>
            </div>

        </c:forEach>
    </div>

</div>
<div class="float-left">
    <br>
    <br class="my-5">
</div>
<div class="mt-5">
    <%@include file="partials/leghand.jsp" %>
</div>
<script src="/"></script>
</body>
</html>
