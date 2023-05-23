package com.example.WebProjekat.service;

import com.example.WebProjekat.model.Knjiga;
import com.example.WebProjekat.repository.KnjigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnjigaService {
    @Autowired
    private KnjigaRepository knjigaRepository;

    public List<Knjiga> findAll() {
        return knjigaRepository.findAll();
    }
}