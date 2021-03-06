package com.backend.springboot.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@PreAuthorize("hasRole('EMPLOYE') or hasRole('ADMIN')")
@RequestMapping("/api/employe")
public class EmployeController {
    @GetMapping("/hello")
    public String Hello() {
        return "Employee Board.";
    }
}