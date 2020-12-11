package com.youcode.polymEX1;

public class Main {

	public static void main(String[] args) {
				Personne[] personnes = new Personne[8];
				personnes[0] = new Employe("khadija", "zahir", "fes", "bab", 1993, 23918);
				personnes[1] = new Employe("khadija", "zahir", "fes", "bab", 1993, 23918);
				personnes[2] = new Employe("khadija", "zahir", "fes", "bab", 1993, 23918);
				personnes[3] = new Employe("khadija", "zahir", "fes", "bab", 1993, 23918);
				personnes[4] = new Employe("khadija", "zahir", "fes", "bab", 1993, 23918);
                personnes[5] = new Chef("khadija", "zahir", "fes", "bab", 1993, 3245, "know");
                personnes[6] = new Chef("khadija", "zahir", "fes", "bab", 1993, 3245, "know");
				personnes[7] = new Directeur("khadija", "zahir", "fes", "bab", 1993,62524, "wweb", "EYETV");
				for (int i = 0; i < personnes.length; i++){
					personnes[i].afficher();
				}
			}
}
