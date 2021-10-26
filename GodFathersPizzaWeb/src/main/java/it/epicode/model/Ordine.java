package it.epicode.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordine {
	double costoCoperto;
	private Integer numeroOrdine;
	private StatoOrdine stato;
	private Integer numeroCoperti;
	private double costototale;
	private Tavolo tavolo;
	private Map<MenuItem, Integer> ordinato = new HashMap<>();

//	public Integer getNumeroOrdine() {
//		return numeroOrdine;
//	}
//
//	public StatoOrdine getStato() {
//		return stato;
//	}
//
//	public Integer getNumeroCoperti() {
//		return numeroCoperti;
//	}
//
//	public double getCostototale() {
//		return costototale;
//	}
//
//	public Tavolo getTavolo() {
//		return tavolo;
//	}
//
//	public Map<MenuItem, Integer> getOrdinato() {
//		return ordinato;
//	}
//
//	public void setNumeroOrdine(Integer numeroOrdine) {
//		this.numeroOrdine = numeroOrdine;
//	}
//
//	public void setStato(StatoOrdine stato) {
//		this.stato = stato;
//	}
//
//	public void setNumeroCoperti(Integer numeroCoperti) {
//		this.numeroCoperti = numeroCoperti;
//	}
//
//	public void setCostototale(double costototale) {
//		this.costototale = costototale;
//	}
//
//	public void setTavolo(Tavolo tavolo) {
//		this.tavolo = tavolo;
//	}
//
//	public void setOrdinato(Map<MenuItem, Integer> ordinato) {
//		this.ordinato = ordinato;
//	}

	public Double getTotale() {
		Double totale = 0d;
		for (MenuItem item : ordinato.keySet()) {
			totale += (item.getPrice() * ordinato.get(item));
		}
		totale += numeroCoperti * getCostoCoperto();
		return totale;

	}

//	public double getCostoCoperto() {
//		return costoCoperto;
//	}

	public void addMenuItem(MenuItem item, Integer numero) {
		this.ordinato.put(item, numero);
	}

	public void removeMenutItem(MenuItem item) {
		this.ordinato.remove(item);
	}

	public void setCostoCoperto(double costoCoperto) {
		this.costoCoperto = costoCoperto;
	}
	
	

}
