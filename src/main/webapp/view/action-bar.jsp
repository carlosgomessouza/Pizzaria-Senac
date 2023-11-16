<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <img src="../img/logo.png" alt="" class="logo">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="../index.html">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="sobrenos.html">Sobre Nós</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="novoProduto.html">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="novoPedido.html">Pedidos</a>
                </li>
            <c:if test="${sessionScope.loggedUser != null}">
                <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                         Cadastrar
                     </a>
                     <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="cadastroCliente.html">Cliente</a></li>
                        <li><a class="dropdown-item" href="cadastro.html">Funcionário</a></li>
                        <li><a class="dropdown-item" href="novoProduto.html">Produto</a></li>
                        <li><a class="dropdown-item" href="motoboy.html">Motoboy</a></li>
                        </ul>
                </li>
            </c:if>
             <li class="nav-item">
                 <a class="nav-link" href="view/cadastro.html">Novo Usuario</a>
             </li>
                    <c:if test="${sessionScope.loggedUser != null}">
                        <li class="nav-item">
                          <form action="/login" method="post">
                               <button class="nav-link" type="submit">Loja</button>
                          </form>
                        </li>

                    </c:if>
                    <c:if test="${sessionScope.loggedUser == null}">
                    <li class="nav-item">
                          <form action="view/login.jsp" method="post">
                               <button class="nav-link" type="submit">Login</button>
                          </form>
                     </li>
                     </c:if>
            </ul>
        </div>
    </div>
</nav>