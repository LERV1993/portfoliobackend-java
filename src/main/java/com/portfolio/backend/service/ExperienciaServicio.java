package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;


public interface ExperienciaServicio {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia experiencia);
    
    public void borrarExperiencia(Long Id);
    
    public void actualizarExperiencia(Experiencia experiencia,Long Id);
    
    public Experiencia buscarPorId(Long Id);
}
