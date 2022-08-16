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
public class SoftSkill {
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Long id;    
    private int porcentajeSoft;    
    private String urlSoft;
    private String softSkill;

    public SoftSkill() {
    }
    
    

    public SoftSkill(int porcentajeSoft, String urlSoft, String softSkill) {
        this.porcentajeSoft = porcentajeSoft;
        this.urlSoft = urlSoft;
        this.softSkill = softSkill;
    }
    
    
    
}
