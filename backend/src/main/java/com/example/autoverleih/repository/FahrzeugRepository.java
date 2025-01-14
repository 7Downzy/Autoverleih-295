package com.example.autoverleih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autoverleih.model.Fahrzeug;

@Repository
public interface FahrzeugRepository extends JpaRepository<Fahrzeug, Long> {
    // Hier können zusätzliche Methoden definiert werden, falls benötigt
}
