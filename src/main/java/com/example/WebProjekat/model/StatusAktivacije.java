package com.example.WebProjekat.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class StatusAktivacije implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;
}