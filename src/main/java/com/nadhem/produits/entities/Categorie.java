package com.nadhem.produits.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descriptionCat;
	
	@OneToMany(mappedBy = "categorie")  
	@JsonIgnore
	private List<Produit> produits;
	
	
	public Categorie() {
		super();
	}

	public Long getId() {
		return idCat;
	}
	public void setId(Long idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescriptionCat() {
		return descriptionCat;
	}
	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
