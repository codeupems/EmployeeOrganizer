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
    <title>dao.Employees</title>
    <%@ include file="/WEB-INF/partials/head.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/partials/navbar.jsp" %>
<h1>Employees List</h1>
<c:forEach var="emp" items="${Emps}">

    <div class="card" style="width: 18rem;">
        <img src="https://robohash.org/${emp.name}" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">${emp.first_name} ${emp.last_name}</h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
    </div>

</c:forEach>



<%@ include file="/WEB-INF/partials/footer.jsp" %>
</body>
</html>
