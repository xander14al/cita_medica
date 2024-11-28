package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Consultorio;

public interface ConsultorioService {

    List<Consultorio> listarConsultorios();

    Consultorio buscarPorId(Integer id);

    void guardarConsultorio(Consultorio consultorio);

    void eliminarConsultorio(Integer id);

}
