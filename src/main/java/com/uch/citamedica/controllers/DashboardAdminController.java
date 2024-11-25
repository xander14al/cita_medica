package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.services.EspecialidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class DashboardAdminController {

    @Autowired
    EspecialidadService especialidadService;

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/dashboard2")
    public String dashboard2() {
        return "admin/dashboard.copy";
    }

    @GetMapping("/especialidad")
    public String especialidad(Model model) {
        model.addAttribute("especialidades", especialidadService.listarEspecialidades());
        model.addAttribute("especialidad", new Especialidad());
        return "admin/especialidad";
    }
}
