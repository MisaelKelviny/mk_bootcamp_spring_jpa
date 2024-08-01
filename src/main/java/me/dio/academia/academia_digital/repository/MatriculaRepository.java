package me.dio.academia.academia_digital.repository;

import me.dio.academia.academia_digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    @Query(value = "SELECT * FROM tb_matriculas m " +
            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
            "WHERE a.bairro = :bairro", nativeQuery = true)
    List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
