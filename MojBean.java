package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MojBean {

  private String activeTab = "Test";
	private String ile;
	private List<Zakladka> list;
	
	public MojBean() {
		list = new ArrayList<Zakladka>();
	}
	
	public String getActiveTab() {
		return activeTab;
	}
	
	public void setActiveTab(String activeTab) {
		this.activeTab = activeTab;
	}

	public String getIle() {
		return ile;
	}

	public void setIle(String ile) {
		this.ile = ile;
		stworzListe(getIle());
	}

	private void stworzListe(String s) {
		int ile = Integer.parseInt(s);
		for(int i = 0; i < ile; i++) {
			list.add(new Zakladka(i+1));
		}
	}

	public List<Zakladka> getList() {
		return list;
	}
	
	

}
