package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Proyecto;
import com.ayeleniasich.portfolio.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository ProyectoRepo;

    @Override
    public List<Proyecto> VerProyecto() {
        return ProyectoRepo.findAll();
    }

    @Override
    public Optional<Proyecto> buscarProyecto(Long id) {
        return ProyectoRepo.findById(id);
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        ProyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        ProyectoRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return ProyectoRepo.existsById(id);
    }

}
