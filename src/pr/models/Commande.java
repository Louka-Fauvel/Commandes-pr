package pr.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commande {
	
	private Date date;
	private Client client;
	private Map<String, DetailCommande> details; // transformer le tableau avec Map -> HashMap

	/**
	 * Ajouter les tests unitaires sur les classes {Commande et CommandeSpeciale
	 * @param date
	 */
	public Commande(Client client) {
		
		this.client = client;
		details = new HashMap<>();
		date = new Date();
		
	}

	public void addProduit(Produit produit, int quantite) {
		
		if(details.containsKey(produit.getRef())) {
			
			incProduit(produit.getRef(), quantite);
			
		} else {
			
			this.details.put(produit.getRef(), new DetailCommande(produit, quantite));
		}
		
		
	}
	
	public void incProduit(String ref, int quantite) {
		
		int index = details.indexOf(DetailCommande.getRef(ref));
		
		if(index != -1) {
			
			details.get(index).incQuantite(quantite);
		}
		
	}

	public float getMontant() {

		float montant = 0;
		
		for(DetailCommande ligneDetail:this.details) {
			montant += ligneDetail.getQuantite() * ligneDetail.getProduit().getPu();
		}
		
		return montant;
	}
	
	public int getQuantiteProduits() {
		
		int quantiteProduits = 0;
		
		for(DetailCommande ligneDetail:this.details) {
			quantiteProduits += ligneDetail.getQuantite();
		}
		
		return quantiteProduits;
	}
	
	public boolean retireLigneDetail(String ref) {/*
		
		for(DetailCommande ligneDetail:this.details) {
			
			if(ref.equals(ligneDetail.getProduit().getRef())) {
				return this.details.remove(ligneDetail);
			}
		}
		
		return false;*/
		return details.remove(new DetailCommande(new Produit(ref, 0), 0));
	}
	
	

	public List<DetailCommande> getDetails() {
		return details;
	}

	@Override
	public String toString() {
		return "Commande [date=" + date + ", client=" + client + ", details=" + details + "]";
	}
}