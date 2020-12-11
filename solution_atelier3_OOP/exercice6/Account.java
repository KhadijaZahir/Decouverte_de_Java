package com.youcode.exercice6;

public class Account {
	private String nom;
	private String adresse;
	private double solde;
	
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void retirer(double m){
    	if(solde>m){
    		double r = solde - m;
    		System.out.println(nom + " habit à "+ adresse +" leur solde est de : " + r + " DH");
    	}else{
    		System.out.println("il faut retirer moins de votre solde actuel");
    	}
}
}
