package com.uch.citamedica.services;

import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.repository.RolRepository;
import com.uch.citamedica.util.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Usuario;
import com.uch.citamedica.repository.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    ObjectMapper objectMapper;

    public Usuario authenticate(String username, String password) {
        //encriptacion
        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        }
        return null;
    }

    @Override
    public void registrarPaciente(UsuarioDto usuarioDto) {
        usuarioDto.setRol(rolRepository.findById(2).orElse(null));
        System.out.println("usuarioDto password: "+usuarioDto.getPassword());
        System.out.println("usuarioDto passwordTemp: "+usuarioDto.getPasswordTemp());
        if (usuarioDto.getPassword().equals(usuarioDto.getPasswordTemp())) {
            Usuario usuario = objectMapper.usuarioDtoToUsuario(usuarioDto);
            usuarioRepository.save(usuario);
        }
    }

    @Override
    public void actualizarPaciente(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(usuario.getIdUsuario()).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setApellidos(usuario.getApellidos());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setTelefono(usuario.getTelefono());
            usuarioExistente.setDireccion(usuario.getDireccion());
            usuarioExistente.setDni(usuario.getDni());
            usuarioExistente.setGenero(usuario.getGenero());
            usuarioExistente.setFechaNacimiento(usuario.getFechaNacimiento());
            usuarioExistente.setUsername(usuario.getUsername());
            usuarioExistente.setPassword(usuario.getPassword());
            usuarioExistente.setEstado(usuario.getEstado());
            usuarioRepository.save(usuarioExistente);
        }
    }

    @Override
    public List<Usuario> listarPacientes() {
        return usuarioRepository.findAll().stream()
                .filter(usuario -> usuario.getRol().getIdRol() == 2)
                .collect(Collectors.toList());
    }


    @Override
    public List<Usuario> listarAdministradores() {
        return usuarioRepository.findAll().stream()
                .filter(usuario -> usuario.getRol().getIdRol() == 1)
                .collect(Collectors.toList());
    }
}
