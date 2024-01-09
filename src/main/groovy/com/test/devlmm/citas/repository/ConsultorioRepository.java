package com.test.devlmm.citas.repository;

import com.test.devlmm.citas.model.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {
    Consultorio findByFloorNumber(String floorNumber);
    Consultorio findByOfficeNumber(int officeNumber);

    @Override
    Optional<Consultorio> findById(Long id);

    @Override
    List<Consultorio> findAll();
}
