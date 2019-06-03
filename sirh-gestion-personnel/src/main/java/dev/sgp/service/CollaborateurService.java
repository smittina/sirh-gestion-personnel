package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<Collaborateur>();
	
	public List<Collaborateur> listerCollaborateurs(){
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
	
	public List<Collaborateur> findByLettre(String lettre){
		List<Collaborateur> liste = new ArrayList<Collaborateur>();
		for(Collaborateur c : listeCollaborateurs) {
			if(c.getNom().startsWith(lettre) || c.getPrenom().startsWith(lettre)) {
				liste.add(c);
			}
		}
		return liste;
	}
	
	public Collaborateur findByMatricule(String matricule) {
		Collaborateur collab = null;
		for(Collaborateur c : listeCollaborateurs) {
			if(matricule.equals(c.getMatricule())) {
				collab = c;
			}
		}
		return collab;
	}

}
