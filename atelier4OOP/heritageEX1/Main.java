package com.youcode.heritageEX1;

public class Main {

	public static void main(String[] args) {
		// superclass(parent)
		Article obj = new Article("khadija", 500);
		obj.afficher();
		// subclass(child)
		ArticleEnSolde obj2 = new ArticleEnSolde("andy", 4, 300);
		obj2.afficher();
	}

}
