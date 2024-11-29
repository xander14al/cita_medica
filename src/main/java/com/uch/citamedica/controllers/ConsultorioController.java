package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Consultorio;
import com.uch.citamedica.services.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioController {

    @Autowired
    ConsultorioService consultorioService;

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("consultorio") Consultorio consultorio) {
        System.out.println(consultorio);
        consultorioService.guardarConsultorio(consultorio);
        return "redirect:/admin/consultorios";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Consultorio obtenerConsultorio(@PathVariable Integer id) {
        Consultorio consultorio = consultorioService.buscarPorId(id);
        return Objects.requireNonNullElseGet(consultorio, Consultorio::new);
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@ModelAttribute("id") Integer id) {
        consultorioService.eliminarConsultorio(id);
        return "redirect:/admin/consultorios";
    }
}
