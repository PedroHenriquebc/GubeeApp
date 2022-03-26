<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de todos os Produtos</title>
</head>
<body>
	<jsp:forward page="/ProdutoController?action=listaProdutos">
		<jsp:param name="" value="" />
	</jsp:forward>
</body>
</html>