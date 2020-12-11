package com.youcode.exercice5;

public class Main {

	public static void main(String[] args) {
		Account res = new Account();
		//modifier les attribut par setter
		res.setNom("El Alami Hassan");
		res.setAdresse("Safi");
		res.setSolde(14765.8);
	
		
		System.out.println(res.toString());
		//System.out.println(res.getNom() +" habite à "+ res.getAdresse()+"- infos solde "+ res.getSolde() + " DH");
	}

}
