package com.example.Prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Prova.model.livroModel;

public interface livroRepository  extends JpaRepository<livroModel, Long>{
}


