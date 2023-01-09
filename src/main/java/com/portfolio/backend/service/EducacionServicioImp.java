package com.portfolio.backend.service;

import com.portfolio.backend.exception.ResourceNotFoundException;
import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicioImp implements EducacionServicio {

    @Autowired
    EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long Id) {
        eduRepo.deleteById(Id);
    }

    @Override
    public void actualizarEducacion(Educacion educacion, Long Id) {
        Educacion nuevaEducacion = eduRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Educacion", "Id", Id));
        nuevaEducacion.setImagen(educacion.getImagen());
        nuevaEducacion.setTitulo(educacion.getTitulo());
        nuevaEducacion.setInstitucion(educacion.getInstitucion());
        nuevaEducacion.setEstado(educacion.getEstado());
        nuevaEducacion.setFecha(educacion.getFecha());

        eduRepo.save(nuevaEducacion);
    }

    @Override
    public Educacion buscarEducacionPorId(Long Id) {
        Educacion educacion = eduRepo.findById(Id).orElse(null);
        return educacion;
    }

}
