package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDto {

    @NotBlank
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String titulo;

    @NotBlank
    private String descripcionMain;

    @NotBlank
    private String imagenMain;
    
    private String banner;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String titulo, String descripcionMain, String imagenMain, String banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcionMain = descripcionMain;
        this.imagenMain = imagenMain;
        this.banner = banner;
    }

   



}
