package brief2OOP;

public class Account{
	private String nom;
	private String adresse;
	private double solde;
	
    public void ele(String nom, String adresse, double solde){
    	this.nom=nom;
    	this.adresse=adresse;
    	this.solde=solde;
    }
    public static void retirer(double m, double solde){
    	if(solde>m){
    		double r = solde - m;
    		System.out.println("voici votre solde actuel: " + r + " DH");
    	}else{
    		System.out.println("il faut retirer moins de votre solde actuel");
    	}
    }
    public static void main(String[] args) {
    	retirer(400, 100);
		System.out.println();
	}
}

