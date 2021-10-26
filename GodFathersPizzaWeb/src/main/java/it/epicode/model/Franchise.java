package it.epicode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Franchise implements MenuItem {
	private String name;
	private Double price;
	
	
//	public Franchise(String name, Double price) {
//		this.name = name;
//		this.price = price;
//	}
//
//
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


	@Override
	public String getMenuItemLine() {
		return name + " prezzo: " + price;
	}


	
	
	
	
	
	
}
