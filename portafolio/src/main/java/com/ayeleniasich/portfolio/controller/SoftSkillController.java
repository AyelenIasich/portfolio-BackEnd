package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.dto.SoftSkillDto;
import com.ayeleniasich.portfolio.model.SoftSkill;
import com.ayeleniasich.portfolio.service.ISoftSkillService;
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
@RequestMapping("/softskill")
@CrossOrigin
public class SoftSkillController {

    @Autowired
    private ISoftSkillService SoftSkillServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<SoftSkill>> VerSoftSkill() {
        List<SoftSkill> list = SoftSkillServ.VerSoftSkill();
        return new ResponseEntity<List<SoftSkill>>(list, HttpStatus.OK);
    }
   @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<SoftSkill> buscarSoftSkill(@PathVariable("id") Long id) {
        if (!SoftSkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        SoftSkill softSkill = SoftSkillServ.buscarSoftSkill(id).get();
        return new ResponseEntity(softSkill, HttpStatus.OK);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearSoftSkill(@RequestBody SoftSkillDto softSkillDto) {
        if (softSkillDto.getPorcentajeSoft() == null) {
            return new ResponseEntity(new Mensaje("Porcentaje inválido"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(softSkillDto.getUrlSoft()) ){
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(softSkillDto.getSoftSkill())) {
            
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        
        SoftSkill softSkill = new SoftSkill(softSkillDto.getPorcentajeSoft(),softSkillDto.getUrlSoft(), softSkillDto.getSoftSkill());
        SoftSkillServ.crearSoftSkill(softSkill);
        return new ResponseEntity(new Mensaje("Lista de soft skill creada"), HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarSoftSkill(@PathVariable("id") Long id, @RequestBody SoftSkillDto softSkillDto) {
        if (!SoftSkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
           if (softSkillDto.getPorcentajeSoft() == null) {
            return new ResponseEntity(new Mensaje("Porcentaje inválido"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(softSkillDto.getUrlSoft()) ){
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(softSkillDto.getSoftSkill())) {
            
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        SoftSkill softSkill = SoftSkillServ.buscarSoftSkill(id).get();
        softSkill.setPorcentajeSoft(softSkillDto.getPorcentajeSoft());
        softSkill.setUrlSoft(softSkillDto.getUrlSoft());
        softSkill.setSoftSkill(softSkillDto.getSoftSkill());           
        SoftSkillServ.crearSoftSkill(softSkill);
        return new ResponseEntity(new Mensaje("Lista de soft skill actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSoftSkill(@PathVariable("id") Long id) {
        if (!SoftSkillServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        SoftSkillServ.borrarSoftSkill(id);
        return new ResponseEntity(new Mensaje("Soft skill eliminada"), HttpStatus.OK);

    }
    
}
