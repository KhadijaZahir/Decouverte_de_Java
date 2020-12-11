package com.youcode.heritageEX2;

public class CompteEpargne extends CompteBancaire{
	public CompteEpargne(long numeroCompte, double solde) {
		super(numeroCompte, solde);
		// TODO Auto-generated constructor stub
	}
	double tauxInteret;
	   public void calculInteret(double tauxInteret){
		if (solde>= 200) {
			double interet =solde*tauxInteret;
			System.out.println("les interets sont de "+ (interet));
		} else {
			System.out.println("il faut que le solde soit sup à 200");
		}
	}
	public void afficher(){
		calculInteret(0.07);
		System.out.println("vote compte est de type epargne et votre numero de compte est: " + numeroCompte + " est votre solde est de "+ solde);		
    }
}
