package com.portafolioFinal.Anadeska.Security.Repository;

import com.portafolioFinal.Anadeska.Security.Entity.Rol;
import com.portafolioFinal.Anadeska.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer>{
   Optional<Rol> findByRolNombre(RolNombre  rolNombre);
}
