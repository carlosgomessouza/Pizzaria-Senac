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



<div class="containerr form-order" id="order">

    <div class="nav">
        <p class="elemento-sel">Novo Pedido</p>
        <p class="elemento">Endereço</p>
        <p class="elemento">Forma de Pagamento</p>
    </div>


    <div class="formulario">
        <h2 class="titulo-form">NOVO PEDIDO</h2>
        <form action="/create-car" method="post">

        <div class="form-floating mb-3 row">
            <select class="form-control" id="floatingInput" name="productList">
                <c:forEach var="productList" items="${productList}">
                    <option value="${productList.productID}"}>${productList.name}</option>
                </c:forEach>
            </select>
            <label for="floatingInput">Produto</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">Preço</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="number" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">Quantidade</label>
        </div>
        <div class="form-floating mb-3 row">
            <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">Desconto</label>
        </div>


        </form>


    </div>

    <button class="botao-form" type="submit" onclick="showAddress(); return false">
        Próximo
    </button>

</div>

<div class="containerr form-order address" id="address">

  <div class="nav">
    <p class="elemento">Novo Pedido</p>
    <p class="elemento-sel">Endereço</p>
    <p class="elemento">Forma de Pagamento</p>
  </div>

  <div class="formulario">
    <h2 class="titulo-form">ENDERECO</h2>

    <form action="/create-car" method="post">
    <div class="form-floating mb-3 row">
      <input type="number" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">CEP</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Rua</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="number" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Bairro</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Número</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Complemento</label>
    </div>

  </div>
  <button class="botao-form" type="submit" onclick="proximaTela(); return false">
    Próximo
  </button>
  </form>
  <a class="botao-voltar" href="novoPedido.html">Voltar</a>

</div>


<script>
    function proximaTela(){
  location.href = "endereco.html"
    }
</script>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>