package com.inti.entities;

public class Gerant {
	public Long id;
	public String nom;
	
	public Gerant() {
		super();
	}
	public Gerant(String nom) {
		super();
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Atelier [id=" + id + ", nom=" + nom + "]";
	}
}
