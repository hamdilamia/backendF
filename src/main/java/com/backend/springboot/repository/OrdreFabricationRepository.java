package com.backend.springboot.repository;

import com.backend.springboot.models.OrdreFabrication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface OrdreFabricationRepository extends JpaRepository<OrdreFabrication,Long> {
    public OrdreFabrication getOrdreFabricationByRefCmdClient(String refCmdClient);
    @Query("SELECT o FROM OrdreFabrication o WHERE o.refCmdClient= :refCmdClient")
    Collection<OrdreFabrication> findAllByRefCmdClient(@Param("refCmdClient") String refCmdClient);
}
