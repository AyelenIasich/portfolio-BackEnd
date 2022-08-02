/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ayelén
 */
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
    private String lugar;
    private String imagen;
    private String modalidad;

    public Educacion() {
    }

    public Educacion(String nombre, int inicio, int fin, String titulo, String lugar, String imagen, String modalidad) {

        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.titulo = titulo;
        this.lugar = lugar;
        this.imagen = imagen;
        this.modalidad = modalidad;
    }

}
