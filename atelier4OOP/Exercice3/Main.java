package com.youcode.Exercice3;

public class Main {

	public static void main(String[] args) {
		Enseignant en = new Enseignant("khadija", "za", "bab", "fes", 1996,
				"science");
		Secretaire sec = new Secretaire("andy", "za", "bab", "japan", 1996,
				3524);
		Etudiant et = new Etudiant("khadija", "za", "bab", "safi", 1996);
		et.setDiplome("AI");

		en.ecrirePersonne();
		sec.ecrirePersonne();
		et.ecrirePersonne();

		System.out.println(en.toString());
		System.out.println(sec.toString());
		System.out.println(et.toString());

	}

}
