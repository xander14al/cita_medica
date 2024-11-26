package com.uch.citamedica.util;

import com.uch.citamedica.dto.MedicoDto;
import com.uch.citamedica.dto.UsuarioDto;
import com.uch.citamedica.entities.Medico;
import com.uch.citamedica.entities.Usuario;
import com.uch.citamedica.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        usuario.setEstado("ACTIVO");
        usuario.setFechaCreacion(new java.util.Date());
        usuario.setIdRol(usuarioDto.getIdRol());
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
        medico.setNumeroColegiatura(medicoDto.getNumeroColegiatura());
        medico.setTelefono(medicoDto.getTelefono());
        medico.setIdEspecialidad(especialidadRepository.findById(medicoDto.getIdEspecialidad()).orElse(null));
        return medico;
    }

    public MedicoDto medicoToMedicoDto(Medico medico) {
        MedicoDto medicoDto = new MedicoDto();
        medicoDto.setIdMedico(medico.getIdMedico());
        medicoDto.setNombre(medico.getNombre());
        medicoDto.setApellidos(medico.getApellidos());
        medicoDto.setDni(medico.getDni());
        medicoDto.setEmail(medico.getEmail());
        medicoDto.setNumeroColegiatura(medico.getNumeroColegiatura());
        medicoDto.setTelefono(medico.getTelefono());
        medicoDto.setEspecialidad(medico.getIdEspecialidad().getNombre());
        medicoDto.setIdEspecialidad(medico.getIdEspecialidad().getIdEspecialidad());
        return medicoDto;
    }


}
