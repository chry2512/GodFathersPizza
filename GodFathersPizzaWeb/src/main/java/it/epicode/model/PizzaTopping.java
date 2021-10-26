package it.epicode.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PizzaTopping implements Pizza {
	private Pizza pizza;
	private String name;
	private Double price;
	private Double calories;
	
	
//	public PizzaTopping(Pizza pizza, String name, Double price, Double calories) {
//		this.pizza = pizza;
//		this.name = name;
//		this.price = price;
//		this.calories = calories;
//	}
	
	public PizzaTopping(String name, Double price, Double calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	@Override
	public Double getCalories() {
		return calories ;
	}

	@Override
	public String getName() {
		return  " con aggiunta di " + name ;
	}

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getMenuItemLine() {
		return getName() + " prezzo: " + getPrice()+" calorie: " + getCalories();
	}
	
	
	
	
}
