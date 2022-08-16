package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.SoftSkill;
import java.util.List;
import java.util.Optional;

public interface ISoftSkillService {

    public List<SoftSkill> VerSoftSkill();

    public Optional<SoftSkill> buscarSoftSkill(Long id);

    public void crearSoftSkill(SoftSkill softSkill);

    public void borrarSoftSkill(Long id);

    public boolean existsById(Long id);
}
