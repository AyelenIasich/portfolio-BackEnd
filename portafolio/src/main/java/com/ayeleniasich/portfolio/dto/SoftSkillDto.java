
package com.ayeleniasich.portfolio.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SoftSkillDto {
      
    @Min(0)
    private Integer porcentajeSoft;

    @NotBlank
    private String urlSoft;

    @NotBlank
    private String softSkill;

    public SoftSkillDto() {
    }

    public SoftSkillDto(Integer porcentajeSoft, String urlSoft, String softSkill) {
        this.porcentajeSoft = porcentajeSoft;
        this.urlSoft = urlSoft;
        this.softSkill = softSkill;
    }

  

}
