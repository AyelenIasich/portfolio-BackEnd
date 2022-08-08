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
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;     
    private String tituloAbout;
    private String subtituloAbout;
    private String descripcionAbout;
    private String imagenAbout;
 

    public About() {
    }

    public About(String tituloAbout, String subtituloAbout, String descripcionAbout, String imagenAbout) {
        this.tituloAbout = tituloAbout;
        this.subtituloAbout = subtituloAbout;
        this.descripcionAbout = descripcionAbout;
        this.imagenAbout = imagenAbout;
    }

 

  

}
