package com.ayeleniasich.portfolio.dto;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AboutDto {

    @NotBlank
    private Long id;


    private String tituloAbout;

   
    private String subtituloAbout;

   
    private String descripcionAbout;
    
     private String parrafoAbout;
    
     @Column(length = 8192)
    private String parrafo2About;
    
    private String imagenAbout;

    public AboutDto() {
    }

    public AboutDto(String tituloAbout, String subtituloAbout, String descripcionAbout, String parrafoAbout, String parrafo2About, String imagenAbout) {
        this.tituloAbout = tituloAbout;
        this.subtituloAbout = subtituloAbout;
        this.descripcionAbout = descripcionAbout;
        this.parrafoAbout = parrafoAbout;
        this.parrafo2About = parrafo2About;
        this.imagenAbout = imagenAbout;
    }



 

}
