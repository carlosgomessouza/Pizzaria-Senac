<!DOCTYPE html>
<html lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/estilo.css">
    <link rel="stylesheet" href="../css/login.css">
    <link rel="stylesheet" href="../css/navbar.css">
    <title>Login</title>
</head>
<body>

<jsp:include page="action-bar.jsp" />

<div class="containerr">

    <img src="../img/logo-login.PNG" alt="" class="img">

        <form class="formulario" action="/login" method="post" id="loginForm">
            <h2 class="titulo-form">LOGIN</h2>
        <span>${requestScope.message}</span>

        <div class="form-floating mb-3 row">
            <input type="text" name="username" id="login" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">E-mail</label>
        </div>
        <div class="form-floating row">
            <input type="password" id="senha" name="password" class="form-control" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">Senha</label>
        </div>
        <button class="botao-form" form="loginForm" type="submit">Login</button>
         <a href="cadastro.html" class="link">Cadastre-se</a>
        </form>
    </div>

</div>

<script src="cadastro.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>