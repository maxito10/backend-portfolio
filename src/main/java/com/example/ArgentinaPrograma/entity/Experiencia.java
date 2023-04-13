package com.example.ArgentinaPrograma.entity;
import com.sun.istack.NotNull;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
     @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String puesto;
     
      @NotNull
   @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicio;
      
       @NotNull
   @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin;
       
   @Lob
   @NotNull
    private String descripcion;
   
     @NotNull
    @Size( min=1,max = 100)
    private String imagen;
     
      @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String empresa;

    public Experiencia() {
    }

    public Experiencia(String puesto, Date inicio, Date fin, String descripcion, String imagen, String empresa) {
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.empresa = empresa;
    }

  
    
   
    
   
 }
