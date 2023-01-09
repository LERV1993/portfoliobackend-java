package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skills;
import com.portfolio.backend.service.SkillsServicioImp;
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
public class SkillsControlador {
    
    @Autowired
    SkillsServicioImp skillsServImp;
    
    @GetMapping("/ver/habilidades")
    @ResponseBody
    public List<Skills> verHabilidad() {
        return skillsServImp.verHabilidad();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/habilidad")
    public void crearHabilidad(@RequestBody Skills habilidad) {
        skillsServImp.crearHabilidad(habilidad);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar/habilidad/{id}")
    public void actualizarHabilidad(@RequestBody Skills habilidad, @PathVariable(value = "id") Long habilidadId) {
        skillsServImp.actualizarHabilidad(habilidad, habilidadId);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/habilidad/{id}")
    public void borrarHabilidad(@PathVariable(value="id") Long habilidadId){
        skillsServImp.borrarHabilidad(habilidadId);
    }
    
    @GetMapping("/ver/habilidad/{id}")
    @ResponseBody
    public Skills buscarHabilidadPorId(@PathVariable(value="id") Long habilidadId){
        return skillsServImp.buscarHabilidadPorId(habilidadId);
    }
}
