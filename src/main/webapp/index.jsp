<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Lista użytkowników</a>
    </div>

<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h5 class="m-0 font-weight-bold text-primary">Witaj na stronie zarządzającą użytkownikami Twojej aplikacji
            :)</h5>
    </div>
    <div class="card-body">
        <h6 class="m-0 font-weight-bold ">Baw się dobrze.</h6>
    </div>
</div>
<%@ include file="footer.jsp" %>
