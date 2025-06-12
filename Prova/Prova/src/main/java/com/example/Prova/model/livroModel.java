package com.example.Prova.model;

import jakarta.persistence.Column;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name= "livro")
@Getter
@Setter
@NoArgsConstructor
public class livroModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)   
    private Long id;

      @ManyToOne
    @JoinColumn(name = "id_bibliotecario", nullable = false)
    private livroModel id_livro;

    @Column (nullable = false)
    private String titulo;

    @Column (nullable = false)
    private String autor;

    @Column (nullable = false)
    private String genero;

    @Column (nullable = false)
    private String status;

    @Column (nullable = false)
    private double dataCadastro;


}
