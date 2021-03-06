package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.getWriter().write("Je suis le Controller : ListerCollaborateursController");
		// Récupère la valeur d'un paramètre dont le nom est avecPhoto
		String avecPhotoParam = req.getParameter("avecPhoto");
		
		// Récupère la valeur d'un paramètre dont le nom est département
		String departementParam = req.getParameter("departement");
		resp.setContentType("text/html");
		
		// Code HTML écrit dans le corps de la réponse
		resp.getWriter().write(
				"<h1>Liste des collaborateurs :</h1"+
				"<ul>"+
				"<li>avecPhoto="+avecPhotoParam+"</li>"+
				"<li>departement="+departementParam+"</li>"+
				"</ul>"				
				);	
	}
	
	
	

}
