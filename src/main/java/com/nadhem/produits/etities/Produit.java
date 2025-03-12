package com.nadhem.produits.etities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private double prix;
	private Date dateCreation;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Produit(String nomProduit, double prix, Date dateCreation) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.dateCreation = dateCreation;
	}


	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + ", dateCreation="
				+ dateCreation + "]";
	}
	
	 

}
