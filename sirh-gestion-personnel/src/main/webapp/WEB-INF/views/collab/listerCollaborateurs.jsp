<%@page import="java.util.List" %>
<%@page import="dev.sgp.entite.Collaborateur" %>
<%@page import="dev.sgp.entite.Departement" %>
<%@page isELIgnored='false' %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Les Collaborateurs</h1>
		<br/>
		<!-- Barre de recherche des collaborateurs -->
		<div class="container">
			<form method="POST">
		  <div class="row">
		    <div class="col-md">
		      Rechercher un nom ou prenom commençant par:
		    </div>
		    <div class="col-md">
		      <input type="text" id="rechercheCollab" name="recherche">
		      <button type="submit" class="btn-secondary" id="btn_rechercheCollab">Rechercher</button>
		    </div>
		    <div class="col-sm">
		      <input type="checkbox" id="collabDesactive">
		      <label>Voir les collaborateurs désactivés</label>
		    </div>
		  </div>
			
			</form>
		<!-- Filtre par département -->
			<div class="row">
			    <div class="col-md-4 text-right">
			      Filtrer par département:
			    </div>
			    <div class="col-md-3">
			      <select>
			      	<option selected>Tous</option>
			      	<c:forEach var="dep" items="${listeDepartements}"  >
  						 <option value="<c:out value="${dep.nom}"/>"><c:out value="${dep.nom}"/></option>
			      	</c:forEach>
			      </select>
			    </div>
		  </div>
		
		<br/>
			<!-- Liste des différents utilisateurs -->
			<div class="row">
					<c:forEach var="col" items="${listeNoms}"  >
			      	
					<div class="col-md-6 col-lg-4 mb-3">
						<div class="card d-flex align-items-center justify-content-center" style="width: 20rem;">		
					 		<h5 class="card-title text-center"><c:out value="${col.nom}"/> <c:out value="${col.prenom}"/></h5>
					 		<div class="row">
						 		<div class="col-md-2">
						 			<img class="card-img-left" src="<%=request.getContextPath() %>/img/profil.png" width=50px height=50px alt="Card image cap">
						 		</div>
			 			 		<div class="col-md-10">
				 			 		<div class="card-body">
							    		<p class="card-text">Fonction : <c:out value="${col.intitulePoste}"/> </p>
							    		<p class="card-text">Departement : <c:out value="${col.departement.nom}"/></p>
							    		<p class="card-text">Email : <c:out value="${col.emailPro}"/></p>    						    
							    		<button href="#" class="btn btn-secondary">Editer</a>
				  					</div>
			 			 		</div>
			 			 	</div>
			 			 </div>
					 </div>	 	
					</c:forEach>
				
			
			</div>
			
			
  		</div>
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
	</body>
</html>