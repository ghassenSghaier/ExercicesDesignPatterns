package tn.iit.glid2.factory;

import tn.iit.glid2.ingredients.Cheese;
import tn.iit.glid2.ingredients.Clam;
import tn.iit.glid2.ingredients.Clovis;
import tn.iit.glid2.ingredients.Dough;
import tn.iit.glid2.ingredients.EggPlant;
import tn.iit.glid2.ingredients.Garlic;
import tn.iit.glid2.ingredients.MarinaraSauce;
import tn.iit.glid2.ingredients.Onion;
import tn.iit.glid2.ingredients.Parmesan;
import tn.iit.glid2.ingredients.Sauce;
import tn.iit.glid2.ingredients.ThinDough;
import tn.iit.glid2.ingredients.Veggies;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough(){
		return new ThinDough();
	}
	
	public Sauce createSauce(){
		return new MarinaraSauce();
	}
	
	public Cheese createCheese(){
		return new Parmesan();
	}
	
	public Veggies[] createVeggies(){
		Veggies veggies[]={new Garlic(), new Onion(), new EggPlant()};
		return veggies;
	}
	
	public Clam createClam(){
		return new Clovis();
	}
}
