/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkillDto {

    @Min(0) 
    @Max(100)
    private Integer porcentaje;

    @NotBlank
    private String urlLogo;

    @NotBlank
    private String skill;

 
    public SkillDto() {
    }

    public SkillDto(Integer porcentaje, String urlLogo, String skill) {
        this.porcentaje = porcentaje;
        this.urlLogo = urlLogo;
        this.skill = skill;
    }


  

    
    
    
}
