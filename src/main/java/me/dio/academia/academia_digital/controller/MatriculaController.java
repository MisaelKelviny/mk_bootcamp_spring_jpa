package me.dio.academia.academia_digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import me.dio.academia.academia_digital.entity.Matricula;
import me.dio.academia.academia_digital.entity.form.MatriculaForm;
import me.dio.academia.academia_digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
@Api(value = "Matricula de alunos api")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    @ApiOperation(value = "Criar matricula")
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    @ApiOperation(value = "Obter todas matriculas")
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }
}