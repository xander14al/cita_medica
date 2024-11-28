package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Clinica;
import com.uch.citamedica.repository.ClinicaRepository;

@Service
public class ClinicaServiceImpl implements ClinicaService {

    @Autowired
    ClinicaRepository clinicaRepository;

    @Override
    public List<Clinica> listarClinicas() {
        return clinicaRepository.findAll();
    }

    @Override
    public Clinica buscarPorId(Integer id) {
        return clinicaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarClinica(Clinica clinica) {
        clinicaRepository.save(clinica);
    }

    @Override
    public void eliminarClinica(Integer id) {
        clinicaRepository.deleteById(id);
    }
}
