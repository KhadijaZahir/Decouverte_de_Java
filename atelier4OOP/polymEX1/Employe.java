package com.youcode.polymEX1;

public class Employe extends Personne {
	// champ salaire
	private int salaire;

	public Employe(String nom, String prenom, String adresse, String ville,
			int dateDeNaissance, int salaire) {
		super(nom, prenom, adresse, ville, dateDeNaissance);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	// redefine method
	public void afficher() {
		System.out.println(getNom() + " " + getPrenom() + " " + getAdresse()
				+ " " + getVille() + " " + getDateDeNaissance() + " "
				+ getSalaire());
	}
}
