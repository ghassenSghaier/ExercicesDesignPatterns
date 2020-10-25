package iit.ens.tn;

public class VitreElectrique extends Voiture{
	
	private Voiture v;
	public VitreElectrique(Voiture v,int prix) {		
		super(v.getDescription(),prix);
		this.v=v;			
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return v.cost() + prix;
	}
	public String getDescription(){
		// TODO Auto-generated method stub
		return v.getDescription()+"avec Vitre Electrique";
	}

}
