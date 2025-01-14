package com.example.autoverleih.service;

import com.example.autoverleih.model.Benutzer;
import com.example.autoverleih.repository.BenutzerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenutzerService {

    private final BenutzerRepository benutzerRepository;

    public BenutzerService(BenutzerRepository benutzerRepository) {
        this.benutzerRepository = benutzerRepository;
    }

    public List<Benutzer> getAllBenutzer() {
        return benutzerRepository.findAll();
    }

    public Optional<Benutzer> getBenutzerById(Long id) {
        return benutzerRepository.findById(id);
    }

    public Benutzer saveBenutzer(Benutzer benutzer) {
        return benutzerRepository.save(benutzer);
    }

    public void deleteBenutzer(Long id) {
        benutzerRepository.deleteById(id);
    }
}
