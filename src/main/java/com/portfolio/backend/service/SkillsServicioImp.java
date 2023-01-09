package com.portfolio.backend.service;

import com.portfolio.backend.exception.ResourceNotFoundException;
import com.portfolio.backend.model.Skills;
import com.portfolio.backend.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServicioImp implements SkillsServicio {
    
    @Autowired
    SkillsRepository habilidadesRepo;

    @Override
    public List<Skills> verHabilidad() {
        return habilidadesRepo.findAll();
    }

    @Override
    public void crearHabilidad(Skills habilidad) {
        habilidadesRepo.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long Id) {
        habilidadesRepo.deleteById(Id);
    }

    @Override
    public void actualizarHabilidad(Skills habilidad, Long Id) {
        Skills nuevaHabilidad = habilidadesRepo.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Habilidad","ID",Id));
        nuevaHabilidad.setImagen(habilidad.getImagen());
        nuevaHabilidad.setPorcentaje(habilidad.getPorcentaje());
        nuevaHabilidad.setTecnologia(habilidad.getTecnologia());
        
        habilidadesRepo.save(nuevaHabilidad);
    }

    @Override
    public Skills buscarHabilidadPorId(Long Id) {
        Skills habilidad = habilidadesRepo.findById(Id).orElse(null);
        return habilidad;
    }
    
}
