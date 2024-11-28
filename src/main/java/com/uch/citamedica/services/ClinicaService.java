package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Clinica;

public interface ClinicaService {

    List<Clinica> listarClinicas();

    Clinica buscarPorId(Integer id);

    void guardarClinica(Clinica clinica);

    void eliminarClinica(Integer id);

}
