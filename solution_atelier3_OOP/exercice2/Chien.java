package com.youcode.exercice2;

public class Chien {
	String nom;

	public void manger() {
		if (nom == "Rex") {
			System.out.println("- Je mange de la viande");
		} else if (nom == "Max") {
			System.out.println("- Je mange de poisson");
		}
	}

	public void aboyer() {
		if (nom == "Rex") {
			System.out.print("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ");
		} else if (nom == "Max") {
			System.out.print("Je ne suis pas du tout en colère. Iwiw !! awaw !! ");
		}
	}
}
