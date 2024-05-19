package com.projeto.front_gestao_vagas.modules.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.front_gestao_vagas.modules.company.dto.CreateCompanyDTO;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("company", new CreateCompanyDTO());
        return "/company/create";
    }    
}
