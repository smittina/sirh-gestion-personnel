package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {
	
	// Récupération du Service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/* TP 1 & 2
		 * resp.getWriter().write("Je suis le Controller : ListerCollaborateursController");
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
				);*/
		
		
		// Envoyer une information de la servlet vers la JSP
		req.setAttribute("listeNoms", collabService.listerCollaborateurs());
		// Rattachement  de la page jsp correspondante
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
		
		
		
		
		
	}
	
	
	

}
