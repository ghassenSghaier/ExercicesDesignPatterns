package tn.iit.glid2.store;

import tn.iit.glid2.factory.PizzaIngredientFactory;
import tn.iit.glid2.factory.SfaxPizzaIngredientFactory;
import tn.iit.glid2.pizza.CheesePizza;
import tn.iit.glid2.pizza.ClamPizza;
import tn.iit.glid2.pizza.PepperoniPizza;
import tn.iit.glid2.pizza.Pizza;

public class TunisPizzaStore extends PizzaStore{

	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientfactory = new SfaxPizzaIngredientFactory();
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientfactory);
			pizza.setName("Tunis Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientfactory);
			pizza.setName("Tunis Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientfactory);
			pizza.setName("Tunis Style Clam Pizza");
		}
		return pizza;
	}

}
