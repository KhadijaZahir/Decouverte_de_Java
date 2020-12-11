package com.youcode.exercice3;

public class Account {
	String nom;
	String adresse;
	double solde;

   
	public void afficheinfo() {
		System.out.println(nom + " habite à " + adresse + " - infos solde "
				+ solde + "DH");
	}
    /*
	public String toString() {
		return "Account [nom=" + nom + ", adresse=" + adresse + ", solde="
				+ solde + "]";
	}
	*/
}
