<!DOCTYPE html>

<html lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/estilo.css">
    <link rel="stylesheet" href="css/card.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">
    <title>Página Inicial</title>
</head>
<body>

<jsp:include page="view/action-bar.jsp" />

<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="img/carrossel1.png" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
            <img src="img/carrossel2.png" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
            <img src="img/carrossel3.png" class="d-block w-100" alt="...">
        </div>
    </div>
</div>

<div class="card-grid">
<div class="cards">
  <c:forEach var="productList" items="${productList}">

    <div class="card" style="width: 18rem;">
        <img src="img/pizza-calabresa.PNG" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">${productList.name}</h5>
            <p class="card-text">Calabresa, cebola e azeitona.</p>
            <a href="#" class="btn btn-primary">${productList.value} R$</a>
        </div>
    </div>
  </c:forEach>
</div>
</div>

<footer class="rodape">
    <div class="contato">
        <p class="rodape-titulo">Contatos</p>
        <p>Tel: (11)953701738</p>
        <p>E-mail: casadapizza@gmail.com</p>
    </div>
    <div class="redes">
        <p class="rodape-titulo">Redes Sociais</p>
        <div class="img-redes">
            <a href="" target="_blank"><img src="img/logo-face.png" class="img-rodape-face" alt=""></a>
            <a href="" target="_blank"><img src="img/logo-whats.png" class="img-rodape-whats" alt=""></a>
            <a href="" target="_blank"><img src="img/logo-insta.png" class="img-rodape" alt=""></a>
            <a href="" target="_blank"><img src="img/logo-ifood.png" class="img-rodape-ifood" alt=""></a>
        </div>
    </div>
    <div class="local">
        <p class="rodape-titulo">Localização</p>
        <p>Av. Guarapiranga 4007, SP, 04937-001</p>
        <p>Rua Boa Vista 358, Embu-Guaçu, SP, 06900-000</p>
    </div>
    <a href="#topo"><img src="img/seta.png" class="img-rodape-seta" alt=""></a>
</footer>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>
