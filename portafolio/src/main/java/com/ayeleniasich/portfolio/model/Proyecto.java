package com.ayeleniasich.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;
    private String tituloProyecto;
    private String tecnologias;
    private String descripcionProyecto;
    private String urlImagen;
    private String urlProyecto;
    private String urlRepositorio;

    public Proyecto() {
    }

    public Proyecto(String tituloProyecto, String tecnologias, String descripcionProyecto, String urlImagen, String urlProyecto, String urlRepositorio) {
        this.tituloProyecto = tituloProyecto;
        this.tecnologias = tecnologias;
        this.descripcionProyecto = descripcionProyecto;
        this.urlImagen = urlImagen;
        this.urlProyecto = urlProyecto;
        this.urlRepositorio = urlRepositorio;
    }

    
    
}
