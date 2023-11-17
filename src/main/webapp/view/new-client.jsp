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
  <title>Cadastro Cliente</title>
</head>
<body>

<jsp:include page="action-bar.jsp" />

<div class="containerr">
  <div class="formulario">
    <h2 class="titulo-form">CADASTRO DE CLIENTE</h2>

<form action="/client-save" id="client-save" method="post">
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" name="name" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Nome</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="text" class="form-control" name="surname" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Sobrenome</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="tel" class="form-control" name="phone" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Telefone</label>
    </div>
    <div class="form-floating mb-3 row">
      <input type="number" class="form-control" name="age" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Idade</label>
    </div>
    <div class="form-floating mb-3 row">
       <input type="text" class="form-control" name="cpf" id="floatingInput" placeholder="name@example.com">
       <label for="floatingInput">CPF</label>
    </div>
    <div class="form-floating mb-3 row">
       <input type="text" class="form-control" name="zipcode" id="floatingInput" placeholder="name@example.com">
       <label for="floatingInput">CEP</label>
    </div>
    <div class="form-floating mb-3 row">
       <input type="text" class="form-control" name="address" id="floatingInput" placeholder="name@example.com">
       <label for="floatingInput">Endereço</label>
    </div>
    <div class="form-floating mb-3 row">
       <input type="text" class="form-control" name="addressNumber" id="floatingInput" placeholder="name@example.com">
       <label for="floatingInput">Numero</label>
    </div>
    <div class="form-floating mb-3 row">
      <select class="form-select" name="gender" id="floatingInput">
           <option selected value="M">Masculino</option>
           <option selected value="F">Feminino</option>
      </select>
      <label for="floatingInput">Genero</label>
    </div>
 </form>
</div>


  <button type="submit" form="client-save" class="botao-form" data-bs-toggle="modal" data-bs-target="#exampleModal">
    Cadastrar
  </button>

  <!-- Modal -->
  <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="exampleModalLabel"></h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          Novo cliente cadastrado com sucesso!
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">OK</button>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>