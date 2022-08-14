package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.dto.TrabajoDto;
import com.ayeleniasich.portfolio.model.Trabajo;
import com.ayeleniasich.portfolio.service.ITrabajoService;
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
@RequestMapping("/trabajo")
@CrossOrigin
public class TrabajoController {

    @Autowired
    private ITrabajoService TrabajoServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<Trabajo>> VerTrabajo() {
        List<Trabajo> list = TrabajoServ.VerTrabajo();
        return new ResponseEntity<List<Trabajo>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<Trabajo> buscarTrabajo(@PathVariable("id") Long id) {
        if (!TrabajoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Trabajo trabajo = TrabajoServ.buscarTrabajo(id).get();
        return new ResponseEntity(trabajo, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearEducacion(@RequestBody TrabajoDto trabajoDto) {
        if (StringUtils.isBlank(trabajoDto.getTituloTrab())) {
            return new ResponseEntity(new Mensaje("El nombre es obliglatorio"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(trabajoDto.getDescripcionTrab())) {
            return new ResponseEntity(new Mensaje("La descripcion es obligatoria"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(trabajoDto.getUrlTrab())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatorio"), HttpStatus.BAD_REQUEST);
        }

        Trabajo trabajo = new Trabajo(trabajoDto.getTituloTrab(), trabajoDto.getInicioTrab(), trabajoDto.getFinTrab(), trabajoDto.getDescripcionTrab(), trabajoDto.getDireccionTrab(), trabajoDto.getUrlTrab());
        TrabajoServ.crearTrabajo(trabajo);
        return new ResponseEntity(new Mensaje("Lista de experiencia creada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarTrabajo(@PathVariable("id") Long id, @RequestBody TrabajoDto trabajoDto) {
        if (!TrabajoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
   
        Trabajo trabajo = TrabajoServ.buscarTrabajo(id).get();
        trabajo.setTituloTrab(trabajoDto.getTituloTrab());
        trabajo.setInicioTrab(trabajoDto.getInicioTrab());
        trabajo.setFinTrab(trabajoDto.getFinTrab());
        trabajo.setDescripcionTrab(trabajoDto.getDescripcionTrab());
        trabajo.setDireccionTrab(trabajoDto.getDireccionTrab());
        trabajo.setUrlTrab(trabajoDto.getUrlTrab());
        TrabajoServ.crearTrabajo(trabajo);
        return new ResponseEntity(new Mensaje("Lista de trabajo actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarTrabajo(@PathVariable("id") Long id) {
        if (!TrabajoServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        TrabajoServ.borrarTrabajo(id);
        return new ResponseEntity(new Mensaje("Lista de trabajo eliminada"), HttpStatus.OK);

    }
}
