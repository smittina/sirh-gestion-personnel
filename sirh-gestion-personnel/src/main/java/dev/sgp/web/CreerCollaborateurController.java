package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet {
	
	// Récupération du Service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	private DepartementService departService = Constantes.DEPART_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Je passe par là");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaiss = req.getParameter("dateDeNaissance");
		LocalDate dateDeNaissance = LocalDate.parse(dateNaiss);
		String adresse = req.getParameter("adresse");
		String numSecuriteSociale=req.getParameter("numSecuriteSociale");
		// Création d'un numéro de matricule
		int numMatricule=Collaborateur.getCpt_collab()+1;
		String matricule = "M"+Integer.toString(numMatricule);  
		// Création de la Date Heure de Création
	    LocalDateTime localtDateAndTime = LocalDateTime.now();
	    ZoneId zoneId = ZoneId.of("Europe/Paris");
	    ZonedDateTime dateHeureCreation  = ZonedDateTime.of(localtDateAndTime, zoneId);
		// Email pro = prenom.nom@societe.com -- societe.com dans fichier properties
	    Properties prop = new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String emailPro = prenom.toLowerCase()+"."+nom.toLowerCase()+"@"+prop.getProperty("societe");
	    String fonction = "Non Renseigné";
	    Departement dep = new Departement(1,"Comptabilité");
		// Photo fictive par défaut ??
	    String photo = "profil.png";
		// Collaborateur actif par défaut
		boolean actif = true;
		// Numéro de sécu = 15 chiffres
	    if(numSecuriteSociale.length() != 15) {
			// ERREUR DE SAISIE ==> Code 400
	    	resp.sendError(400, "La taille du numéro de sécurité social est incorrecte");
	    	
	    }
	    else {
	    	// Création du collaborateur
			Collaborateur newCollab = new Collaborateur(matricule, nom, prenom, dateDeNaissance, adresse, numSecuriteSociale, emailPro, photo, dateHeureCreation, actif, fonction, dep);
			// Enregistrement dans la Liste des Collaborateurs
			collabService.sauvegarderCollaborateur(newCollab);
			System.out.println("Taille de collabService :"+collabService.listerCollaborateurs().size());
			// Sauvegarde ==> Redirection verss la liste des collaborateurs
			req.setAttribute("listeNoms", collabService.listerCollaborateurs());
			req.setAttribute("listeDepartements", departService.listerDepartements() );

			//this.getServletContext().getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
	    }
		
	    
	}
	
	

}
