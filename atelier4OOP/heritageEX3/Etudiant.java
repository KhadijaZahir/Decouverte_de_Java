package com.youcode.Exercice3;

public class Etudiant extends Personne {
	public Etudiant(String nom, String prenom, String adresse, String ville,
			int dateNaissance) {
		super(nom, prenom, adresse, ville, dateNaissance);
	}
	public Etudiant(){
		   
	   }
	private String diplome;
	
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}


	public String toString() {
		return "Etudiant [diplome=" + diplome + ", toString()="
				+ super.toString() + "]";
	}
	void ecrirePersonne() {
		System.out.println("Personne :" + getNom() + ", prenom :" + getPrenom()
				+ ", adresse:" + getAdresse() + ", ville:" + getVille() + ", diplome:"
				+ diplome + ", dateNaissance:" + getDateNaissance());
	}

}
