package me.dio.academia.academia_digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import me.dio.academia.academia_digital.entity.Aluno;
import me.dio.academia.academia_digital.entity.AvaliacaoFisica;
import me.dio.academia.academia_digital.entity.form.AlunoForm;
import me.dio.academia.academia_digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@Api(value = "Alunos api")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    @ApiOperation(value = "Criar Aluno")
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    @ApiOperation(value = "Obter avaliacao fisica do aluno")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    @ApiOperation(value = "Obter todos alunos")
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                              String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }
}
