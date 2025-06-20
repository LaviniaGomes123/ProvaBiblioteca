package com.example.Prova.model;

import jakarta.persistence.Column;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name= "bibliotecario")
@Getter
@Setter
@NoArgsConstructor

public class bibliotecarioModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)   
    private Long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String email;

  

    
}