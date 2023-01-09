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
@Table(name = "Experiencia")
@Getter
@Setter
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "cargo", nullable = false)
    private String cargo;
    @Column(name = "empresa", nullable = false)
    private String empresa;
    @Column(name = "iniciofin", nullable = false)
    private String iniciofin;
    @Column(name = "lugar", nullable = false)
    private String lugar;
    @Column(name = "desc_1", nullable = false)
    private String desc_1;
    @Column(name = "desc_2", nullable = false)
    private String desc_2;
    @Column(name = "desc_3", nullable = false)
    private String desc_3;
    @Column(name = "desc_4", nullable = false)
    private String desc_4;
    @Column(name = "desc_5", nullable = false)
    private String desc_5;

    public Experiencia() {
    }

    public Experiencia(Long id, String imagen, String cargo, String empresa, String iniciofin, String lugar, String desc_1, String desc_2, String desc_3, String desc_4, String desc_5) {
        this.id = id;
        this.imagen = imagen;
        this.cargo = cargo;
        this.empresa = empresa;
        this.iniciofin = iniciofin;
        this.lugar = lugar;
        this.desc_1 = desc_1;
        this.desc_2 = desc_2;
        this.desc_3 = desc_3;
        this.desc_4 = desc_4;
        this.desc_5 = desc_5;
    }



}
