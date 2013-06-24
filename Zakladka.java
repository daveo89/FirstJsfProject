package com.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Zakladka {

  private int id;
	
	public Zakladka(){}
	
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
