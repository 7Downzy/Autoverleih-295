package com.example.autoverleih.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.autoverleih.model.Reservierung;
import com.example.autoverleih.service.ReservierungService;

@RestController
@RequestMapping("/api/reservierungen")
public class ReservierungController {

    private final ReservierungService reservierungService;

    @Autowired
    public ReservierungController(ReservierungService reservierungService) {
        this.reservierungService = reservierungService;
    }

    @GetMapping
    public List<Reservierung> getAllReservierungen() {
        return reservierungService.getAllReservierungen();
    }

    @GetMapping("/{id}")
    public Optional<Reservierung> getReservierungById(@PathVariable Long id) {
        return reservierungService.getReservierungById(id);
    }

    @PostMapping
    public Reservierung createReservierung(@RequestBody Reservierung reservierung) {
        return reservierungService.saveReservierung(reservierung);
    }

    @PutMapping("/{id}")
    public Reservierung updateReservierung(@PathVariable Long id, @RequestBody Reservierung reservierungDetails) {
        reservierungDetails.setId(id); // ID setzen
        return reservierungService.saveReservierung(reservierungDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteReservierung(@PathVariable Long id) {
        reservierungService.deleteReservierung(id);
    }
}
