package com.youcode.heritageEX2;

public class CompteBancaire {
	
	public CompteBancaire(long numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	protected long numeroCompte;
	protected double solde;
	
	public void Ajouter(double MontantAjout){
		double ajot = solde + MontantAjout;
		System.out.println("vous avez ajouter: " + MontantAjout + "dh alors votre compte est: "+ ajot);		
	}  
    public void retirer(double montantRetrait){
		double newSolde = solde - montantRetrait;
		System.out.println("vous avez retirer " + montantRetrait + "dh alors votre compte est: "+ newSolde);		
	}
    public void afficher(double solde, long numeroCompte){
    	this.solde= solde;
		System.out.println("vote compte est de type numero de compte est: " + numeroCompte +"est votre solde"+ solde);		
    }
}
