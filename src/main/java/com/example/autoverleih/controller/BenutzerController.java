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

import com.example.autoverleih.model.Benutzer;
import com.example.autoverleih.service.BenutzerService;

@RestController
@RequestMapping("/api/benutzer")
public class BenutzerController {

    private final BenutzerService benutzerService;

    public BenutzerController(BenutzerService benutzerService) {
        this.benutzerService = benutzerService;
    }

    @GetMapping
    public List<Benutzer> getAllBenutzer() {
        return benutzerService.getAllBenutzer();
    }

    @GetMapping("/{id}")
    public Optional<Benutzer> getBenutzerById(@PathVariable Long id) {
        return benutzerService.getBenutzerById(id);
    }

    @PostMapping
    public Benutzer createBenutzer(@RequestBody Benutzer benutzer) {
        return benutzerService.saveBenutzer(benutzer);
    }

    @PutMapping("/{id}")
    public Benutzer updateBenutzer(@PathVariable Long id, @RequestBody Benutzer benutzerDetails) {
        benutzerDetails.setId(id); // ID setzen
        return benutzerService.saveBenutzer(benutzerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBenutzer(@PathVariable Long id) {
        benutzerService.deleteBenutzer(id);
    }
}
