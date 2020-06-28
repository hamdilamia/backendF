package com.backend.springboot.service;

import com.backend.springboot.models.OrdreFabrication;
import com.backend.springboot.repository.OrdreFabricationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class OrdreFabricationService {
    @Autowired
    OrdreFabricationRepository ordreFabricationRepository ;

    public OrdreFabrication ajouterOf(OrdreFabrication o){
        return ordreFabricationRepository.save(o);
    }

    public OrdreFabrication modifierOf(OrdreFabrication o){
        return ordreFabricationRepository.save(o);
    }

    public void supprimerOf(Long idOf){
        ordreFabricationRepository.deleteById(idOf);
    }

    public List<OrdreFabrication> afficherTtOf (){

        return ordreFabricationRepository.findAll();
    }
}
