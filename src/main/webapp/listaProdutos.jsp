<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<%@ page import="model.Produto"%>
<%@ page import="dao.ProdutoDao"%>
<%
ProdutoDao produtoDao = new ProdutoDao();
ArrayList<Produto> lista = (ArrayList<Produto>) request.getAttribute("produtos");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de todos os Produtos</title>
</head>
<body>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Descricao</th>
				<th>Mercado_id</th>
				<th>Tecnologia_id</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Produto p : lista) {
			%>
			<tr>
				<td><%=p.getId()%></td>
				<td><%=p.getNome()%></td>
				<td><%=p.getDescricao()%></td>
				<td><%=p.getMercado_id()%></td>
				<td><%=p.getTecnologia_id()%></td>
				<td><a href="ProdutoController?action=edit&id=<%=p.getId()%>">Atualizar</td>
				<td><a href="ProdutoController?action=delete&id=<%=p.getId()%>">Deletar</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<p>
		<a href="ProdutoController?action=insert">Adicionar produto</a>
		<a href="ProdutoFiltroController?action=filter">Filtrar produto</a>
	</p>
	
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
	8 - Azure <br>
	
</body>
</html>
