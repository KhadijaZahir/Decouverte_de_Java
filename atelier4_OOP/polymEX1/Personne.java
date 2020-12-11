package com.youcode.polymEX1;

public class Personne {
	private String nom, prenom, adresse, ville;
	private int dateDeNaissance;

	public Personne(String nom, String prenom, String adresse, String ville, int dateDeNaissance ) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateDeNaissance = dateDeNaissance;
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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(int dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public void afficher(){
		System.out.println(nom + " "+ prenom +" "+ adresse +" "+ ville);
	}
 }

