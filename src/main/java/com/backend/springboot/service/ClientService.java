package com.backend.springboot.service;

import com.backend.springboot.models.Client;
import com.backend.springboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client ajouterClient(Client c){
        return clientRepository.save(c);
    }

    public Client modifierClient(Client o){
        return clientRepository.save(o);
    }

    public void supprimerClient(Long idClient){
        clientRepository.deleteById(idClient);
    }

    public List<Client> afficherTtClient(){

        return clientRepository.findAll();
    }
}
