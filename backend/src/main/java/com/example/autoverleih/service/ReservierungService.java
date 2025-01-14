package com.example.autoverleih.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autoverleih.model.Reservierung;
import com.example.autoverleih.repository.ReservierungRepository;

@Service
public class ReservierungService {

    private final ReservierungRepository reservierungRepository;

    @Autowired
    public ReservierungService(ReservierungRepository reservierungRepository) {
        this.reservierungRepository = reservierungRepository;
    }

    public List<Reservierung> getAllReservierungen() {
        return reservierungRepository.findAll();
    }

    public Optional<Reservierung> getReservierungById(Long id) {
        return reservierungRepository.findById(id);
    }

    public Reservierung saveReservierung(Reservierung reservierung) {
        return reservierungRepository.save(reservierung);
    }

    public void deleteReservierung(Long id) {
        reservierungRepository.deleteById(id);
    }
}
