package com.youcode.Exercice3;

class Secretaire extends Personne {
	public Secretaire(String nom, String prenom, String adresse, String ville,
			int dateNaissance, int numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau = numeroBureau;
	}

	public Secretaire() {

	}

	int numeroBureau;

	public int getNumeroBureau() {
		return numeroBureau;
	}

	public void setNumeroBureau(int numeroBureau) {
		this.numeroBureau = numeroBureau;
	}

	public String toString() {
		return "Secretaire [numeroBureau=" + numeroBureau + ", toString()="
				+ super.toString() + "]";
	}

	void ecrirePersonne() {
		System.out.println("Personne :" + getNom() + ", prenom :" + getPrenom()
				+ ", adresse:" + getAdresse() + ", ville:" + getVille()
				+ ", NumeroBureau:" + getNumeroBureau() + ", dateNaissance:"
				+ getDateNaissance());
	}
}
