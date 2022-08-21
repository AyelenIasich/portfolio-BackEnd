package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Proyecto;
import java.util.List;
import java.util.Optional;

public interface IProyectoService {

    public List<Proyecto> VerProyecto();

    public Optional<Proyecto> buscarProyecto(Long id);

    public void crearProyecto(Proyecto proyecto);

    public void borrarProyecto(Long id);

    public boolean existsById(Long id);
}
