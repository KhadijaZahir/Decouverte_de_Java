package com.youcode.ex1;

public class Test {

	public static void main(String[] args) {
		
		//create objet
		//instancier un objet
		Chien rex = new Chien();
		Chien max = new Chien();
		
		//initialisation d'attribue pour chaque objet
		rex.nom = "Rex";
		max.nom = "Max";
		System.out.println(rex.aboyer() + rex.manger());
		System.out.println(max.aboyer() + max.manger());
	}


}
