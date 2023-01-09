package com.portfolio.backend.service;

import com.portfolio.backend.model.Skills;
import java.util.List;


public interface SkillsServicio {
    
    public List<Skills> verHabilidad();
    
    public void crearHabilidad(Skills habilidad);
    
    public void borrarHabilidad(Long Id);
    
    public void actualizarHabilidad(Skills habilidad,Long Id);
    
    public Skills buscarHabilidadPorId(Long Id);
}
