package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

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
    private String imagen;

    private String descripcion;

    private String modalidad;

    private String titleUrl;

    private String url;

    public EducacionDto() {
    }

    public EducacionDto(String nombre, Integer inicio, Integer fin, String titulo, String imagen, String modalidad, String url, String titleUrl) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.titulo = titulo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.titleUrl = titleUrl;
        this.url = url;
    }

}
