<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp" %>
<div class="container-fluid">
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Usuń użytkownika</h1>
        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
    </div>
    <form method="post" action="/user/delete">
        <div class="card shadow mb-4">
            <div class="card-body">
                Czy potwierdzasz usunięcie użytkownia?<br>
                <br>
                <input type="submit" value="Potwierdź">
            </div>
        </div>
    </form>
</div>
<%@ include file="../footer.jsp" %>