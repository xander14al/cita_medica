package com.uch.citamedica.util;

import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.entities.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapper {

    public Usuario UsuarioDtoToUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        System.out.println("usuarioDto: "+usuarioDto.toString());
        System.out.println("usuario: "+usuario.toString());

        usuario.setUsername(usuarioDto.getUsername());
        usuario.setPassword(usuarioDto.getPassword());
        usuario.setDni(usuarioDto.getDni());
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setApellidos(usuarioDto.getApellidos());
        usuario.setFechaNacimiento(usuarioDto.getFechaNacimiento());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setTelefono(usuarioDto.getTelefono());
        usuario.setDireccion(usuarioDto.getDireccion());
        usuario.setGenero(usuarioDto.getGenero());
        usuario.setEstado("ACTIVO");
        usuario.setFechaCreacion(new java.util.Date());
        usuario.setIdRol(usuarioDto.getIdRol());
        System.out.println("usuario: "+usuario.toString());
        return usuario;
    }
}
