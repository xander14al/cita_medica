package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Clinica;

public interface ClinicaService {

    Clinica buscarPorId(Integer id);

    void guardarClinica(Clinica clinica);

}
