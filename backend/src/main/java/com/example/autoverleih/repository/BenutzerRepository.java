package com.example.autoverleih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autoverleih.model.Benutzer;

@Repository
public interface BenutzerRepository extends JpaRepository<Benutzer, Long> {
}

