package com.youcode.Exercice3;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private int dateNaissance;
	private static int nbCategory;

	public Personne(String nom, String prenom, String adresse, String ville,
			int dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}

	public Personne() {

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

	public int getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public static int getNbCategory() {
		return nbCategory;
	}

	public static void setNbCategory(int nbCategory) {
		Personne.nbCategory = nbCategory;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", ville=" + ville + ", dateNaissance="
				+ dateNaissance + "]";
	}

	public void modifiePersonne(String adresse, String ville) {
		this.adresse = adresse;
		this.ville = ville;
		ville = "casa";
		adresse = "narjiss";
	}

	abstract void ecrirePersonne();

}
