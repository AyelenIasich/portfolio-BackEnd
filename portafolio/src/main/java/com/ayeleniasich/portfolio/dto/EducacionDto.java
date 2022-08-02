/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ayelén
 */
@Getter
@Setter

public class EducacionDto {

    @NotBlank
    private String nombre;

    @Min(0)
    private Integer inicio;

    @Min(0)
    private Integer fin;

    @NotBlank
    private String titulo;

    @NotBlank
    private String lugar;

    @NotBlank
    private String imagen;

    @NotBlank
    private String modalidad;

    public EducacionDto() {
    }

    public EducacionDto(String nombre, Integer inicio, Integer fin, String titulo, String lugar, String imagen, String modalidad) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.titulo = titulo;
        this.lugar = lugar;
        this.imagen = imagen;
        this.modalidad = modalidad;
    }

    

}
