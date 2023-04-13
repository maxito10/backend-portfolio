package com.example.ArgentinaPrograma.service;
import com.example.ArgentinaPrograma.entity.Habilidad;
import java.util.List;


public interface IHabilidadService {
     public List<Habilidad> verHabilidades();
    
    public void crearHabilidad (Habilidad hab);
    
    public void borrarHabilidad (Long id);
    
    public Habilidad buscarHabilidad (Long id);
}
