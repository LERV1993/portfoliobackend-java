package com.portfolio.backend.service;

import com.portfolio.backend.exception.ResourceNotFoundException;
import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServicioImp implements ExperienciaServicio {

    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long Id) {
        expRepo.deleteById(Id);
    }

    @Override
    public void actualizarExperiencia(Experiencia experiencia, Long Id) {
       Experiencia nuevaExp = expRepo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Experiencia", "Id", Id));
       nuevaExp.setImagen(experiencia.getImagen());
       nuevaExp.setCargo(experiencia.getCargo());
       nuevaExp.setEmpresa(experiencia.getEmpresa());
       nuevaExp.setLugar(experiencia.getLugar());
       nuevaExp.setDesc_1(experiencia.getDesc_1());
       nuevaExp.setDesc_2(experiencia.getDesc_2());
       nuevaExp.setDesc_3(experiencia.getDesc_3());
       nuevaExp.setDesc_4(experiencia.getDesc_4());
       nuevaExp.setDesc_5(experiencia.getDesc_5());
       
       
       expRepo.save(nuevaExp);
    }

    @Override
    public Experiencia buscarPorId(Long Id) {
        Experiencia experiencia = expRepo.findById(Id).orElse(null);
        return experiencia;
    }


    
}
