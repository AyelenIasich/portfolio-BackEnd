package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.EducacionDto;
import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.model.Educacion;
import com.ayeleniasich.portfolio.service.IEducacionService;
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
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Ayelén
 */
@RestController
@RequestMapping("/educacion")
@CrossOrigin
public class EducacionController {

    @Autowired
    private IEducacionService EduServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<Educacion>> VerEducacion() {
        List<Educacion> list = EduServ.VerEducacion();
        return new ResponseEntity<List<Educacion>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<Educacion> buscarEducacion(@PathVariable("id") Long id) {
        if (!EduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Educacion educacion = EduServ.buscarEducacion(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearEducacion(@RequestBody EducacionDto educacionDto) {
        if (StringUtils.isBlank(educacionDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (educacionDto.getInicio() == null || (educacionDto.getInicio() < 1900 && educacionDto.getInicio() < 3000)) {
            return new ResponseEntity(new Mensaje("Año inválido. El año de inicio debe ser entre 1900 al 3000"), HttpStatus.BAD_REQUEST);
        }
        if (educacionDto.getFin() == null || (educacionDto.getFin() < 1900 && educacionDto.getFin() < 3000)) {
            return new ResponseEntity(new Mensaje("Año inválido. El año de finalización debe ser entre 1900 al 3000"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getLugar())) {
            return new ResponseEntity(new Mensaje("La dirección es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(educacionDto.getImagen())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getModalidad())) {
            return new ResponseEntity(new Mensaje("La modalidad es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(educacionDto.getNombre(), educacionDto.getInicio(), educacionDto.getFin(), educacionDto.getTitulo(), educacionDto.getLugar(), educacionDto.getImagen(), educacionDto.getModalidad());
        EduServ.crearEducacion(educacion);
        return new ResponseEntity(new Mensaje("Lista de educacion creada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarEducacion(@PathVariable("id") Long id, @RequestBody EducacionDto educacionDto) {
        if (!EduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        if (StringUtils.isBlank(educacionDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (educacionDto.getInicio() == null || (educacionDto.getInicio() < 1900 && educacionDto.getInicio() < 3000)) {
            return new ResponseEntity(new Mensaje("Año inválido. El año de inicio debe ser entre 1900 al 3000"), HttpStatus.BAD_REQUEST);
        }
        if (educacionDto.getFin() == null || (educacionDto.getFin() < 1900 && educacionDto.getFin() < 3000)) {
            return new ResponseEntity(new Mensaje("Año inválido. El año de finalización debe ser entre 1900 al 3000"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getLugar())) {
            return new ResponseEntity(new Mensaje("La dirección es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(educacionDto.getImagen())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(educacionDto.getModalidad())) {
            return new ResponseEntity(new Mensaje("La modalidad es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = EduServ.buscarEducacion(id).get();
        educacion.setNombre(educacionDto.getNombre());
        educacion.setInicio(educacionDto.getFin());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setLugar(educacionDto.getLugar());
        educacion.setImagen(educacionDto.getImagen());
        educacion.setModalidad(educacionDto.getModalidad());
        EduServ.crearEducacion(educacion);
        return new ResponseEntity(new Mensaje("Lista de educación actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id) {
        if (!EduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        EduServ.borrarEducacion(id);
        return new ResponseEntity(new Mensaje("Lista de educación eliminada"), HttpStatus.OK);

    }

}
