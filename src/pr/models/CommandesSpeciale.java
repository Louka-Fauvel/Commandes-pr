package pr.models;

public class CommandesSpeciale extends Commande{
	
	private float promo;
	
	public CommandesSpeciale(Client client, float promo) {
		super(client);
		this.promo = promo;
	}
	
	@Override
	public float getMontant() {
		return super.getMontant() * (1 - this.promo);
	}

	@Override
	public String toString() {
		return "CommandesSpeciale [promo=" + promo + "]";
	}
	
}
