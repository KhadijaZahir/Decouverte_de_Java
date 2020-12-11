package com.youcode.heritageEX2;

public class CompteCourant extends CompteBancaire{
	
	public CompteCourant(long numeroCompte, double solde) {
		super(numeroCompte, solde);
		// TODO Auto-generated constructor stub
	}

	public void afficher(){
		System.out.println("vote compte est de type courant et votre numero de compte est: " + numeroCompte + "est votre solde"+ solde);		
    }
}
