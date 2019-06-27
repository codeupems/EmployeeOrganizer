<%--
  Created by IntelliJ IDEA.
  User: johndeleon
  Date: 2019-06-14
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg nav-style navbar-light">
    <a class="navbar-brand nav-li emp_lu" href="#">Employee Lookup Tool</a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">

        <ul class="navbar-nav" id="topnav">
            <li class="nav-item nav-li" id="home">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item nav-li" id="list">
                <a class="nav-link" href="/employees-list">Employee List</a>
            </li>
            <li class="nav-item nav-li" id="reguser">
                <a class="nav-link"  href="/registeruser">Register User</a>
            </li>
            <li class="nav-item" id="create">
                <a class="nav-link" href="/registeremployee" tabindex="-1"
                  >Register Employee</a>
            </li>
            <li class="nav-item" id="login">
                <a class="nav-link" href="/login" tabindex="-1" aria-disabled="true">login</a>
            </li>

            <li class="nav-item" id="logout">
                <a class="nav-link " href="/logout" tabindex="-1"
                   aria-disabled="true">logout</a>

            </li>
        </ul>
    </div>
</nav>

