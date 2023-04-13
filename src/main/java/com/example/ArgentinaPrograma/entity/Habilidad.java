package com.example.ArgentinaPrograma.entity;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
    @Entity

public class Habilidad {
    @Id
   @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @Max(100)
    @Min(0)
    @NotNull
    private int porcentaje;
    
   
  

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre,int porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        
    }
    
    
    
    
    
}
