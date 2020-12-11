package com.youcode.polymEX1;

public class Directeur extends Chef{
	 
	
	public Directeur(String nom, String prenom, String adresse, String ville,
			int dateDeNaissance, int salaire, String service, String societe) {
		super(nom, prenom, adresse, ville, dateDeNaissance, salaire, service);
		this.societe= societe;
	}
	//champ societe
	  private String societe;
	  
		public String getSociete() {
			return societe;
		}
		public void setSociete(String societe) {
			this.societe = societe;
		}
		//redefine method
				public void afficher(){
					System.out.println(getNom() + " "+ getPrenom() +" "+ getAdresse() +" "+ getVille() + " " + getDateDeNaissance() + " " +getSalaire()+" " + getService()+" " + getSociete());
				}
}
