package com.isga.web.modele;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private Book livre = new Book();
	private List<Book> livres = new ArrayList<Book>();
	
	public Book getLivre() {
		return livre;
	}
	public void setLivre(Book livre) {
		this.livre = livre;
	}
	public List<Book> getLivres() {
		return livres;
	}
	public void setLivres(List<Book> livres) {
		livres = livres;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
