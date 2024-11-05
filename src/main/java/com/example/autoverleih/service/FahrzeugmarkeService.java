package com.example.autoverleih.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autoverleih.model.Fahrzeugmarke;
import com.example.autoverleih.repository.FahrzeugmarkeRepository;

@Service
public class FahrzeugmarkeService {

    private final FahrzeugmarkeRepository fahrzeugmarkeRepository;

    @Autowired
    public FahrzeugmarkeService(FahrzeugmarkeRepository fahrzeugmarkeRepository) {
        this.fahrzeugmarkeRepository = fahrzeugmarkeRepository;
    }

    public List<Fahrzeugmarke> getAllFahrzeugmarken() {
        return fahrzeugmarkeRepository.findAll();
    }

    public Optional<Fahrzeugmarke> getFahrzeugmarkeById(Long id) {
        return fahrzeugmarkeRepository.findById(id);
    }

    public Fahrzeugmarke saveFahrzeugmarke(Fahrzeugmarke fahrzeugmarke) {
        return fahrzeugmarkeRepository.save(fahrzeugmarke);
    }

    public void deleteFahrzeugmarke(Long id) {
        fahrzeugmarkeRepository.deleteById(id);
    }
}
