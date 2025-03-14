package com.nadhem.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.produits.entities.Produit;



public interface ProduitRepository extends JpaRepository<Produit, Long > {
	
	List<Produit> findByNomProduit(String nomPrduit);
	List<Produit> findByNomProduitContains(String nomPrduit);

}

