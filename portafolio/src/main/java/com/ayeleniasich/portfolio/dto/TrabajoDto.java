package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrabajoDto {


    private String tituloTrab;

    private int inicioTrab;

    private int finTrab;

   
    private String descripcionTrab;

 
    private String urlTrab;

    private String direccionTrab;

    public TrabajoDto() {
    }

    public TrabajoDto(String tituloTrab, int inicioTrab, int finTrab, String descripcionTrab, String urlTrab, String direccionTrab) {
        this.tituloTrab = tituloTrab;
        this.inicioTrab = inicioTrab;
        this.finTrab = finTrab;
        this.descripcionTrab = descripcionTrab;
        this.urlTrab = urlTrab;
        this.direccionTrab = direccionTrab;
    }

}
