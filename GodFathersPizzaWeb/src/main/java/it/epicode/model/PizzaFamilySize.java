package it.epicode.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PizzaFamilySize implements Pizza{
	private Pizza pizza;
	private Double calories= 1.95;
	private Double price= 4.15;
	
	public  PizzaFamilySize (Pizza pizza) {
		this.pizza=pizza;
	}

		
	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}




	@Override
	public Double getCalories() {
		return calories * pizza.getCalories();
	}

	@Override
	public String getName() {
		return "Family Size" + " " + pizza.getName();
	}

	@Override
	public Double getPrice() {
		return price  +pizza.getPrice();
	}

	@Override
	public String getMenuItemLine() {
		return getName() + " prezzo: "  + getPrice()  + " calorie: " + getCalories() ;
	}
	
	

	
}
