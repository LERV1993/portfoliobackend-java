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
@Table(name = "banner")
@Getter
@Setter
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo1", nullable = false)
    private String titulo1;
    @Column(name = "titulo2", nullable = false)
    private String titulo2;
    @Column(name = "titulo3", nullable = false)
    private String titulo3;
    @Column(name = "subtitulo", nullable = false)
    private String subtitulo;
    @Column(name = "descripcion1", nullable = false)
    private String descripcion1;
    @Column(name = "descripcion2", nullable = false)
    private String descripcion2;
    @Column(name = "descripcion3", nullable = false)
    private String descripcion3;
    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "pie_foto1", nullable = false)
    private String pie_foto1;
    @Column(name = "pie_foto2", nullable = false)
    private String pie_foto2;

    public Banner() {
    }

    public Banner(Long id, String titulo1, String titulo2, String titulo3, String subtitulo, String descripcion1, String descripcion2, String descripcion3, String imagen, String pie_foto1, String pie_foto2) {
        this.id = id;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
        this.subtitulo = subtitulo;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
        this.imagen = imagen;
        this.pie_foto1 = pie_foto1;
        this.pie_foto2 = pie_foto2;
    }



}
