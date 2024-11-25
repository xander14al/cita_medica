package com.uch.citamedica.controllers;

import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.entities.Usuario;
import com.uch.citamedica.services.RolService;
import com.uch.citamedica.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class DashboardPatientController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "patient/dashboard";
    }

    @GetMapping("/create_account")
    public String createAccount(Model model) {
        model.addAttribute("usuarioDto", new UsuarioDto());
        return "create-account";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("usuarioDto") UsuarioDto usuarioDto) {

        System.out.println("usuarioDto password: "+usuarioDto.getPassword());
        System.out.println("usuarioDto passwordTemp: "+usuarioDto.getPasswordTemp());
        usuarioService.registrarPaciente(usuarioDto);
        return "redirect:/login";
    }

    @GetMapping("/perfil")
    public String perfil(HttpSession session, Model model) {
        Usuario usuario = (Usuario) session.getAttribute("usuarioLogueado");
        model.addAttribute("usuario", usuario);
        System.out.println("user fec: "+usuario.getFechaNacimiento());
        return "patient/perfil";
    }

    @PostMapping("/actualizar")
    public String actualizar(HttpSession session, @ModelAttribute("usuario") Usuario usuario) {
        usuario.setIdRol(rolService.findById(2));
        usuarioService.actualizarPaciente(usuario);
        System.out.println(usuario.getFechaNacimiento());
        session.setAttribute("usuarioLogueado", usuario);
        return "redirect:/patient/perfil";
    }

}
