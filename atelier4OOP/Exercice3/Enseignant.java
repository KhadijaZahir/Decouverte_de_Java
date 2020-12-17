package com.youcode.Exercice3;

public class Enseignant extends Personne {
	private String specialite;

	public Enseignant(String nom, String prenom, String adresse, String ville,
			int dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
	}

	public Enseignant() {

	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String toString() {
		return "Enseignant [specialite=" + specialite + ", toString()="
				+ super.toString() + "]";
	}

	void ecrirePersonne() {
		System.out.println("Personne :" + getNom() + ", prenom :" + getPrenom()
				+ ", adresse:" + getAdresse() + ", ville:" + getVille()
				+ ", diplome:" + getSpecialite() + ", dateNaissance:"
				+ getDateNaissance());
	}

}
