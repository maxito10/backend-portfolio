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
public class Estudio {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
  
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String titulo;
    
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
    private String imginst;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String url;
    

    public Estudio() {
    }

    public Estudio(Long id, String titulo, Date inicio, Date fin, String descripcion, String imginst, String institucion, String url) {
        this.id = id;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.imginst = imginst;
        this.institucion = institucion;
        this.url = url;
    }

    


   
    
    
    
}
