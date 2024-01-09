package com.test.devlmm.citas.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DoctorDTO {
    private String name;
    private String fatherLastname;
    private String motherLastname;
    private String specialty;
}
