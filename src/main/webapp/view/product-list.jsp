<!DOCTYPE html>
<html lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="../css/navbar.css">
  <link rel="stylesheet" href="../css/product-list.css">
</head>
<body>
<jsp:include page="action-bar.jsp" />

  <ul class="product-list-head">
    <li>Nome</li>
    <li></li>
    <li>Preço</li>
    <li>Tipo</li>
  </ul>

  <c:forEach var="productList" items="${productList}">
    <ul class="product-list">
      <li>${productList.name}</li>
      <li></li>
      <li>${productList.value} R$</li>
      <c:if test="${productList.productType == 1}">
        <li>Pequena</li>
      </c:if>
      <c:if test="${productList.productType == 2}">
        <li>Media</li>
      </c:if>
      <c:if test="${productList.productType == 3}">
        <li>Grande</li>
      </c:if>
    </ul>
  </c:forEach>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>