package com.uch.citamedica.controllers;

import com.uch.citamedica.dto.LoginDTO;
import com.uch.citamedica.entities.Usuario;
import com.uch.citamedica.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginDTO());
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("loginForm") LoginDTO loginDTO,
                        HttpSession session,
                        RedirectAttributes redirectAttributes) {
        Usuario usuario = usuarioService.authenticate(loginDTO.getUsername(), loginDTO.getPassword());

        if (usuario != null) {
            session.setAttribute("usuarioLogueado", usuario);
            return "redirect:/dashboard";
        }

        redirectAttributes.addFlashAttribute("error", "Credenciales inválidas");
        return "redirect:/login";
    }

} 