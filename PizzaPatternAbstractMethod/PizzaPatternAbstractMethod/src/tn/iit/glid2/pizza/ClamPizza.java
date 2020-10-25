package tn.iit.glid2.pizza;

import tn.iit.glid2.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		super(ingredientfactory);
	}

	public void prepare() {
		System.out.println("Pr�parons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}
}
