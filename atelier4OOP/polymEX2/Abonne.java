package com.youcode.polymEX2;

public class Abonne extends Video {
	private int numeroIdentite;
	private String nom;
	private int numeroAbonnement;

	public Abonne(String titre, String dateDeCreation, boolean indicExistance,
			String editeur, double duree, int numeroIdentite, String nom,
			int numeroAbonnement) {
		super(titre, dateDeCreation, indicExistance, editeur, duree);
		this.numeroIdentite = numeroIdentite;
		this.nom = nom;
		this.numeroAbonnement = numeroAbonnement;
	}

	public int getNumeroIdentite() {
		return numeroIdentite;
	}

	public String getNom() {
		return nom;
	}

	public int getNumeroAbonnement() {
		return numeroAbonnement;
	}

	public void setNumeroIdentite(int numeroIdentite) {
		this.numeroIdentite = numeroIdentite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumeroAbonnement(int numeroAbonnement) {
		this.numeroAbonnement = numeroAbonnement;
	}

	////////////et ouvrage pris
}
