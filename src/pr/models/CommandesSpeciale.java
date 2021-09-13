package pr.models;

public class CommandesSpeciale extends Commande{
	
	private float promo;
	
	public CommandesSpeciale(Client id, float promo) {
		this.promo = promo;
	}
	
	public void getMontant() {
		
	}
}
