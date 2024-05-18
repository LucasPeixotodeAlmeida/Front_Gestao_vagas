package com.projeto.front_gestao_vagas.modules.candidate.dto;

import java.util.List;

import lombok.Data;

@Data
public class Token {
    private String access_token;
    private List<String> roles;
    private long expires_in;
}
