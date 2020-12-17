package gestionSupermarcheOOP;

public class Achat {
	private Article article;
	private int quantite;

	public Achat(Article article, int quantite) {
		this.article = article;
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
    
	public double getPrix() {
		double soldee = 1.0;
		if (article.isSolde()) {
			soldee = 0.5;
		}
		return quantite * article.getPrix() * soldee;
	}

	public void afficher() {
		String nom = article.getNom();
		double prixUnite = article.getPrix();
		double prixTotal = getPrix();
		String ensolde = "";

		if (article.isSolde()) {
			ensolde = "en solde";

		} else {
			ensolde = "non soldé";
		}
		System.out.println(nom + " : " + prixUnite + " x " + quantite + " = "
				+ prixTotal + " MAD (" + ensolde + " )");
	}

}
