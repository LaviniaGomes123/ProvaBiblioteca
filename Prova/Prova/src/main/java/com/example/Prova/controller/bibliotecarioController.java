package com.example.Prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prova.model.bibliotecarioModel;
import com.example.Prova.service.bibliotecarioService;
@CrossOrigin
@RestController
@RequestMapping("/bibliotecario")
public class bibliotecarioController {
    

    @Autowired
    private bibliotecarioService service;

    @GetMapping
    public List<bibliotecarioModel> listar(){
        return listar();
    }

    @PostMapping
    public bibliotecarioModel bibliotecarioModel(@RequestBody bibliotecarioModel bibliotecarioModel){
        return service.salvar(bibliotecarioModel);
    }
    
}

