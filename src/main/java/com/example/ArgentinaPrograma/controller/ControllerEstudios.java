package com.example.ArgentinaPrograma.controller;
import com.example.ArgentinaPrograma.entity.Estudio;
import com.example.ArgentinaPrograma.service.IEstudioService;
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
public class ControllerEstudios {
    
    @Autowired
  private IEstudioService estServ;
  
   
    @PostMapping("/estudios/crear")
   public void agregarEstudio(@RequestBody Estudio estu){
     estServ.crearEstudio(estu); 
 }
   
   @GetMapping("/estudios/ver")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estServ.verEstudios();
}
     
    @DeleteMapping("/estudios/borrar/{id}")
    public String borrarEstudio (@PathVariable Long id){
        estServ.borrarEstudio(id);
         return "El estudio fue eliminado correctamente";
    
    }
    
     
    @PutMapping("/estudios/editar/{id}")
    public Estudio editarEstudio(@PathVariable Long id,
                                @RequestParam("titulo") String nuevoTitulo,
                                @RequestParam("inicio")@DateTimeFormat(pattern = "yyyy-MM-dd") Date nuevoInicio,
                                @RequestParam("fin")@DateTimeFormat(pattern = "yyyy-MM-dd") Date nuevoFin,
                                @RequestParam("descripcion") String nuevoDescripcion,
                                @RequestParam("imginst") String nuevoImginstitucion,
                                @RequestParam("url") String nuevoUrl){
    
        Estudio estudio = estServ.buscarEstudio(id);
        estudio.setTitulo(nuevoTitulo);
        estudio.setInicio(nuevoInicio);
        estudio.setFin(nuevoFin);
        estudio.setDescripcion(nuevoDescripcion);
        estudio.setImginst(nuevoImginstitucion);
        estudio.setUrl(nuevoUrl);
        
        
        
   estServ.crearEstudio(estudio);
   return estudio;
}

}
