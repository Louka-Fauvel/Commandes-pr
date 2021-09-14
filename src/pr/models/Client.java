package pr.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String id;
	private List<Commande> commandes;
	
	public Client(String id) {

		this.id = id;
		commandes = new ArrayList<>();
    }

	@Override
	public String toString() {
		return "Client [id=" + id + ", commandes=" + commandes + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}