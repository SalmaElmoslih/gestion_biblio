<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<main class="container" >
	<c:import url="menu.jsp" />
	<form method="post" action ="index.do">
	
		<input type="text" class="form-control" name="titre" placeholder="titre">
		<input type="text" class="form-control" name="genre" placeholder="genre">
		<input type="text" class="form-control" name="auteur" placeholder="auteur">
		<input type="text" class="form-control" name="annee" placeholder="annee">
		<select name ="disponible" class =" form-control">
			<option> Oui </option>
			<option> Non </option>
		</select>
		<input type="file" class="form-control" name="image"> <hr>
		<input type="submit" class="btn btn-primary" value="ajouter un livre" >
		<hr>
		
	</form>
	<c:forEach items= "${model.livres}" var="Livre">
			<div class="card" style="width: 18rem;" >
			  <img src="..." class="card-img-top" alt="...">
			  <div class="card-body">
			    <h5 class="card-title">${Livre.titre}</h5>
			  </div>
			  <ul class="list-group list-group-flush">
			    <li class="list-group-item">${Livre.auteur}</li>
			    <li class="list-group-item">${Livre.genre}</li>
			    <li class="list-group-item">${Livre.annee}</li>
			    <li class="list-group-item">${Livre.statut}</li>
			  </ul>
			  <div class="card-body">
			    <button class="btn btn-primary">Emprunter</button>
			  </div>
		</div>
	</c:forEach>
</main>
</body>
</html>