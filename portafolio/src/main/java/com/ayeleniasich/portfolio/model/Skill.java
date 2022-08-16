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
public class Skill {
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;    
    private int porcentaje;    
    private String urlLogo;
    private String skill;
   

    public Skill() {
    }

    public Skill(int porcentaje, String urlLogo, String skill) {
        this.porcentaje = porcentaje;
        this.urlLogo = urlLogo;
        this.skill = skill;
    }


    
    
    
    
}
