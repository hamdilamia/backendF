package com.backend.springboot.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;
    private String nomProduit;
    private String designation;
    private String urlImagePrincipale;
    private String urlDossierTec;

    public Produit(){}

    public Produit(String nomProduit, String designation, String urlImagePrincipale, String urlDossierTec) {
        this.nomProduit = nomProduit;
        this.designation = designation;
        this.urlImagePrincipale = urlImagePrincipale;
        this.urlDossierTec = urlDossierTec;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getUrlImagePrincipale() {
        return urlImagePrincipale;
    }

    public void setUrlImagePrincipale(String urlImagePrincipale) {
        this.urlImagePrincipale = urlImagePrincipale;
    }

    public String getUrlDossierTec() {
        return urlDossierTec;
    }

    public void setUrlDossierTec(String urlDossierTec) {
        this.urlDossierTec = urlDossierTec;
    }
}
