package pr;

import java.util.ArrayList;
import java.util.List;

import pr.models.Client;
import pr.models.Commande;
import pr.models.Produit;

public class Prog {
	
	private static List<Client> clients;
	private static List<Commande> commandes;
	private static List<Produit> produits;

	public static void main(String[] args) {
		
		clients = new ArrayList<>();
		clients.add(new Client("Akou"));
		clients.add(new Client("Louka"));
		System.out.println(clients);
		
		produits = new ArrayList<>();
		produits.add(new Produit("Croissant", 1.5f));
		produits.add(new Produit("Glace", 3.99f));
		System.out.println(produits);
		
		commandes = new ArrayList<>();
		commandes.add(new Commande(clients.get(0)));
		commandes.add(new Commande(clients.get(1)));
		
		commandes.get(0).addProduit(produits.get(0), 3);
		commandes.get(1).addProduit(produits.get(1), 1);
		
		System.out.println(commandes);

	}
}
