package gestionSupermarcheOOP;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Caisse {
	private int numero;
	private double total;

	public Caisse(int numero, double total) {
		this.numero = numero;
		this.total = total;
	}
	

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public void montantTotal() {
		System.out.println("la caisse N° " + numero + " a encaissé " + total
				+ " MAD ");
	}

	public void scanner(Chariot chariot) {
		System.out.println("=========================================");

		// Affichage de la date courante
		Date dateCourante = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
		System.out.println(formatDate.format(dateCourante));

		System.out.println("Caisse numéro " + numero);

		int nbAchat = chariot.getNbAchats();

		for (int i = 0; i < nbAchat; i++) {
			Achat achat = chariot.getAchat(i);
			double prix = achat.getPrix();
			achat.afficher();
			total += prix;
		}

		System.out.println();
		System.out.println("Montant a payer : " + total + " MAD ");
		System.out.println("=========================================");
	}

}
