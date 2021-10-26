package it.epicode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.epicode.MenuRunner;
import it.epicode.model.DrinkLemonade;
import it.epicode.model.FranchiseMug;
import it.epicode.model.GestioneOrdine;
import it.epicode.model.Menu;
import it.epicode.model.Ordine;
import it.epicode.model.PizzaFamilySize;
import it.epicode.model.PizzaHawaiian;
import it.epicode.model.PizzaMargherita;
import it.epicode.model.PizzaSalami;
import it.epicode.model.Tavolo;
import it.epicode.model.ToppingCheese;
import it.epicode.model.ToppingHam;

@Configuration
public class MenuConfig {
	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	@Bean
	public PizzaFamilySize pizzaFamilyMargherita () {
		return new PizzaFamilySize(pizzaMargherita());
	}
	
	@Bean
	public PizzaFamilySize pizzaFamilySalami () {
		return new PizzaFamilySize(pizzaSalami());
	}
	@Bean
	public PizzaFamilySize pizzaFamilyHawaiian () {
		return new PizzaFamilySize(pizzaHawaiian());
	}
	@Bean
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	@Bean
	public FranchiseMug franchiseMug() {
		return new FranchiseMug();
	}
	@Bean
	public ToppingCheese toppingCheese() {
		return new ToppingCheese();
	}
	@Bean
	public ToppingHam toppingHam () {
		return new ToppingHam();
	}
	@Bean
	public Menu menu() {
		Menu menu= new Menu();
		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());
		menu.getMenuPizza().add(pizzaFamilyMargherita());
		menu.getMenuPizza().add(pizzaFamilySalami());
		menu.getMenuPizza().add(pizzaFamilyHawaiian());
		menu.getMenuTopping().add(toppingHam());
		menu.getMenuTopping().add(toppingCheese());
		menu.getMenuDrink().add(drinkLemonade());
		menu.getMenuFranchise().add(franchiseMug());
		return menu;
	}
	
	@Bean
	public GestioneOrdine listaOrd() {
		GestioneOrdine go= new GestioneOrdine();
		MenuRunner mr= new MenuRunner();
		Tavolo t1= new Tavolo(1,4,true);
		Tavolo t2= new Tavolo(2,6,true);
		Ordine o1= mr.creaOrdine(t2, 4, 2.0);
		Ordine o2= mr.creaOrdine(t1, 3, 2.0);
		mr.valorizzaOrdine(o1);
		mr.valorizzaOrdine2(o2);
		o1.setNumeroOrdine(1);
		o2.setNumeroOrdine(2);
		go.addOrdine(o1);
		go.addOrdine(o2);
		return go;
	}

}
