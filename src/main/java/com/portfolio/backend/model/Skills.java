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
@Table(name = "skills")
@Getter
@Setter
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "porcentaje", nullable = false)
    private int porcentaje;
    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "tecnologia", nullable = false)
    private String tecnologia;

    public Skills() {
    }

    public Skills(Long id, int porcentaje, String imagen, String tecnologia) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
        this.tecnologia = tecnologia;
    }

}
