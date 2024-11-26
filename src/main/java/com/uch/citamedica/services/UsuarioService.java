package com.uch.citamedica.services;

import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    
    Usuario authenticate(String username, String password);

    void actualizarPaciente(Usuario usuario);

    void registrarPaciente(UsuarioDto usuarioDto);

    List<Usuario> listarPacientes();

    List<Usuario> listarAdministradores();
} 