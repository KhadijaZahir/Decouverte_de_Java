package com.youcode.heritageEX2;

public class Main {

	public static void main(String[] args) {
		CompteBancaire obj1 =new CompteEpargne(800, 346655287);
		CompteBancaire obj2 =new CompteCourant(800, 346655287);
		obj2.afficher();
        obj2.Ajouter(500);
		obj2.retirer(300);
		
		obj1.afficher();	
		obj1.Ajouter(500);
		obj1.retirer(300);
	}

}
