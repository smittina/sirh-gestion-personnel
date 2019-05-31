<%@page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Nouveau Collaborateur</h1>
		<div class="container">
			<form method="POST" >
				<div class="form-group row">				
					<label class="col-sm-3 col-form-label">Nom : </label>
					<input class="form-control col-sm-5" type="text" name="nom" required>
				</div>
				
				<div class="form-group row">				
					<label class="col-sm-3 col-form-label">Prenom : </label>
					<input class="form-control col-sm-5" type="text" name="prenom" required>
				</div>
				
				<div class="form-group row">				
					<label class="col-sm-3 col-form-label">Date de Naissance : </label>
					<input class="form-control col-sm-5" type="date" name="dateDeNaissance" required>
				</div>
				
				<div class="form-group row">				
					<label class="col-sm-3 col-form-label">Adresse : </label>
					<input class="form-control col-sm-5 h-50" type="text" name="adresse" required>
				</div>
				
				<div class="form-group row">			
					<label class="col-sm-3 col-form-label">Numéro de sécurité sociale : </label>
					<input class="form-control col-sm-5" type="text" name="numSecuriteSociale" required>
				</div>
				
				<button type="submit" class="btn btn-primary">Créer</button>
			</form>
		
		</div>
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
	</body>
</html>