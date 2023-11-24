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
    <link rel="stylesheet" href="../css/cadastro.css">
    <link rel="stylesheet" href="../css/navbar.css">
    <title>Novo Pedido</title>

    <script type="text/javascript" src="js/NewOrder.js">

    </script>
</head>
<body>

<jsp:include page="action-bar.jsp" />

<div class="containerr form-order-button">
    <div class="nav">
        <button class="elemento-sel" id="btn-order" onclick="showOrder();">Novo Pedido</button>
        <button class="elemento" id="btn-address" onclick="showAddress();">Endereço</button>
        <button class="elemento" id="btn-payment" onclick="showPayment();">Forma de Pagamento</button>
    </div>
</div>

<form action="/order-save" id="order-save" method="post">
<div class="containerr form-order" id="order">

<div class="formulario">
        <h2 class="titulo-form">NOVO PEDIDO</h2>

        <div class="form-floating mb-3 row">
            <select class="form-control" name="productID" id="floatingSelectBox" onchange="changeProduct();">
                <option value="" selected>Selecione</option>
                <c:forEach var="productList" items="${productList}">
                    <option value="${productList.productID}"}>${productList.name}</option>
                </c:forEach>
            </select>
            <label for="floatingInput">Produto</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="text" name="value" class="form-control" id="floatingValue" >
            <label for="floatingInput">Preço</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="number" name="amount" class="form-control" id="floatingInput" >
            <label for="floatingInput">Quantidade ${requestScope.product.name}</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="text" class="form-control" id="floatingInput" >
            <label for="floatingInput">Desconto</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="text" name="productType" class="form-control" id="floatingType" >
            <label for="floatingInput">Tipo</label>
        </div>
    </div>
</div>

<div class="containerr form-order address" id="address">
  <div class="formulario">
    <h2 class="titulo-form">ENDERECO</h2>
    <div class="form-floating mb-3 row">
            <select class="form-control" name="clientID" id="floatingSelectBoxClient" onchange="changeClient();" >
                <option value="" selected>Selecione</option>
                <c:forEach var="clientList" items="${clientList}">
                    <option value="${clientList.clientID}"}>${clientList.name}</option>
                </c:forEach>
            </select>
    </div>
    <div class="form-floating mb-3 row">
      <input type="number" class="form-control" id="floatingZipcode" placeholder="name@example.com">
      <label for="floatingZipcode">CEP</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" id="floatingAddress" placeholder="name@example.com">
      <label for="floatingInput">Endereço</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" id="floatingAddressNumber" placeholder="name@example.com">
      <label for="floatingAddressNumber">Número</label>
    </div>

  </div>
</div>

<div class="containerr form-order payment" id="payment" >
  <div class="formulario">
    <h2 class="titulo-form">FORMA DE PAGAMENTO</h2>

    <select class="form-select" aria-label="Default select example">
      <option selected value="credito">Cartão de Crédito</option>
      <option value="debito">Cartão de Débito</option>
      <option value="pix">PIX</option>
      <option value="dinheiro">Dinheiro</option>
    </select>

</div>
</form>

  <button type="submit" form="order-save" class="botao-form" data-bs-toggle="modal" data-bs-target="#exampleModal">
    Salvar
  </button>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>