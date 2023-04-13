
package com.example.ArgentinaPrograma.Security.Repository;

import com.example.ArgentinaPrograma.Security.Entity.Rol;
import com.example.ArgentinaPrograma.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
