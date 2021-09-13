package pr.models;

public class Produit {

	private String ref ;
	private float pu ;

	public Produit(String ref,  float pu) {

		this.ref = ref;
		this.pu = pu;
	}
	
	public float getPu() {
		
		return pu;
	}
}