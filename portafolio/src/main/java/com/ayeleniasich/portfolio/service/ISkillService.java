
package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Skill;
import java.util.List;
import java.util.Optional;


public interface ISkillService {
     public List<Skill> VerSkill();

    public Optional<Skill> buscarSkill(Long id);

    public void crearSkill(Skill skill);

    public void borrarSkill(Long id);

    public boolean existsById(Long id);
}
