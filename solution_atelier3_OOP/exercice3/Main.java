package com.youcode.exercice3;

public class Main {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		
		//initialiser les attribues
		account1.nom = "sara";
		account1.adresse = "hfg";
		account1.solde =1234.5;
        account1.afficheinfo();
		//System.out.println(account1.toString());

	}
}
