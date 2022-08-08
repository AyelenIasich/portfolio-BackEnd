package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.About;
import com.ayeleniasich.portfolio.repository.AboutRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AboutService implements IAboutService {

    @Autowired
    public AboutRepository AboutRepo;

    @Override
    public List<About> VerAbout() {
        return AboutRepo.findAll();
    }

    @Override
    public Optional<About> buscarAbout(Long id) {
        return AboutRepo.findById(id);
    }

    @Override
    public void crearAbout(About about) {
        AboutRepo.save(about);
    }

    @Override
    public void borrarAbout(Long id) {
        AboutRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return AboutRepo.existsById(id);
    }

}
