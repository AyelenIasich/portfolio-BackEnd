package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Persona;
import com.ayeleniasich.portfolio.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository PerRepo;

    @Override
    public Optional<Persona> VerPersona(Long id) {
        return PerRepo.findById(id);
    }

    @Override
    public Optional<Persona> buscarPersona(Long id) {
        return PerRepo.findById(id);
    }

    @Override
    public void crearPersona(Persona per) {
        PerRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        PerRepo.deleteById(id);

    }

    @Override
    public boolean existsById(Long id) {
        return PerRepo.existsById(id);
    }

}
