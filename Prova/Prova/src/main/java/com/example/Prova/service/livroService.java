package com.example.Prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prova.model.livroModel;
import com.example.Prova.repository.livroRepository;

@Service
public class livroService {
    @Autowired
    private livroRepository repository;

    public List<livroModel> listar() {
        return repository.findAll();
    }

    public livroModel salvar (livroModel livroModel){
        return repository.save(livroModel);
    }
}
