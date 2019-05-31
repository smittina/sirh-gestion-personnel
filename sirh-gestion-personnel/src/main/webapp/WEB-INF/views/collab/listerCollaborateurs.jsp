<%@page import="java.util.List" %>
<%@page import="dev.sgp.entite.Collaborateur" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Nos Collaborateurs</h1>
		<ul>
		<%
			List<Collaborateur> listeNoms = (List<Collaborateur>) request.getAttribute("listeNoms");
			for(Collaborateur c : listeNoms){
		%>
			<li><%=c.getNom() %> - <%=c.getPrenom() %> - <%=c.getEmailPro() %></li>
		<%
			}
		%>
		</ul>
		<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap-4.3.1-dist/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
	</body>
</html>