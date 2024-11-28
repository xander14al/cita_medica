package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Horario;

public interface HorarioService {

    List<Horario> listarHorarios();

    Horario buscarPorId(Integer id);

    void guardarHorario(Horario horario);

    void eliminarHorario(Integer id);

}
