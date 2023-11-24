<!DOCTYPE html>

<html lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
</head>
<body>
  <script>
    document.addEventListener('DOMContentLoaded', function () {
      location.href = 'http://localhost:8080/product-list?requestPlace=index'
    });
  </script>
</body>
</html>


