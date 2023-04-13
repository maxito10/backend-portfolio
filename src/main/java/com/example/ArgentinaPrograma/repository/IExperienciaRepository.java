package com.example.ArgentinaPrograma.repository;

import com.example.ArgentinaPrograma.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Integer> {


}