package iit.ens.tn;

public class Test {
	public static void main(String[] args) {
	Voiture v1=new Camionnette ("P404",10000);
	Voiture v2=new Berline ("P407",20000);
	v1=new ABS(v1, 800);//800 repr�sente le prix de l�option ABS
	v2=new VitreElectrique(v2, 1000); // 1000 repr�sente le prix de l�option
	v2=new AirBag(v2, 1200); // 1200 repr�sente le prix de l�option
	System.out.println("La voiture est une "+v1.getDescription());
	//affiche: La voiture est une P404 avec ABS
	System.out.println("Son prix est:"+ v1.cost());
	//affiche: Son prix est 10800
	System.out.println("La voiture est une "+v2.getDescription());
	//affiche: La voiture est une P407 avec VitreElectrique, AirBag
	System.out.println("Son prix est:"+ v2.cost());
	//affiche: Son prix est 22200
	}
}
