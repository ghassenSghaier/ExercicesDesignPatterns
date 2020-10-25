package iit.ens.tn;

public abstract class Voiture {
	protected int prix;	
	protected String description;
	
	public Voiture(String description,int prix) {		
		this.prix=prix;
		this.description=description;
	}	
	public abstract int  cost();
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	
	
	
}
