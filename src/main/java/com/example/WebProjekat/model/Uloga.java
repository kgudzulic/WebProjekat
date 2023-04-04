package com.example.WebProjekat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Uloga implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;
}