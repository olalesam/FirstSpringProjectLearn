package com.nadhem.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.produits.entities.Produit;
import com.nadhem.produits.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
	
	@Autowired
	ProduitService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Produit> getAllProduit() {
		return produitService.getAllProduits();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT) 
	public Produit updateProduit(@RequestBody Produit produit) { 
		return produitService.updateProduit(produit); 
	} 
	
	
}
