package com.projeto.front_gestao_vagas.modules.candidate.dto;

import lombok.Data;

@Data
public class CreateCandidateDTO {
    private String username;
    private String name;
    private String password;
    private String email;
    private String description;
}
