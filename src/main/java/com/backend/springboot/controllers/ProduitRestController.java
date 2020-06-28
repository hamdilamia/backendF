package com.backend.springboot.controllers;

import com.backend.springboot.models.Produit;
import com.backend.springboot.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suiviProd/produit")
@CrossOrigin(origins="*")

public class ProduitRestController {
    @Autowired
    ProduitService produitService;
    @PostMapping("/add")
    public Produit add(@RequestBody Produit p){
        return produitService.add(p);
    }


    @PutMapping("/update")
    public Produit update(@RequestBody Produit p){
        return produitService.update(p);
    }

    @GetMapping("/getAll")
    public List<Produit> getAll(){
        return produitService.getAll();
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        produitService.delete(id);
    }
}
