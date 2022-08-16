package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Skill;
import com.ayeleniasich.portfolio.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService implements ISkillService {

    @Autowired
    public SkillRepository SkillRepo;

    @Override
    public List<Skill> VerSkill() {
        return SkillRepo.findAll();
    }

    @Override
    public Optional<Skill> buscarSkill(Long id) {
        return SkillRepo.findById(id);
    }

    @Override
    public void crearSkill(Skill skill) {
        SkillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        SkillRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return SkillRepo.existsById(id);
    }

}
