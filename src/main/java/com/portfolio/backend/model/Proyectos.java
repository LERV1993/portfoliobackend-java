package com.portfolio.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "proyectos")
@Getter
@Setter
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "lenguaje", nullable = false)
    private String lenguaje;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "repo", nullable = false)
    private String repo;
    @Column(name = "url", nullable = false)
    private String url;

    public Proyectos() {
    }

    public Proyectos(Long Id, String titulo, String lenguaje, String descripcion, String imagen, String repo, String url) {
        this.Id = Id;
        this.titulo = titulo;
        this.lenguaje = lenguaje;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.repo = repo;
        this.url = url;
    }

}
