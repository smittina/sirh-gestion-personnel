package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//String matriculeParam = req.getParameter("matricule");
		
		if(req.getParameterMap().containsKey("matricule")) {
			String matriculeParam = req.getParameter("matricule");
			resp.setStatus(200);
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"+"<p>Matricule"+matriculeParam+"</p>");
			
		}
		else {
			resp.setStatus(400);
			resp.setContentType("text/html");
			
			// Code HTML écrit dans le corps de la réponse
			resp.getWriter().write(
					"<p>Un matricule est attendu</p>"		
					);	
			
			
		}
	}
	
	private List<String> listerParamManquants(HttpServletRequest req){
		List<String> paramManquants = new ArrayList<String>();
		Map<String, String[]> lesParam = req.getParameterMap();
		if(!lesParam.containsKey("matricule")) {
			paramManquants.add("matricule");
		}
		if(!lesParam.containsKey("titre")) {
			paramManquants.add("titre");
		}
		if(!lesParam.containsKey("prenom")) {
			paramManquants.add("prenom");
		}
		if(!lesParam.containsKey("nom")) {
			paramManquants.add("nom");
		}
		return paramManquants;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> paramManquants = listerParamManquants(req);
		if(req.getParameterMap().containsKey("matricule") && req.getParameterMap().containsKey("titre") && req.getParameterMap().containsKey("nom") && req.getParameterMap().containsKey("prenom")) {
			String matriculeParam = req.getParameter("matricule");
			String titreParam = req.getParameter("titre");
			String nomParam = req.getParameter("nom");
			String prenomParam = req.getParameter("prenom");
			resp.setStatus(200);
			resp.setContentType("text/html");
			resp.getWriter().write("<p>matricule : "+matriculeParam+"</p>"
					+ "<p> titre : "+titreParam+"</p>"
					+ "<p> nom : "+ nomParam+"</p>"
					+ "<p> prenom : "+ prenomParam+"</p>");
		}
		else {
			resp.setStatus(400);
			resp.setContentType("text/html");
			String params = "";
			for(String p : paramManquants) {
				params +=" "+p;
			}
			resp.getWriter().write("<p>Les paramètres suivants sont incorrects : </p>"+"<p>"+params+"</p>");
		}
		
	}
	

}
