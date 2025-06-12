package com.example.Prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prova.model.livroModel;
import com.example.Prova.service.livroService;
@CrossOrigin 
@RestController
@RequestMapping("/livro")

public class livroController {

    @Autowired
    private livroService service;

    @GetMapping
    public List<livroModel> listar(){
        return listar();
    }

    @PostMapping
    public livroModel livroModel(@RequestBody livroModel livroModel){
        return service.salvar(livroModel);
    }
    
}
