package brief2OOP;

public class Account{
	String nom;
	String adresse;
	double solde;
	
	public void afficherInfosSolde(String nom, String adresse, double solde){
		this.nom= nom;
		this.adresse= adresse;
		this.solde= solde;	
		System.out.println(nom +" habite à "+ adresse+"- infos solde "+ solde + " DH");
	}
    public void calculerInterer(){
    	this.solde=solde;
    	double interet;
    	interet=solde*0.07;
    	System.out.println(interet);
	}
    public static void main(String[] args) {
		Account res = new Account();
		res.afficherInfosSolde("El Alami Hassan","Safi",14765.8);
		res.calculerInterer();
	}
}

