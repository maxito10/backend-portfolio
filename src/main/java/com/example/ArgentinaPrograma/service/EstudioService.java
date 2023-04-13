
package com.example.ArgentinaPrograma.service;

import com.example.ArgentinaPrograma.entity.Estudio;
import com.example.ArgentinaPrograma.repository.IEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{

    @Autowired
   public IEstudioRepository estuRepo;   
    
    @Override
    public List<Estudio> verEstudios() {
        return estuRepo.findAll();
        
    }

    @Override
    public void crearEstudio(Estudio estu) {
        estuRepo.save(estu);
    }

    @Override
    public void borrarEstudio(Long id) {
        estuRepo.deleteById(id);
    }

  

    @Override
    public void editarEstudio(Estudio est) {
        estuRepo.save(est);
    }

     @Override
    public Estudio buscarEstudio(Long id) {
        return estuRepo.findById(id).orElse(null);
    }

    
  
    
}
