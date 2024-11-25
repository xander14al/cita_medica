package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.services.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    EspecialidadService especialidadService;

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("especialidad") Especialidad especialidad) {
        especialidadService.guardarEspecialidad(especialidad);
        return "redirect:/admin/especialidad";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Especialidad obtenerEspecialidad(@PathVariable Integer id) {
        Especialidad especialidad = especialidadService.buscarPorId(id);
        return Objects.requireNonNullElseGet(especialidad, Especialidad::new);
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@ModelAttribute("id") Integer id) {
        especialidadService.eliminarEspecialidad(id);
        return "redirect:/admin/especialidad";
    }
}
