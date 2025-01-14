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

import com.example.autoverleih.model.Fahrzeugmarke;
import com.example.autoverleih.service.FahrzeugmarkeService;

@RestController
@RequestMapping("/api/fahrzeugmarken")
public class FahrzeugmarkeController {

    private final FahrzeugmarkeService fahrzeugmarkeService;

    public FahrzeugmarkeController(FahrzeugmarkeService fahrzeugmarkeService) {
        this.fahrzeugmarkeService = fahrzeugmarkeService;
    }

    @GetMapping
    public List<Fahrzeugmarke> getAllFahrzeugmarken() {
        return fahrzeugmarkeService.getAllFahrzeugmarken();
    }

    @GetMapping("/{id}")
    public Optional<Fahrzeugmarke> getFahrzeugmarkeById(@PathVariable Long id) {
        return fahrzeugmarkeService.getFahrzeugmarkeById(id);
    }

    @PostMapping
    public Fahrzeugmarke createFahrzeugmarke(@RequestBody Fahrzeugmarke fahrzeugmarke) {
        return fahrzeugmarkeService.saveFahrzeugmarke(fahrzeugmarke);
    }

    @PutMapping("/{id}")
    public Fahrzeugmarke updateFahrzeugmarke(@PathVariable Long id, @RequestBody Fahrzeugmarke fahrzeugmarkeDetails) {
        fahrzeugmarkeDetails.setId(id); // ID setzen
        return fahrzeugmarkeService.saveFahrzeugmarke(fahrzeugmarkeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteFahrzeugmarke(@PathVariable Long id) {
        fahrzeugmarkeService.deleteFahrzeugmarke(id);
    }
}
