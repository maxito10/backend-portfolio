package com.example.ArgentinaPrograma.repository;
import com.example.ArgentinaPrograma.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{

    
}
