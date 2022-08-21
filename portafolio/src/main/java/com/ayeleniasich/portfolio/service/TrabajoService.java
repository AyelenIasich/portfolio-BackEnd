package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Trabajo;
import com.ayeleniasich.portfolio.repository.TrabajoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrabajoService implements ITrabajoService {

    @Autowired
    public TrabajoRepository TrabajoRepo;

    @Override
    public List<Trabajo> VerTrabajo() {
        return TrabajoRepo.findAll(Sort.by(Sort.Direction.DESC, "finTrab"));
    }

    @Override
    public Optional<Trabajo> buscarTrabajo(Long id) {
        return TrabajoRepo.findById(id);
    }

    @Override
    public void crearTrabajo(Trabajo trabajo) {
        TrabajoRepo.save(trabajo);
    }

    @Override
    public void borrarTrabajo(Long id) {
        TrabajoRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return TrabajoRepo.existsById(id);
    }

}
