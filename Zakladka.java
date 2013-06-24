package com.beans;

import javax.faces.bean.ManagedBean;

import org.primefaces.component.tabview.Tab;

@ManagedBean
public class Zakladka {

	private int id;
	private String aktywnaZakladka;
	private Tab tab;
	
	public Zakladka(){
		
	}
	
	public String getAktywnaZakladka() {
		tab = new Tab();
		aktywnaZakladka = tab.getTitle();
		return aktywnaZakladka;
	}

	public void setAktywnaZakladka(String aktywnaZakladka) {
		this.aktywnaZakladka = aktywnaZakladka;
	}

	public Zakladka(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
