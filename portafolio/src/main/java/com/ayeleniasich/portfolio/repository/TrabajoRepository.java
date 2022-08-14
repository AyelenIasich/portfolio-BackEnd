
package com.ayeleniasich.portfolio.repository;


import com.ayeleniasich.portfolio.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, Long> {
    
}
