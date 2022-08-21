package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProyectoDto {

    @NotBlank
    private String tituloProyecto;

    @NotBlank
    private String tecnologias;

    @NotBlank
    private String descripcionProyecto;

    @NotBlank
    private String urlImagen;

    @NotBlank
    private String urlProyecto;

    @NotBlank
    private String urlRepositorio;
    
    

    public ProyectoDto() {
    }
    
    
    public ProyectoDto(String tituloProyecto, String tecnologias, String descripcionProyecto, String urlImagen, String urlProyecto, String urlRepositorio) {
        this.tituloProyecto = tituloProyecto;
        this.tecnologias = tecnologias;
        this.descripcionProyecto = descripcionProyecto;
        this.urlImagen = urlImagen;
        this.urlProyecto = urlProyecto;
        this.urlRepositorio = urlRepositorio;
    }

    
    
}
