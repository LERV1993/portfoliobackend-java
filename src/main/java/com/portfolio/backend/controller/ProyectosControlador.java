package com.portfolio.backend.controller;

import com.portfolio.backend.model.Proyectos;
import com.portfolio.backend.service.ProyectosServicioImp;
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
public class ProyectosControlador {
    
    @Autowired
    ProyectosServicioImp proyectoServ;
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyectoServ.verProyectos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/proyecto")
    public void crearProyecto(@RequestBody Proyectos proyecto){
        proyectoServ.crearProyectos(proyecto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/proyecto/{id}")
    public void modificarProyecto(@RequestBody Proyectos Proyecto, @PathVariable(value="id")Long proyectoId){
        proyectoServ.actualizarProyecto(Proyecto, proyectoId);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/proyecto/{id}")
    public void borrarProyecto(@PathVariable(value="id")Long proyectoId){
        proyectoServ.borrarProyecto(proyectoId);
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyectos buscarProyectoPorId(@PathVariable(value="id")Long proyectoId){
        return proyectoServ.buscarProyectoPorId(proyectoId);
        
    }
    
}
