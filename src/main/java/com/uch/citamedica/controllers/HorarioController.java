package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Horario;
import com.uch.citamedica.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Objects;

@Controller
@RequestMapping("/horario")
public class HorarioController {

    @Autowired
    HorarioService horarioService;

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("horario") Horario horario) {
        horarioService.guardarHorario(horario);
        return "redirect:/admin/horarios";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Horario obtenerHorario(@PathVariable Integer id) {
        Horario horario = horarioService.buscarPorId(id);
        System.out.println(horario);
        if (horario != null) {
            horario.setCitas(Collections.unmodifiableList(horario.getCitas()));
        }
        return Objects.requireNonNullElseGet(horario, Horario::new);
    }


    @GetMapping("/eliminar/{id}")
    public String eliminar(@ModelAttribute("id") Integer id) {
        horarioService.eliminarHorario(id);
        return "redirect:/admin/horarios";
    }
}
