package tn.iit.glid2.main;

import tn.iit.glid2.store.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("***********************");
		PizzaStore sfaxps =	new SfaxPizzaStore();
		sfaxps.orderPizza("cheese");
		System.out.println("***********************");
		/*PizzaStore tunisps = new TunisPizzaStore();
		tunisps.orderPizza("pepperoni");*/

	}

}
