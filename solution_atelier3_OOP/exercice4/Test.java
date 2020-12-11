package com.youcode.exercice4;

public class Test {

	public static void main(String[] args) {
		Account res = new Account("El Alami Hassan","Safi",14765.8);
		Account res2 = new Account("mohammed","casa",15563);
		
		res.afficherInfosSolde();
		res.calculerInterer();
		res2.afficherInfosSolde();
		res2.calculerInterer();
	}

}
