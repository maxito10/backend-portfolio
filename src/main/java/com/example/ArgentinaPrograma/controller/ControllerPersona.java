
package com.example.ArgentinaPrograma.controller;
import com.example.ArgentinaPrograma.entity.Persona;
import com.example.ArgentinaPrograma.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://backprueba-production-7b63.up.railway.app")
public class ControllerPersona {
    
  @Autowired
  private IPersonaService persoServ;
  
   
    @PostMapping("/personas/crear")
   public  String agregarPersona( @RequestBody Persona perso){
     persoServ.savePersona(perso); 
     return "La persona fue creada correctamente";
 
    }
     @GetMapping("/personas/ver")
    @ResponseBody
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
        
}
    
    @DeleteMapping("/personas/delete/{id}")
    public String deletePersona (@PathVariable Long id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    
    }

   //URL:PUERTO/personas/editar/4/nombre & apellido
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("titulo") String nuevoTitulo,
                                @RequestParam("imgpersona") String NuevoImg,
                                @RequestParam("bannerpersona") String NuevoBanner,
                                @RequestParam("sobremi") String NuevoSobremi){
    
        Persona persona = persoServ.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevoTitulo);
       persona.setImgpersona(NuevoImg);
        persona.setBannerpersona(NuevoBanner);
        persona.setSobremi(NuevoSobremi);
        
   persoServ.savePersona(persona);
   return persona;
    }
    
    
   @GetMapping("/personas/traer/perfil") 
  public Persona findPersona(){
  return persoServ.findPersona((long)1);}
    
  
  

}





   
