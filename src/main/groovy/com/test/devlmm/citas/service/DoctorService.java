package com.test.devlmm.citas.service;

import com.test.devlmm.citas.dto.DoctorDTO;
import com.test.devlmm.citas.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<DoctorDTO> findAllDoctores();

    Doctor findByName(String name);
}
