package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyectos;
import java.util.List;


public interface ProyectosServicio {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyectos(Proyectos proyectos);
    
    public void actualizarProyecto(Proyectos proyecto,Long Id);
    
    public void borrarProyecto(Long Id);
    
    public Proyectos buscarProyectoPorId(Long Id);
}
