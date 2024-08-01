package me.dio.academia.academia_digital.service;

import me.dio.academia.academia_digital.entity.AvaliacaoFisica;
import me.dio.academia.academia_digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.academia_digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
