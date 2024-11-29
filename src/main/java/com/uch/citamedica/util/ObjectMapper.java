package com.uch.citamedica.util;

import com.uch.citamedica.dto.MedicoDto;
import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.entities.Medico;
import com.uch.citamedica.entities.Usuario;
import com.uch.citamedica.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ObjectMapper {

    @Autowired
    EspecialidadRepository especialidadRepository;

    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
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
        usuario.setEstado(Usuario.EstadoUsuario.Activo);
        usuario.setFechaCreacion(LocalDateTime.now());
        usuario.setRol(usuarioDto.getRol());
        return usuario;
    }

    // Medicos
    public Medico medicoDtoToMedico(MedicoDto medicoDto) {
        Medico medico = new Medico();
        medico.setIdMedico(medicoDto.getIdMedico());
        medico.setNombre(medicoDto.getNombre());
        medico.setApellidos(medicoDto.getApellidos());
        medico.setDni(medicoDto.getDni());
        medico.setEmail(medicoDto.getEmail());
        medico.setNumeroColegio(medicoDto.getNumeroColegio());
        medico.setTelefono(medicoDto.getTelefono());
        medico.setEspecialidad(especialidadRepository.findById(medicoDto.getIdEspecialidad()).orElse(null));
        return medico;
    }

    public MedicoDto medicoToMedicoDto(Medico medico) {
        MedicoDto medicoDto = new MedicoDto();
        medicoDto.setIdMedico(medico.getIdMedico());
        medicoDto.setNombre(medico.getNombre());
        medicoDto.setApellidos(medico.getApellidos());
        medicoDto.setDni(medico.getDni());
        medicoDto.setEmail(medico.getEmail());
        medicoDto.setNumeroColegio(medico.getNumeroColegio());
        medicoDto.setTelefono(medico.getTelefono());
        medicoDto.setEspecialidad(medico.getEspecialidad().getNombre());
        medicoDto.setIdEspecialidad(medico.getEspecialidad().getIdEspecialidad());
        return medicoDto;
    }


}
