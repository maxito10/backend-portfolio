package com.example.ArgentinaPrograma.controller;
import com.example.ArgentinaPrograma.entity.Habilidad;
import com.example.ArgentinaPrograma.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://hosting-angular-49dee.web.app")

 class ControllerHabilidad {
    
    @Autowired
  private IHabilidadService habiServ;
  
  
    @PostMapping("/habilidad/crear")
   public void agregarHabilidad( @RequestBody Habilidad hab){
     habiServ.crearHabilidad(hab); 
   }
   
   
   @GetMapping("/habilidades/ver")
    @ResponseBody
    public List<Habilidad> verHabilidades(){
        return habiServ.verHabilidades();
}
    @DeleteMapping("/habilidad/delete/{id}")
    public String borrarHabilidad (@PathVariable Long id){
        habiServ.borrarHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    
    }
     
    
}
