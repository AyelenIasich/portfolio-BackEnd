package com.ayeleniasich.portfolio.repository;


import com.ayeleniasich.portfolio.model.Proyecto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{



}
