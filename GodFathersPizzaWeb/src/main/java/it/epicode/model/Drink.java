package it.epicode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Drink implements FoodItem {
	private String name;
	private Double price;
	private Double calories;
	
	
//	public Drink(String name, Double price, Double calories) {
//		this.name = name;
//		this.price = price;
//		this.calories = calories;
//	}


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public Double getPrice() {
//		return price;
//	}
//
//
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//
//
//	public Double getCalories() {
//		return calories;
//	}
//
//
//	public void setCalories(Double calories) {
//		this.calories = calories;
//	}


	@Override
	public String getMenuItemLine() {
		return name + " prezzo: " + price + " calorie: " + calories;
	}
	
	
	
	
}
