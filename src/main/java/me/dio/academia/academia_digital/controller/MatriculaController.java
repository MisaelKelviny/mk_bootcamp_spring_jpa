package me.dio.academia.academia_digital.controller;

import jakarta.validation.Valid;
import me.dio.academia.academia_digital.entity.Matricula;
import me.dio.academia.academia_digital.entity.form.MatriculaForm;
import me.dio.academia.academia_digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }
}