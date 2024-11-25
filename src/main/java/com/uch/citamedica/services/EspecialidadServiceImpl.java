package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.repository.EspecialidadRepository;

import jakarta.persistence.Id;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    EspecialidadRepository especialidadRepository;

    @Override
    public List<Especialidad> listarEspecialidades() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad buscarPorId(Integer id) {
        return especialidadRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarEspecialidad(Especialidad especialidad) {
        especialidadRepository.save(especialidad);
    }

    @Override
    public void eliminarEspecialidad(Integer id) {
        especialidadRepository.deleteById(id);
    }
}
