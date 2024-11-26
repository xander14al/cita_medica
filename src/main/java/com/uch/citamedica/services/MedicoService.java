package com.uch.citamedica.services;

import com.uch.citamedica.dto.MedicoDto;

import java.util.List;

public interface MedicoService {

    List<MedicoDto> listarMedicos();

    void guardarMedico(MedicoDto medico);

    MedicoDto buscarPorId(Integer id);

    void eliminarMedico(Integer id);
}
