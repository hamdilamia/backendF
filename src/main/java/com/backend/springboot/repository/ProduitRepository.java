package com.backend.springboot.repository;

import com.backend.springboot.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    public Produit getProduitByNomProduit(String nomProduit);
    @Query("SELECT p FROM Produit p WHERE p.nomProduit= :nomProduit")
    Collection<Produit> findAllByRef(@Param("nomProduit") String nomProduit);
}
