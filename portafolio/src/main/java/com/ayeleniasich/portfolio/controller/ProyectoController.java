/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.dto.ProyectoDto;
import com.ayeleniasich.portfolio.model.Proyecto;
import com.ayeleniasich.portfolio.service.IProyectoService;
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
@RequestMapping("/proyectos")
@CrossOrigin
public class ProyectoController {

    @Autowired
    private IProyectoService ProyectoServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<Proyecto>> VerProyecto() {
        List<Proyecto> list = ProyectoServ.VerProyecto();
        return new ResponseEntity<List<Proyecto>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<Proyecto> buscarProyecto(@PathVariable("id") Long id) {
        if (!ProyectoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proyecto proyecto = ProyectoServ.buscarProyecto(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearEducacion(@RequestBody ProyectoDto proyectoDto) {
        if (StringUtils.isBlank(proyectoDto.getTituloProyecto())) {
            return new ResponseEntity(new Mensaje("El título es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getTecnologias())) {
            return new ResponseEntity(new Mensaje("La tecnologías utilizadas son obliglatorias"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getDescripcionProyecto())) {
            return new ResponseEntity(new Mensaje("La descripción es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlImagen())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlProyecto())) {
            return new ResponseEntity(new Mensaje("La url del proyecto es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlRepositorio())) {
            return new ResponseEntity(new Mensaje("La url del repositorio es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        Proyecto proyecto = new Proyecto( proyectoDto.getTituloProyecto(), proyectoDto.getTecnologias(), proyectoDto.getDescripcionProyecto(), proyectoDto.getUrlImagen(), proyectoDto.getUrlProyecto(), proyectoDto.getUrlRepositorio() );
        ProyectoServ.crearProyecto(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto creado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarEducacion(@PathVariable("id") Long id, @RequestBody ProyectoDto proyectoDto) {
        if (!ProyectoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
    if (StringUtils.isBlank(proyectoDto.getTituloProyecto())) {
            return new ResponseEntity(new Mensaje("El título es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getTecnologias())) {
            return new ResponseEntity(new Mensaje("La tecnologías utilizadas son obliglatorias"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getDescripcionProyecto())) {
            return new ResponseEntity(new Mensaje("La descripción es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlImagen())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlProyecto())) {
            return new ResponseEntity(new Mensaje("La url del proyecto es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proyectoDto.getUrlRepositorio())) {
            return new ResponseEntity(new Mensaje("La url del repositorio es obliglatorio"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proyecto = ProyectoServ.buscarProyecto(id).get();
        proyecto.setTituloProyecto(proyectoDto.getTituloProyecto());
        proyecto.setTecnologias(proyectoDto.getTecnologias());
        proyecto.setDescripcionProyecto(proyectoDto.getDescripcionProyecto());
        proyecto.setUrlImagen(proyectoDto.getUrlImagen());
        proyecto.setUrlProyecto(proyectoDto.getUrlProyecto());
        proyecto.setUrlRepositorio(proyectoDto.getUrlRepositorio());
        ProyectoServ.crearProyecto(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id) {
        if (!ProyectoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        ProyectoServ.borrarProyecto(id);
        return new ResponseEntity(new Mensaje("Lista de educación eliminada"), HttpStatus.OK);

    }
}
