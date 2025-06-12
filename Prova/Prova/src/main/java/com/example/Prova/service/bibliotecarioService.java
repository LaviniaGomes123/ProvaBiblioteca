package com.example.Prova.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prova.model.bibliotecarioModel;
import com.example.Prova.repository.bibliotecarioRepository;

@Service
public class bibliotecarioService {

    @Autowired
    private bibliotecarioRepository repository;

    public List<bibliotecarioModel> listar() {
        return repository.findAll();
    }

    public bibliotecarioModel salvar (bibliotecarioModel bibliotecarioModel){
        return repository.save(bibliotecarioModel);
    }
    
}
