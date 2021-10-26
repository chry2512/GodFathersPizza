package it.epicode.model;

import java.util.ArrayList;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class GestioneOrdine {
	
	public List<Ordine> listaOrdini;
	
	public GestioneOrdine() {
		listaOrdini= new ArrayList<Ordine>();
	}
	public void addOrdine(Ordine ordine) {
		listaOrdini.add(ordine);
	}
	
	public Ordine getById(int id) {
		return listaOrdini.stream().filter(a-> a.getNumeroOrdine()==id).findFirst().orElseThrow(null);
	}
	
	
}

