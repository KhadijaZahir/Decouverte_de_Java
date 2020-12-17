package com.youcode.polymEX2;

public class Livre extends Ouvrage {

	private String auteur;

	public Livre(String titre, String dateDeCreation, boolean indicExistance,
			String auteur) {
		super(titre, dateDeCreation, indicExistance);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", toString()=" + super.toString()
				+ "]";
	}

	public void afficher() {
		System.out.println("auteur est : " + auteur + " titre est : "
				+ getTitre() + " date de creation est : " + getDateDeCreation()
				+ "existance dans la biblio : " + isIndicExistance());
	}
}
