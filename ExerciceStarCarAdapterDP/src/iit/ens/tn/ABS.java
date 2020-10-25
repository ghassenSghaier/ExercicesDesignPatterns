package iit.ens.tn;

public class ABS extends Voiture{
	
	private Voiture v;
	public ABS(Voiture v,int prix) {		
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
		return v.getDescription()+"avec ABS";
	}


}
