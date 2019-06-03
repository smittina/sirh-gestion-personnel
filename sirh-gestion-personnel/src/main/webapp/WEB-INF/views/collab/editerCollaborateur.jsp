<%@page import="java.util.List" %>
<%@page import="dev.sgp.entite.Collaborateur" %>
<%@page import="dev.sgp.entite.Departement" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<div class="container">
			<div class="row">				
				<div class="col-md-4">
					<%Collaborateur c = (Collaborateur) request.getAttribute("leCollaborateur"); %>
					<img src="<%=request.getContextPath()%>/img/<%=c.getPhoto() %>" width=100px; height=100px>
				</div>
				<div class="col-md-8">
					<h1><%=c.getPrenom().toUpperCase()%> <%=c.getNom()%> - <%=c.getMatricule() %></h1>
				</div>
			</div>
		</div>
	
	
	
	<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
	
	</body>
</html>