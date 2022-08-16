package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.dto.PersonaDto;
import com.ayeleniasich.portfolio.model.Persona;
import com.ayeleniasich.portfolio.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class personaController {

    @Autowired
    private IPersonaService PerServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<Persona> VerPersona(@PathVariable("id") Long id) {
          if (!PerServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Persona persona = PerServ.buscarPersona(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<Persona> buscarEducacion(@PathVariable("id") Long id) {
        if (!PerServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Persona persona = PerServ.buscarPersona(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDto personaDto) {
        if (StringUtils.isBlank(personaDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getApellido())) {
            return new ResponseEntity(new Mensaje("El apellido es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getImagenMain())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getDescripcionMain())) {
            return new ResponseEntity(new Mensaje("La descripcion es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        Persona persona = new Persona(personaDto.getNombre(), personaDto.getTitulo(), personaDto.getApellido(), personaDto.getDescripcionMain(), personaDto.getImagenMain(), personaDto.getBanner());
        PerServ.crearPersona(persona);
        return new ResponseEntity(new Mensaje("persona creada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarPersona(@PathVariable("id") Long id, @RequestBody PersonaDto personaDto) {
        if (!PerServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        if (StringUtils.isBlank(personaDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getApellido())) {
            return new ResponseEntity(new Mensaje("El apellido es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("El titulo es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getDescripcionMain())) {
            return new ResponseEntity(new Mensaje("La descripcion es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(personaDto.getImagenMain())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = PerServ.buscarPersona(id).get();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setTitulo(personaDto.getTitulo());
        persona.setDescripcionMain(personaDto.getDescripcionMain());
        persona.setImagenMain(personaDto.getImagenMain());
        persona.setBanner(personaDto.getBanner());
        PerServ.crearPersona(persona);
        return new ResponseEntity(new Mensaje("Datos actualizados"), HttpStatus.OK);
    }
}
