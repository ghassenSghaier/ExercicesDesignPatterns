package iit.ens.tn;

public class Berline extends Voiture{

	public Berline(String description, int prix) {
		super(description, prix);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int cost() {
		return prix;
	}

	

}
