package com.backend.springboot.controllers;

import com.backend.springboot.models.OrdreFabrication;
import com.backend.springboot.service.OrdreFabricationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/ordreFabrication")
@CrossOrigin(origins="*")

public class





OrdreFabricationRestController {
    @Autowired
    OrdreFabricationService ordreFabricationService;
    @PostMapping("/add")
    public OrdreFabrication add(@RequestBody OrdreFabrication p){
        return ordreFabricationService.ajouterOf(p);
    }


    @PutMapping("/update")
    public OrdreFabrication update(@RequestBody OrdreFabrication p){
        return ordreFabricationService.modifierOf(p);
    }

    @GetMapping("/getAll")
    public List<OrdreFabrication> getAll(){
        return ordreFabricationService.afficherTtOf();
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long idOf){
        ordreFabricationService.supprimerOf(idOf);
    }
}
