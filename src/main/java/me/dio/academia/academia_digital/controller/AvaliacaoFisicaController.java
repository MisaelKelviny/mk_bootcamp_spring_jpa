package me.dio.academia.academia_digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.academia.academia_digital.entity.AvaliacaoFisica;
import me.dio.academia.academia_digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.academia_digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
@Api(value = "Avaliacoes de alunos api")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    @ApiOperation(value = "Criar avaliação fisica")
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @GetMapping
    @ApiOperation(value = "Obter todas as avaliações fisicas")
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }
}