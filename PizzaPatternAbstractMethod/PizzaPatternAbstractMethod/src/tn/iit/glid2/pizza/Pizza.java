package tn.iit.glid2.pizza;

import tn.iit.glid2.factory.PizzaIngredientFactory;
import tn.iit.glid2.ingredients.Cheese;
import tn.iit.glid2.ingredients.Clam;
import tn.iit.glid2.ingredients.Dough;
import tn.iit.glid2.ingredients.Sauce;
import tn.iit.glid2.ingredients.Veggies;

public abstract class Pizza {
	protected PizzaIngredientFactory ingredientfactory;

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Veggies veggies[];
	protected Clam clam;

	public Pizza(PizzaIngredientFactory ingredientfactory) {
		super();
		this.ingredientfactory = ingredientfactory;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("Cuire durant 25mn à 350°");
	}

	public void cut() {
		System.out.println("Couper en morceaux à la diagonale");
	}

	public void box() {
		System.out.println("Placer la pizza dans un boitier officiel");
	}

	public void setName(String s) {
		name = s;
	}
}
