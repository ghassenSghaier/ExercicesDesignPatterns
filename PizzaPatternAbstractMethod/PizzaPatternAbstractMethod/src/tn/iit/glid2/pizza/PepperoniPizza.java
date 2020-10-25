package tn.iit.glid2.pizza;

import tn.iit.glid2.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza(PizzaIngredientFactory ingredientfactory) {
		super(ingredientfactory);
	}

	public void prepare() {
		System.out.println("Préparons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}
}
