<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<%@ page import="model.Produto"%>
<%@ page import="dao.ProdutoDao"%>
<%
Produto produto = (Produto)request.getAttribute("produto");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produto</title>
</head>
<body>
	<form method="POST" action='ProdutoController' name="frmProduto">
		Id: <input type="text" readonly="readonly" name="id" value="<%=produto.getId()%>" /> <br/>
		Nome: <input type="text" name="nome" value="<%=produto.getNome()%>" /> <br/>
		Descricao: <input type="text" name="descricao" value="<%=produto.getDescricao()%>" /> <br/>
		Mercado_id: <input type="text" readonly="readonly" name="mercado_id" value="<%=produto.getMercado_id()%>" /> <br/>
		Tecnologia_id: <input type="text" readonly="readonly" name="tecnologia_id" value="<%=produto.getTecnologia_id()%>" /> <br/>
		<input type="submit" value="Submit" />
	</form>
	
	<br>
	<br>
	
	<h3>Legenda Mercado_id</h3>
	1 - Backend <br>
	2 - Frontend <br>
	3 - Cloud <br>
	
	<br>
	
	<h3>Legenda Tecnologia_id</h3>
	1 - Spring Boot <br>
	2 - Java <br>
	3 - Python <br>
	4 - Javascript <br>
	5 - React <br>
	6 - Angular <br>
	7 - AWS <br>
	89 - Azure <br>
</body>
</html>