package com.youcode.exercice4;

public class Account {
	String nom;
	String adresse;
	double solde;
	
	public Account(String nom, String adresse, double solde) {
		this.nom = nom;
		this.adresse = adresse;
		this.solde = solde;
	}
	public void afficherInfosSolde(){	
		System.out.println(nom +" habite à "+ adresse+"- infos solde "+ solde + " DH");
	}
    public void calculerInterer(){
    	double interet;
    	double tauxInteret = 0.07;
    	interet=solde*tauxInteret;
    	System.out.println(interet);
	}
}
