<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action='ProdutoController' name="frmInserirProduto">
		<!--  Id: <input type="text" name="id" /> <br /> -->
		Nome: <input type="text" name="nome" /> <br /> 
		Descricao: <input type="text" name="descricao" /> <br /> 
		Mercado_id: <input type="text" name="mercado_id" /> <br /> 
		Tecnologia_id: <input type="text" name="tecnologia_id" /><br /> 
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