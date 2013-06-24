package com.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.component.tabview.Tab;
import org.primefaces.event.TabChangeEvent;


@ManagedBean
public class Zakladka {

	private int id;
	private String aktualneId;
	
	public Zakladka(){}
	
	public Zakladka(int id) {
		this.id = id;
	}
	
	
	public String getAktualneId() {
		return aktualneId;
	}

	public void setAktualneId(String aktualneId) {
		this.aktualneId = aktualneId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void akcjaId(ActionEvent event) {
		aktualneId = "Test";	
	}
	
	public void onChange(TabChangeEvent event) {
		aktualneId = "Test";
	}
	
}
