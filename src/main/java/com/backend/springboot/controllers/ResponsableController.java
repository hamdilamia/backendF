package com.backend.springboot.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@PreAuthorize("hasRole('RESPONSABLE') or hasRole('ADMIN')")
@RequestMapping("/api/responsable")
public class ResponsableController {
    @GetMapping("/hello")
    public String Hello() {
        return "Responsable Board.";
    }
}