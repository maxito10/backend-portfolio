package com.example.ArgentinaPrograma.repository;
import com.example.ArgentinaPrograma.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository <Estudio, Long>{
    
}
