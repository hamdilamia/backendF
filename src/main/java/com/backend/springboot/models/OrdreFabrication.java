package com.backend.springboot.models;

import javax.persistence.*;

@Entity
@Table
public class OrdreFabrication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOf;
    private Produit produit;
    private String refCmdClient;
    private Integer quantite;
    private String dateEntree;
    private String dateSortie;

    public OrdreFabrication(Produit produit, String refCmdClient, Integer quantite, String dateEntree, String dateSortie) {
        this.produit = produit;
        this.refCmdClient = refCmdClient;
        this.quantite = quantite;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
    }

    public Long getIdOf() {
        return idOf;
    }

    public void setIdOf(Long idOf) {
        this.idOf = idOf;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public String getRefCmdClient() {
        return refCmdClient;
    }

    public void setRefCmdClient(String refCmdClient) {
        this.refCmdClient = refCmdClient;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }
}
