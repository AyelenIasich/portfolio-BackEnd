/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.SoftSkill;
import com.ayeleniasich.portfolio.repository.SoftSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SoftSkillService implements ISoftSkillService{

     @Autowired
    public SoftSkillRepository SoftSkillRepo;
    
    @Override
    public List<SoftSkill> VerSoftSkill() {
             return SoftSkillRepo.findAll();  }

    @Override
    public Optional<SoftSkill> buscarSoftSkill(Long id) {
       return SoftSkillRepo.findById(id);
    }


    @Override
    public void crearSoftSkill(SoftSkill softSkill) {
        SoftSkillRepo.save(softSkill);  }

    @Override
    public void borrarSoftSkill(Long id) {
      SoftSkillRepo.deleteById(id);  }

    @Override
    public boolean existsById(Long id) {
       return SoftSkillRepo.existsById(id);    }
    
}
