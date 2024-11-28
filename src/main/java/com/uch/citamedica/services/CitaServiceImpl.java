package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Cita;
import com.uch.citamedica.repository.CitaRepository;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    CitaRepository citaRepository;

    @Override
    public List<Cita> listarCitas() {
        return citaRepository.findAll();
    }

    @Override
    public Cita buscarPorId(Integer id) {
        return citaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void eliminarCita(Integer id) {
        citaRepository.deleteById(id);
    }
}
