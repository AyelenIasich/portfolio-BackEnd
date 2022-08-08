package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Persona;
import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public Optional<Persona> VerPersona(Long id);

    public Optional<Persona> buscarPersona(Long id);

    public void crearPersona(Persona per);

    public void borrarPersona(Long id);

    public boolean existsById(Long id);

}
