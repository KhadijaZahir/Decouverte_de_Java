package com.youcode.polymEX1;

public class Chef extends Employe{
	
	
	public Chef(String nom, String prenom, String adresse, String ville,
			int dateDeNaissance, int salaire, String service) {
		super(nom, prenom, adresse, ville, dateDeNaissance, salaire);
		this.service = service;
	}
	//champ service
	private String service;
	  
	
	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


		//redefine method
		public void afficher(){
			System.out.println(getNom() + " "+ getPrenom() +" "+ getAdresse() +" "+ getVille() + " " + getDateDeNaissance() + " " +getSalaire()+ " " + getService());
		}
}