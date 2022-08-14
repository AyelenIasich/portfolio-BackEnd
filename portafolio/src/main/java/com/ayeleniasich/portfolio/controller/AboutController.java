package com.ayeleniasich.portfolio.controller;

import com.ayeleniasich.portfolio.dto.AboutDto;
import com.ayeleniasich.portfolio.dto.Mensaje;
import com.ayeleniasich.portfolio.model.About;
import com.ayeleniasich.portfolio.service.IAboutService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@CrossOrigin
public class AboutController {

    @Autowired
    private IAboutService AboutServ;

    @GetMapping("/lista")
    @ResponseBody
    public ResponseEntity<List<About>> VerAbout() {
        List<About> list = AboutServ.VerAbout();
        return new ResponseEntity<List<About>>(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public ResponseEntity<About> buscarAbout(@PathVariable("id") Long id) {
        if (!AboutServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        About about = AboutServ.buscarAbout(id).get();
        return new ResponseEntity(about, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> crearAbout(@RequestBody AboutDto aboutDto) {
        if (StringUtils.isBlank(aboutDto.getTituloAbout())) {
            return new ResponseEntity(new Mensaje("El titulo es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(aboutDto.getSubtituloAbout())) {
            return new ResponseEntity(new Mensaje("El subtitulo es obliglatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(aboutDto.getDescripcionAbout())) {
            return new ResponseEntity(new Mensaje("La descripcion es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(aboutDto.getImagenAbout())) {
            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
        }
        About about = new About(aboutDto.getTituloAbout(), aboutDto.getSubtituloAbout(), aboutDto.getDescripcionAbout(), aboutDto.getImagenAbout(), aboutDto.getParrafoAbout(), aboutDto.getParrafo2About());
        AboutServ.crearAbout(about);
        return new ResponseEntity(new Mensaje("sobre mi creada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseEntity<?> editarAbout(@PathVariable("id") Long id, @RequestBody AboutDto aboutDto) {
        if (!AboutServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
//        if (StringUtils.isBlank(aboutDto.getTituloAbout())) {
//            return new ResponseEntity(new Mensaje("El titulo es obliglatorio"), HttpStatus.BAD_REQUEST);
//        }
//        if (StringUtils.isBlank(aboutDto.getSubtituloAbout())) {
//            return new ResponseEntity(new Mensaje("El subitulo es obliglatorio"), HttpStatus.BAD_REQUEST);
//        }
//        if (StringUtils.isBlank(aboutDto.getImagenAbout())) {
//            return new ResponseEntity(new Mensaje("La imagen es obliglatoria"), HttpStatus.BAD_REQUEST);
//        }
//        if (StringUtils.isBlank(aboutDto.getDescripcionAbout())) {
//            return new ResponseEntity(new Mensaje("La descripcion es obliglatoria"), HttpStatus.BAD_REQUEST);
//        }

        About about = AboutServ.buscarAbout(id).get();
        about.setTituloAbout(aboutDto.getTituloAbout());
        about.setSubtituloAbout(aboutDto.getSubtituloAbout());
        about.setDescripcionAbout(aboutDto.getDescripcionAbout());
        about.setImagenAbout(aboutDto.getImagenAbout());
        about.setParrafoAbout(aboutDto.getParrafoAbout());
         about.setParrafo2About(aboutDto.getParrafo2About());

        AboutServ.crearAbout(about);
        return new ResponseEntity(new Mensaje("Datos actualizados"), HttpStatus.OK);
    }
}
