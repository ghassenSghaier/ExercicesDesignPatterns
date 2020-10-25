package iit.ens.tn;

public class Camionnette extends Voiture{

	public Camionnette(String description, int prix) {
		super(description, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		return  prix;
	}
}
