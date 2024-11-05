package com.example.autoverleih.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autoverleih.model.Fahrzeug;
import com.example.autoverleih.repository.FahrzeugRepository;

@Service
public class FahrzeugService {

    private final FahrzeugRepository fahrzeugRepository;

    @Autowired
    public FahrzeugService(FahrzeugRepository fahrzeugRepository) {
        this.fahrzeugRepository = fahrzeugRepository;
    }

    public List<Fahrzeug> getAllFahrzeuge() {
        return fahrzeugRepository.findAll();
    }

    public Optional<Fahrzeug> getFahrzeugById(Long id) {
        return fahrzeugRepository.findById(id);
    }

    public Fahrzeug saveFahrzeug(Fahrzeug fahrzeug) {
        return fahrzeugRepository.save(fahrzeug);
    }

    public void deleteFahrzeug(Long id) {
        fahrzeugRepository.deleteById(id);
    }    
}
