package com.isga.web.modele;

public class Book {
	private Long id;
	private String titre;
	private String auteur;
	private String genre;
	private int annee;
	private Boolean statut;
	private String image;
	
	public Book(String titre, String auteur, String genre, int annee, Boolean statut, String image) {
		super();
		
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.annee = annee;
		this.statut = statut;
		this.image = image;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
