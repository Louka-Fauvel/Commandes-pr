package pr.models;

public class Produit {

	private String ref;
	private float pu;

	public Produit(String ref,  float pu) {

		this.ref = ref;
		this.pu = pu;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Produit)) {
			return false;
		}
		
		return ((Produit)obj).getRef().equals(ref);
	}

	public float getPu() {
		
		return pu;
	}
	
	public String getRef() {
		return ref;
	}

	@Override
	public String toString() {
		return "Produit [ref=" + ref + ", pu=" + pu + "]";
	}

	
}