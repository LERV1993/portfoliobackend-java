package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.service.ExperienciaServicioImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaControlador {

    @Autowired
    ExperienciaServicioImp expServImp;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/exp")
    public void crearExperiencia(@RequestBody Experiencia experiencia) {
        expServImp.crearExperiencia(experiencia);
    }

    @GetMapping("/ver/exp")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServImp.verExperiencia();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/exp/{id}")
    public void modificarExp(@RequestBody Experiencia experiencia, @PathVariable(value = "id") Long expId) {
        expServImp.actualizarExperiencia(experiencia, expId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/exp/{id}")
    public void borrarExp(@PathVariable(value = "id") Long expId) {
        expServImp.borrarExperiencia(expId);
    }

    @GetMapping("/exp/{id}")
    @ResponseBody
    public Experiencia bucarExpPorId(@PathVariable(value="id") Long expId){
        return expServImp.buscarPorId(expId);
    }
}
