package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Especialidad;

public interface EspecialidadService {

    List<Especialidad> listarEspecialidades();

    Especialidad buscarPorId(Integer id);

    void guardarEspecialidad(Especialidad especialidad);

    void eliminarEspecialidad(Integer id);

}
