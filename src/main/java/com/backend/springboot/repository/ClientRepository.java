package com.backend.springboot.repository;

import com.backend.springboot.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ClientRepository extends JpaRepository<Client,Long> {
    public Client getClientByEmail(String email);
    @Query("SELECT c FROM Client c WHERE c.nom= :nom")
    Collection<Client> findAllByNom(@Param("nom") String nom);
}
