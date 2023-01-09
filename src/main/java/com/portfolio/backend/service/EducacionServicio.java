package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import java.util.List;

public interface EducacionServicio {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion educacion);
    
    public void borrarEducacion(Long Id);
    
    public void actualizarEducacion(Educacion educacion, Long Id);
    
    public Educacion buscarEducacionPorId(Long Id);
}
