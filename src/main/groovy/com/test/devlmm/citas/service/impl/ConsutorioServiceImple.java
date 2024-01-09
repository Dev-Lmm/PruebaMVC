package com.test.devlmm.citas.service.impl;

import com.test.devlmm.citas.dto.ConsultorioDTO;
import com.test.devlmm.citas.model.Consultorio;
import com.test.devlmm.citas.repository.ConsultorioRepository;
import com.test.devlmm.citas.service.ConsultorioService;

import java.util.List;

public class ConsutorioServiceImple implements ConsultorioService {
    private final ConsultorioRepository consultorioRepository;

    public ConsutorioServiceImple(ConsultorioRepository consultorioRepository) {
        this.consultorioRepository = consultorioRepository;
    }

    @Override
    public List<ConsultorioDTO> findAllConsultorios() {
        return null;
    }

    @Override
    public Consultorio findByOfficeNumber(int officeNumber) {
        Consultorio consultorio = consultorioRepository.findByOfficeNumber(officeNumber);
        return consultorio;
    }
}
