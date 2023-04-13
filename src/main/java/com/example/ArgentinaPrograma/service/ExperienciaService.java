package com.example.ArgentinaPrograma.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.ArgentinaPrograma.entity.Experiencia;
import com.example.ArgentinaPrograma.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public  class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public IExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
         return expeRepo.findAll();
    }

    @Override
    public Experiencia saveExperiencia(Experiencia expe) {
         return expeRepo.save(expe);
    }

   
    
    
      @Override
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
   
}






  

   

    

 

   
   

   
    

