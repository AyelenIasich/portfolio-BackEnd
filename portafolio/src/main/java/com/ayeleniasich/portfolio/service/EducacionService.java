/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Educacion;
import com.ayeleniasich.portfolio.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayelén
 */
@Service
@Transactional
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository EduRepo;

    @Override
    public List<Educacion> VerEducacion() {
        return EduRepo.findAll();
    }

    @Override
    public Optional<Educacion> buscarEducacion(Long id) {
        return EduRepo.findById(id);
    }

    @Override
    public void crearEducacion(Educacion edu) {
        EduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        EduRepo.deleteById(id);

    }

    
    @Override
    public boolean existsById(Long id) {
        return EduRepo.existsById(id);
    }
}
