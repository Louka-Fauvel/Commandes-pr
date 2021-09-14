package pr.models;

public class DetailCommande {
	
	private int quantite;
	private Produit produit;
	
	public DetailCommande(Produit produit , int quantite) {
		
		this.produit = produit;
		this.quantite = quantite;
	}

	public int getQuantite() {
		
		return quantite;
	}

	public Produit getProduit() {
		
		return produit;
	}
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof DetailCommande)) {
			return false;
		}
		
		return ((DetailCommande)obj).getProduit().equals(produit);
	}

	public static DetailCommande getRef(String ref) {
		
		return new DetailCommande(new Produit(ref, 0), 0);
	}

	public void incQuantite(int quantite) {
		this.quantite += quantite;
	}

	@Override
	public String toString() {
		return "DetailCommande [quantite=" + quantite + ", produit=" + produit + "]";
	}
}