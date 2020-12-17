package com.youcode.polymEX2;

public class Video extends Ouvrage {

	private String editeur;
	private double duree;

	public Video(String titre, String dateDeCreation, boolean indicExistance,
			String editeur, double duree) {
		super(titre, dateDeCreation, indicExistance);
		this.editeur = editeur;
		this.duree = duree;
	}

	public String getEditeur() {
		return editeur;
	}

	public double getDuree() {
		return duree;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Video [editeur=" + editeur + ", duree=" + duree
				+ ", toString()=" + super.toString() + "]";
	}

	public void afficher() {
		System.out.println("editeur est : " + editeur + "duree est : " + duree
				+ " titre est : " + getTitre() + " date de creation est : "
				+ getDateDeCreation() + "existance dans la biblio : "
				+ isIndicExistance());
	}
}