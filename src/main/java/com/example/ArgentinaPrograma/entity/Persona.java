
package com.example.ArgentinaPrograma.entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
    @Entity
public class Persona {
    
    @Id
   @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size( max = 100)
    private String imgpersona;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String bannerpersona;
    
   @Lob
   @NotNull
   @Size(min = 1, max = 1000, message = "No cumple con la longitud")
   private String sobremi;
    
    
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String imgpersona, String bannerpersona, String sobremi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.imgpersona = imgpersona;
        this.bannerpersona = bannerpersona;
        this.sobremi = sobremi;
    }
    
    
    }
    
    

