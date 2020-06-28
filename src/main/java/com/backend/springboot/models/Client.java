package com.backend.springboot.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idClient;

    @NotBlank
    @Size(max = 10)
    private String nom;

    @NotBlank
    @Size(max = 10)
    private String prenom;

    @NotBlank
    @Size(max = 30)
    private String email;

    public Client (){}

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
