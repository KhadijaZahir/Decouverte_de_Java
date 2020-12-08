package brief2OOP;

public class Chien {
	
	public static void main(String[] args) {
	    Main account = new Main("El Alami Hassan ", "Safi", 14765.8);
	    Main account1 = new Main("Karimi Khalid", "Casablanca", 7654.0);
        System.out.println(account.nom +" habite à "+ account.adresse+"- infos solde "+ account.solde + " DH");
        System.out.println(account1.nom +" habite à "+ account1.adresse+"- infos solde "+ account1.solde + " DH");

	}

	
}
