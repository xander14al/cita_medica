package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Horario;
import com.uch.citamedica.repository.HorarioRepository;

@Service
public class HorarioServiceImpl implements HorarioService {

    @Autowired
    HorarioRepository horarioRepository;

    @Override
    public List<Horario> listarHorarios() {
        return horarioRepository.findAll();
    }

    @Override
    public Horario buscarPorId(Integer id) {
        return horarioRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarHorario(Horario horario) {
        horarioRepository.save(horario);
    }

    @Override
    public void eliminarHorario(Integer id) {
        horarioRepository.deleteById(id);
    }
}
