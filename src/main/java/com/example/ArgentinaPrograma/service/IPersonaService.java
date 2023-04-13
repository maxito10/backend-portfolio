
package com.example.ArgentinaPrograma.service;

import com.example.ArgentinaPrograma.entity.Persona;
import java.util.List;




public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public void editarPersona (Persona perso);
    
    public Persona findPersona (Long id);

 
    
   
    
}
