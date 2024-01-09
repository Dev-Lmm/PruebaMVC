package com.test.devlmm.citas.service;

import com.test.devlmm.citas.dto.ConsultorioDTO;
import com.test.devlmm.citas.model.Consultorio;

import java.util.List;

public interface ConsultorioService {
    List<ConsultorioDTO> findAllConsultorios();
    Consultorio findByOfficeNumber(int officeNumber);
}
