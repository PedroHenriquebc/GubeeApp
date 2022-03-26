<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Filtrar busca por mercado e/ou tecnologia</h2>

	<h3><strong>Mercado</strong></h3>

	<form method="POST" action='ProdutoFiltroController'>
		<input type="checkbox" id="mercado1" name="mercado1" value="1">
		<label for="mercado1"> Backend</label><br> 
		
		<input type="checkbox" id="mercado2" name="mercado2" value="2"> 
		<label for="mercado2"> Frontend</label><br>
		
		<input type="checkbox" id="mercado3" name="mercado3" value="3"> 
		<label for="mercado3"> Cloud</label><br>
		

	<h3><strong>Tecnologia</strong></h3>

		<input type="checkbox" id="tecnologia1" name="tech1" value="2">
		<label for="tecnologia1"> Java</label><br> 
		<input type="checkbox" id="tecnologia2" name="tech2" value="3"> 
		<label for="tecnologia2"> Python</label><br>
		<input type="checkbox" id="tecnologia3" name="tech3" value="1"> 
		<label for="tecnologia3"> Spring Boot</label><br> 
		<input type="checkbox" id="tecnologia4" name="tech4" value="4"> 
		<label for="tecnologia4"> Javascript</label><br> 
		<input type="checkbox" id="tecnologia5" name="tech5" value="5"> 
		<label for="tecnologia5"> React</label><br> 
		<input type="checkbox" id="tecnologia6" name="tech6" value="6"> 
		<label for="tecnologia6"> Angular</label><br> 
		<input type="checkbox" id="tecnologia7" name="tech7" value="7"> 
		<label for="tecnologia7"> AWS</label><br>  
		<input type="checkbox" id="tecnologia8" name="tech8" value="8"> 
		<label for="tecnologia8"> Azure</label><br>  
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>