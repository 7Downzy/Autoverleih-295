package com.example.autoverleih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autoverleih.model.Fahrzeugmarke;

@Repository
public interface FahrzeugmarkeRepository extends JpaRepository<Fahrzeugmarke, Long> {
    // Hier können zusätzliche Methoden definiert werden, falls benötigt
}
