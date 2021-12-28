package com.example.ti360.college.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Case TI360")
@RestController
@RequestMapping("/")
public class CaseTi360Controller {

    @GetMapping
    public String caseTi360() {
        return "Case TI360 - Atualização de Alunos";
    }
}
