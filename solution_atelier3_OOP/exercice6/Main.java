package com.youcode.exercice6;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		account.setNom("El Alami Hassan");
		account.setAdresse("Safi");
		account.setSolde(1765.8);
		
		account.retirer(2000);
	   }
	}

