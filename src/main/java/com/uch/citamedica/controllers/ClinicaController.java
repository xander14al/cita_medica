package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Clinica;
import com.uch.citamedica.services.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clinica")
public class ClinicaController {

    @Autowired
    ClinicaService clinicaService;

    @GetMapping
    public String clinica(Model model) {
        model.addAttribute("clinica", clinicaService.buscarPorId(1));
        return "admin/clinica";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("clinica") Clinica clinica) {
        clinicaService.guardarClinica(clinica);
        return "admin/clinica";
    }
}
