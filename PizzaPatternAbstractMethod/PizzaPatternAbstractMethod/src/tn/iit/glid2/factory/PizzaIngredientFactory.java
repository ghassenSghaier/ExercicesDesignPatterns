package tn.iit.glid2.factory;

import tn.iit.glid2.ingredients.Cheese;
import tn.iit.glid2.ingredients.Clam;
import tn.iit.glid2.ingredients.Dough;
import tn.iit.glid2.ingredients.Sauce;
import tn.iit.glid2.ingredients.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Clam createClam();
}
