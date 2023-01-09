package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.EducacionServicioImp;
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
public class EducacionControlador {
    
    @Autowired
    EducacionServicioImp eduServImp;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/educacion")
    public void crearEducacion(@RequestBody Educacion educacion){
        eduServImp.crearEducacion(educacion);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServImp.verEducacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/educacion/{id}")
    public void modificarEducacion(@RequestBody Educacion educacion, @PathVariable(value="id")Long educacionId){
        eduServImp.actualizarEducacion(educacion, educacionId);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/educacion/{id}")
    public void borrarEducacion(@PathVariable(value = "id") Long educacionId){
        eduServImp.borrarEducacion(educacionId);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacionPorId(@PathVariable(value="id")Long educacionId){
        return eduServImp.buscarEducacionPorId(educacionId);
    }
}
