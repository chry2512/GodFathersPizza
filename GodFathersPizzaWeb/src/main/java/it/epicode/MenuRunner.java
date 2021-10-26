package it.epicode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import it.epicode.model.DrinkLemonade;
import it.epicode.model.FranchiseMug;
import it.epicode.model.MenuItem;
import it.epicode.model.Ordine;
import it.epicode.model.PizzaHawaiian;
import it.epicode.model.PizzaMargherita;
import it.epicode.model.PizzaSalami;
import it.epicode.model.StatoOrdine;
import it.epicode.model.Tavolo;
import it.epicode.model.ToppingCheese;

@Component
@Order(1)
public class MenuRunner implements CommandLineRunner {
	
 
	private static final Logger log = LoggerFactory.getLogger(MenuRunner.class);
	


	
	@Value("${godfathersPizza.costocoperto}")
	double costoCoperto;
	

	public void valorizzaOrdine(Ordine ordine) {
		Map<MenuItem,Integer>itemOrdine=new HashMap<MenuItem,Integer>();
		PizzaMargherita pizMar=new PizzaMargherita();
		ToppingCheese topping= new ToppingCheese(pizMar);
		DrinkLemonade drink=new DrinkLemonade();
		ToppingCheese topping1= new ToppingCheese(topping);
		PizzaHawaiian pizHaw= new PizzaHawaiian();
		itemOrdine.put(pizMar, 3);
		itemOrdine.put(drink, 3);
		itemOrdine.put(pizHaw, 1);
//		itemOrdine.put(topping, 1);
//		itemOrdine.put(topping1, 1);
		ordine.setOrdinato(itemOrdine);
	}
	
	public void valorizzaOrdine2(Ordine ordine) {
		Map<MenuItem,Integer>itemOrdine=new HashMap<MenuItem,Integer>();
		PizzaMargherita pizMar=new PizzaMargherita();
		PizzaSalami pizzSal= new PizzaSalami();
		ToppingCheese topping= new ToppingCheese(pizMar);
		DrinkLemonade drink=new DrinkLemonade();
		FranchiseMug franch= new FranchiseMug();
		ToppingCheese topping1= new ToppingCheese(topping);
		itemOrdine.put(pizzSal, 2);
		itemOrdine.put(drink, 2);
		itemOrdine.put(franch, 2);
//		itemOrdine.put(topping, 1);
//		itemOrdine.put(topping1, 1);
		ordine.setOrdinato(itemOrdine);
	}
	
	public Ordine creaOrdine(Tavolo tavolo,Integer numeroCoperti,Double costoCoperto) {
		Ordine ordine=new Ordine();
		ordine.setTavolo(tavolo);
		ordine.setNumeroOrdine(tavolo.getNumero());
		ordine.setStato(StatoOrdine.IN_CORSO);
		ordine.setNumeroCoperti(numeroCoperti);
		ordine.setCostoCoperto(costoCoperto);
		return ordine;
	}
	



	public void stampaOrdine(Ordine ordine) {
		Set<MenuItem>listOrdini=ordine.getOrdinato().keySet();
		log.info("\n------------------------------------------------------------------------------------------------===== Ordinazione=====: \n" + "----------------------------------------------------------------------------------------------------numero  tavolo: " + ordine.getTavolo().getNumero() + "\n" +"----------------------------------------------------------------------------------------------------Coperti: " + ordine.getNumeroCoperti());
		log.info("Stato Ordine: " + ordine.getStato());
		for(MenuItem e:listOrdini) {
			log.info("[" + e.getMenuItemLine() );
			log.info("Quantita: " + ordine.getOrdinato().get(e));
			
		}
		log.info("[Conto compreso di coperto: " + ordine.getTotale() +  "]");

	}
	@Override
	public void run(String... args) throws Exception {
		Tavolo tavolo=new Tavolo(3,10,true);
		MenuRunner menuRun=new MenuRunner();
		Ordine ordine=menuRun.creaOrdine(tavolo, 10, costoCoperto);
		menuRun.valorizzaOrdine(ordine);
		menuRun.stampaOrdine(ordine);
	}
	
	

}
