package com.youcode.polymEX2;

import java.io.Serializable;

public class Ouvrage implements Serializable {
	private String titre, dateDeCreation;
	private boolean indicExistance;

	public Ouvrage(String titre, String dateDeCreation, boolean indicExistance) {
		this.titre = titre;
		this.dateDeCreation = dateDeCreation;
		this.indicExistance = indicExistance;
	}

	public Ouvrage() {
		titre = null;
		dateDeCreation = null;

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public boolean isIndicExistance() {
		return indicExistance;
	}

	public void setIndicExistance(boolean indicExistance) {
		this.indicExistance = indicExistance;
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", dateDeCreation=" + dateDeCreation
				+ ", indicExistance=" + indicExistance + "]";
	}

	public void afficher() {
		if (isIndicExistance() == true) {
			System.out.println("disponible dans la bibliothèque");
		} else {
			System.out.println("non disponible dans la bibliothèque");
		}
		System.out.println(titre + dateDeCreation + indicExistance);
	}

}
