package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.dto.SkillDto;
import com.ayeleniasich.portfolio.model.Skill;
import com.ayeleniasich.portfolio.service.ISkillService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@CrossOrigin
public class SkillController {

    @Autowired
    private ISkillService SkillServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<Skill>> VerSkill() {
        List<Skill> list = SkillServ.VerSkill();
        return new ResponseEntity<List<Skill>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<Skill> buscarSkill(@PathVariable("id") Long id) {
        if (!SkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Skill skill = SkillServ.buscarSkill(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearSkill(@RequestBody SkillDto skillDto) {
        if (skillDto.getPorcentaje() == null || (skillDto.getPorcentaje() < 0 && skillDto.getPorcentaje() < 100)) {
            return new ResponseEntity(new Mensaje("Porcentaje inválido"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(skillDto.getUrlLogo()) ){
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        }        
         if (StringUtils.isBlank(skillDto.getSkill())) {
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        Skill skill = new Skill(skillDto.getPorcentaje(), skillDto.getUrlLogo(), skillDto.getSkill());
        SkillServ.crearSkill(skill);
        return new ResponseEntity(new Mensaje("Lista de habilidades creada"), HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarSkill(@PathVariable("id") Long id, @RequestBody SkillDto skillDto) {
        if (!SkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        if (skillDto.getPorcentaje() == null) {
            return new ResponseEntity(new Mensaje("Porcentaje inválido"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(skillDto.getUrlLogo()) ){
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        }       
         if (StringUtils.isBlank(skillDto.getSkill())) {
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obliglatorio"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = SkillServ.buscarSkill(id).get();
        skill.setPorcentaje(skillDto.getPorcentaje());
        skill.setUrlLogo(skillDto.getUrlLogo());       
        skill.setSkill(skillDto.getSkill());      
        SkillServ.crearSkill(skill);
        return new ResponseEntity(new Mensaje("Lista de educación actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id) {
        if (!SkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        SkillServ.borrarSkill(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);

    }
    
    
    
}
