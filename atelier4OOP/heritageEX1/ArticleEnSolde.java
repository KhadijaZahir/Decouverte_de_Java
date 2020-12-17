package com.youcode.heritageEX1;

public class ArticleEnSolde extends Article {
	int remise;

	public ArticleEnSolde(String nom, int prix, int remise) {
		super(nom, prix);
		this.remise = remise;
	}

	public void afficher() {
		double net = getPrix() - (getPrix() * remise);
		System.out.println("pourcentage de remise sur le prix : " + net);
	}
}
