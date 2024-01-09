package com.test.devlmm.citas.repository;

import com.test.devlmm.citas.model.Doctor;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByName(String name);
    Doctor findBySpecialty(String speciality);

    @Override
    Optional<Doctor> findById(Long id);

    @Override
    List<Doctor> findAll();
}
