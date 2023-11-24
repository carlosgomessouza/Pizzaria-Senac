<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <img src="../img/logo.PNG" alt="" class="logo">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="../index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="view/sobrenos.jsp">Sobre Nós</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/product-list">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/client-list">Clientes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/order-list">Pedidos</a>
                </li>
            <c:if test="${sessionScope.loggedUser != null}">
                <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                         Cadastrar
                     </a>
                     <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="../view/new-client.jsp">Cliente</a></li>
                        <li><a class="dropdown-item" href="../view/new-product.jsp">Produto</a></li>
                     </ul>
                </li>
            </c:if>
                    <c:if test="${sessionScope.loggedUser != null}">
                        <li class="nav-item">
                          <form action="/login" method="post">
                               <button class="nav-link" type="submit">Loja</button>
                          </form>
                        </li>

                    </c:if>
                    </div>
                  <div>
                    <c:if test="${sessionScope.loggedUser == null}">
                     <li class="nav-item">
                       <form action="view/login.jsp" method="post">
                           <button class="nav-link" type="submit">
                                <img src="../img/login.png" class="login" alt="">
                           </button>
                       </form>
                     </li>
                     </c:if>
                  </div>
            </ul>
        </div>
    </div>
</nav>