package it.epicode.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {
	List <Pizza> menuPizza= new ArrayList<>();
	List <PizzaTopping> menuTopping= new ArrayList<>();
	List<Drink> menuDrink = new ArrayList<>();
	List<Franchise> menuFranchise = new ArrayList<>();
	
	
//	public List<Pizza> getMenuPizza() {
//		return menuPizza;
//	}
//	
//	public List<PizzaTopping> getMenuTopping() {
//		return menuTopping;
//	}
//	
//	public List<Drink> getMenuDrink() {
//		return menuDrink;
//	}
//	
//	public List<Franchise> getMenuFranchise() {
//		return menuFranchise;
//	}
	
//	public void creaMenu() {
//		menuPizza.add(new PizzaHawaiian());
//		menuPizza.add(new PizzaMargherita());
//		menuPizza.add(new PizzaSalami());
//		menuPizza.add(new PizzaFamilySize(new PizzaMargherita()));
//		menuTopping.add(new ToppingCheese(new PizzaMargherita()));
//		menuTopping.add(new ToppingHam(new PizzaSalami()));
//		menuDrink.add(new DrinkLemonade());
//		menuFranchise.add(new FranchiseMug());
//
//	}
	
	
	
	
}
