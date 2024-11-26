package com.uch.citamedica.controllers;

import com.uch.citamedica.dto.MedicoDto;
import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.entities.Medico;
import com.uch.citamedica.services.EspecialidadService;

import com.uch.citamedica.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DashboardAdminController {

    @Autowired
    EspecialidadService especialidadService;

    @Autowired
    MedicoService medicoService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("activePage", "dashboard");
        return "admin/dashboard";
    }

    @GetMapping("/medicos")
    public String showMedicos(Model model) {
        model.addAttribute("activePage", "medicos");
        model.addAttribute("medicos", medicoService.listarMedicos());
        model.addAttribute("especialidades", especialidadService.listarEspecialidades());
        model.addAttribute("medico", new MedicoDto());
        return "admin/medicos";
    }

    @GetMapping("/citas")
    public String showCitas(Model model) {
        model.addAttribute("activePage", "citas");
        return "admin/citas";
    }

    @GetMapping("/pacientes")
    public String showPacientes(Model model) {
        model.addAttribute("activePage", "pacientes");
        return "admin/pacientes";
    }

    @GetMapping("/horarios")
    public String showHorarios(Model model) {
        model.addAttribute("activePage", "horarios");
        return "admin/horarios";
    }

    @GetMapping("/especialidad")
    public String especialidad(Model model) {
        model.addAttribute("activePage", "especialidad");
        model.addAttribute("especialidades", especialidadService.listarEspecialidades());
        model.addAttribute("especialidad", new Especialidad());
        return "admin/especialidades";
    }

    @GetMapping("/consultorios")
    public String showConsultorios(Model model) {
        model.addAttribute("activePage", "consultorios");
        return "admin/consultorios";
    }

    @GetMapping("/clinica")
    public String showClinica(Model model) {
        model.addAttribute("activePage", "clinica");
        return "admin/clinica";
    }

    @GetMapping("/pagos")
    public String showPagos(Model model) {
        model.addAttribute("activePage", "pagos");
        return "admin/pagos";
    }
}
