package com.test.devlmm.citas.service.impl;

import com.test.devlmm.citas.dto.DoctorDTO;
import com.test.devlmm.citas.model.Doctor;
import com.test.devlmm.citas.repository.DoctorRepository;
import com.test.devlmm.citas.service.DoctorService;

import java.util.List;
import java.util.stream.Collectors;

public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    @Override
    public List<DoctorDTO> findAllDoctores() {
       List<Doctor> doctors = doctorRepository.findAll();
       return doctors.stream().map((doctor) -> mapToDoctorDTO(doctor)).collect(Collectors.toList());
    }

    @Override
    public Doctor findByName(String name) {
        Doctor doctor = doctorRepository.findByName(name);
        return doctor;
    }

    private DoctorDTO mapToDoctorDTO(Doctor doctor) {
        DoctorDTO doctorDTO = DoctorDTO.builder()
                .name(doctor.getName())
                .fatherLastname(doctor.getFatherLastname())
                .motherLastname(doctor.getMotherLastname())
                .specialty(doctor.getSpecialty())
                .build();

        return doctorDTO;
    }
}
