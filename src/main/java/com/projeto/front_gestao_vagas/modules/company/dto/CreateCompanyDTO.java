package com.projeto.front_gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateCompanyDTO {

    private String username;
    private String email;
    private String name;
    private String description;
    private String website;
    private String password;
}
