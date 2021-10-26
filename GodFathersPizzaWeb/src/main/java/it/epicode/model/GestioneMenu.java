package it.epicode.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.config.MenuConfig;

public class GestioneMenu {
	Menu menu;
	AnnotationConfigApplicationContext ctx;
	
		public GestioneMenu () {
			ctx= new AnnotationConfigApplicationContext(MenuConfig.class);
			menu=(Menu) ctx.getBean("menu");
		}

	public void stampaMenu() {
//		ctx= new AnnotationConfigApplicationContext(MenuConfig.class);
//		menu=(Menu) ctx.getBean("menu");
		
		System.out.println("\n=====PIZZE=====\n");
		for (Pizza p : menu.getMenuPizza()) {
			System.out.println(p.getMenuItemLine());
		}
//		System.out.println("\n=====TOPPING=====\n");
//		for (PizzaTopping pt : menu.getMenuTopping()) {
//			System.out.println(pt.getMenuItemLine());
//		}
		System.out.println("\n=====DRINK=====\n");
		for (Drink d : menu.getMenuDrink()) {
			System.out.println(d.getMenuItemLine());
		}
		System.out.println("\n=====FRANCHISE=====\n");
		for (Franchise f : menu.getMenuFranchise()) {
			System.out.println(f.getMenuItemLine());
		}
		PizzaMargherita pizza= ctx.getBean(PizzaMargherita.class);
		
		System.out.println("\n=====TOPPING=====\n");
		ToppingCheese topping1= new ToppingCheese(pizza);
		System.out.println(topping1.getMenuItemLine());
		
		
		ToppingCheese topping2= new  ToppingCheese(topping1);
		System.out.println(topping2.getMenuItemLine());
	}
}
