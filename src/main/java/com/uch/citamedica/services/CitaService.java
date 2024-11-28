package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Cita;

public interface CitaService {

    List<Cita> listarCitas();

    Cita buscarPorId(Integer id);

    void guardarCita(Cita cita);

    void eliminarCita(Integer id);

}
