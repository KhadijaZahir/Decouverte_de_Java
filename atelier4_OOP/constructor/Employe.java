package com.youcode.constructor;

public class Employe {
	private String nom;
	private String prenom;
	private String adresse;
	private int anneeNaissance;
	private int anneeEncours;
	
   
	public Employe(String nom, String prenom, String adresse,
			int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.anneeNaissance = anneeNaissance;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public int getAnneeEncours() {
		return anneeEncours;
	}

	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}

	public void calculerAge(){
		int age;
		age = anneeEncours - anneeNaissance;
		System.out.println(age + " ans");
	}
    public void afficherInfosClient(){
		System.out.println(prenom + " "+ nom + ", né le " + anneeNaissance +" habitant à " + adresse);
	}
}
