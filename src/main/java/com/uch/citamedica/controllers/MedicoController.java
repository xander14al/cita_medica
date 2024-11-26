package com.uch.citamedica.controllers;

import com.uch.citamedica.dto.MedicoDto;
import com.uch.citamedica.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("medico") MedicoDto medicoDto) {
        medicoService.guardarMedico(medicoDto);
        return "redirect:/admin/medicos";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public MedicoDto obtenerMedico(@PathVariable Integer id) {
        MedicoDto medico = medicoService.buscarPorId(id);
        return Objects.requireNonNullElseGet(medico, MedicoDto::new);
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@ModelAttribute("id") Integer id) {
        medicoService.eliminarMedico(id);
        return "redirect:/admin/medicos";
    }
}
