package pr.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pr.models.Client;
import pr.models.Commande;
import pr.models.Produit;

public class ClientTest {

	private Commande laCommande;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}
	
	@BeforeEach
	void setUp() throws Exception {
		laCommande = new Commande(new Client("Iris"));
	}
	
	@Test
	void testAddProduit() {
		assertEquals(0, laCommande.getMontant(), 0);
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits());
		
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(4, laCommande.getQuantiteProduits());
		assertEquals(1, laCommande.getDetails().size());
		//System.out.println(laCommande);
	}
	
	@Test
	void testGetMontant() {
		assertEquals(0, laCommande.getMontant(), 0);
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(4.0f, laCommande.getMontant(), 0);
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(14.0f, laCommande.getMontant(), 0);
	}
	
	@Test
	void testGetQuantiteProduits() {
		assertEquals(0, laCommande.getQuantiteProduits(), 0);
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits(), 0);
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(12, laCommande.getQuantiteProduits(), 0);
		
	}
	
	@Test
	void testRetireLigneDetail() {
		assertEquals(0, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Croissant", 1.0f), 10);
		assertEquals(12, laCommande.getQuantiteProduits());
		
		laCommande.retireLigneDetail("Pain");
		assertEquals(10, laCommande.getQuantiteProduits());
		
		laCommande.retireLigneDetail("xxx");
		assertEquals(10, laCommande.getQuantiteProduits());
		
		laCommande.retireLigneDetail("Croissant");
		assertEquals(0, laCommande.getQuantiteProduits());
	}
	
	@Test
	void testIncProduit() {
		assertEquals(0, laCommande.getQuantiteProduits());
		laCommande.addProduit(new Produit("Pain", 2.0f), 2);
		assertEquals(2, laCommande.getQuantiteProduits());
		
		laCommande.incProduit("Pain", 2);
		assertEquals(4, laCommande.getQuantiteProduits());
		
		laCommande.incProduit("Pain", -1);
		assertEquals(3, laCommande.getQuantiteProduits());

		laCommande.incProduit("Painx", 100);
		assertEquals(3, laCommande.getQuantiteProduits());
	}

}
