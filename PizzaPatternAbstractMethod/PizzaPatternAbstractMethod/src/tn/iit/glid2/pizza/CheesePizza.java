package tn.iit.glid2.pizza;
import tn.iit.glid2.factory.*;
import tn.iit.glid2.ingredients.*;

public class CheesePizza extends Pizza{
	
	
	public CheesePizza(PizzaIngredientFactory ingredientfactory) {
		super(ingredientfactory);
	}

	public void prepare(){
		System.out.println("Pr�parons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}	
}
