package brief2OOP;

public class Account{
	private String nom;
	private String adresse;
	private double solde;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/*@Override
	public String toString() {
		return "Account [nom=" + nom + ", adresse=" + adresse + ", solde="
				+ solde + "]";
	}
	*/
	 public static void main(String[] args) {
			Account res = new Account();
			res.setNom("El Alami Hassan");
			res.setAdresse("Safi");
			res.setSolde(14765.8);
			
			res.getNom();
			res.getAdresse();
			res.getSolde();
			
			//res.toString();
			System.out.println(res.getNom() +" habite à "+ res.getAdresse()+"- infos solde "+ res.getSolde() + " DH");
			//System.out.println(res);
            //System.out.println(res.toString());
		}
}

