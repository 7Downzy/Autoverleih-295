package com.example.autoverleih.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservierung {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String feldX;  // Beispiel für andere Felder
    private String feldY;

    // Getter und Setter für alle Felder

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeldX() {
        return feldX;
    }

    public void setFeldX(String feldX) {
        this.feldX = feldX;
    }

    public String getFeldY() {
        return feldY;
    }

    public void setFeldY(String feldY) {
        this.feldY = feldY;
    }
}
