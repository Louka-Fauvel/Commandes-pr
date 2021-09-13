package pr.models;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	
	private int date;
	private int quantite;
	private Client id;
	private List<DetailCommande> details;

	/**
	 * Ajouter les tests unitaires sur les classes {Commande et CommandeSpeciale
	 * @param date
	 */
	public Commande(Client id) {
		this.id = id;
		details = new ArrayList<>();
	}

	public void addProduit(Produit produit, int quantite) {
		details.add(quantite);
		
	}

	public void getMontant() {

		//float
	}
}