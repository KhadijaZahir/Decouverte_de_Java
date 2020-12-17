package com.youcode.constructor;

public class Main {

	public static void main(String[] args) {
		Employe obj = new Employe("El alami", "Mohammad", "Casablanca", 1990, 2020);
		Employe obj1 = new Employe("El wahabi", "Khalid", "Safi", 1990, 2020);
		Employe obj2 = new Employe("Sbai", "Fouad", "Salé", 2006, 2020);

		obj.afficherInfosClient();
		obj1.afficherInfosClient();
		obj2.afficherInfosClient();
		obj.setAnneeEncours(2020);
		obj2.setAnneeEncours(2020);
		obj1.setAnneeEncours(2020);
		obj.setAnneeNaissance(1990);
		obj2.setAnneeNaissance(1990);
		obj1.setAnneeNaissance(2006);
		obj.calculerAge();
		obj2.calculerAge();
		obj1.calculerAge();
	}

}
