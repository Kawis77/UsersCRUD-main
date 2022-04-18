<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp" %>
<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dane użytkownika</h1>
        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
    </div>

        <div class="card shadow mb-4">
            <div class="card-body">
                <h6 class="m-0 font-weight-bold text-primary">Id:</h6>
                ${user.id}<br>
                <br>
                <h6 class="m-0 font-weight-bold text-primary">Nazwa użytkownika:</h6>
                ${user.userName}<br>
                <br>
                <h6 class="m-0 font-weight-bold text-primary">Email:</h6>
                ${user.email}<br>
                <br>
            </div>
        </div>
</div>
<%@ include file="../footer.jsp" %>