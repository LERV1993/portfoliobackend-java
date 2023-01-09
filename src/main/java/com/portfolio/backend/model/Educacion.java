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
@Table(name = "educacion")
@Getter
@Setter
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "institucion", nullable = false)
    private String institucion;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name="fecha",nullable=false)
    private String fecha;

    public Educacion() {
    }

    public Educacion(Long Id, String imagen, String titulo, String institucion, String estado, String fecha) {
        this.Id = Id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.institucion = institucion;
        this.estado = estado;
        this.fecha = fecha;
    }



}
