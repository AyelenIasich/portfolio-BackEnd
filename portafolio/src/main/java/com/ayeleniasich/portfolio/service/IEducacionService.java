package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Educacion;
import java.util.List;
import java.util.Optional;


public interface IEducacionService {

    public List<Educacion> VerEducacion();

    public Optional<Educacion> buscarEducacion(Long id);

    public void crearEducacion(Educacion edu);

    public void borrarEducacion(Long id);

    public boolean existsById(Long id);

}
