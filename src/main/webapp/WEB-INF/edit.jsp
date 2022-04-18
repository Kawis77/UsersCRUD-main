<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp" %>
<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Edycja użytkownika</h1>
        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
    </div>

    <form method="post" action="/user/edit">
        <div class="card shadow mb-4">
        <div class="card-body">
            <h6 class="m-0 font-weight-bold text-primary">Nazwa użytkownika:</h6>
            <input type="text" name="userName" value="${user.userName}" placeholder="Username"><br>
            <br>
            <h6 class="m-0 font-weight-bold text-primary">Email:</h6>
            <input type="text" name="email" value="${user.email}" placeholder="Email"><br>
            <br>
            <h6 class="m-0 font-weight-bold text-primary">Hasło</h6>
            <input type="text" name="email" placeholder="Password"><br>
            <br>
            <input type="submit" value="Edytuj">
        </div>
        </div>
    </form>
</div>
<%@ include file="../footer.jsp" %>