
package com.ayeleniasich.portfolio.repository;

import com.ayeleniasich.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}