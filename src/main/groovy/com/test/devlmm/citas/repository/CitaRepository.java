package com.test.devlmm.citas.repository;

import com.test.devlmm.citas.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    Cita findByPaciente(String paciente);

    @Override
    Optional<Cita> findById(Long id);

    @Override
    List<Cita> findAll();
}

