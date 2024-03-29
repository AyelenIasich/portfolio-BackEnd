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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;
    private String nombre;
    private int inicio;
    private int fin;
    private String titulo;

    private String imagen;
    private String modalidad;
    private String url;
    private String titleUrl;
    private String descripcion;

    public Educacion() {
    }

    public Educacion(String nombre, int inicio, int fin, String titulo, String imagen, String modalidad, String url, String titleUrl, String descripcion) {

        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.modalidad = modalidad;
        this.url = url;
        this.titleUrl = titleUrl;
    }

}
