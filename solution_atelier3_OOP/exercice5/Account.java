package com.youcode.exercice5;

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
	
	public String toString() {
		return "Account [nom=" + nom + ", adresse=" + adresse + ", solde="
				+ solde + "]";
	}
	
}
