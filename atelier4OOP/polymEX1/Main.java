package com.youcode.polymEX1;

public class Main {

	public static void main(String[] args) {
		Personne[] personnes = new Personne[8];
		personnes[0] = new Employe("Employe1", "zahir", "fes", "bab", 2000, 218);
		personnes[1] = new Employe("Employe2", "zahir", "fes", "bab", 1999,
				3245);
		personnes[2] = new Employe("Employe3", "zahir", "fes", "bab", 1933,
				23918);
		personnes[3] = new Employe("Employe4", "zahir", "fes", "bab", 1983,
				23918);
		personnes[4] = new Employe("Employe5", "zahir", "safi", "bab", 1993,
				23918);
		personnes[5] = new Chef("Chef1", "zahir", "sale", "bab", 1993, 3245,
				"IOT");
		personnes[6] = new Chef("Chef2", "zahir", "casa", "bab", 1993, 23918,
				"AI");
		personnes[7] = new Directeur("Directeur", "zahir", "fes", "bab", 1993,
				624, "develempment", "WEBAGENCY");
		for (int i = 0; i < personnes.length; i++) {
			personnes[i].afficher();
		}
	}
}
