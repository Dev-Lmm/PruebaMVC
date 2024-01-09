package com.test.devlmm.citas.dto;

import com.test.devlmm.citas.model.Consultorio;
import com.test.devlmm.citas.model.Doctor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CitaDTO {
    private String paciente;
    private Doctor doctor;
    private Consultorio consultorio;
    private LocalDateTime horario;
}
