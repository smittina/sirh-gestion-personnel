<%@page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
	</head>
	<body>
		<h1>Nos Collaborateurs</h1>
		<ul>
		<%
			List<String> listeNoms = (List<String>)request.getAttribute("listeNoms");
			for(String nom : listeNoms){
		%>
			<li><%=nom %></li>
		<%
			}
		%>
		</ul>
	</body>
</html>