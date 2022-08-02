
package com.ayeleniasich.portfolio.security.repository;

import com.ayeleniasich.portfolio.security.entity.Rol;
import com.ayeleniasich.portfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolRepository  extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
