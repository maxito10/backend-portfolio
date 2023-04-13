package com.example.ArgentinaPrograma.service;

import com.example.ArgentinaPrograma.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    
    public Experiencia saveExperiencia(Experiencia expe);
    
    public void borrarExperiencia(int id);
 
    
    
    
 
}
