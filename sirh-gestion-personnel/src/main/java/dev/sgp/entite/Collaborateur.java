package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numSecuriteSocial;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	private String intitulePoste;
	private Departement departement;
	
	private static int cpt_collab = 0;
	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecuriteSocial, String emailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecuriteSocial = numSecuriteSocial;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		
		cpt_collab++;
	}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecuriteSocial, String emailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif, String intitulePoste, Departement departement) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecuriteSocial = numSecuriteSocial;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		this.intitulePoste = intitulePoste;
		this.departement = departement;
		
		cpt_collab++;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumSecuriteSocial() {
		return numSecuriteSocial;
	}

	public void setNumSecuriteSocial(String numSecuriteSocial) {
		this.numSecuriteSocial = numSecuriteSocial;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public static int getCpt_collab() {
		return cpt_collab;
	}

	public static void setCpt_collab(int cpt_collab) {
		Collaborateur.cpt_collab = cpt_collab;
	}

	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	

}
