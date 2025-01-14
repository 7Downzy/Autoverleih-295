package com.example.autoverleih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autoverleih.model.Reservierung;

@Repository
public interface ReservierungRepository extends JpaRepository<Reservierung, Long> {
    // Hier können zusätzliche Methoden definiert werden, falls benötigt
}
