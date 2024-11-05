package com.example.autoverleih.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.autoverleih.model.Fahrzeug;
import com.example.autoverleih.service.FahrzeugService;

@RestController
@RequestMapping("/api/fahrzeuge")
public class FahrzeugController {

    private final FahrzeugService fahrzeugService;

    public FahrzeugController(FahrzeugService fahrzeugService) {
        this.fahrzeugService = fahrzeugService;
    }

    @GetMapping
    public List<Fahrzeug> getAllFahrzeuge() {
        return fahrzeugService.getAllFahrzeuge();
    }

    @GetMapping("/{id}")
    public Optional<Fahrzeug> getFahrzeugById(@PathVariable Long id) {
        return fahrzeugService.getFahrzeugById(id);
    }

    @PostMapping
    public Fahrzeug createFahrzeug(@RequestBody Fahrzeug fahrzeug) {
        return fahrzeugService.saveFahrzeug(fahrzeug);
    }

    @PutMapping("/{id}")
    public Fahrzeug updateFahrzeug(@PathVariable Long id, @RequestBody Fahrzeug fahrzeugDetails) {
        fahrzeugDetails.setId(id); // Setzen der ID für das Update
        return fahrzeugService.saveFahrzeug(fahrzeugDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteFahrzeug(@PathVariable Long id) {
        fahrzeugService.deleteFahrzeug(id);
    }
}
