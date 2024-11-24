package com.isga.web.modele;

import java.io.Serializable;

public class Student implements Serializable {

	
	private Long id;
	private String nom;
	private String prenom;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
