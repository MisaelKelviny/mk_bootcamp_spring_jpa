package me.dio.academia.academia_digital.service;

import me.dio.academia.academia_digital.entity.Matricula;
import me.dio.academia.academia_digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
