package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AboutDto {

    @NotBlank
    private Long id;

    @NotBlank
    private String tituloAbout;

    @NotBlank
    private String subtituloAbout;

    @NotBlank
    private String descripcionAbout;

    @NotBlank
    private String imagenAbout;

    public AboutDto() {
    }

    public AboutDto(String tituloAbout, String subtituloAbout, String descripcionAbout, String imagenAbout) {
        this.tituloAbout = tituloAbout;
        this.subtituloAbout = subtituloAbout;
        this.descripcionAbout = descripcionAbout;
        this.imagenAbout = imagenAbout;
    }

}
