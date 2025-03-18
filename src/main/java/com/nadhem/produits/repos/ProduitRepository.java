package com.nadhem.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadhem.produits.entities.Categorie;
import com.nadhem.produits.entities.Produit;


@RepositoryRestResource(path = "rest") 
public interface ProduitRepository extends JpaRepository<Produit, Long > {
	
	List<Produit> findByNomProduit(String nomPrduit);
	List<Produit> findByNomProduitContains(String nomPrduit);
	
	/* @Query("select p from Produit p where p.nomProduit like %?1 and p.prix > ?2")
	List<Produit> findByNomPrix(String nom, Double prix); */
	
	
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prix > :prix")
	List<Produit> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Produit p where p.categorie = ?1") 
	List<Produit> findByCategorie (Categorie categorie); 
	
	List<Produit> findByCategorieIdCat(Long id); 
	
	List<Produit> findByOrderByNomProduitAsc(); 
	
	@Query("select p from Produit p order by p.nomProduit ASC, p.prix DESC") 
	List<Produit> trierProduitsNomsPrix ();

}

//Méthode GET : 
//• http://localhost:8080/produits/rest 
//• http://localhost:8080/produits/rest/2 
//• http://localhost:8080/produits/rest?size=2&page=0 
//• http://localhost:8080/produits/rest?size=2&page=1 
//• http://localhost:8080/produits/rest?sort=nomProduit,desc 
//• http://localhost:8080/produits/rest?size=2&page=0&sort=prixProduit,desc 
//• http://localhost:8080/produits/rest/search 
//• http://localhost:8080/produits/rest/search/findByNomProduitContains?nom=PC 
//• http://localhost:8080/produits/rest/search/findByCategorieIdCat?id=1 

