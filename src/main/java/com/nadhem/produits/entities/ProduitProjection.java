package com.nadhem.produits.entities;

import org.springframework.data.rest.core.config.Projection;

// permet de limité le nombre de champs de nos entités retrourné par nos endpoint

@Projection(name = "nomProd", types = { Produit.class })
public interface ProduitProjection {
	public String getNomProduit(); 
}
