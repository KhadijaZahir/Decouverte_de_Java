package com.youcode.exercice2;

public class Main {

	public static void main(String[] args) {
		Chien rex = new Chien();
		Chien max = new Chien();
		rex.nom = "Rex";
		max.nom = "Max";
		rex.aboyer();
		rex.manger();
		max.aboyer();
		max.manger();
	}

}
