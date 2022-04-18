<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp" %>
<div class="container-fluid">
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dodanie użytkownika</h1>
    </div>
    <form method="post" action="/user/add">
        <div class="card shadow mb-4">
        <div class="card-body">
            <h6 class="m-0 font-weight-bold text-primary">Nazwa użytkownika:</h6>

            <input type="text" name="userName" placeholder="userName"><br>
            <br>
            <h6 class="m-0 font-weight-bold text-primary">Email:</h6>

            <input type="text" name="email" placeholder="email"><br>
            <br>
            <h6 class="m-0 font-weight-bold text-primary">Hasło</h6>

            <input type="text" name="pass" placeholder="password"><br>
            <br>
            <input type="submit" value="Dodaj">
        </div>
        </div>
    </form>
</div>
<%@ include file="../footer.jsp" %>