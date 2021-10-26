package it.epicode.model;

public class ToppingHam extends PizzaTopping {

	public ToppingHam(Pizza pizza) {
		super(pizza, "Ham", 0.99, 35d);
	}

	public ToppingHam() {
		super("Ham", 0.99, 35d);
	}

	

}
