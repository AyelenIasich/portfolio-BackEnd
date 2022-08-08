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

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcionMain;
    private String imagenMain;
    
   
    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String descripcionMain, String imagenMain) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcionMain = descripcionMain;
        this.imagenMain = imagenMain;
    }

   

  

}
