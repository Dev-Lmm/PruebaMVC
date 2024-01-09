package com.test.devlmm.citas.controller;

import com.test.devlmm.citas.dto.DoctorDTO;
import com.test.devlmm.citas.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DoctorController {
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public String listDoctors(Model model) {
        List<DoctorDTO> doctors = doctorService.findAllDoctores();
        model.addAttribute("doctors", doctors);
        return "doctors-list";
    }
}
