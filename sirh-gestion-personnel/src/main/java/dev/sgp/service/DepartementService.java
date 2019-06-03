package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {
	List<Departement> listeDepartements;
	
	public DepartementService() {
		listeDepartements = new ArrayList<Departement>();
		Departement d1 = new Departement(1,"Comptabilité");
		Departement d2 = new Departement(2,"Ressources Humaines");
		Departement d3 = new Departement(3,"Informatique");
		Departement d4 = new Departement(4,"Administratif");
		listeDepartements.add(d1);
		listeDepartements.add(d2);
		listeDepartements.add(d3);
		listeDepartements.add(d4);
	}
	
	public List<Departement> listerDepartements(){
		return listeDepartements;
	}
	
	public void sauvegarderDepartement(Departement depart) {
		listeDepartements.add(depart);
	}

}
