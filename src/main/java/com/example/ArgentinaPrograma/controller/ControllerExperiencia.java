package com.example.ArgentinaPrograma.controller;
import com.example.ArgentinaPrograma.entity.Experiencia;
import com.example.ArgentinaPrograma.service.IExperienciaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
@CrossOrigin(origins = "https://hosting-angular-49dee.web.app")
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/experiencias/crear")
    public void saveExperiencia(@RequestBody Experiencia expe){
    expServ.saveExperiencia(expe);
    }
    
    @GetMapping("/experiencias/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
    return expServ.verExperiencias();
    }
    
   
  
    
    
     @DeleteMapping("/experiencias/borrar/{id}")
    public String borrarExperiencia (@PathVariable int id){
    expServ.borrarExperiencia(id);
     return "La experiencia fue eliminada correctamente";
    }
    
    
    
    
}
