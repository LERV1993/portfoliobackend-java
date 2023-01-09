package com.portfolio.backend.service;

import com.portfolio.backend.exception.ResourceNotFoundException;
import com.portfolio.backend.model.Proyectos;
import com.portfolio.backend.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServicioImp implements ProyectosServicio {

    @Autowired
    ProyectosRepository proyectosRepo; 
    
    @Override
    public List<Proyectos> verProyectos() {
       return proyectosRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proyectos) {
      proyectosRepo.save(proyectos);
    }

    @Override
    public void actualizarProyecto(Proyectos proyecto, Long Id) {
       Proyectos nuevoProyecto = proyectosRepo.findById(Id).orElseThrow(()->new ResourceNotFoundException("Proyecto","ID",Id));
       
       nuevoProyecto.setTitulo(proyecto.getTitulo());
       nuevoProyecto.setLenguaje(proyecto.getLenguaje());
       nuevoProyecto.setDescripcion(proyecto.getDescripcion());
       nuevoProyecto.setImagen(proyecto.getImagen());
       nuevoProyecto.setRepo(proyecto.getRepo());
       nuevoProyecto.setUrl(proyecto.getUrl());
       
       proyectosRepo.save(nuevoProyecto);
    }

    @Override
    public void borrarProyecto(Long Id) {
        proyectosRepo.deleteById(Id);
    }

    @Override
    public Proyectos buscarProyectoPorId(Long Id) {
        Proyectos proyecto = proyectosRepo.findById(Id).orElse(null);
       return proyecto;
    }
    
}
