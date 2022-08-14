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
public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;

    private String tituloTrab;

    private int inicioTrab;

    private int finTrab;

    private String descripcionTrab;

    private String urlTrab;

    private String direccionTrab;

    public Trabajo() {
    }

    public Trabajo(String tituloTrab, int inicioTrab, int finTrab, String descripcionTrab, String urlTrab, String direccionTrab) {
        this.tituloTrab = tituloTrab;
        this.inicioTrab = inicioTrab;
        this.finTrab = finTrab;
        this.descripcionTrab = descripcionTrab;
        this.urlTrab = urlTrab;
        this.direccionTrab = direccionTrab;
    }

    
    
    
}
