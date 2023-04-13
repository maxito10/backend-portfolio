package com.example.ArgentinaPrograma.Security.Service;

import com.example.ArgentinaPrograma.Security.Entity.Rol;
import com.example.ArgentinaPrograma.Security.Enums.RolNombre;
import com.example.ArgentinaPrograma.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    iRolRepository iRolRepository;
    
    public Optional <Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
